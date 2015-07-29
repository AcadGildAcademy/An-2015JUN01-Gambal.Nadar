package com.example.gambal.intentapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    Button  app_bt1, setting_bt1, vibrate_bt1;
    EditText search_txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_bt1 = (Button) findViewById(R.id.app_bt);
        setting_bt1=(Button)findViewById(R.id.setting_bt);
        vibrate_bt1=(Button)findViewById(R.id.vibrate_bt);
        search_txt1 = (EditText)findViewById(R.id.search_txt);


        app_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=ranjith.naidu.filetransfer.gui"));
                Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=ranjith.naidu.filetransfer.gui" ));
                startActivity(intent1);
                Toast.makeText(getApplicationContext(),"App Button Clicked",Toast.LENGTH_SHORT).show();
           }
        });

        setting_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Setting Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        vibrate_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search_txt2= search_txt1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/#q="+search_txt2));
                //Intent intent = new Intent(Intent.Action_);
                //intent.setData(Uri.parse("market://details?id=TeamViewer"));
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Vibrate Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
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
}
