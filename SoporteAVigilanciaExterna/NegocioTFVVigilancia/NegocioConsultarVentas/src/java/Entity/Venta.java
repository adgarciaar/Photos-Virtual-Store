/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

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
@Table(name = "VENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdventa", query = "SELECT v FROM Venta v WHERE v.idventa = :idventa")
    , @NamedQuery(name = "Venta.findByIdfoto", query = "SELECT v FROM Venta v WHERE v.idfoto = :idfoto")
    , @NamedQuery(name = "Venta.findByFecha", query = "SELECT v FROM Venta v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "Venta.findByValor", query = "SELECT v FROM Venta v WHERE v.valor = :valor")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVENTA")
    private Long idventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDFOTO")
    private long idfoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR")
    private int valor;

    public Venta() {
    }

    public Venta(Long idventa) {
        this.idventa = idventa;
    }

    public Venta(Long idventa, long idfoto, String fecha, int valor) {
        this.idventa = idventa;
        this.idfoto = idfoto;
        this.fecha = fecha;
        this.valor = valor;
    }

    public Long getIdventa() {
        return idventa;
    }

    public void setIdventa(Long idventa) {
        this.idventa = idventa;
    }

    public long getIdfoto() {
        return idfoto;
    }

    public void setIdfoto(long idfoto) {
        this.idfoto = idfoto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idventa != null ? idventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idventa == null && other.idventa != null) || (this.idventa != null && !this.idventa.equals(other.idventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Venta[ idventa=" + idventa + " ]";
    }
    
}
