package com.example.Stest;

import android.os.Bundle;
import android.app.Activity;

import android.content.*;
import android.view.*;
import android.widget.*;

public class Second extends Activity {
	
	EditText et;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	
		et=(EditText) findViewById(R.id.editText1);
		btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name=et.getText().toString();
				Intent i=new Intent("com.example.Stest.First");
				i.putExtra("key",name);
				startActivity(i);
				
			}
		});
	
	}

	}
