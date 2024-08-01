package br.com.cbf.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20)
    private String nome;
    @Column(length = 3)
    private String sigla;
    @Column(length = 2)
    private String uf;
    private String estadio;
}
