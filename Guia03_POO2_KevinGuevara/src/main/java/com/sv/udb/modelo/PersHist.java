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
@Table(name = "pers_hist", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersHist.findAll", query = "SELECT p FROM PersHist p"),
    @NamedQuery(name = "PersHist.findByCodiPersHist", query = "SELECT p FROM PersHist p WHERE p.codiPersHist = :codiPersHist"),
    @NamedQuery(name = "PersHist.findByCodiPers", query = "SELECT p FROM PersHist p WHERE p.codiPers = :codiPers"),
    @NamedQuery(name = "PersHist.findByNombPers", query = "SELECT p FROM PersHist p WHERE p.nombPers = :nombPers"),
    @NamedQuery(name = "PersHist.findByApelPers", query = "SELECT p FROM PersHist p WHERE p.apelPers = :apelPers"),
    @NamedQuery(name = "PersHist.findByCodiTipoPers", query = "SELECT p FROM PersHist p WHERE p.codiTipoPers = :codiTipoPers"),
    @NamedQuery(name = "PersHist.findByCodiUbicGeog", query = "SELECT p FROM PersHist p WHERE p.codiUbicGeog = :codiUbicGeog"),
    @NamedQuery(name = "PersHist.findByFechAlta", query = "SELECT p FROM PersHist p WHERE p.fechAlta = :fechAlta"),
    @NamedQuery(name = "PersHist.findByFechBaja", query = "SELECT p FROM PersHist p WHERE p.fechBaja = :fechBaja"),
    @NamedQuery(name = "PersHist.findByEsta", query = "SELECT p FROM PersHist p WHERE p.esta = :esta")})
public class PersHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_pers_hist")
    private Long codiPersHist;
    @Column(name = "codi_pers")
    private BigInteger codiPers;
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

    public PersHist() {
    }

    public PersHist(Long codiPersHist) {
        this.codiPersHist = codiPersHist;
    }

    public Long getCodiPersHist() {
        return codiPersHist;
    }

    public void setCodiPersHist(Long codiPersHist) {
        this.codiPersHist = codiPersHist;
    }

    public BigInteger getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(BigInteger codiPers) {
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
        hash += (codiPersHist != null ? codiPersHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersHist)) {
            return false;
        }
        PersHist other = (PersHist) object;
        if ((this.codiPersHist == null && other.codiPersHist != null) || (this.codiPersHist != null && !this.codiPersHist.equals(other.codiPersHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.PersHist[ codiPersHist=" + codiPersHist + " ]";
    }
    
}
