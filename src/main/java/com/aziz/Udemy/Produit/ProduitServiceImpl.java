package com.aziz.Udemy.Produit;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService{

    final ProduitRepository produitRepository;



    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
      return   produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
  produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Integer id) {
  produitRepository.deleteById(id);
    }

    @Override
    public Produit getProduit(Integer id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Page<Produit> getAllProduitsParPage(int page, int size) {
        return produitRepository.findAll(PageRequest.of(page, size));
    }


}
