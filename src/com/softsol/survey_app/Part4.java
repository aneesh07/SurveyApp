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

public class Part4 extends Activity implements OnCheckedChangeListener {
	 public static  TextView razi;
	 public static  TextView gharda;
	 public static  TextView naziveedu;
	 public static  RadioGroup ghardarg;
	 public static  RadioGroup razirg;
	 public static  RadioGroup naziveedurg;
   private Button next;
   private int flagC=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.partner_screen4);
		next=(Button)findViewById(R.id.next_but4);
		razi=(TextView)findViewById(R.id.raziTextView);
		gharda=(TextView)findViewById(R.id.ghardaTextView);
		naziveedu=(TextView)findViewById(R.id.naziveeduTextView);
		ghardarg=(RadioGroup)findViewById(R.id.ghardaRadioGroup);
		ghardarg.setOnCheckedChangeListener(this);
		razirg=(RadioGroup)findViewById(R.id.raziRadioGroup);
		razirg.setOnCheckedChangeListener(this);
		naziveedurg=(RadioGroup)findViewById(R.id.naziveeduRadioGroup);
		naziveedurg.setOnCheckedChangeListener(this);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flagC>=3)
				{
				Intent i=new Intent("android.intent.action.PART5");
				startActivity(i);
			}}
		});
		
		
		
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId())
		{
		
		case R.id.ghardaRadioGroup:
		switch (arg1){
		case R.id.ghardaRadioBut1:
		Part0.value[12]="Dealer";
		flagC++;
		break;
		case R.id.ghardaRadioBut2:
		Part0.value[12]="Distributor";
		flagC++;
			break;
		case R.id.ghardaRadioBut3:
		Part0.value[12]="Retailer";
		flagC++;
			break;
		}
		break;
		case R.id.raziRadioGroup:
			switch (arg1){
			case R.id.raziRadioBut1:
			Part0.value[13]="Dealer";
			flagC++;
			break;
			case R.id.raziRadioBut2:
			Part0.value[13]="Distributor";
			flagC++;
				break;
			case R.id.raziRadioBut3:
			Part0.value[13]="Retailer";
			flagC++;
				break;
			}
			break;
		case R.id.naziveeduRadioGroup:
			switch (arg1){
			case R.id.naziveeduRadioBut1:
			Part0.value[14]="Dealer";
			flagC++;
			break;
			case R.id.naziveeduRadioBut2:
			Part0.value[14]="Distributor";
			flagC++;
				break;
			case R.id.naziveeduRadioBut3:
			Part0.value[14]="Retailer";
			flagC++;
				break;
			}
			break;
		
		}
	}
		
		}
		
			

