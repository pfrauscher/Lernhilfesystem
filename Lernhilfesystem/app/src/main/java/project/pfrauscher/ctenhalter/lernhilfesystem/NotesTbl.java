package project.pfrauscher.ctenhalter.lernhilfesystem;

import java.sql.Date;

/**
 * Created by pfrauscher on 03.06.2016.
 */
public class NotesTbl {//pfrauscher

    public static final String TABLE_NAME= "Notes";

    public final static String NoteId = "NoteId";
    public final static String SubjectId="SubjectId";
    public final static String NoteName= "NoteName";
    public final static String DueTo= "DueTo";
    public final static String NoteText= "NoteText";
    public final static String NoteImage="NoteImage";

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public static final String SQL_CREATE= "CREATE TABLE "+TABLE_NAME+"("+NoteId+"INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT" +
                                            SubjectId+ " INT NOT NULL,"+
                                            NoteName+ " TEXT NOT NULL," +
                                            DueTo+ " DATE NOT NULL,"+
                                            NoteText+ " TEXT NOT NULL,"+
                                            NoteImage+ "LONGBLOB NOT NULL" +
                                            ")";
    public static final String STMT_DELETE = "DELETE FROM " +TABLE_NAME;
    public static final String STMT_INSERT=
            "INSERT INTO "+ TABLE_NAME+
                    "(" + NoteName+ "," + DueTo+ "," + NoteText+ ","+ NoteImage+") "+
                    "VALUES(?,?,?,?)";
    public static final String STMT_GET_NOTEINFO= "SELECT * FROM NotesTbl WHERE NoteId="+NoteId;//für die Activity N

}
