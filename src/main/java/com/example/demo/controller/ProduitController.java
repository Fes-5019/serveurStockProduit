package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.service.IProduitService;
import com.example.demo.service.IProduitServiceImp;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public List<Produit> getProduits() {
		System.out.println("ok");
		return produitService.getProduits();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit p) {
		produitService.addProduit(p);
	}
	
	@DeleteMapping("/{ref}")
	public void deleteProduit(@PathVariable String ref) {
		produitService.deleteProduit(ref);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit p) {
		produitService.updateProduit(p);
	}
	
}
