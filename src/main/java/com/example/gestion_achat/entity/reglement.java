package com.example.gestion_achat.entity;

import javax.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.Entity;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    private float montantp;

    private float  montantRestant ;
    private boolean payee ;
    @Temporal(TemporalType.DATE)
    private Date dateReglement ;
    @ManyToOne
    facture facture ;
}
