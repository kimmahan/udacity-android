package com.kimmahan.myandroidportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button spotify, scores, library, build, xyz, capstone;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVars();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeVars() {
        spotify = (Button)findViewById(R.id.button_spotify);
        scores = (Button)findViewById(R.id.button_scores);
        library = (Button)findViewById(R.id.button_library);
        build = (Button)findViewById(R.id.button_buildit);
        xyz = (Button)findViewById(R.id.button_xyz);
        capstone = (Button)findViewById(R.id.button_capstone);
        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        build.setOnClickListener(this);
        xyz.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    public void onClick(View v){

        switch(v.getId()){
            case R.id.button_spotify:
                Toast.makeText(this,R.string.toast_spotify, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_scores:
                Toast.makeText(this, R.string.toast_scores, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_library:
                Toast.makeText(this, R.string.toast_library, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_buildit:
                Toast.makeText(this, R.string.toast_buildit, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_xyz:
                Toast.makeText(this, R.string.toast_xyz, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(this, R.string.toast_capstone, Toast.LENGTH_SHORT).show();
                break;
        }

    }


}
