package com.xworkz.camera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera")
public class CameraEntity {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "pixels")
	private int pixels;
	
	@Column(name = "memoryCardSize")
	private String memoryCardSize;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "noOfLens")
	private int noOfLens;
	
	@Column(name = "quality")
	private boolean quality;
	
	@Column(name = "macroMode")
	private boolean macroMode;
	
	@Column(name = "autoFocus")
	private boolean autoFocus;
	
	public CameraEntity(String name, int pixels, String memoryCardSize, int price, int noOfLens, boolean quality,
			boolean macroMode, boolean autoFocus) {
	
		this.name = name;
		this.pixels = pixels;
		this.memoryCardSize = memoryCardSize;
		this.price = price;
		this.noOfLens = noOfLens;
		this.quality = quality;
		this.macroMode = macroMode;
		this.autoFocus = autoFocus;
	}
	public CameraEntity() {
		
	}
	@Override
	public String toString() {
		return "CameraEntity [name=" + name + ", pixels=" + pixels + ", memoryCardSize=" + memoryCardSize + ", price="
				+ price + ", noOfLens=" + noOfLens + ", quality=" + quality + ", macroMode=" + macroMode
				+ ", autoFocus=" + autoFocus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		CameraEntity other = (CameraEntity) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPixels() {
		return pixels;
	}
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	public String getMemoryCardSize() {
		return memoryCardSize;
	}
	public void setMemoryCardSize(String memoryCardSize) {
		this.memoryCardSize = memoryCardSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfLens() {
		return noOfLens;
	}
	public void setNoOfLens(int noOfLens) {
		this.noOfLens = noOfLens;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public boolean isMacroMode() {
		return macroMode;
	}
	public void setMacroMode(boolean macroMode) {
		this.macroMode = macroMode;
	}
	public boolean isAutoFocus() {
		return autoFocus;
	}
	public void setAutoFocus(boolean autoFocus) {
		this.autoFocus = autoFocus;
	}
	
	
	

}
