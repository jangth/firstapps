package com.jangth.first.morningcall;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MorningCallSettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_call_setting);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.morning_call_setting, menu);
        return true;
    }
    
    public void onClickTimeSettingButton(View v) {
    	DialogFragment newFragment = new MorningTimePickerDialog();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
}
