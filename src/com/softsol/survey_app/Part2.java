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

public class Part2 extends Activity implements OnCheckedChangeListener {
	 public static  TextView upl;
	 public static  TextView syngenta;
	 public static TextView nagarjuna;
	 public static  RadioGroup syngentarg;
	 public static  RadioGroup uplrg;
	 public static  RadioGroup nagarjunarg;
     private Button next;
     private int flagC=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.partner_screen2);
		next=(Button)findViewById(R.id.next_but2);
		upl=(TextView)findViewById(R.id.uplTextView);
		syngenta=(TextView)findViewById(R.id.syngentaTextView);
		nagarjuna=(TextView)findViewById(R.id.nagarjunaTextView);
		syngentarg=(RadioGroup)findViewById(R.id.syngentaRadioGroup);
		syngentarg.setOnCheckedChangeListener(this);
		uplrg=(RadioGroup)findViewById(R.id.uplRadioGroup);
		uplrg.setOnCheckedChangeListener(this);
		nagarjunarg=(RadioGroup)findViewById(R.id.nagarjunaRadioGroup);
		nagarjunarg.setOnCheckedChangeListener(this);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flagC>=3)
				{
				Intent i=new Intent("android.intent.action.PART3");
				startActivity(i);
			}}
		});
		
		
		
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId())
		{
		
		case R.id.syngentaRadioGroup:
		switch (arg1){
		case R.id.syngentaRadioBut1:
		Part0.value[6]="Dealer";
		flagC++;
		break;
		case R.id.syngentaRadioBut2:
		Part0.value[6]="Distributor";
		flagC++;
			break;
		case R.id.syngentaRadioBut3:
		Part0.value[6]="Retailer";
		flagC++;
			break;
		}
		break;
		case R.id.uplRadioGroup:
			switch (arg1){
			case R.id.uplRadioBut1:
			Part0.value[7]="Dealer";
			flagC++;
			break;
			case R.id.uplRadioBut2:
			Part0.value[7]="Distributor";
			flagC++;
				break;
			case R.id.uplRadioBut3:
			Part0.value[7]="Retailer";
			flagC++;
				break;
			}
			break;
		case R.id.nagarjunaRadioGroup:
			switch (arg1){
			case R.id.nagarjunaRadioBut1:
			Part0.value[8]="Dealer";
			flagC++;
			break;
			case R.id.nagarjunaRadioBut2:
			Part0.value[8]="Distributor";
			flagC++;
				break;
			case R.id.nagarjunaRadioBut3:
			Part0.value[8]="Retailer";
			flagC++;
				break;
			}
			break;
		
		}
	}
		
		}
		
			

