package com.phil.rego.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Chocolate")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Chocolate {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chocolateSeq")
    @SequenceGenerator(allocationSize = 1, name = "chocolateSeq", sequenceName = "CHOCOLATE_SEQ")
    @Column(name = "ID")
    protected int id;

    @Column(name = "CHOCOLATE_NAME")
    protected String name;

    public Chocolate(String name) {
        this.name = name;
    }

}
