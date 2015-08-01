package com.example.gambal.intentex;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class appactivity extends Activity implements View.OnClickListener {
    Button specificapp_bt;
    Button developer_bt;
    Button search_bt;
    EditText search_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        specificapp_bt=(Button)findViewById(R.id.specificapp_bt);
        developer_bt = (Button)findViewById(R.id.developer_bt);
        search_bt= (Button)findViewById(R.id.search_bt);
        search_et = (EditText)findViewById(R.id.search_et);

        specificapp_bt.setOnClickListener(this);
        developer_bt.setOnClickListener(this);
        search_bt.setOnClickListener(this);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_appactivity, menu);
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
            case R.id.specificapp_bt:
                Intent specintent = new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=ranjith.naidu.filetransfer.gui"));
                startActivity(specintent);
                break;

            case R.id.developer_bt:
                Intent devintent = new Intent(Intent.ACTION_VIEW,Uri.parse("market://search?q=pub:ranjith naidu"));
                startActivity(devintent);
                break;

            case R.id.search_bt:
                String search_et1=search_bt.getText().toString();
                //Toast.makeText(appactivity.this, search_et1, Toast.LENGTH_SHORT).show();
                Intent searchintent = new Intent(Intent.ACTION_VIEW,Uri.parse("market://search?q=" + search_et1));
                startActivity(searchintent);
                break;
        }

    }
}
