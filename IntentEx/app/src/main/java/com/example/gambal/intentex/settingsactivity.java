package com.example.gambal.intentex;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class settingsactivity extends Activity implements View.OnClickListener{

    Button wifi_bt;
    Button bluetooth_bt;
    Button addaccount_bt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingsactivity);

        wifi_bt=(Button)findViewById(R.id.wifi_bt);
        bluetooth_bt=(Button)findViewById(R.id.bluetooth_bt);
        addaccount_bt=(Button)findViewById(R.id.addaccount_bt);


        wifi_bt.setOnClickListener(this);
        bluetooth_bt.setOnClickListener(this);
        addaccount_bt.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settingsactivity, menu);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.wifi_bt:
                Intent wifi = new Intent (WifiManager.ACTION_PICK_WIFI_NETWORK);
                startActivity(wifi);
                break;
            case R.id.bluetooth_bt:
                Intent blue = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                startActivity(blue);
                break;
            case R.id.addaccount_bt:
                Intent addac = new Intent(Settings.ACTION_SYNC_SETTINGS);
                startActivity(addac);
                break;

        }

    }
}
