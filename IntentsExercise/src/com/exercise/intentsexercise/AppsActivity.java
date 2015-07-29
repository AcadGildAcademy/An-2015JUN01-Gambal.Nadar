package com.exercise.intentsexercise;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AppsActivity extends Activity implements OnClickListener{

	Button specificApps,developerApps,searchApps;
	EditText input;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apps);

		specificApps = (Button) findViewById(R.id.specific);
		developerApps = (Button) findViewById(R.id.developer);
		searchApps = (Button) findViewById(R.id.search);

		input = (EditText) findViewById(R.id.input);

		specificApps.setOnClickListener(this);
		developerApps.setOnClickListener(this);
		searchApps.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.specific:
			Intent specificIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=ranjith.naidu.filetransfer.gui"));
			startActivity(specificIntent);
			break;

		case R.id.developer:
			Intent developerIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("market://search?q=pub:ranjith naidu"));
			startActivity(developerIntent);
			break;

		case R.id.search:

			String ip = input.getText().toString();
			String url = "market://search?q=" + ip;
			Intent searchIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
			startActivity(searchIntent);
			break;
		}
	}
}


