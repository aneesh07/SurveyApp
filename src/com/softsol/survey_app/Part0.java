package com.softsol.survey_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class Part0 extends Activity implements OnCheckedChangeListener {
   TextView bayer;
   TextView dupont;
   TextView basf;
   RadioGroup dupontrg;
   RadioGroup bayerrg;
   RadioGroup basfrg;
   private Button next;
   private int flagC=0;
  public static String[] value=new String[17];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.partner_screen);
		next=(Button)findViewById(R.id.next_but);
		bayer=(TextView)findViewById(R.id.bayerTextView);
		dupont=(TextView)findViewById(R.id.dupontTextView);
		basf=(TextView)findViewById(R.id.basfTextView);
		dupontrg=(RadioGroup)findViewById(R.id.dupontRadioGroup);
		dupontrg.setOnCheckedChangeListener(this);
		bayerrg=(RadioGroup)findViewById(R.id.bayerRadioGroup);
		bayerrg.setOnCheckedChangeListener(this);
		basfrg=(RadioGroup)findViewById(R.id.basfRadioGroup);
		basfrg.setOnCheckedChangeListener(this);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flagC>=3)
				{
				Intent i=new Intent("android.intent.action.PART1");
				startActivity(i);
				}
			}
		});
		
		
		
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId())
		{
		
		case R.id.dupontRadioGroup:
		switch (arg1){
		case R.id.dupontRadioBut1:
		value[0]="Dealer";
		flagC++;
		break;
		case R.id.dupontRadioBut2:
		value[0]="Distributor";
		flagC++;
			break;
		case R.id.dupontRadioBut3:
		value[0]="Retailer";
		flagC++;
			break;
		}
		break;
		case R.id.bayerRadioGroup:
			switch (arg1){
			case R.id.bayerRadioBut1:
			value[1]="Dealer";
			flagC++;
			break;
			case R.id.bayerRadioBut2:
			value[1]="Distributor";
			flagC++;
				break;
			case R.id.bayerRadioBut3:
			value[1]="Retailer";
			flagC++;
				break;
			}
			break;
		case R.id.basfRadioGroup:
			switch (arg1){
			case R.id.basfRadioBut1:
			value[2]="Dealer";
			flagC++;
			break;
			case R.id.basfRadioBut2:
			value[2]="Distributor";
			flagC++;
				break;
			case R.id.basfRadioBut3:
			value[2]="Retailer";
			flagC++;
				break;
			}
			break;
		
		}
	}
		
		}
		
			

