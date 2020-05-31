/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "COMPRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c")
    , @NamedQuery(name = "Compra.findByIdcompra", query = "SELECT c FROM Compra c WHERE c.idcompra = :idcompra")
    , @NamedQuery(name = "Compra.findByTipotarjeta", query = "SELECT c FROM Compra c WHERE c.tipotarjeta = :tipotarjeta")
    , @NamedQuery(name = "Compra.findByNumerotarjeta", query = "SELECT c FROM Compra c WHERE c.numerotarjeta = :numerotarjeta")
    , @NamedQuery(name = "Compra.findByNombrecomprador", query = "SELECT c FROM Compra c WHERE c.nombrecomprador = :nombrecomprador")
    , @NamedQuery(name = "Compra.findByMesvencimiento", query = "SELECT c FROM Compra c WHERE c.mesvencimiento = :mesvencimiento")
    , @NamedQuery(name = "Compra.findByAniovencimiento", query = "SELECT c FROM Compra c WHERE c.aniovencimiento = :aniovencimiento")
    , @NamedQuery(name = "Compra.findByEmail", query = "SELECT c FROM Compra c WHERE c.email = :email")
    , @NamedQuery(name = "Compra.findByIdfotos", query = "SELECT c FROM Compra c WHERE c.idfotos = :idfotos")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOMPRA")
    private Long idcompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPOTARJETA")
    private String tipotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROTARJETA")
    private long numerotarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRECOMPRADOR")
    private String nombrecomprador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MESVENCIMIENTO")
    private short mesvencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ANIOVENCIMIENTO")
    private short aniovencimiento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IDFOTOS")
    private String idfotos;

    public Compra() {
    }

    public Compra(Long idcompra) {
        this.idcompra = idcompra;
    }

    public Compra(Long idcompra, String tipotarjeta, long numerotarjeta, String nombrecomprador, short mesvencimiento, short aniovencimiento, String email, String idfotos) {
        this.idcompra = idcompra;
        this.tipotarjeta = tipotarjeta;
        this.numerotarjeta = numerotarjeta;
        this.nombrecomprador = nombrecomprador;
        this.mesvencimiento = mesvencimiento;
        this.aniovencimiento = aniovencimiento;
        this.email = email;
        this.idfotos = idfotos;
    }

    public Long getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Long idcompra) {
        this.idcompra = idcompra;
    }

    public String getTipotarjeta() {
        return tipotarjeta;
    }

    public void setTipotarjeta(String tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }

    public long getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(long numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public String getNombrecomprador() {
        return nombrecomprador;
    }

    public void setNombrecomprador(String nombrecomprador) {
        this.nombrecomprador = nombrecomprador;
    }

    public short getMesvencimiento() {
        return mesvencimiento;
    }

    public void setMesvencimiento(short mesvencimiento) {
        this.mesvencimiento = mesvencimiento;
    }

    public short getAniovencimiento() {
        return aniovencimiento;
    }

    public void setAniovencimiento(short aniovencimiento) {
        this.aniovencimiento = aniovencimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdfotos() {
        return idfotos;
    }

    public void setIdfotos(String idfotos) {
        this.idfotos = idfotos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcompra != null ? idcompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.idcompra == null && other.idcompra != null) || (this.idcompra != null && !this.idcompra.equals(other.idcompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Compra[ idcompra=" + idcompra + " ]";
    }
    
}
