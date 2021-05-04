/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facelets;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ligas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ligas.findAll", query = "SELECT l FROM Ligas l")
    , @NamedQuery(name = "Ligas.findByCodLiga", query = "SELECT l FROM Ligas l WHERE l.codLiga = :codLiga")
    , @NamedQuery(name = "Ligas.findByNomLiga", query = "SELECT l FROM Ligas l WHERE l.nomLiga = :nomLiga")
    , @NamedQuery(name = "Ligas.findByPais", query = "SELECT l FROM Ligas l WHERE l.pais = :pais")})
public class Ligas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "cod_liga")
    private String codLiga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nom_liga")
    private String nomLiga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Pais")
    private String pais;
    @OneToMany(mappedBy = "liga")
    private Collection<Convocados> convocadosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codLiga")
    private Collection<Club> clubCollection;

    public Ligas() {
    }

    public Ligas(String codLiga) {
        this.codLiga = codLiga;
    }

    public Ligas(String codLiga, String nomLiga, String pais) {
        this.codLiga = codLiga;
        this.nomLiga = nomLiga;
        this.pais = pais;
    }

    public String getCodLiga() {
        return codLiga;
    }

    public void setCodLiga(String codLiga) {
        this.codLiga = codLiga;
    }

    public String getNomLiga() {
        return nomLiga;
    }

    public void setNomLiga(String nomLiga) {
        this.nomLiga = nomLiga;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @XmlTransient
    public Collection<Convocados> getConvocadosCollection() {
        return convocadosCollection;
    }

    public void setConvocadosCollection(Collection<Convocados> convocadosCollection) {
        this.convocadosCollection = convocadosCollection;
    }

    @XmlTransient
    public Collection<Club> getClubCollection() {
        return clubCollection;
    }

    public void setClubCollection(Collection<Club> clubCollection) {
        this.clubCollection = clubCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLiga != null ? codLiga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ligas)) {
            return false;
        }
        Ligas other = (Ligas) object;
        if ((this.codLiga == null && other.codLiga != null) || (this.codLiga != null && !this.codLiga.equals(other.codLiga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Ligas[ codLiga=" + codLiga + " ]";
    }
    
}
