/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kevin
 */
@Entity
@Table(name = "pers", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pers.findAll", query = "SELECT p FROM Pers p"),
    @NamedQuery(name = "Pers.findByCodiPers", query = "SELECT p FROM Pers p WHERE p.codiPers = :codiPers"),
    @NamedQuery(name = "Pers.findByNombPers", query = "SELECT p FROM Pers p WHERE p.nombPers = :nombPers"),
    @NamedQuery(name = "Pers.findByApelPers", query = "SELECT p FROM Pers p WHERE p.apelPers = :apelPers"),
    @NamedQuery(name = "Pers.findByCodiTipoPers", query = "SELECT p FROM Pers p WHERE p.codiTipoPers = :codiTipoPers"),
    @NamedQuery(name = "Pers.findByGenePers", query = "SELECT p FROM Pers p WHERE p.genePers = :genePers"),
    @NamedQuery(name = "Pers.findByFechNaciPers", query = "SELECT p FROM Pers p WHERE p.fechNaciPers = :fechNaciPers"),
    @NamedQuery(name = "Pers.findByDuiPers", query = "SELECT p FROM Pers p WHERE p.duiPers = :duiPers"),
    @NamedQuery(name = "Pers.findByNitPers", query = "SELECT p FROM Pers p WHERE p.nitPers = :nitPers"),
    @NamedQuery(name = "Pers.findByTipoSangPers", query = "SELECT p FROM Pers p WHERE p.tipoSangPers = :tipoSangPers"),
    @NamedQuery(name = "Pers.findByCodiUbicGeog", query = "SELECT p FROM Pers p WHERE p.codiUbicGeog = :codiUbicGeog"),
    @NamedQuery(name = "Pers.findByFechAlta", query = "SELECT p FROM Pers p WHERE p.fechAlta = :fechAlta"),
    @NamedQuery(name = "Pers.findByFechBaja", query = "SELECT p FROM Pers p WHERE p.fechBaja = :fechBaja"),
    @NamedQuery(name = "Pers.findByEsta", query = "SELECT p FROM Pers p WHERE p.esta = :esta")})
public class Pers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_pers")
    private Long codiPers;
    @Size(max = 255)
    @Column(name = "nomb_pers")
    private String nombPers;
    @Size(max = 255)
    @Column(name = "apel_pers")
    private String apelPers;
    @Lob
    @Column(name = "foto_pers")
    private byte[] fotoPers;
    @Column(name = "codi_tipo_pers")
    private BigInteger codiTipoPers;
    @Column(name = "gene_pers")
    private Character genePers;
    @Column(name = "fech_naci_pers")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechNaciPers;
    @Size(max = 50)
    @Column(name = "dui_pers")
    private String duiPers;
    @Size(max = 50)
    @Column(name = "nit_pers")
    private String nitPers;
    @Size(max = 50)
    @Column(name = "tipo_sang_pers")
    private String tipoSangPers;
    @Column(name = "codi_ubic_geog")
    private BigInteger codiUbicGeog;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public Pers() {
    }

    public Pers(Long codiPers) {
        this.codiPers = codiPers;
    }

    public Long getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(Long codiPers) {
        this.codiPers = codiPers;
    }

    public String getNombPers() {
        return nombPers;
    }

    public void setNombPers(String nombPers) {
        this.nombPers = nombPers;
    }

    public String getApelPers() {
        return apelPers;
    }

    public void setApelPers(String apelPers) {
        this.apelPers = apelPers;
    }

    public byte[] getFotoPers() {
        return fotoPers;
    }

    public void setFotoPers(byte[] fotoPers) {
        this.fotoPers = fotoPers;
    }

    public BigInteger getCodiTipoPers() {
        return codiTipoPers;
    }

    public void setCodiTipoPers(BigInteger codiTipoPers) {
        this.codiTipoPers = codiTipoPers;
    }

    public Character getGenePers() {
        return genePers;
    }

    public void setGenePers(Character genePers) {
        this.genePers = genePers;
    }

    public Date getFechNaciPers() {
        return fechNaciPers;
    }

    public void setFechNaciPers(Date fechNaciPers) {
        this.fechNaciPers = fechNaciPers;
    }

    public String getDuiPers() {
        return duiPers;
    }

    public void setDuiPers(String duiPers) {
        this.duiPers = duiPers;
    }

    public String getNitPers() {
        return nitPers;
    }

    public void setNitPers(String nitPers) {
        this.nitPers = nitPers;
    }

    public String getTipoSangPers() {
        return tipoSangPers;
    }

    public void setTipoSangPers(String tipoSangPers) {
        this.tipoSangPers = tipoSangPers;
    }

    public BigInteger getCodiUbicGeog() {
        return codiUbicGeog;
    }

    public void setCodiUbicGeog(BigInteger codiUbicGeog) {
        this.codiUbicGeog = codiUbicGeog;
    }

    public Date getFechAlta() {
        return fechAlta;
    }

    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

    public Date getFechBaja() {
        return fechBaja;
    }

    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

    public Integer getEsta() {
        return esta;
    }

    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiPers != null ? codiPers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pers)) {
            return false;
        }
        Pers other = (Pers) object;
        if ((this.codiPers == null && other.codiPers != null) || (this.codiPers != null && !this.codiPers.equals(other.codiPers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.Pers[ codiPers=" + codiPers + " ]";
    }
    
}
