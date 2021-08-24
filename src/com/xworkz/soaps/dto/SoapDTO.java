package com.xworkz.soaps.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.soaps.constants.SoapType;
@Entity
@Table(name = "soap")
public class SoapDTO  implements Serializable{
	@Column(name = "s_id")
	@Id
	private int id;
	
@Column(name = "s_name")
	private String brandAmbassador;
@Column(name = "s_odour")
	private String odour;
@Column(name = "s_certified")
	private boolean certified;
@Column(name = "s_antiBacterial")
	private boolean antiBacterial;
@Column(name = "s_type")
	private SoapType type;
	public SoapDTO(int id, String brandAmbassador, String odour, boolean certified, boolean antiBacterial,
			SoapType type) {
		
		this.id = id;
		this.brandAmbassador = brandAmbassador;
		this.odour = odour;
		this.certified = certified;
		this.antiBacterial = antiBacterial;
		this.type = type;
	}
	public SoapDTO() {
		
	}
	@Override
	public String toString() {
		return "SoapDTO [id=" + id + ", brandAmbassador=" + brandAmbassador + ", odour=" + odour + ", certified="
				+ certified + ", antiBacterial=" + antiBacterial + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoapDTO other = (SoapDTO) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandAmbassador() {
		return brandAmbassador;
	}
	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}
	public String getOdour() {
		return odour;
	}
	public void setOdour(String odour) {
		this.odour = odour;
	}
	public boolean isCertified() {
		return certified;
	}
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
	public boolean isAntiBacterial() {
		return antiBacterial;
	}
	public void setAntiBacterial(boolean antiBacterial) {
		this.antiBacterial = antiBacterial;
	}
	public SoapType getType() {
		return type;
	}
	public void setType(SoapType type) {
		this.type = type;
	}
	

}
