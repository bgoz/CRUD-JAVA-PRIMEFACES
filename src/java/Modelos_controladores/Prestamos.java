/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos_controladores;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author braya
 */
@Entity
@Table(name = "prestamos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamos.findAll", query = "SELECT p FROM Prestamos p")
    , @NamedQuery(name = "Prestamos.findByIdPrestamo", query = "SELECT p FROM Prestamos p WHERE p.idPrestamo = :idPrestamo")
    , @NamedQuery(name = "Prestamos.findByFecPrestamo", query = "SELECT p FROM Prestamos p WHERE p.fecPrestamo = :fecPrestamo")
    , @NamedQuery(name = "Prestamos.findByFecDevolucion", query = "SELECT p FROM Prestamos p WHERE p.fecDevolucion = :fecDevolucion")})
public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPrestamo")
    private Integer idPrestamo;
    @Column(name = "FecPrestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecPrestamo;
    @Column(name = "FecDevolucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecDevolucion;
    @JoinColumn(name = "idLibro", referencedColumnName = "idLibro")
    @ManyToOne(optional = false)
    private Libro idLibro;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Prestamos() {
    }

    public Prestamos(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFecPrestamo() {
        return fecPrestamo;
    }

    public void setFecPrestamo(Date fecPrestamo) {
        this.fecPrestamo = fecPrestamo;
    }

    public Date getFecDevolucion() {
        return fecDevolucion;
    }

    public void setFecDevolucion(Date fecDevolucion) {
        this.fecDevolucion = fecDevolucion;
    }

    public Libro getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Libro idLibro) {
        this.idLibro = idLibro;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestamo != null ? idPrestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.idPrestamo == null && other.idPrestamo != null) || (this.idPrestamo != null && !this.idPrestamo.equals(other.idPrestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos_controladores.Prestamos[ idPrestamo=" + idPrestamo + " ]";
    }
    
}
