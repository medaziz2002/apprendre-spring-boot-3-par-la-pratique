package com.aziz.Udemy.Produit;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Integer id);
    Produit getProduit(Integer id);
    List<Produit> getAllProduits();
    Page<Produit> getAllProduitsParPage(int page, int size);
}
