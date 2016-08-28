/**
 * @author Kevin Guevara Tolentino
 * @version 0.01 Alpha
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

/**
 * Entidad a partir de una base de datos: luga_acce
 */
@Entity
@Table(name = "luga_acce", catalog = "RegiVisitas", schema = "")
@NamedQueries({
    @NamedQuery(name = "LugaAcce.findAll", query = "SELECT l FROM LugaAcce l where l.esta = 1")})
public class LugaAcce implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_luga_acce")
    private Long codiLugaAcce;
    @Size(max = 100)
    @Column(name = "nomb_luga_acce")
    private String nombLugaAcce;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

/**
 * Constructor, usado para instanciar un objeto
 */
    public LugaAcce() {
    }
/**
 * Constructor
 * @param codiLugaAcce tipo Long
 * @see LugaAcce(Long )
 */
    public LugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }
/**
 * Método de encapsulamiento
 * @return codiLugaAcce, de tipo Long
 * @see getCodiLugaAcce()
 */
    public Long getCodiLugaAcce() {
        return codiLugaAcce;
    }
/**
 * Método de encapsulamiento
 * @param codiLugaAcce Tipo Long
 * @see setCodiLugaAcce(Long )
 */
    public void setCodiLugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }
/**
 * Método de encapsulamiento
 * @return nombLugaAcce, de tipo String
 * @see getNombLugaAcce()
 */
    public String getNombLugaAcce() {
        return nombLugaAcce;
    }
/**
 * Método de encapsulamiento
 * @see setNombLugaAcce(String )
 * @param nombLugaAcce Tipo String
 */
    public void setNombLugaAcce(String nombLugaAcce) {
        this.nombLugaAcce = nombLugaAcce;
    }
/**
 * Método de encapsulamiento
 * @return fechAlta, de tipo Date 
 * @see getFechAlta()
 */
    public Date getFechAlta() {
        return fechAlta;
    }
/**
 * Método de encapsulamiento
 * @param fechAlta Tipo Date
 * @see setFechAlta(Date )
 */
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }
/**
 * Método de encapsulamiento
 * @return fechaBaja, de tipo Date 
 * @see getFechBaja()
 */
    public Date getFechBaja() {
        return fechBaja;
    }
/**
 * Método de encapsulamiento
 * @param fechBaja Tipo Date
 * @see setFechBaja(Date )
 */
    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }
/**
 * Método de encapsulamiento
 * @return esta, de tipo Integer 
 * @see getEsta()
 */
    public Integer getEsta() {
        return esta;
    }
/**
 * Método de encapsulamiento
 * @param esta Tipo Integer
 * @see setEsta(Integer )
 */
    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiLugaAcce != null ? codiLugaAcce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LugaAcce)) {
            return false;
        }
        LugaAcce other = (LugaAcce) object;
        if ((this.codiLugaAcce == null && other.codiLugaAcce != null) || (this.codiLugaAcce != null && !this.codiLugaAcce.equals(other.codiLugaAcce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.LugaAcce[ codiLugaAcce=" + codiLugaAcce + " ]";
    }
    
}
