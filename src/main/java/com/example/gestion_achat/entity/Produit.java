package com.example.gestion_achat.entity;

import javax.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long idProd;

    private String codeProduit ;
    private String  libelleProduit ;

    private   float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation ;
    @Temporal(TemporalType.DATE)
    private   Date dateDemiereModification ;
    @OneToMany(mappedBy = "prod")
    private List<detailFacture> detailFactureList;
    @ManyToOne
    private stock stock;
    @ManyToOne
    private categorieProd categorieProd;
}

