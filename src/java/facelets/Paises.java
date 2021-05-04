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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Noah
 */
@Entity
@Table(name = "paises")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paises.findAll", query = "SELECT p FROM Paises p")
    , @NamedQuery(name = "Paises.findById", query = "SELECT p FROM Paises p WHERE p.id = :id")
    , @NamedQuery(name = "Paises.findByCodPais", query = "SELECT p FROM Paises p WHERE p.codPais = :codPais")
    , @NamedQuery(name = "Paises.findByNomPais", query = "SELECT p FROM Paises p WHERE p.nomPais = :nomPais")})
public class Paises implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 3)
    @Column(name = "cod_pais")
    private String codPais;
    @Size(max = 80)
    @Column(name = "nom_pais")
    private String nomPais;
    @OneToMany(mappedBy = "pais")
    private Collection<Convocados> convocadosCollection;

    public Paises() {
    }

    public Paises(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paises)) {
            return false;
        }
        Paises other = (Paises) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Paises[ id=" + id + " ]";
    }
    
}
