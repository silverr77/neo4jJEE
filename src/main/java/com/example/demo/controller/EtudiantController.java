package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.node.Etudiant;
import com.example.demo.node.Publication;
import com.example.demo.repository.EtudiantRepository;

@RestController
public class EtudiantController {

	
	@Autowired
	EtudiantRepository etudiantrepository;
	
	
	
	@PostMapping("/addEtudiant")
	public String addEtudiant(@RequestBody Etudiant etudiant) {
		etudiantrepository.save(etudiant);
		return "etudiant added succ";
	}
	
}
