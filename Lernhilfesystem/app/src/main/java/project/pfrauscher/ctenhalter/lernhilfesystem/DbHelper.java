package project.pfrauscher.ctenhalter.lernhilfesystem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pfrauscher on 30.05.2016.
 */
public class DbHelper extends SQLiteOpenHelper {//pfrauscher

    private final static String DB_NAME = "LearningManagementSystem.db";
    private final static int DB_VERSION= 1;

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(NotesTbl.SQL_CREATE);//tabellen erstellen
            db.execSQL(SubjectsTbl.SQL_CREATE);

            seed(db);//damit die Daten nicht verloren gehen
    }
    private void seed(SQLiteDatabase db){
        //code damit Daten nicht verloren gehen
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(NotesTbl.SQL_DROP);//tabellen "löschen"
            db.execSQL(SubjectsTbl.SQL_DROP);

            onCreate(db); //onCreate wieder aufrufen um die Tabellen zurückzuholen
    }
}
