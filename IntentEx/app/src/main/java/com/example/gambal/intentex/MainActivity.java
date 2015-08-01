package com.example.gambal.intentex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {
    Button app_bt;
    Button setting_bt;
    Button vibrate_bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        app_bt = (Button) findViewById(R.id.app_bt);
        setting_bt = (Button) findViewById(R.id.setting_bt);
        vibrate_bt = (Button) findViewById(R.id.vibrate_bt);

        app_bt.setOnClickListener(this);
        setting_bt.setOnClickListener(this);
        vibrate_bt.setOnClickListener(this);


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

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.app_bt:
                Intent appintent = new Intent(MainActivity.this,appactivity.class);
                startActivity(appintent);
                //Toast.makeText(MainActivity.this,"App", Toast.LENGTH_SHORT).show();

                break;

            case R.id.setting_bt:
                Intent settingsintent = new Intent(MainActivity.this,settingsactivity.class);
                startActivity(settingsintent);
                Toast.makeText(MainActivity.this,"Setting", Toast.LENGTH_SHORT).show();
                break;

            case R.id.vibrate_bt:
                Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(500);
                Toast.makeText(MainActivity.this,"Vibrate", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
