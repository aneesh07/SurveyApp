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

public class Part5 extends Activity implements OnCheckedChangeListener {
	 public static  TextView mahyco;
	 public static TextView ankur;

	 public  static RadioGroup ankurrg;
	 public  static RadioGroup mahycorg;
  
   private Button next;
   private int flagC=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.partner_screen5);
		next=(Button)findViewById(R.id.next_but5);
		mahyco=(TextView)findViewById(R.id.mahycoTextView);
		ankur=(TextView)findViewById(R.id.ankurTextView);
		
		ankurrg=(RadioGroup)findViewById(R.id.ankurRadioGroup);
		ankurrg.setOnCheckedChangeListener(this);
		mahycorg=(RadioGroup)findViewById(R.id.mahycoRadioGroup);
		mahycorg.setOnCheckedChangeListener(this);
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(flagC>=2)
				{
				Intent i=new Intent("android.intent.action.TECH");
				startActivity(i);
			}}
		});
		
		
		
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg0.getId())
		{
		
		case R.id.ankurRadioGroup:
		switch (arg1){
		case R.id.ankurRadioBut1:
		Part0.value[15]="Dealer";
		flagC++;
		break;
		case R.id.ankurRadioBut2:
		Part0.value[15]="Distributor";
		flagC++;
			break;
		case R.id.ankurRadioBut3:
		Part0.value[15]="Retailer";
		flagC++;
			break;
		}
		break;
		case R.id.mahycoRadioGroup:
			switch (arg1){
			case R.id.mahycoRadioBut1:
			Part0.value[16]="Dealer";
			flagC++;
			break;
			case R.id.mahycoRadioBut2:
			Part0.value[16]="Distributor";
			flagC++;
				break;
			case R.id.mahycoRadioBut3:
			Part0.value[16]="Retailer";
			flagC++;
				break;
			}
			break;
		
		}
	}
		
		}
		
			

