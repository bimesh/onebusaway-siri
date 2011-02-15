//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketingFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketingFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="factkt_1"/>
 *     &lt;enumeration value="ticketMachines"/>
 *     &lt;enumeration value="factkt_2"/>
 *     &lt;enumeration value="ticketOffice"/>
 *     &lt;enumeration value="factkt_3"/>
 *     &lt;enumeration value="ticketOnDemandMachines"/>
 *     &lt;enumeration value="factkt_4"/>
 *     &lt;enumeration value="ticketSales"/>
 *     &lt;enumeration value="factkt_5"/>
 *     &lt;enumeration value="mobileTicketing"/>
 *     &lt;enumeration value="factkt_6"/>
 *     &lt;enumeration value="ticketCollection"/>
 *     &lt;enumeration value="factkt_7"/>
 *     &lt;enumeration value="centralReservations"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketingFacilityEnumeration")
@XmlEnum
public enum TicketingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("factkt_1")
    FACTKT_1("factkt_1"),
    @XmlEnumValue("ticketMachines")
    TICKET_MACHINES("ticketMachines"),
    @XmlEnumValue("factkt_2")
    FACTKT_2("factkt_2"),
    @XmlEnumValue("ticketOffice")
    TICKET_OFFICE("ticketOffice"),
    @XmlEnumValue("factkt_3")
    FACTKT_3("factkt_3"),
    @XmlEnumValue("ticketOnDemandMachines")
    TICKET_ON_DEMAND_MACHINES("ticketOnDemandMachines"),
    @XmlEnumValue("factkt_4")
    FACTKT_4("factkt_4"),
    @XmlEnumValue("ticketSales")
    TICKET_SALES("ticketSales"),
    @XmlEnumValue("factkt_5")
    FACTKT_5("factkt_5"),
    @XmlEnumValue("mobileTicketing")
    MOBILE_TICKETING("mobileTicketing"),
    @XmlEnumValue("factkt_6")
    FACTKT_6("factkt_6"),
    @XmlEnumValue("ticketCollection")
    TICKET_COLLECTION("ticketCollection"),
    @XmlEnumValue("factkt_7")
    FACTKT_7("factkt_7"),
    @XmlEnumValue("centralReservations")
    CENTRAL_RESERVATIONS("centralReservations");
    private final String value;

    TicketingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketingFacilityEnumeration fromValue(String v) {
        for (TicketingFacilityEnumeration c: TicketingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
