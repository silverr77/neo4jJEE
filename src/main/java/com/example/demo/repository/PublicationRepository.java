package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.demo.node.Etudiant;
import com.example.demo.node.Publication;

public interface PublicationRepository extends Neo4jRepository<Publication, Long>{

	@Query("MATCH (u:Etudiant)<-[r:PUBLISH]-(m:Publication) RETURN u,r,m")
	List<Etudiant> graph();

	
	
}
