//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * Type for Origin and Destination stop of a Vehicle Journey
 * 
 * <p>Java class for DatedVehicleJourneyIndirectRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyIndirectRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginRef" type="{http://www.siri.org.uk/}StopPointRefStructure"/>
 *         &lt;element name="AimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DestinationRef" type="{http://www.siri.org.uk/}StopPointRefStructure"/>
 *         &lt;element name="AimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedVehicleJourneyIndirectRefStructure", propOrder = {
    "originRef",
    "aimedDepartureTime",
    "destinationRef",
    "aimedArrivalTime"
})
public class DatedVehicleJourneyIndirectRefStructure {

    @XmlElement(name = "OriginRef", required = true)
    protected StopPointRefStructure originRef;
    @XmlElement(name = "AimedDepartureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date aimedDepartureTime;
    @XmlElement(name = "DestinationRef", required = true)
    protected StopPointRefStructure destinationRef;
    @XmlElement(name = "AimedArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date aimedArrivalTime;

    /**
     * Gets the value of the originRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Sets the value of the originRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setOriginRef(StopPointRefStructure value) {
        this.originRef = value;
    }

    /**
     * Gets the value of the aimedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Sets the value of the aimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAimedDepartureTime(Date value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Gets the value of the destinationRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Sets the value of the destinationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDestinationRef(StopPointRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Gets the value of the aimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Sets the value of the aimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAimedArrivalTime(Date value) {
        this.aimedArrivalTime = value;
    }

}