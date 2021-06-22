package com.example.batch.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Utenti")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Utenti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

}
