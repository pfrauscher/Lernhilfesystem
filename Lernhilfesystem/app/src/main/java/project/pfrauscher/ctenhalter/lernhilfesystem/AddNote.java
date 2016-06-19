package project.pfrauscher.ctenhalter.lernhilfesystem;

/**
 * Created by ctenhalter on 23.05.2016.
 */
import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CalendarView;
        import android.widget.DatePicker;
        import android.widget.EditText;
public class AddNote {
    public class AddNoteActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.add_edit_note);

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

                        insertNewNote();
                    }
                }
            });
        }

        private void insertNewNote() {

            //DB Code

        }
    }

}
