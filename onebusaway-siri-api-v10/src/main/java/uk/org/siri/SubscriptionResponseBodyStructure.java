//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * Type for Body of Subscription Response. Used in WSDL.
 * 
 * <p>Java class for SubscriptionResponseBodyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResponseBodyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/}ResponseStatus" maxOccurs="unbounded"/>
 *         &lt;element name="SubscriptionManagerAddress" type="{http://www.siri.org.uk/}EndpointAddress" minOccurs="0"/>
 *         &lt;element name="ServiceStartedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponseBodyStructure", propOrder = {
    "responseStatus",
    "subscriptionManagerAddress",
    "serviceStartedTime"
})
public class SubscriptionResponseBodyStructure {

    @XmlElement(name = "ResponseStatus", required = true)
    protected List<StatusResponseStructure> responseStatus;
    @XmlElement(name = "SubscriptionManagerAddress")
    protected String subscriptionManagerAddress;
    @XmlElement(name = "ServiceStartedTime")
    @XmlSchemaType(name = "dateTime")
    protected Date serviceStartedTime;

    /**
     * Gets the value of the responseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusResponseStructure }
     * 
     * 
     */
    public List<StatusResponseStructure> getResponseStatus() {
        if (responseStatus == null) {
            responseStatus = new ArrayList<StatusResponseStructure>();
        }
        return this.responseStatus;
    }

    /**
     * Gets the value of the subscriptionManagerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionManagerAddress() {
        return subscriptionManagerAddress;
    }

    /**
     * Sets the value of the subscriptionManagerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionManagerAddress(String value) {
        this.subscriptionManagerAddress = value;
    }

    /**
     * Gets the value of the serviceStartedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Sets the value of the serviceStartedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setServiceStartedTime(Date value) {
        this.serviceStartedTime = value;
    }

}
