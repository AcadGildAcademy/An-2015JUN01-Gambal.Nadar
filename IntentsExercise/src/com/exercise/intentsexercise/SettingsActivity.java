package com.exercise.intentsexercise;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingsActivity extends Activity implements OnClickListener{

	Button wifi,bluetooth,addAccount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		wifi = (Button) findViewById(R.id.wifi);
		bluetooth = (Button) findViewById(R.id.bluetooth);
		addAccount = (Button) findViewById(R.id.add);

		wifi.setOnClickListener(this);
		bluetooth.setOnClickListener(this);
		addAccount.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.wifi:
			Intent wifi = new Intent(WifiManager.ACTION_PICK_WIFI_NETWORK);
			startActivity(wifi);
			break;

		case R.id.bluetooth:
			Intent bluetooth = new Intent(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS);
			startActivity(bluetooth);
			break;

		case R.id.add:
			Intent account = new Intent(Settings.ACTION_SYNC_SETTINGS);
			startActivity(account);
			
			break;
		}
	}
}


