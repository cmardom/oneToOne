package org.iesvdm.onetoone.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="tarjetas")
public class Tarjeta {
    @Id
    private int numero;
    private Date caducidad;
    @OneToOne
    @JoinColumn(name="socios_dni")
    private Socio socio;
}
