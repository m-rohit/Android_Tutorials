package com.example.app10;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	TimePicker tp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tp=(TimePicker) findViewById(R.id.timePicker1);
		tp.setIs24HourView(true);
		
	}
	
	public void onClick(View v)
	{
		Toast.makeText(getBaseContext(), "Time Selected "+tp.getCurrentHour()+":"+tp.getCurrentMinute(), 
				Toast.LENGTH_SHORT).show();
	}

	}
