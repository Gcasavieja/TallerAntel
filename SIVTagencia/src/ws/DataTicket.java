
package ws;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoAnulacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_fin" type="{http://ws/}date" minOccurs="0"/>
 *         &lt;element name="fecha_inicio" type="{http://ws/}date" minOccurs="0"/>
 *         &lt;element name="fecha_venta" type="{http://ws/}date" minOccurs="0"/>
 *         &lt;element name="idAgencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTarifa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTicket" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataTicket", propOrder = {
    "codigoAnulacion",
    "estado",
    "fechaFin",
    "fechaInicio",
    "fechaVenta",
    "idAgencia",
    "idTarifa",
    "idTicket",
    "importe",
    "matricula"
})
public class DataTicket {

    protected String codigoAnulacion;
    protected String estado;
    protected Date fechaFin;
    protected Date fechaInicio;
    protected Date fechaVenta;
    protected int idAgencia;
    protected int idTarifa;
    protected int idTicket;
    protected double importe;
    protected String matricula;

    /**
     * Gets the value of the codigoAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAnulacion() {
        return codigoAnulacion;
    }

    /**
     * Sets the value of the codigoAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAnulacion(String value) {
        this.codigoAnulacion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaFin(Date value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaInicio(Date value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaVenta property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Sets the value of the fechaVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaVenta(Date value) {
        this.fechaVenta = value;
    }

    /**
     * Gets the value of the idAgencia property.
     * 
     */
    public int getIdAgencia() {
        return idAgencia;
    }

    /**
     * Sets the value of the idAgencia property.
     * 
     */
    public void setIdAgencia(int value) {
        this.idAgencia = value;
    }

    /**
     * Gets the value of the idTarifa property.
     * 
     */
    public int getIdTarifa() {
        return idTarifa;
    }

    /**
     * Sets the value of the idTarifa property.
     * 
     */
    public void setIdTarifa(int value) {
        this.idTarifa = value;
    }

    /**
     * Gets the value of the idTicket property.
     * 
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * Sets the value of the idTicket property.
     * 
     */
    public void setIdTicket(int value) {
        this.idTicket = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

}
