package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@Service
@Primary
public class IProduitServiceDB implements IProduitService {

	@Autowired
	//@Qualifier("produitRepository")
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> getProduits() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit p) {
		produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Long id) {
		Produit p = new Produit();
		p.setId(id);
		produitRepository.delete(p);
	}

	@Override
	public void updateProduit(Produit p) {
		produitRepository.save(p);
	}

	@Override
	public Produit getOne(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.getOne(id);
	}

}
