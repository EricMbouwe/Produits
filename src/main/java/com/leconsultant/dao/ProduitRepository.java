package com.leconsultant.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.leconsultant.entities.Produits;

public interface ProduitRepository extends JpaRepository<Produits, Long>{  // en parametre l'entite et le type de l'Id de l'entite
	public Page<Produits> findByDesignationContains(String mc,Pageable pageable);
}
