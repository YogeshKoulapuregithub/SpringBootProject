package com.jsp.springboot.Actor.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
//@Table(name="actor_db")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int actorId;
	private String actorName;
	private String actorIndustry;
	private String natinality;
	private int actorAge;
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorIndustry() {
		return actorIndustry;
	}
	public void setActorIndustry(String actorIndustry) {
		this.actorIndustry = actorIndustry;
	}
	public String getNatinality() {
		return natinality;
	}
	public void setNatinality(String natinality) {
		this.natinality = natinality;
	}
	public int getActorAge() {
		return actorAge;
	}
	public void setActorAge(int actorAge) {
		this.actorAge = actorAge;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorIndustry=" + actorIndustry
				+ ", natinality=" + natinality + ", actorAge=" + actorAge + "]";
	}
	
	

}
