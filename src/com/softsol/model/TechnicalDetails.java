package com.softsol.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "TechnicalDetails")
public class TechnicalDetails extends Model {
    
	@Column(name = "storeArea")
	public String storeArea;
	@Column(name = "numberOfSalesPerson")
	public String numberOfSalesPerson;
	@Column(name = "totalRevenue")
	public String totalRevenue;
	@Column(name = "numberOfFarmersServing")
	public String numberOfFarmersServing;
	@Column(name = "catchmentArea")
	public String catchmentArea;
	@Column(name = "farmerOrientedService")
	public String farmerOrientedService;
	
	public TechnicalDetails()
	{
		super();
	}
	
	public TechnicalDetails(String storeArea,String numberOfSalesPerson,String totalRevenue,
			                String numberOfFarmersServing, String catchmentArea,String farmerOrientedService )
	{
		super();
		this.storeArea = storeArea;
		this.numberOfSalesPerson = numberOfSalesPerson;
		this.totalRevenue = totalRevenue;
        this.numberOfFarmersServing = numberOfFarmersServing;
        this.catchmentArea = catchmentArea;
        this.farmerOrientedService = farmerOrientedService;
	}
	
	
}
