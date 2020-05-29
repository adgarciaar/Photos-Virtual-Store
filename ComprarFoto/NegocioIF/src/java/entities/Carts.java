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
@Table(name = "CARTS")
@NamedQueries({
    @NamedQuery(name = "Carts.findAll", query = "SELECT c FROM Carts c")})
public class Carts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CARTNUMBER")
    private long cartnumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BALANCE")
    private long balance;

    public Carts() {
    }

    public Carts(long cartnumber) {
        this.cartnumber = cartnumber;
    }

    public Carts(long cartnumber, long balance) {
        this.cartnumber = cartnumber;
        this.balance = balance;
    }

    public long getCartnumber() {
        return cartnumber;
    }

    public void setCartnumber(Long cartnumber) {
        this.cartnumber = cartnumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "entities.Carts[ cartnumber=" + cartnumber + " ]";
    }
    
}
