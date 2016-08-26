/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.io.Serializable;
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
@Table(name = "tipo_pers", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPers.findAll", query = "SELECT t FROM TipoPers t"),
    @NamedQuery(name = "TipoPers.findByCodiTipoPers", query = "SELECT t FROM TipoPers t WHERE t.codiTipoPers = :codiTipoPers"),
    @NamedQuery(name = "TipoPers.findByNombTipoPers", query = "SELECT t FROM TipoPers t WHERE t.nombTipoPers = :nombTipoPers"),
    @NamedQuery(name = "TipoPers.findByFechAlta", query = "SELECT t FROM TipoPers t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoPers.findByFechBaja", query = "SELECT t FROM TipoPers t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoPers.findByEsta", query = "SELECT t FROM TipoPers t WHERE t.esta = :esta")})
public class TipoPers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_pers")
    private Long codiTipoPers;
    @Size(max = 150)
    @Column(name = "nomb_tipo_pers")
    private String nombTipoPers;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public TipoPers() {
    }

    public TipoPers(Long codiTipoPers) {
        this.codiTipoPers = codiTipoPers;
    }

    public Long getCodiTipoPers() {
        return codiTipoPers;
    }

    public void setCodiTipoPers(Long codiTipoPers) {
        this.codiTipoPers = codiTipoPers;
    }

    public String getNombTipoPers() {
        return nombTipoPers;
    }

    public void setNombTipoPers(String nombTipoPers) {
        this.nombTipoPers = nombTipoPers;
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
        hash += (codiTipoPers != null ? codiTipoPers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPers)) {
            return false;
        }
        TipoPers other = (TipoPers) object;
        if ((this.codiTipoPers == null && other.codiTipoPers != null) || (this.codiTipoPers != null && !this.codiTipoPers.equals(other.codiTipoPers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoPers[ codiTipoPers=" + codiTipoPers + " ]";
    }
    
}
