package org.iesvdm.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="socios")
public class Socio {

    @Id
    private String dni;
    private String nombre;
    private String apellidos;

    @OneToOne(mappedBy="socio")
    private Tarjeta tarjeta;
}
