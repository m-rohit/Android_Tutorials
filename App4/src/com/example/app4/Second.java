package com.example.app4;

import android.os.Bundle;
import android.annotation.SuppressLint;
//import android.app.Activity;
import android.app.Fragment;
import android.view.*;

//@SuppressLint("NewApi")
public class Second extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState)
	
	//Inflate the layout for this fragment
	{
		return inflater.inflate(R.layout.activity_second, container, false);
	
		
	}
}
