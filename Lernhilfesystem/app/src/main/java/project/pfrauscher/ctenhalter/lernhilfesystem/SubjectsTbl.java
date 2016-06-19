package project.pfrauscher.ctenhalter.lernhilfesystem;

/**
 * Created by pfrauscher on 03.06.2016.
 */
public class SubjectsTbl {//pfrauscher
    public static final String TABLE_NAME= "Subjects";
    public final static String SubjectId = "SubjectId";
    public final static String SubjectName= "SubjectName";




    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public static final String SQL_CREATE= "CREATE TABLE "+TABLE_NAME+"("+SubjectId+"INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT" +
            SubjectName+ " TEXT NOT NULL," +
            ")";
    public static final String STMT_DELETE = "DELETE FROM " +TABLE_NAME;
    public static final String STMT_INSERT=
            "INSERT INTO "+ TABLE_NAME+
                    "(" + SubjectId+ "," + SubjectName+") "+
                    "VALUES(?,?,?,?)";
    public static final String SELECT_NOTES="SELECT NoteName,DueTo FROM NotesTbl WHERE SubjectId = "+SubjectId; //zum holen von allen Notes eines Subjects
}
