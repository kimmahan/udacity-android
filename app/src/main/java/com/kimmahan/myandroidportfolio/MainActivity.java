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
        spotify = (Button)findViewById(R.id.button_main1);
        scores = (Button)findViewById(R.id.button_main2);
        library = (Button)findViewById(R.id.button_main3);
        build = (Button)findViewById(R.id.button_main4);
        xyz = (Button)findViewById(R.id.button_main5);
        capstone = (Button)findViewById(R.id.button_main6);
        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        build.setOnClickListener(this);
        xyz.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    public void onClick(View v){

        switch(v.getId()){
            case R.id.button_main1:
                Toast.makeText(this, "This will launch the Spotify Streamer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_main2:
                Toast.makeText(this, "Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_main3:
                Toast.makeText(this, "Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_main4:
                Toast.makeText(this, "Build it bigger", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_main5:
                Toast.makeText(this, "XYZ", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_main6:
                Toast.makeText(this, "Capstone!", Toast.LENGTH_LONG).show();
                break;
        }

    }


}
