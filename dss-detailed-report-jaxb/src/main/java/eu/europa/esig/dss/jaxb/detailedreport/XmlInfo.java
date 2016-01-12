//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.12 at 10:53:20 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Info">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CertificateId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Field" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RevokedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="NextUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="AlgoExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Info", propOrder = {
    "value"
})
public class XmlInfo {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Identifier")
    protected String identifier;
    @XmlAttribute(name = "CertificateId")
    protected String certificateId;
    @XmlAttribute(name = "Field")
    protected String field;
    @XmlAttribute(name = "RevokedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar revokedDate;
    @XmlAttribute(name = "NextUpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextUpdateDate;
    @XmlAttribute(name = "AlgoExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algoExpirationDate;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the certificateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * Sets the value of the certificateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateId(String value) {
        this.certificateId = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the revokedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevokedDate() {
        return revokedDate;
    }

    /**
     * Sets the value of the revokedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevokedDate(XMLGregorianCalendar value) {
        this.revokedDate = value;
    }

    /**
     * Gets the value of the nextUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextUpdateDate() {
        return nextUpdateDate;
    }

    /**
     * Sets the value of the nextUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextUpdateDate(XMLGregorianCalendar value) {
        this.nextUpdateDate = value;
    }

    /**
     * Gets the value of the algoExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgoExpirationDate() {
        return algoExpirationDate;
    }

    /**
     * Sets the value of the algoExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgoExpirationDate(XMLGregorianCalendar value) {
        this.algoExpirationDate = value;
    }

}
