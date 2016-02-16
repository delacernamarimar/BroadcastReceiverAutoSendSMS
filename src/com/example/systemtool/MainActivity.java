package com.example.systemtool;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {
	private IntentFilter filter = new IntentFilter(Intent.ACTION_TIME_TICK);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		Toast.makeText(this, "Auto text is now activated",Toast.LENGTH_LONG).show();
	}
}
