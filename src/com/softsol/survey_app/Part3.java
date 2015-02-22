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

public class Part3 extends Activity implements OnCheckedChangeListener {
	 public static  TextView rallies;
	 public static TextView pioneer;
	 public static TextView excel;
	 public static RadioGroup pioneerrg;
	 public static RadioGroup ralliesrg;
	 public static RadioGroup excelrg;
   private Button next;
   private int flagC=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.partner_screen3);
		next=(Button)findViewById(R.id.next_but3);
		rallies=(TextView)findViewById(R.id.ralliesTextView);
		pioneer=(TextView)findViewById(R.id.pioneerTextView);
		excel=(TextView)findViewById(R.id.excelTextView);
		pioneerrg=(RadioGroup)findViewById(R.id.pioneerRadioGroup);
		pioneerrg.setOnCheckedChangeListener(this);
		ralliesrg=(RadioGroup)findViewById(R.id.ralliesRadioGroup);
		ralliesrg.setOnCheckedChangeListener(this);
		excelrg=(RadioGroup)findViewById(R.id.excelRadioGroup);
		excelrg.setOnCheckedChangeListener(this);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flagC>=3)
				{
				Intent i=new Intent("android.intent.action.PART4");
				startActivity(i);
			}}
		});
		
		
		
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId())
		{
		
		case R.id.pioneerRadioGroup:
		switch (arg1){
		case R.id.pioneerRadioBut1:
		Part0.value[9]="Dealer";
		flagC++;
		break;
		case R.id.pioneerRadioBut2:
		Part0.value[9]="Distributor";
		flagC++;
			break;
		case R.id.pioneerRadioBut3:
		Part0.value[9]="Retailer";
		flagC++;
			break;
		}
		break;
		case R.id.ralliesRadioGroup:
			switch (arg1){
			case R.id.ralliesRadioBut1:
			Part0.value[10]="Dealer";
			flagC++;
			break;
			case R.id.ralliesRadioBut2:
			Part0.value[10]="Distributor";
			flagC++;
				break;
			case R.id.ralliesRadioBut3:
			Part0.value[10]="Retailer";
			flagC++;
				break;
			}
			break;
		case R.id.excelRadioGroup:
			switch (arg1){
			case R.id.excelRadioBut1:
			Part0.value[11]="Dealer";
			flagC++;
			break;
			case R.id.excelRadioBut2:
			Part0.value[11]="Distributor";
			flagC++;
				break;
			case R.id.excelRadioBut3:
			Part0.value[11]="Retailer";
			flagC++;
				break;
			}
			break;
		
		}
	}
		
		}
		
			

