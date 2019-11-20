package com.example.demo.node;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@NoArgsConstructor
public class Etudiant {

	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String filiere;
	@Relationship(type = "PUBLISH", direction = Relationship.INCOMING)
	private List<Publication> publications;
	
	
	@Relationship(type = "Comment", direction = Relationship.INCOMING)
	private List<Publication> publications_Comments;
	
	
	
	
	public Etudiant(String nom, String prenom, String filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getFiliere() {
		return filiere;
	}




	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}




	public List<Publication> getPublications() {
		return publications;
	}




	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}




	public List<Publication> getPublications_Comments() {
		return publications_Comments;
	}




	public void setPublications_Comments(List<Publication> publications_Comments) {
		this.publications_Comments = publications_Comments;
	}
	
	
	
	
	
	
}
