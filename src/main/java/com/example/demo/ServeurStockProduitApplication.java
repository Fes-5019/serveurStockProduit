package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@SpringBootApplication
public class ServeurStockProduitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ServeurStockProduitApplication.class, args);
		ProduitRepository pdtRep=ctx.getBean(ProduitRepository.class);
		
//		pdtRep.save(new Produit("Régle", 5, 12));
//		pdtRep.save(new Produit("Crayon", 5, 1.5f));
//		pdtRep.save(new Produit("Table", 600, 15000));
	}

}
