package com.leconsultant.controlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.leconsultant.dao.ProduitRepository;
import com.leconsultant.entities.Produits;

@Controller
public class ProduitsControler {
	
	@Autowired
	ProduitRepository prodRepo;
	
  //@RequestMapping(value = "/index", method = RequestMethod.GET)
	
	@GetMapping("/index")
	public String listerProduits(Model model, @RequestParam(name="page", defaultValue = "0") int page,
											  @RequestParam(name="motCle", defaultValue = "") String mc) {
	  //Page<Produits> produits = prodRepo.findAll(PageRequest.of(page, 5)); //recupere la liste des produits a travers l'interface ProduitRepository
		Page<Produits> produits = prodRepo.findByDesignationContains(mc, PageRequest.of(page, 5));
		model.addAttribute("listProduits", produits);    // stocke la liste de produit recuperee dans le model
		model.addAttribute("pages", new int[produits.getTotalPages()]);
		model.addAttribute("currentPage", page);
		model.addAttribute("motCle", mc);
		return "produits";  
	}
	
	@GetMapping("/delete")
	public String supprimerProduit(Long id, int page, String mc) {
		prodRepo.deleteById(id);
		return "redirect:/index?page="+page+"&motcle=mc";
	}
}
