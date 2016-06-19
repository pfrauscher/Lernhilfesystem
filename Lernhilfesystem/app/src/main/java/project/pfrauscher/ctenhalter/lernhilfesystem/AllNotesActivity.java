package project.pfrauscher.ctenhalter.lernhilfesystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;


/**
 * Created by ctenhalter on 23.05.2016.
 */

public class AllNotesActivity extends Activity { //ctenhalter
    Intent showNote;
    Spinner spinnerSubjectName = (Spinner) findViewById(R.id.subjectSpinner);
    ListView listNotes = (ListView) findViewById(R.id.noteList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {//ctenhalter
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_notes_for);

        readFromDatabase();
        showNote = new Intent(this, ShowNoteActivity.class);

        if (listNotes.getItemAtPosition(0) != null) {

            listNotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    showNote.putExtra("id", id);//db zum anzeigen
                    startActivity(showNote);


                }
            });
        }
    }


    private void readFromDatabase() {

        //Elemente befüllen
    }

    public AllNotesActivity(Spinner spinnerSubjectName, ListView listNotes) {
        this.spinnerSubjectName = spinnerSubjectName;
        this.listNotes = listNotes;
    }
}
