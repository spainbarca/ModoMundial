/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facelets;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Noah
 */
@Entity
@Table(name = "posiciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Posiciones.findAll", query = "SELECT p FROM Posiciones p")
    , @NamedQuery(name = "Posiciones.findByN", query = "SELECT p FROM Posiciones p WHERE p.n = :n")
    , @NamedQuery(name = "Posiciones.findByCodPos", query = "SELECT p FROM Posiciones p WHERE p.codPos = :codPos")
    , @NamedQuery(name = "Posiciones.findByNomPos", query = "SELECT p FROM Posiciones p WHERE p.nomPos = :nomPos")})
public class Posiciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "n")
    private Integer n;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "cod_pos")
    private String codPos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nom_pos")
    private String nomPos;
    @OneToMany(mappedBy = "posicion")
    private Collection<Convocados> convocadosCollection;

    public Posiciones() {
    }

    public Posiciones(Integer n) {
        this.n = n;
    }

    public Posiciones(Integer n, String codPos, String nomPos) {
        this.n = n;
        this.codPos = codPos;
        this.nomPos = nomPos;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public String getCodPos() {
        return codPos;
    }

    public void setCodPos(String codPos) {
        this.codPos = codPos;
    }

    public String getNomPos() {
        return nomPos;
    }

    public void setNomPos(String nomPos) {
        this.nomPos = nomPos;
    }

    @XmlTransient
    public Collection<Convocados> getConvocadosCollection() {
        return convocadosCollection;
    }

    public void setConvocadosCollection(Collection<Convocados> convocadosCollection) {
        this.convocadosCollection = convocadosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (n != null ? n.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posiciones)) {
            return false;
        }
        Posiciones other = (Posiciones) object;
        if ((this.n == null && other.n != null) || (this.n != null && !this.n.equals(other.n))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Posiciones[ n=" + n + " ]";
    }
    
}
