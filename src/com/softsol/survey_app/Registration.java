package com.softsol.survey_app;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends Activity {
	 public  static Button save;
	 public  static EditText name;
	 public  static EditText address;
	 public  static EditText district;
	 public  static EditText block;
	 NotificationManager nm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.register_screen);
		save=(Button) findViewById(R.id.save_but);
		name=(EditText)findViewById(R.id.name_edit);
		address=(EditText) findViewById(R.id.address_edit);
		district=(EditText) findViewById(R.id.district_edit);
		block=(EditText) findViewById(R.id.block_edit);
		name.setInputType(InputType.TYPE_CLASS_TEXT);
		address.setInputType(InputType.TYPE_CLASS_TEXT);
		district.setInputType(InputType.TYPE_CLASS_TEXT);
		block.setInputType(InputType.TYPE_CLASS_NUMBER);
		nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		//save.setEnabled(false);
		
			//save.setEnabled(true);
			save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if ((name.getText().length()>0)&&(address.getText().length()>0)&&(block.getText().length()>0)&&(district.getText().length()>0))
				{
					
					Intent i=new Intent("android.intent.action.PART0");
					startActivity(i);
				}
				
			}
		});
		
		
	}
	 

}
