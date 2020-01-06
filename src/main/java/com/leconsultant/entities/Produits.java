package com.leconsultant.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produits implements Serializable{     // un java bean est une classe serialisable / elle devient une entite jpa lorsque on utilise lannotaion @entity.
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double prix;
	private int quantite;
	private String designation;
	
	
	public Produits(int prix, int quantite, String designation) {
		super();
		this.prix = prix;
		this.quantite = quantite;
		this.designation = designation;
	}
	
	public Produits() {
		super();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
