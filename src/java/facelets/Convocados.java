/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facelets;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Noah
 */
@Entity
@Table(name = "convocados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convocados.findAll", query = "SELECT c FROM Convocados c")
    , @NamedQuery(name = "Convocados.findById", query = "SELECT c FROM Convocados c WHERE c.id = :id")
    , @NamedQuery(name = "Convocados.findByNombJug", query = "SELECT c FROM Convocados c WHERE c.nombJug = :nombJug")
    , @NamedQuery(name = "Convocados.findByApellJug", query = "SELECT c FROM Convocados c WHERE c.apellJug = :apellJug")
    , @NamedQuery(name = "Convocados.findByApodo", query = "SELECT c FROM Convocados c WHERE c.apodo = :apodo")
    , @NamedQuery(name = "Convocados.findByEdad", query = "SELECT c FROM Convocados c WHERE c.edad = :edad")
    , @NamedQuery(name = "Convocados.findByTalla", query = "SELECT c FROM Convocados c WHERE c.talla = :talla")
    , @NamedQuery(name = "Convocados.findByPeso", query = "SELECT c FROM Convocados c WHERE c.peso = :peso")
    , @NamedQuery(name = "Convocados.findByPartSel", query = "SELECT c FROM Convocados c WHERE c.partSel = :partSel")
    , @NamedQuery(name = "Convocados.findByGolesSel", query = "SELECT c FROM Convocados c WHERE c.golesSel = :golesSel")})
public class Convocados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "id")
    private String id;
    @Size(max = 40)
    @Column(name = "nomb_jug")
    private String nombJug;
    @Size(max = 40)
    @Column(name = "apell_jug")
    private String apellJug;
    @Size(max = 40)
    @Column(name = "apodo")
    private String apodo;
    @Column(name = "edad")
    private Integer edad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "talla")
    private Float talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private float peso;
    @Column(name = "part_sel")
    private Integer partSel;
    @Column(name = "goles_sel")
    private Integer golesSel;
    @JoinColumn(name = "confederacion", referencedColumnName = "cod_conf")
    @ManyToOne
    private Confederaciones confederacion;
    @JoinColumn(name = "liga", referencedColumnName = "cod_liga")
    @ManyToOne
    private Ligas liga;
    @JoinColumn(name = "mund_jug", referencedColumnName = "num")
    @ManyToOne
    private Numero mundJug;
    @JoinColumn(name = "posicion", referencedColumnName = "nom_pos")
    @ManyToOne
    private Posiciones posicion;
    @JoinColumn(name = "pais", referencedColumnName = "cod_pais")
    @ManyToOne
    private Paises pais;
    @JoinColumn(name = "club", referencedColumnName = "nom_club")
    @ManyToOne
    private Club club;

    public Convocados() {
    }

    public Convocados(String id) {
        this.id = id;
    }

    public Convocados(String id, float peso) {
        this.id = id;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombJug() {
        return nombJug;
    }

    public void setNombJug(String nombJug) {
        this.nombJug = nombJug;
    }

    public String getApellJug() {
        return apellJug;
    }

    public void setApellJug(String apellJug) {
        this.apellJug = apellJug;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getTalla() {
        return talla;
    }

    public void setTalla(Float talla) {
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Integer getPartSel() {
        return partSel;
    }

    public void setPartSel(Integer partSel) {
        this.partSel = partSel;
    }

    public Integer getGolesSel() {
        return golesSel;
    }

    public void setGolesSel(Integer golesSel) {
        this.golesSel = golesSel;
    }

    public Confederaciones getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(Confederaciones confederacion) {
        this.confederacion = confederacion;
    }

    public Ligas getLiga() {
        return liga;
    }

    public void setLiga(Ligas liga) {
        this.liga = liga;
    }

    public Numero getMundJug() {
        return mundJug;
    }

    public void setMundJug(Numero mundJug) {
        this.mundJug = mundJug;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
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
        if (!(object instanceof Convocados)) {
            return false;
        }
        Convocados other = (Convocados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "facelets.Convocados[ id=" + id + " ]";
    }
    
}
