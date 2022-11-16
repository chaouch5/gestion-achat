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


public class stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long idStock;

    private int qte;
    private int qteMin;
    private String libelleStock;
    @OneToMany(mappedBy ="stock")
    private List<Produit> produitList;
}
