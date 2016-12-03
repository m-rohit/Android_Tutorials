package com.example.app13;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {
	
	String[] fn={"Indu","Neetu","Reetu","Deepu","Rohit",
			"Rohini","Rahul","Rishu","Sourav","Dhuruv"};
	
	Spinner sp;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> ad=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, fn);
		sp=(Spinner) findViewById(R.id.spinner1);
		sp.setAdapter(ad);
		sp.setOnItemSelectedListener(new OnItemSelectedListener()
		{
	
    public void onItemSelected(AdapterView<?> arg0,
			View arg1, int arg2, long arg3)
	{
		int index=arg0.getSelectedItemPosition();
		Toast.makeText(getBaseContext(), "You have selected item : "+fn[index], 
				Toast.LENGTH_SHORT).show();
	}
	
    public void onNothingSelected(AdapterView<?> arg0)
	{
		
	}

	});
}}