package com.sicredi.floricultura.floricultura.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "supplier")
public class Supplier{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String cnpj;
    @OneToMany
    private List<Product> products;
    private Boolean status;

}
/*
{
    "name":"Roberto",
    "cnpj":"8571471145",
    "products":[],
    "status":"true"
}

*/

