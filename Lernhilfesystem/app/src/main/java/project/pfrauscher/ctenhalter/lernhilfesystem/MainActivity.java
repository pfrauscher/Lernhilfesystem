package project.pfrauscher.ctenhalter.lernhilfesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listSubjects = (ListView) findViewById(R.id.listSubjects);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        readFromDatabase ();//fill list


        listSubjects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//ctenhalter


                showAllNotesForSubject(id);

            }
        });
    registerForContextMenu(listSubjects);
}

    private void showAllNotesForSubject(long id) {
        Intent showAllNotesIntent = new Intent(this, AllNotesActivity.class);
        showAllNotesIntent.putExtra("id", id);
        startActivity(showAllNotesIntent);
    }

    private void readFromDatabase() {



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) //ctenhalter

    {

        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //ctenhalter


        switch (item.getItemId()){


            case R.id.menuAddSubject:

                Intent addSubjectIntent = new Intent(this,AddSubjectActivity.class);
                startActivity(addSubjectIntent);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        if ( v.getId() == R.id.listSubjects){

            getMenuInflater().inflate(R.menu.context_menu,menu);

        }

        super.onCreateContextMenu(menu, v, menuInfo);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {


        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){

            case R.id.menuDelete:

                listSubjects.removeViewAt(info.position);

                //DB code    info.id = datenbank id



            case R.id.menuEdit:

        }
        return super.onContextItemSelected(item);
    }
}
