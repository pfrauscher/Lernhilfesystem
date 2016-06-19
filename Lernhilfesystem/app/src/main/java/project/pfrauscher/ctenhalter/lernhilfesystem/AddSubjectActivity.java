package project.pfrauscher.ctenhalter.lernhilfesystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ctenhalter on 20.05.2016.
 */
public class AddSubjectActivity extends Activity {//ctenhalter

    String subjectname= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_subject);

        getNewSubjectName();

    }

    public void getNewSubjectName() {

        Button btnConfirm = (Button) findViewById(R.id.btnConfirmSubject);



        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextSubjectName = (EditText) findViewById(R.id.edtTxtSubjectName);
                subjectname = editTextSubjectName.getText().toString();

                insertNewSubject();
                editTextSubjectName.setText(null);

            }
        });

    }

    private void insertNewSubject() {


        //DB Code
    }



}
