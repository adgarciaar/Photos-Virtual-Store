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
@Table(name = "FOTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foto.findAll", query = "SELECT f FROM Foto f")
    , @NamedQuery(name = "Foto.findByIdfoto", query = "SELECT f FROM Foto f WHERE f.idfoto = :idfoto")
    , @NamedQuery(name = "Foto.findByArchivo", query = "SELECT f FROM Foto f WHERE f.archivo = :archivo")
    , @NamedQuery(name = "Foto.findByDescripcion", query = "SELECT f FROM Foto f WHERE f.descripcion = :descripcion")
    , @NamedQuery(name = "Foto.findByFecha", query = "SELECT f FROM Foto f WHERE f.fecha = :fecha")
    , @NamedQuery(name = "Foto.findByPais", query = "SELECT f FROM Foto f WHERE f.pais = :pais")
    , @NamedQuery(name = "Foto.findByUbicacion", query = "SELECT f FROM Foto f WHERE f.ubicacion = :ubicacion")
    , @NamedQuery(name = "Foto.findByEvento", query = "SELECT f FROM Foto f WHERE f.evento = :evento")
    , @NamedQuery(name = "Foto.findBySujeto", query = "SELECT f FROM Foto f WHERE f.sujeto = :sujeto")
    , @NamedQuery(name = "Foto.findByTema", query = "SELECT f FROM Foto f WHERE f.tema = :tema")
    , @NamedQuery(name = "Foto.findByPrecio", query = "SELECT f FROM Foto f WHERE f.precio = :precio")
    , @NamedQuery(name = "Foto.findByCorreo", query = "SELECT f FROM Foto f WHERE f.correo = :correo")})
public class Foto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDFOTO")
    private Long idfoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ARCHIVO")
    private String archivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PAIS")
    private String pais;
    @Size(max = 100)
    @Column(name = "UBICACION")
    private String ubicacion;
    @Size(max = 100)
    @Column(name = "EVENTO")
    private String evento;
    @Size(max = 100)
    @Column(name = "SUJETO")
    private String sujeto;
    @Size(max = 50)
    @Column(name = "TEMA")
    private String tema;
    @Column(name = "PRECIO")
    private Integer precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CORREO")
    private String correo;

    public Foto() {
    }

    public Foto(Long idfoto) {
        this.idfoto = idfoto;
    }

    public Foto(Long idfoto, String archivo, String descripcion, String fecha, String pais, String correo) {
        this.idfoto = idfoto;
        this.archivo = archivo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.pais = pais;
        this.correo = correo;
    }

    public Long getIdfoto() {
        return idfoto;
    }

    public void setIdfoto(Long idfoto) {
        this.idfoto = idfoto;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getSujeto() {
        return sujeto;
    }

    public void setSujeto(String sujeto) {
        this.sujeto = sujeto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfoto != null ? idfoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.idfoto == null && other.idfoto != null) || (this.idfoto != null && !this.idfoto.equals(other.idfoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Foto[ idfoto=" + idfoto + " ]";
    }
    
}
