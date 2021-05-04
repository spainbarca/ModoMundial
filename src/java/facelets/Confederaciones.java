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
@Table(name = "confederaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Confederaciones.findAll", query = "SELECT c FROM Confederaciones c")
    , @NamedQuery(name = "Confederaciones.findByCodConf", query = "SELECT c FROM Confederaciones c WHERE c.codConf = :codConf")
    , @NamedQuery(name = "Confederaciones.findByNameConf", query = "SELECT c FROM Confederaciones c WHERE c.nameConf = :nameConf")})
public class Confederaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "cod_conf")
    private String codConf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name_conf")
    private String nameConf;
    @OneToMany(mappedBy = "confederacion")
    private Collection<Convocados> convocadosCollection;

    public Confederaciones() {
    }

    public Confederaciones(String codConf) {
        this.codConf = codConf;
    }

    public Confederaciones(String codConf, String nameConf) {
        this.codConf = codConf;
        this.nameConf = nameConf;
    }

    public String getCodConf() {
        return codConf;
    }

    public void setCodConf(String codConf) {
        this.codConf = codConf;
    }

    public String getNameConf() {
        return nameConf;
    }

    public void setNameConf(String nameConf) {
        this.nameConf = nameConf;
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
        hash += (codConf != null ? codConf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Confederaciones)) {
            return false;
        }
        Confederaciones other = (Confederaciones) object;
        if ((this.codConf == null && other.codConf != null) || (this.codConf != null && !this.codConf.equals(other.codConf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Confederaciones[ codConf=" + codConf + " ]";
    }
    
}
