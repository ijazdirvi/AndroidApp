package com.ijazsunny37.fyphomesecuritysystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by apple on 21/8/17.
 */

public class Home_Activity extends AppCompatActivity {

    Button settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(myToolbar);

        //settings = (Button) findViewById(R.id.btn_settings);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.email:
                Intent intent =  new Intent(Home_Activity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Email Area",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.setting:
                Intent intent1 =  new Intent(Home_Activity.this, Settings_Activity.class);
                startActivity(intent1);
                Toast.makeText(getApplicationContext(),"Settings Area",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }



}