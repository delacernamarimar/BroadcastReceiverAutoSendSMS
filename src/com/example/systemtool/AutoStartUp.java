package com.example.systemtool;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class AutoStartUp extends Service{

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate();
		Toast.makeText(this, "Service is going???",Toast.LENGTH_LONG).show();
	}

}
