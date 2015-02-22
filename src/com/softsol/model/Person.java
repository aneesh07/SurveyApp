package com.softsol.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Person")
public class Person extends Model {
	
	@Column(name = "personName")
	public String personName;
	@Column(name = "address")
	public String address;
	@Column(name = "district")
	public String district; 
	@Column(name = "block")
	public String block;
	@Column(name = "MajorPartnersId")
	public MajorPartners majorPartnerId;
	@Column(name = "TechnicalDetailsId")
	public TechnicalDetails technicalDetailsId;
	
	public Person()
	{
		super();
	}
	
	public Person(String personName ,String address , String district, String block, MajorPartners majorPartnersId, TechnicalDetails technicalDetailsId)
	{
		super();
		this.personName = personName;
		this.address = address;
		this.district = district;
		this.block = block; 
		this.majorPartnerId = majorPartnersId;
		this.technicalDetailsId = technicalDetailsId;
		
		
	}

}