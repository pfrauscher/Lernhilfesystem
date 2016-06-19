package project.pfrauscher.ctenhalter.lernhilfesystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

/**
 * Created by ctenhalter on 23.05.2016.
 */
public class EditNoteActivity extends Activity {

    int noteId;//die zu bearbeitende notiz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_edit_note);

        Bundle params = getIntent().getExtras();
        if(params != null){

            noteId= params.getInt("noteId");
        }


        Button btnConfirm = (Button) findViewById(R.id.btnConfirmNote);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edtName = (EditText) findViewById(R.id.edtTxtNoteName);
                DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
                EditText edtText = (EditText) findViewById(R.id.edtTxtText);


                if (edtName.getText() != null && edtName.getText() != null) {

                    String noteName = edtName.getText().toString();
                    long dueTo = datePicker.getCalendarView().getDate();
                    String noteText = edtText.getText().toString();

                    editNote(noteId,noteName,dueTo,noteText);
                }
            }
        });
    }

    private void editNote(int noteId, String noteName, long dueTo, String noteText) {

        //DB Code

    }

}
