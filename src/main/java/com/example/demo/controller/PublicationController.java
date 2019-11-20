package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.node.Etudiant;
import com.example.demo.node.Publication;
import com.example.demo.repository.PublicationRepository;

@RestController
public class PublicationController {
	
	@Autowired
	PublicationRepository publicationrepository;
	
	@GetMapping("/getPublications")
	public List<Etudiant> getPublications(){
		return (List<Etudiant>) publicationrepository.graph();
	}
	
	@PostMapping("addPublication")
	public String addPublication(@RequestBody Publication publication) {
		
		publicationrepository.save(publication);
		return "publication addedd with success";
	}
	
}
