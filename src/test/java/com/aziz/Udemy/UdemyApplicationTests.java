package com.aziz.Udemy;

import com.aziz.Udemy.Produit.Produit;
import com.aziz.Udemy.Produit.ProduitRepository;
import com.aziz.Udemy.Produit.ProduitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@SpringBootTest
class UdemyApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	ProduitService produitService;

	@Test
	public void TestNewProduct()
	{
		Produit prod= Produit.builder()
				.nomProduit("PC DELL")
				.prixProduit(BigDecimal.valueOf(2200.500))
				.dateCreation(new Date()).build();
		produitRepository.save(prod);
	}

	@Test
	public void findProduct()
	{
		Produit prod=produitRepository.findById(1).get();
		System.out.println(prod.toString());

	}

	@Test
	public void testUpdateProduct()
	{
       Produit prod=   produitRepository.findById(1).get();
	   prod.setPrixProduit((BigDecimal.valueOf(1000.0)));
	   produitRepository.save(prod);

	}
	@Test
	public void deleteById()
	{
		produitRepository.deleteById(1);
	}




	@Test
	public void testListerTousProduits()
	{
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomProduitContains()
	{

		Page<Produit> prods = produitService.getAllProduitsParPage(0,2);
		System.out.println(prods.getSize());
		System.out.println(prods.getTotalElements());
		System.out.println(prods.getTotalPages());
		prods.getContent().forEach(p -> {System.out.println(p.toString());
		});
/*ou bien
for (Produit p : prods)
{
System.out.println(p);
} */
	}

}
