package com.example.List1;

import android.os.Bundle;

import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class List extends Activity {

	ListView lv;
	String[] pd={"John F. Kennedy","Narendra Modi","Barak Obama",
			"David Anderson"};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
	
	lv=(ListView) findViewById(R.id.listView1);
	//setListAdapter sl=new setListAdapter();
	ArrayAdapter ad=new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_1, pd);
	lv.setAdapter(ad);
	}
    
	
	//--No.1--
	public void onListItemClick(
			ListView parent, View v, int position, long id )
	{
		Toast.makeText(this, "You have selected"+pd[position], Toast.LENGTH_SHORT).show();
	}
	
	}
