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
@Table(name = "tipo_docu", catalog = "RegiVisitas", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocu.findAll", query = "SELECT t FROM TipoDocu t where t.esta = 1"),
    @NamedQuery(name = "TipoDocu.findByCodiTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.codiTipoDocu = :codiTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByNombTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.nombTipoDocu = :nombTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByFechAlta", query = "SELECT t FROM TipoDocu t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoDocu.findByFechBaja", query = "SELECT t FROM TipoDocu t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoDocu.findByEsta", query = "SELECT t FROM TipoDocu t WHERE t.esta = :esta")})
public class TipoDocu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_docu")
    private Long codiTipoDocu;
    @Size(max = 50)
    @Column(name = "nomb_tipo_docu")
    private String nombTipoDocu;
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
    public TipoDocu() {
    }
/**
 * Constructor
 * @param codiTipoDocu tipo Long
 * @see TipoDocu(Long )
 */
    public TipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }
/**
 * Método de encapsulamiento
 * @return codiTipoDocu, de tipo Long
 * @see getCodiTipoDocu()
 */
    public Long getCodiTipoDocu() {
        return codiTipoDocu;
    }
/**
 * Método de encapsulamiento
 * @param codiTipoDocu Tipo Long
 * @see setCodiTipoDocu(Long )
 */
    public void setCodiTipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }
/**
 * Método de encapsulamiento
 * @return nombTipoDocu, de tipo String
 * @see getNombTipoDocu()
 */
    public String getNombTipoDocu() {
        return nombTipoDocu;
    }
/**
 * Método de encapsulamiento
 * @see setNombTipoDocu(String )
 * @param nombTipoDocu Tipo String
 */
    public void setNombTipoDocu(String nombTipoDocu) {
        this.nombTipoDocu = nombTipoDocu;
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
        hash += (codiTipoDocu != null ? codiTipoDocu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocu)) {
            return false;
        }
        TipoDocu other = (TipoDocu) object;
        if ((this.codiTipoDocu == null && other.codiTipoDocu != null) || (this.codiTipoDocu != null && !this.codiTipoDocu.equals(other.codiTipoDocu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoDocu[ codiTipoDocu=" + codiTipoDocu + " ]";
    }
    
}
