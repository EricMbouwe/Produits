package com.leconsultant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leconsultant.dao.ProduitRepository;
import com.leconsultant.entities.Produits;

@SpringBootApplication
public class GetidApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository prodRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GetidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		prodRepo.save(new Produits(45000, 28, "TV sony"));
		prodRepo.save(new Produits(13000, 5, "Douille"));
		prodRepo.save(new Produits(1800, 12, "marteau"));
		prodRepo.save(new Produits(6500, 8, "fer arepasser"));
		prodRepo.save(new Produits(16000, 21, "Ventilateur"));
		prodRepo.save(new Produits(5100, 14, "Moteur"));
		
		prodRepo.save(new Produits(45000, 28, "TV sony"));
		prodRepo.save(new Produits(13000, 5, "Douille"));
		prodRepo.save(new Produits(1800, 12, "marteau"));
		prodRepo.save(new Produits(6500, 8, "fer arepasser"));
		prodRepo.save(new Produits(16000, 21, "Ventilateur"));
		prodRepo.save(new Produits(5100, 14, "Moteur"));
		
		prodRepo.save(new Produits(45000, 28, "TV sony"));
		prodRepo.save(new Produits(13000, 5, "Douille"));
		prodRepo.save(new Produits(1800, 12, "marteau"));
		prodRepo.save(new Produits(6500, 8, "fer arepasser"));
		prodRepo.save(new Produits(16000, 21, "Ventilateur"));
		prodRepo.save(new Produits(5100, 14, "Moteur"));
		
		prodRepo.save(new Produits(45000, 28, "TV sony"));
		prodRepo.save(new Produits(13000, 5, "Douille"));
		prodRepo.save(new Produits(1800, 12, "marteau"));
		prodRepo.save(new Produits(6500, 8, "fer arepasser"));
		prodRepo.save(new Produits(16000, 21, "Ventilateur"));
		prodRepo.save(new Produits(5100, 14, "Moteur"));
		
		prodRepo.findAll().forEach(p->{
			System.out.println(p.getDesignation());
		});
	}

}
