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
@Table(name = "gafe_iden", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GafeIden.findAll", query = "SELECT g FROM GafeIden g"),
    @NamedQuery(name = "GafeIden.findByCodiGafeIden", query = "SELECT g FROM GafeIden g WHERE g.codiGafeIden = :codiGafeIden"),
    @NamedQuery(name = "GafeIden.findByNombGafeIden", query = "SELECT g FROM GafeIden g WHERE g.nombGafeIden = :nombGafeIden"),
    @NamedQuery(name = "GafeIden.findByNumeTipoGafe", query = "SELECT g FROM GafeIden g WHERE g.numeTipoGafe = :numeTipoGafe"),
    @NamedQuery(name = "GafeIden.findByCodiTipoGafe", query = "SELECT g FROM GafeIden g WHERE g.codiTipoGafe = :codiTipoGafe"),
    @NamedQuery(name = "GafeIden.findByFechAlta", query = "SELECT g FROM GafeIden g WHERE g.fechAlta = :fechAlta"),
    @NamedQuery(name = "GafeIden.findByFechBaja", query = "SELECT g FROM GafeIden g WHERE g.fechBaja = :fechBaja"),
    @NamedQuery(name = "GafeIden.findByEsta", query = "SELECT g FROM GafeIden g WHERE g.esta = :esta")})
public class GafeIden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_gafe_iden")
    private Long codiGafeIden;
    @Size(max = 200)
    @Column(name = "nomb_gafe_iden")
    private String nombGafeIden;
    @Size(max = 200)
    @Column(name = "nume_tipo_gafe")
    private String numeTipoGafe;
    @Column(name = "codi_tipo_gafe")
    private BigInteger codiTipoGafe;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public GafeIden() {
    }

    public GafeIden(Long codiGafeIden) {
        this.codiGafeIden = codiGafeIden;
    }

    public Long getCodiGafeIden() {
        return codiGafeIden;
    }

    public void setCodiGafeIden(Long codiGafeIden) {
        this.codiGafeIden = codiGafeIden;
    }

    public String getNombGafeIden() {
        return nombGafeIden;
    }

    public void setNombGafeIden(String nombGafeIden) {
        this.nombGafeIden = nombGafeIden;
    }

    public String getNumeTipoGafe() {
        return numeTipoGafe;
    }

    public void setNumeTipoGafe(String numeTipoGafe) {
        this.numeTipoGafe = numeTipoGafe;
    }

    public BigInteger getCodiTipoGafe() {
        return codiTipoGafe;
    }

    public void setCodiTipoGafe(BigInteger codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
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
        hash += (codiGafeIden != null ? codiGafeIden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GafeIden)) {
            return false;
        }
        GafeIden other = (GafeIden) object;
        if ((this.codiGafeIden == null && other.codiGafeIden != null) || (this.codiGafeIden != null && !this.codiGafeIden.equals(other.codiGafeIden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.GafeIden[ codiGafeIden=" + codiGafeIden + " ]";
    }
    
}
