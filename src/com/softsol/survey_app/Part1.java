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

public class Part1 extends Activity implements OnCheckedChangeListener {
	 public static TextView tatarallis;
	 public static TextView monsanto;
	 public static TextView cheminova;
	 public static RadioGroup monsantorg;
	 public static RadioGroup tatarallisrg;
	 public static RadioGroup cheminovarg;
   private Button next;
   private int flagC=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.partner_screen1);
		next=(Button)findViewById(R.id.next_but1);
		tatarallis=(TextView)findViewById(R.id.tatarallisTextView);
		monsanto=(TextView)findViewById(R.id.monsantoTextView);
		cheminova=(TextView)findViewById(R.id.cheminovaTextView);
		monsantorg=(RadioGroup)findViewById(R.id.monsantoRadioGroup);
		monsantorg.setOnCheckedChangeListener(this);
		tatarallisrg=(RadioGroup)findViewById(R.id.tatarallisRadioGroup);
		tatarallisrg.setOnCheckedChangeListener(this);
		cheminovarg=(RadioGroup)findViewById(R.id.cheminovaRadioGroup);
		cheminovarg.setOnCheckedChangeListener(this);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flagC>=3)
				{
				Intent i=new Intent("android.intent.action.PART2");
				startActivity(i);
			}}
		});
		
		
		
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId())
		{
		
		case R.id.monsantoRadioGroup:
		switch (arg1){
		case R.id.monsantoRadioBut1:
		Part0.value[3]="Dealer";
		flagC++;
		break;
		case R.id.monsantoRadioBut2:
		Part0.value[3]="Distributor";
		flagC++;
			break;
		case R.id.monsantoRadioBut3:
		Part0.value[3]="Retailer";
		flagC++;
			break;
		}
		break;
		case R.id.tatarallisRadioGroup:
			switch (arg1){
			case R.id.tatarallisRadioBut1:
			Part0.value[4]="Dealer";
			flagC++;
			break;
			case R.id.tatarallisRadioBut2:
			Part0.value[4]="Distributor";
			flagC++;
				break;
			case R.id.tatarallisRadioBut3:
			Part0.value[4]="Retailer";
			flagC++;
				break;
			}
			break;
		case R.id.cheminovaRadioGroup:
			switch (arg1){
			case R.id.cheminovaRadioBut1:
			Part0.value[5]="Dealer";
			flagC++;
			
			break;
			case R.id.cheminovaRadioBut2:
			Part0.value[5]="Distributor";
			flagC++;
				break;
			case R.id.cheminovaRadioBut3:
			Part0.value[5]="Retailer";
			flagC++;
				break;
			}
			break;
		
		}
	}
		
		}
		
			

