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


public class fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long idfournisseur;
     private String codeFournisseur ;
     private String  libelleFournisseur;
     @Enumerated(EnumType.STRING)
     CategorieFournisseur categorieFournisseur;
    @ManyToMany
    private List<secteurAvtivite> listSecteurAtivite;
    @OneToOne
    private DetailFourn DetailFourn;
    @OneToMany(mappedBy = "four")
    private List<facture> factureListt;
}
