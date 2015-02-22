package com.softsol.survey_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Tech extends Activity implements OnCheckedChangeListener{
    public static  EditText store_area;
    public static EditText no_of_sales;
    public static EditText total_rev;
    public static EditText no_of_farm;
    public static EditText catch_area;
    public static RadioGroup farm_ser;
    private Button  next;
    public static int flag=0;
    private int flagC=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.td_screen);
		store_area=(EditText)findViewById(R.id.editText1);
		no_of_sales=(EditText)findViewById(R.id.editText2);
		total_rev=(EditText)findViewById(R.id.editText3);
		no_of_farm=(EditText)findViewById(R.id.editText4);
		catch_area=(EditText)findViewById(R.id.editText5);
		farm_ser=(RadioGroup)findViewById(R.id.radioGroup1);
		next=(Button)findViewById(R.id.next_buttd);
		farm_ser.setOnCheckedChangeListener(this);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if((store_area.getText().length()>0)&&(no_of_sales.getText().length()>0)&&(total_rev.getText().length()>0)&&(no_of_farm.getText().length()>0)&&(catch_area.getText().length()>0)&&(flagC>=1))
				{
					if(flag==0)
				{
					Intent i=new Intent("android.intent.action.SUBMIT");
					startActivity(i);
				}
				if(flag==1)
				{
					Intent i=new Intent("android.intent.action.DOS");
					startActivity(i);
				}
				
			}}
		});
	}
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch(arg1)
		{
		case R.id.radio0:
			flag=1;
			flagC++;
			break;
		case R.id.radio1:
			flag=0;
			flagC++;
			break;
			
		}
	}
	
	
}
