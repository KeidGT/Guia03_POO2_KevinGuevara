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
@Table(name = "unid_orga", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidOrga.findAll", query = "SELECT u FROM UnidOrga u"),
    @NamedQuery(name = "UnidOrga.findByCodiUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.codiUnidOrga = :codiUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByNombUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.nombUnidOrga = :nombUnidOrga"),
    @NamedQuery(name = "UnidOrga.findBySiglUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.siglUnidOrga = :siglUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByCodiUnidOrgaSupe", query = "SELECT u FROM UnidOrga u WHERE u.codiUnidOrgaSupe = :codiUnidOrgaSupe"),
    @NamedQuery(name = "UnidOrga.findByDireUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.direUnidOrga = :direUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByTeleUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.teleUnidOrga = :teleUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByFaxUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.faxUnidOrga = :faxUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByEmaiUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.emaiUnidOrga = :emaiUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByContUnidOrga", query = "SELECT u FROM UnidOrga u WHERE u.contUnidOrga = :contUnidOrga"),
    @NamedQuery(name = "UnidOrga.findByCodiUbicGeog", query = "SELECT u FROM UnidOrga u WHERE u.codiUbicGeog = :codiUbicGeog"),
    @NamedQuery(name = "UnidOrga.findByFechAlta", query = "SELECT u FROM UnidOrga u WHERE u.fechAlta = :fechAlta"),
    @NamedQuery(name = "UnidOrga.findByFechBaja", query = "SELECT u FROM UnidOrga u WHERE u.fechBaja = :fechBaja"),
    @NamedQuery(name = "UnidOrga.findByEsta", query = "SELECT u FROM UnidOrga u WHERE u.esta = :esta")})
public class UnidOrga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_unid_orga")
    private Long codiUnidOrga;
    @Size(max = 100)
    @Column(name = "nomb_unid_orga")
    private String nombUnidOrga;
    @Size(max = 100)
    @Column(name = "sigl_unid_orga")
    private String siglUnidOrga;
    @Column(name = "codi_unid_orga_supe")
    private BigInteger codiUnidOrgaSupe;
    @Size(max = 200)
    @Column(name = "dire_unid_orga")
    private String direUnidOrga;
    @Size(max = 20)
    @Column(name = "tele_unid_orga")
    private String teleUnidOrga;
    @Size(max = 20)
    @Column(name = "fax_unid_orga")
    private String faxUnidOrga;
    @Size(max = 50)
    @Column(name = "emai_unid_orga")
    private String emaiUnidOrga;
    @Size(max = 100)
    @Column(name = "cont_unid_orga")
    private String contUnidOrga;
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

    public UnidOrga() {
    }

    public UnidOrga(Long codiUnidOrga) {
        this.codiUnidOrga = codiUnidOrga;
    }

    public Long getCodiUnidOrga() {
        return codiUnidOrga;
    }

    public void setCodiUnidOrga(Long codiUnidOrga) {
        this.codiUnidOrga = codiUnidOrga;
    }

    public String getNombUnidOrga() {
        return nombUnidOrga;
    }

    public void setNombUnidOrga(String nombUnidOrga) {
        this.nombUnidOrga = nombUnidOrga;
    }

    public String getSiglUnidOrga() {
        return siglUnidOrga;
    }

    public void setSiglUnidOrga(String siglUnidOrga) {
        this.siglUnidOrga = siglUnidOrga;
    }

    public BigInteger getCodiUnidOrgaSupe() {
        return codiUnidOrgaSupe;
    }

    public void setCodiUnidOrgaSupe(BigInteger codiUnidOrgaSupe) {
        this.codiUnidOrgaSupe = codiUnidOrgaSupe;
    }

    public String getDireUnidOrga() {
        return direUnidOrga;
    }

    public void setDireUnidOrga(String direUnidOrga) {
        this.direUnidOrga = direUnidOrga;
    }

    public String getTeleUnidOrga() {
        return teleUnidOrga;
    }

    public void setTeleUnidOrga(String teleUnidOrga) {
        this.teleUnidOrga = teleUnidOrga;
    }

    public String getFaxUnidOrga() {
        return faxUnidOrga;
    }

    public void setFaxUnidOrga(String faxUnidOrga) {
        this.faxUnidOrga = faxUnidOrga;
    }

    public String getEmaiUnidOrga() {
        return emaiUnidOrga;
    }

    public void setEmaiUnidOrga(String emaiUnidOrga) {
        this.emaiUnidOrga = emaiUnidOrga;
    }

    public String getContUnidOrga() {
        return contUnidOrga;
    }

    public void setContUnidOrga(String contUnidOrga) {
        this.contUnidOrga = contUnidOrga;
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
        hash += (codiUnidOrga != null ? codiUnidOrga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidOrga)) {
            return false;
        }
        UnidOrga other = (UnidOrga) object;
        if ((this.codiUnidOrga == null && other.codiUnidOrga != null) || (this.codiUnidOrga != null && !this.codiUnidOrga.equals(other.codiUnidOrga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.UnidOrga[ codiUnidOrga=" + codiUnidOrga + " ]";
    }
    
}
