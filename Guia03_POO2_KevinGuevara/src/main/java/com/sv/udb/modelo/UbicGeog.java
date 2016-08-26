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
@Table(name = "ubic_geog", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UbicGeog.findAll", query = "SELECT u FROM UbicGeog u"),
    @NamedQuery(name = "UbicGeog.findByCodiUbicGeog", query = "SELECT u FROM UbicGeog u WHERE u.codiUbicGeog = :codiUbicGeog"),
    @NamedQuery(name = "UbicGeog.findByNombUbicGeog", query = "SELECT u FROM UbicGeog u WHERE u.nombUbicGeog = :nombUbicGeog"),
    @NamedQuery(name = "UbicGeog.findByCodiUbicGeogSupe", query = "SELECT u FROM UbicGeog u WHERE u.codiUbicGeogSupe = :codiUbicGeogSupe"),
    @NamedQuery(name = "UbicGeog.findByFechAlta", query = "SELECT u FROM UbicGeog u WHERE u.fechAlta = :fechAlta"),
    @NamedQuery(name = "UbicGeog.findByFechBaja", query = "SELECT u FROM UbicGeog u WHERE u.fechBaja = :fechBaja"),
    @NamedQuery(name = "UbicGeog.findByEsta", query = "SELECT u FROM UbicGeog u WHERE u.esta = :esta")})
public class UbicGeog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_ubic_geog")
    private Long codiUbicGeog;
    @Size(max = 200)
    @Column(name = "nomb_ubic_geog")
    private String nombUbicGeog;
    @Column(name = "codi_ubic_geog_supe")
    private BigInteger codiUbicGeogSupe;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public UbicGeog() {
    }

    public UbicGeog(Long codiUbicGeog) {
        this.codiUbicGeog = codiUbicGeog;
    }

    public Long getCodiUbicGeog() {
        return codiUbicGeog;
    }

    public void setCodiUbicGeog(Long codiUbicGeog) {
        this.codiUbicGeog = codiUbicGeog;
    }

    public String getNombUbicGeog() {
        return nombUbicGeog;
    }

    public void setNombUbicGeog(String nombUbicGeog) {
        this.nombUbicGeog = nombUbicGeog;
    }

    public BigInteger getCodiUbicGeogSupe() {
        return codiUbicGeogSupe;
    }

    public void setCodiUbicGeogSupe(BigInteger codiUbicGeogSupe) {
        this.codiUbicGeogSupe = codiUbicGeogSupe;
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
        hash += (codiUbicGeog != null ? codiUbicGeog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UbicGeog)) {
            return false;
        }
        UbicGeog other = (UbicGeog) object;
        if ((this.codiUbicGeog == null && other.codiUbicGeog != null) || (this.codiUbicGeog != null && !this.codiUbicGeog.equals(other.codiUbicGeog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.UbicGeog[ codiUbicGeog=" + codiUbicGeog + " ]";
    }
    
}
