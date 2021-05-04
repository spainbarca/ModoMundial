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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "club")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Club.findAll", query = "SELECT c FROM Club c")
    , @NamedQuery(name = "Club.findByCodClub", query = "SELECT c FROM Club c WHERE c.codClub = :codClub")
    , @NamedQuery(name = "Club.findByNomClub", query = "SELECT c FROM Club c WHERE c.nomClub = :nomClub")})
public class Club implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "cod_club")
    private String codClub;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nom_club")
    private String nomClub;
    @OneToMany(mappedBy = "club")
    private Collection<Convocados> convocadosCollection;
    @JoinColumn(name = "cod_liga", referencedColumnName = "cod_liga")
    @ManyToOne(optional = false)
    private Ligas codLiga;

    public Club() {
    }

    public Club(String codClub) {
        this.codClub = codClub;
    }

    public Club(String codClub, String nomClub) {
        this.codClub = codClub;
        this.nomClub = nomClub;
    }

    public String getCodClub() {
        return codClub;
    }

    public void setCodClub(String codClub) {
        this.codClub = codClub;
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    @XmlTransient
    public Collection<Convocados> getConvocadosCollection() {
        return convocadosCollection;
    }

    public void setConvocadosCollection(Collection<Convocados> convocadosCollection) {
        this.convocadosCollection = convocadosCollection;
    }

    public Ligas getCodLiga() {
        return codLiga;
    }

    public void setCodLiga(Ligas codLiga) {
        this.codLiga = codLiga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codClub != null ? codClub.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Club)) {
            return false;
        }
        Club other = (Club) object;
        if ((this.codClub == null && other.codClub != null) || (this.codClub != null && !this.codClub.equals(other.codClub))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Club[ codClub=" + codClub + " ]";
    }
    
}
