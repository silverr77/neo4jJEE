package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.demo.node.Etudiant;
import com.example.demo.node.Publication;

public interface EtudiantRepository extends Neo4jRepository<Etudiant, Long>{
	
	
}
