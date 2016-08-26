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
@Table(name = "usua", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usua.findAll", query = "SELECT u FROM Usua u"),
    @NamedQuery(name = "Usua.findByCodiUsua", query = "SELECT u FROM Usua u WHERE u.codiUsua = :codiUsua"),
    @NamedQuery(name = "Usua.findByCodiPers", query = "SELECT u FROM Usua u WHERE u.codiPers = :codiPers"),
    @NamedQuery(name = "Usua.findByAcceUsua", query = "SELECT u FROM Usua u WHERE u.acceUsua = :acceUsua"),
    @NamedQuery(name = "Usua.findByContUsua", query = "SELECT u FROM Usua u WHERE u.contUsua = :contUsua"),
    @NamedQuery(name = "Usua.findByFechCambClavUsua", query = "SELECT u FROM Usua u WHERE u.fechCambClavUsua = :fechCambClavUsua"),
    @NamedQuery(name = "Usua.findByFechAlta", query = "SELECT u FROM Usua u WHERE u.fechAlta = :fechAlta"),
    @NamedQuery(name = "Usua.findByFechBaja", query = "SELECT u FROM Usua u WHERE u.fechBaja = :fechBaja"),
    @NamedQuery(name = "Usua.findByEsta", query = "SELECT u FROM Usua u WHERE u.esta = :esta")})
public class Usua implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_usua")
    private Long codiUsua;
    @Column(name = "codi_pers")
    private BigInteger codiPers;
    @Size(max = 255)
    @Column(name = "acce_usua")
    private String acceUsua;
    @Size(max = 255)
    @Column(name = "cont_usua")
    private String contUsua;
    @Column(name = "fech_camb_clav_usua")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechCambClavUsua;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public Usua() {
    }

    public Usua(Long codiUsua) {
        this.codiUsua = codiUsua;
    }

    public Long getCodiUsua() {
        return codiUsua;
    }

    public void setCodiUsua(Long codiUsua) {
        this.codiUsua = codiUsua;
    }

    public BigInteger getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(BigInteger codiPers) {
        this.codiPers = codiPers;
    }

    public String getAcceUsua() {
        return acceUsua;
    }

    public void setAcceUsua(String acceUsua) {
        this.acceUsua = acceUsua;
    }

    public String getContUsua() {
        return contUsua;
    }

    public void setContUsua(String contUsua) {
        this.contUsua = contUsua;
    }

    public Date getFechCambClavUsua() {
        return fechCambClavUsua;
    }

    public void setFechCambClavUsua(Date fechCambClavUsua) {
        this.fechCambClavUsua = fechCambClavUsua;
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
        hash += (codiUsua != null ? codiUsua.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usua)) {
            return false;
        }
        Usua other = (Usua) object;
        if ((this.codiUsua == null && other.codiUsua != null) || (this.codiUsua != null && !this.codiUsua.equals(other.codiUsua))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.Usua[ codiUsua=" + codiUsua + " ]";
    }
    
}
