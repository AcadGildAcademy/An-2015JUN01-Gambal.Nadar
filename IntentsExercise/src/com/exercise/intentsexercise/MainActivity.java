package com.exercise.intentsexercise;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	Button appsButton,settingsButton,vibrateButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		appsButton = (Button) findViewById(R.id.Apps);
		settingsButton = (Button) findViewById(R.id.Settings);
		vibrateButton = (Button) findViewById(R.id.Vibrate);

		appsButton.setOnClickListener(this);
		settingsButton.setOnClickListener(this);
		vibrateButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.Apps:
			Intent appsIntent = new Intent(this,AppsActivity.class);
			startActivity(appsIntent);

			break;

		case R.id.Settings:
			Intent settingsIntent = new Intent(this,SettingsActivity.class);
			startActivity(settingsIntent);

			break;

		case R.id.Vibrate:
			Vibrator vib = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
			 // Vibrate for 500 milliseconds
			 vib.vibrate(500);
			break;
		}
	}
}
