package com.ijazsunny37.fyphomesecuritysystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by apple on 21/8/17.
 */

public class Settings_Activity extends AppCompatActivity {
    Switch btn_system;
    TextView system_status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_settings);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(myToolbar);

        system_status =(TextView)findViewById(R.id.system_status);
        btn_system = (Switch) findViewById(R.id.btn_system);

        btn_system.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btn_system.setText("System is ON");
                } else {
                    btn_system.setText("System is OFF");
                }
            }
        });
    }
}
