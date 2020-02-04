package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.service.IProduitService;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {

	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public List<Produit> getProduits() {
		return produitService.getProduits();
	}
	
	@GetMapping("/{id}")
	public List<Produit> getProduit(@PathVariable Long id) {
		return produitService.getProduits();
	}
	
	@RequestMapping(path="/produit/{id}", method=RequestMethod.GET)
	public Produit getProd(@PathVariable Long id) {
		return produitService.getOne(id);
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit p) {
		produitService.addProduit(p);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable Long id) {
		produitService.deleteProduit(id);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit p) {
		produitService.updateProduit(p);
	}
	
}
