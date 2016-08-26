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
@Table(name = "equi_comp", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquiComp.findAll", query = "SELECT e FROM EquiComp e"),
    @NamedQuery(name = "EquiComp.findByCodiEquiComp", query = "SELECT e FROM EquiComp e WHERE e.codiEquiComp = :codiEquiComp"),
    @NamedQuery(name = "EquiComp.findByNombEquiCom", query = "SELECT e FROM EquiComp e WHERE e.nombEquiCom = :nombEquiCom"),
    @NamedQuery(name = "EquiComp.findByCodiLugaAcce", query = "SELECT e FROM EquiComp e WHERE e.codiLugaAcce = :codiLugaAcce"),
    @NamedQuery(name = "EquiComp.findByMacAddrEquiComp", query = "SELECT e FROM EquiComp e WHERE e.macAddrEquiComp = :macAddrEquiComp"),
    @NamedQuery(name = "EquiComp.findByIpAddrEquiComp", query = "SELECT e FROM EquiComp e WHERE e.ipAddrEquiComp = :ipAddrEquiComp"),
    @NamedQuery(name = "EquiComp.findByFechAlta", query = "SELECT e FROM EquiComp e WHERE e.fechAlta = :fechAlta"),
    @NamedQuery(name = "EquiComp.findByFechBaja", query = "SELECT e FROM EquiComp e WHERE e.fechBaja = :fechBaja"),
    @NamedQuery(name = "EquiComp.findByEsta", query = "SELECT e FROM EquiComp e WHERE e.esta = :esta")})
public class EquiComp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_equi_comp")
    private Long codiEquiComp;
    @Size(max = 100)
    @Column(name = "nomb_equi_com")
    private String nombEquiCom;
    @Column(name = "codi_luga_acce")
    private BigInteger codiLugaAcce;
    @Size(max = 50)
    @Column(name = "mac_addr_equi_comp")
    private String macAddrEquiComp;
    @Size(max = 50)
    @Column(name = "ip_addr_equi_comp")
    private String ipAddrEquiComp;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public EquiComp() {
    }

    public EquiComp(Long codiEquiComp) {
        this.codiEquiComp = codiEquiComp;
    }

    public Long getCodiEquiComp() {
        return codiEquiComp;
    }

    public void setCodiEquiComp(Long codiEquiComp) {
        this.codiEquiComp = codiEquiComp;
    }

    public String getNombEquiCom() {
        return nombEquiCom;
    }

    public void setNombEquiCom(String nombEquiCom) {
        this.nombEquiCom = nombEquiCom;
    }

    public BigInteger getCodiLugaAcce() {
        return codiLugaAcce;
    }

    public void setCodiLugaAcce(BigInteger codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }

    public String getMacAddrEquiComp() {
        return macAddrEquiComp;
    }

    public void setMacAddrEquiComp(String macAddrEquiComp) {
        this.macAddrEquiComp = macAddrEquiComp;
    }

    public String getIpAddrEquiComp() {
        return ipAddrEquiComp;
    }

    public void setIpAddrEquiComp(String ipAddrEquiComp) {
        this.ipAddrEquiComp = ipAddrEquiComp;
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
        hash += (codiEquiComp != null ? codiEquiComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquiComp)) {
            return false;
        }
        EquiComp other = (EquiComp) object;
        if ((this.codiEquiComp == null && other.codiEquiComp != null) || (this.codiEquiComp != null && !this.codiEquiComp.equals(other.codiEquiComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.EquiComp[ codiEquiComp=" + codiEquiComp + " ]";
    }
    
}
