/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "TARJETA")
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t")})
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROTARJETA")
    private long numerotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SALDO")
    private long saldo;

    public Tarjeta() {
    }

    public Tarjeta(long numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public Tarjeta(long numerotarjeta, long saldo) {
        this.numerotarjeta = numerotarjeta;
        this.saldo = saldo;
    }

    public long getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(long numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "entities.Tarjeta[ numerotarjeta=" + numerotarjeta + " ]";
    }
    
}
