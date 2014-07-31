package com.serruys.androidtestproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void buttonClick(View V){
		Toast.makeText(this, "Hey!", Toast.LENGTH_SHORT).show();
	}

}