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
@Table(name = "visi", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visi.findAll", query = "SELECT v FROM Visi v"),
    @NamedQuery(name = "Visi.findByCodiVisi", query = "SELECT v FROM Visi v WHERE v.codiVisi = :codiVisi"),
    @NamedQuery(name = "Visi.findByCodiUsua", query = "SELECT v FROM Visi v WHERE v.codiUsua = :codiUsua"),
    @NamedQuery(name = "Visi.findByCodiPers", query = "SELECT v FROM Visi v WHERE v.codiPers = :codiPers"),
    @NamedQuery(name = "Visi.findByCodiPersVisi", query = "SELECT v FROM Visi v WHERE v.codiPersVisi = :codiPersVisi"),
    @NamedQuery(name = "Visi.findByCodiUnidOrgaVisi", query = "SELECT v FROM Visi v WHERE v.codiUnidOrgaVisi = :codiUnidOrgaVisi"),
    @NamedQuery(name = "Visi.findByCodiTipoDocu", query = "SELECT v FROM Visi v WHERE v.codiTipoDocu = :codiTipoDocu"),
    @NamedQuery(name = "Visi.findByCodiGafe", query = "SELECT v FROM Visi v WHERE v.codiGafe = :codiGafe"),
    @NamedQuery(name = "Visi.findByCodiLugaEntr", query = "SELECT v FROM Visi v WHERE v.codiLugaEntr = :codiLugaEntr"),
    @NamedQuery(name = "Visi.findByCodiLugaSali", query = "SELECT v FROM Visi v WHERE v.codiLugaSali = :codiLugaSali"),
    @NamedQuery(name = "Visi.findByFechHoraEntrVisi", query = "SELECT v FROM Visi v WHERE v.fechHoraEntrVisi = :fechHoraEntrVisi"),
    @NamedQuery(name = "Visi.findByFechHoraSaliVisi", query = "SELECT v FROM Visi v WHERE v.fechHoraSaliVisi = :fechHoraSaliVisi"),
    @NamedQuery(name = "Visi.findByMotiVisi", query = "SELECT v FROM Visi v WHERE v.motiVisi = :motiVisi"),
    @NamedQuery(name = "Visi.findByFechAlta", query = "SELECT v FROM Visi v WHERE v.fechAlta = :fechAlta"),
    @NamedQuery(name = "Visi.findByFechBaja", query = "SELECT v FROM Visi v WHERE v.fechBaja = :fechBaja"),
    @NamedQuery(name = "Visi.findByEsta", query = "SELECT v FROM Visi v WHERE v.esta = :esta")})
public class Visi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_visi")
    private Long codiVisi;
    @Column(name = "codi_usua")
    private BigInteger codiUsua;
    @Column(name = "codi_pers")
    private BigInteger codiPers;
    @Column(name = "codi_pers_visi")
    private BigInteger codiPersVisi;
    @Column(name = "codi_unid_orga_visi")
    private BigInteger codiUnidOrgaVisi;
    @Column(name = "codi_tipo_docu")
    private BigInteger codiTipoDocu;
    @Column(name = "codi_gafe")
    private BigInteger codiGafe;
    @Column(name = "codi_luga_entr")
    private BigInteger codiLugaEntr;
    @Column(name = "codi_luga_sali")
    private BigInteger codiLugaSali;
    @Column(name = "fech_hora_entr_visi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechHoraEntrVisi;
    @Column(name = "fech_hora_sali_visi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechHoraSaliVisi;
    @Size(max = 255)
    @Column(name = "moti_visi")
    private String motiVisi;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    public Visi() {
    }

    public Visi(Long codiVisi) {
        this.codiVisi = codiVisi;
    }

    public Long getCodiVisi() {
        return codiVisi;
    }

    public void setCodiVisi(Long codiVisi) {
        this.codiVisi = codiVisi;
    }

    public BigInteger getCodiUsua() {
        return codiUsua;
    }

    public void setCodiUsua(BigInteger codiUsua) {
        this.codiUsua = codiUsua;
    }

    public BigInteger getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(BigInteger codiPers) {
        this.codiPers = codiPers;
    }

    public BigInteger getCodiPersVisi() {
        return codiPersVisi;
    }

    public void setCodiPersVisi(BigInteger codiPersVisi) {
        this.codiPersVisi = codiPersVisi;
    }

    public BigInteger getCodiUnidOrgaVisi() {
        return codiUnidOrgaVisi;
    }

    public void setCodiUnidOrgaVisi(BigInteger codiUnidOrgaVisi) {
        this.codiUnidOrgaVisi = codiUnidOrgaVisi;
    }

    public BigInteger getCodiTipoDocu() {
        return codiTipoDocu;
    }

    public void setCodiTipoDocu(BigInteger codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }

    public BigInteger getCodiGafe() {
        return codiGafe;
    }

    public void setCodiGafe(BigInteger codiGafe) {
        this.codiGafe = codiGafe;
    }

    public BigInteger getCodiLugaEntr() {
        return codiLugaEntr;
    }

    public void setCodiLugaEntr(BigInteger codiLugaEntr) {
        this.codiLugaEntr = codiLugaEntr;
    }

    public BigInteger getCodiLugaSali() {
        return codiLugaSali;
    }

    public void setCodiLugaSali(BigInteger codiLugaSali) {
        this.codiLugaSali = codiLugaSali;
    }

    public Date getFechHoraEntrVisi() {
        return fechHoraEntrVisi;
    }

    public void setFechHoraEntrVisi(Date fechHoraEntrVisi) {
        this.fechHoraEntrVisi = fechHoraEntrVisi;
    }

    public Date getFechHoraSaliVisi() {
        return fechHoraSaliVisi;
    }

    public void setFechHoraSaliVisi(Date fechHoraSaliVisi) {
        this.fechHoraSaliVisi = fechHoraSaliVisi;
    }

    public String getMotiVisi() {
        return motiVisi;
    }

    public void setMotiVisi(String motiVisi) {
        this.motiVisi = motiVisi;
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
        hash += (codiVisi != null ? codiVisi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visi)) {
            return false;
        }
        Visi other = (Visi) object;
        if ((this.codiVisi == null && other.codiVisi != null) || (this.codiVisi != null && !this.codiVisi.equals(other.codiVisi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.Visi[ codiVisi=" + codiVisi + " ]";
    }
    
}
