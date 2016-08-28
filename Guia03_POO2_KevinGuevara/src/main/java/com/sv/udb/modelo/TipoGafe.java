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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad a partir de una base de datos: tipo_docu
 */
@Entity
@Table(name = "tipo_gafe", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoGafe.findAll", query = "SELECT t FROM TipoGafe t where t.esta = 1"),
    @NamedQuery(name = "TipoGafe.findByCodiTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.codiTipoGafe = :codiTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByNombTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.nombTipoGafe = :nombTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByFechAlta", query = "SELECT t FROM TipoGafe t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoGafe.findByFechBaja", query = "SELECT t FROM TipoGafe t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoGafe.findByEsta", query = "SELECT t FROM TipoGafe t WHERE t.esta = :esta")})
public class TipoGafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_gafe")
    private Long codiTipoGafe;
    @Size(max = 200)
    @Column(name = "nomb_tipo_gafe")
    private String nombTipoGafe;
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
    public TipoGafe() {
    }
/**
 * Constructor
 * @param codiTipoGafe tipo Long
 * @see TipoGafe(Long )
 */
   
    public TipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }
/**
 * Método de encapsulamiento
 * @return getCodiTipoGafe, de tipo Long
 * @see codiTipoGafe()
 */
    public Long getCodiTipoGafe() {
        return codiTipoGafe;
    }
/**
 * Método de encapsulamiento
 * @param codiTipoGafe Tipo Long
 * @see setCodiTipoGafe(Long )
 */
    public void setCodiTipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }
/**
 * Método de encapsulamiento
 * @return nombTipoGafe, de tipo String
 * @see getNombTipoGafe()
 */
    public String getNombTipoGafe() {
        return nombTipoGafe;
    }
/**
 * Método de encapsulamiento
 * @see setNombTipoGafe(String )
 * @param nombTipoGafe Tipo String
 */
    public void setNombTipoGafe(String nombTipoGafe) {
        this.nombTipoGafe = nombTipoGafe;
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
        hash += (codiTipoGafe != null ? codiTipoGafe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGafe)) {
            return false;
        }
        TipoGafe other = (TipoGafe) object;
        if ((this.codiTipoGafe == null && other.codiTipoGafe != null) || (this.codiTipoGafe != null && !this.codiTipoGafe.equals(other.codiTipoGafe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoGafe[ codiTipoGafe=" + codiTipoGafe + " ]";
    }
    
}
