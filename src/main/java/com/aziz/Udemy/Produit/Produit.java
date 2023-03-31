package com.aziz.Udemy.Produit;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Product")
public class Produit {
    
    @Id
    @GeneratedValue
    @Column(name = "idPoduct")
    private Integer idProduit;

    @Column(name="nameProduct")
    private String nomProduit;

    @Column(name="PriceProduct")
    private BigDecimal prixProduit;
    @Column(name = "dateOfCreation")
    private Date dateCreation;




}
