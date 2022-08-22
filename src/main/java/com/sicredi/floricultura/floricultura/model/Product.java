package com.sicredi.floricultura.floricultura.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private TypeOfProduct typeOfProduct;
    private String family;
    private Date yearPurchase;
    private Double price;
    private Date yearExpiration;
    private Boolean status;
}
/*
{
    "name": "Rosa",
    "typeOfProduct": "FLOWER",
    "family": "Rosaceas",
    "yearPurchase":"2022-08-22",
    "price": "29.90",
    "yearExpiration":"2023-08-22",
    "status":"false"
}
 */



