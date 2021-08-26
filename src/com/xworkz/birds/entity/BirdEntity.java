package com.xworkz.birds.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bird")
public class BirdEntity  implements Serializable{
	@Column(name = "b_id")
	@Id
	private int id ;
	
	@Column(name = "b_name")
	private String name;
	
	@Column(name = "b_lifespan")
	private int lifespan;
	
	@Column(name = "b_colour")
	private String colour;
	
	@Column(name = "b_breed")
	private String breed;
	
	@Column(name = "b_LayingEggs")
	private boolean LayingEggs;
	
	@Column(name = "b_fly")
	private boolean fly;
	
	@Column(name = "b_weight")
	private float weight;
	
	@Column(name = "b_height")
	private float height;
	
	public BirdEntity(int id, String name, int lifespan, String colour, String breed, boolean layingEggs, boolean fly,
			float weight, float height) {
		
		this.id = id;
		this.name = name;
		this.lifespan = lifespan;
		this.colour = colour;
		this.breed = breed;
		LayingEggs = layingEggs;
		this.fly = fly;
		this.weight = weight;
		this.height = height;
	}
	public BirdEntity() {
		
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
		BirdEntity other = (BirdEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", lifespan=" + lifespan + ", colour=" + colour + ", breed="
				+ breed + ", LayingEggs=" + LayingEggs + ", fly=" + fly + ", weight=" + weight + ", height=" + height
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifespan() {
		return lifespan;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isLayingEggs() {
		return LayingEggs;
	}
	public void setLayingEggs(boolean layingEggs) {
		LayingEggs = layingEggs;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}


}
