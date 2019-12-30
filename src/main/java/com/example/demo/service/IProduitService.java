package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.*;

public interface IProduitService {
	List<Produit> getProduits();

	void addProduit(Produit p);

	void updateProduit(Produit p);

	void deleteProduit(Long id);

	Produit getOne(Long id);

}
