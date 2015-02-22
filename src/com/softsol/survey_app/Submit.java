package com.softsol.survey_app;

import com.softsol.model.MajorPartners;
import com.softsol.model.Person;
import com.softsol.model.TechnicalDetails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Submit extends Activity {
    Button sub;
    Button exi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		setContentView(R.layout.submit_screen);
		sub=(Button)findViewById(R.id.sub_but);
		exi=(Button)findViewById(R.id.exi_but);
		
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String yesNo;
				if(Tech.flag==1){ yesNo="YES";}
				else{yesNo="NO";}
					
			    TechnicalDetails technicalDetails = new TechnicalDetails(
			     Tech.store_area.getText().toString(),
			     Tech.no_of_sales.getText().toString(),
			     Tech.total_rev.getText().toString(),
			     Tech.no_of_farm.getText().toString(),
			     Tech.catch_area.getText().toString(),
			     yesNo);
			     
			    technicalDetails.save();
			    
			    MajorPartners majorPartners = new MajorPartners(Part0.value);
			    majorPartners.save();
			    
			    
			    Person person = new Person(Registration.name.getText().toString(), Registration.address.getText().toString(),
			    		                   Registration.district.getText().toString(), Registration.block.getText().toString(),
			    		                   majorPartners, technicalDetails);
			    person.save();
				
			    Intent intent = new Intent(getApplicationContext(), Start.class);
			    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			    intent.putExtra("EXIT", true);
			    startActivity(intent);
				
			}
			
		
		});
		exi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String yesNo;
				if(Tech.flag==1){ yesNo="YES";}
				else{yesNo="NO";}
					
			    TechnicalDetails technicalDetails = new TechnicalDetails(
			     Tech.store_area.getText().toString(),
			     Tech.no_of_sales.getText().toString(),
			     Tech.total_rev.getText().toString(),
			     Tech.no_of_farm.getText().toString(),
			     Tech.catch_area.getText().toString(),
			     yesNo);
			     
			    technicalDetails.save();
			    
			    MajorPartners majorPartners = new MajorPartners(Part0.value);
			    majorPartners.save();
			    
			    
			    Person person = new Person(Registration.name.getText().toString(), Registration.address.getText().toString(),
			    		                   Registration.district.getText().toString(), Registration.block.getText().toString(),
			    		                   majorPartners, technicalDetails);
			    person.save();
			    Intent intent = new Intent(getApplicationContext(), Start.class);
			    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			    intent.putExtra("SHUT", true);
			    startActivity(intent);
				
			}
		});
		
		
		
		
		
	}
}
