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
@Table(name = "numero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Numero.findAll", query = "SELECT n FROM Numero n")
    , @NamedQuery(name = "Numero.findByNum", query = "SELECT n FROM Numero n WHERE n.num = :num")
    , @NamedQuery(name = "Numero.findByNomNum", query = "SELECT n FROM Numero n WHERE n.nomNum = :nomNum")})
public class Numero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num")
    private Integer num;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nom_num")
    private String nomNum;
    @OneToMany(mappedBy = "mundJug")
    private Collection<Convocados> convocadosCollection;

    public Numero() {
    }

    public Numero(Integer num) {
        this.num = num;
    }

    public Numero(Integer num, String nomNum) {
        this.num = num;
        this.nomNum = nomNum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNomNum() {
        return nomNum;
    }

    public void setNomNum(String nomNum) {
        this.nomNum = nomNum;
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
        hash += (num != null ? num.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numero)) {
            return false;
        }
        Numero other = (Numero) object;
        if ((this.num == null && other.num != null) || (this.num != null && !this.num.equals(other.num))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Numero[ num=" + num + " ]";
    }
    
}
