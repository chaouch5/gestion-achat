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



public class categorieProd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long idCategorieProd;
    private String codeProduit;
    private String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorieProd")
    private List<Produit> ListeProd;
}
