package com.stockTrack.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Tornando a variável acessivel as outras classes
@Setter   //Tornando a variável acessivel as outras classes
@AllArgsConstructor //Construtor
@NoArgsConstructor
@Entity(name = "product")//Anotação (Espeficicar o uso)
@Table(name = "product")//Nome da tabela


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gere ids automaticos
    private Integer id;
    private String name;
    private Long price;
    private Integer stock;

}
