package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;

@Service
public class IProduitServiceImp implements IProduitService {
	List<Produit> listProduits;

	public IProduitServiceImp() {
		listProduits = new ArrayList<Produit>();
		listProduits.add(new Produit("wwwwwww", 300, 12));
		listProduits.add(new Produit("Styyyyyyl", 500, 1.5f));
		listProduits.add(new Produit("Cartable", 90, 15000));
	}

	@Override
	public List<Produit> getProduits() {
		return listProduits;
	}

	@Override
	public void addProduit(Produit p) {
		listProduits.add(p);

	}

	@Override
	public void deleteProduit(String ref) {
		Produit p=new Produit();
		p.setRef(ref);
		listProduits.remove(p);

	}

	@Override
	public void updateProduit(Produit p) {
	      deleteProduit(p.getRef());
		  addProduit(p);
	}

}
