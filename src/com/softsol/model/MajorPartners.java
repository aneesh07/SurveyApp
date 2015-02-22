package com.softsol.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Partners")
public class MajorPartners extends Model {
	
	 @Column(name = "Bayer")
	    public String bayer;
	 @Column(name = "DuPont")
	    public String duPont;
	 @Column(name = "BASF")
	    public String basf;
	 @Column(name = "Monsanto")
	    public String monsanto;
	 @Column(name = "TataRallis")
	    public String tataRallis;
	 @Column(name = "Cheminova")
	    public String cheminova;
	 @Column(name = "Syngenta")
	    public String syngenta;
	 @Column(name = "UPL")
	    public String upl;
	 @Column(name = "Nagarjuna")
	    public String nagarjuna;
	 @Column(name = "Pioneer")
	    public String pioneer;
	 @Column(name = "Rallies")
	    public String rallies;
	 @Column(name = "Excel")
	    public String excel;
	 @Column(name = "Gharda")
	    public String gharda;
	 @Column(name = "Razi")
	    public String razi;
	 @Column(name = "Naziveedu")
	    public String naziveedu;
	 @Column(name = "Ankur	")
	    public String ankur;
	 @Column(name = "Mahyco")
	    public String mahyco;

	 public MajorPartners()
	    {
	        super();
	    }
	 
	    public MajorPartners(String[] values)
	    {
	        super();
	        	 this.bayer = values[0];	
		         this.duPont = values[1]; 
			     this.basf = values[2];
			     this.monsanto = values[3];
			     this.tataRallis = values[4];
			     this.cheminova = values[5];
			     this.syngenta = values[6];
			     this.upl = values[7];
			     this.nagarjuna = values[8];
			     this.pioneer = values[9];
			     this.rallies = values[10];
			     this.excel = values[11];
			     this.gharda = values[12];
			     this.razi = values[13];
			     this.naziveedu = values[14];
			     this.ankur = values[15];
			     this.mahyco = values[16];
	        	
	        }
	        
	               
	    }
	 
