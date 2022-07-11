package com.learn.springrestapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Taxa {
    @Id
    private Integer idade;
    private Double m1;
    private Double m2;
    private Double iea;
    private Double ipa;
    private Double ipa_maj;
    private Double ied;
    private Double dg;
    private Double dit15;
    private Double dit7;
    private Double ditler15;
    private Double ditler7;
    private Double saf_indiv;
    private Double saf_fami;
    private String seguradora;
    private String produto;
    private String tipo;
    private String duracao;
    private String sexo;

    @Override
    public String toString() {
        return "Taxa{" +
                "idade=" + idade +
                ", m1='" + m1 + '\'' +
                ", seguradora='" + seguradora + '\'' +
                ", sexo='" + sexo + '\'' +
                ", produto=" + produto +
                '}';
    }



}
