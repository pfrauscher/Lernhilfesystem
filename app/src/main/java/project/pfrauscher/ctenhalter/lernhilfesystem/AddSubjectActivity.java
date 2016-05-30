package project.pfrauscher.ctenhalter.lernhilfesystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by ctenhalter on 20.05.2016.
 */
public class AddSubjectActivity extends Activity {//ctenhalter

    String subjectname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {//ctenhalter
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_subject);
    }

    public AddSubjectActivity(String subjectname) {//ctenhalter
        this.subjectname = subjectname;

    }

    Button btnConfirm = (Button) findViewById(R.id.btnConfirm);

    //DB Code




}
