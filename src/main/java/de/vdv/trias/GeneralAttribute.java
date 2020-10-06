/*
 * MIT License
 * 
 * Copyright (c) 2020 Hochschule Esslingen
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE. 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package de.vdv.trias;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.siri.siri.AccessFacilityEnumeration;
import uk.org.siri.siri.AccommodationFacilityEnumeration;
import uk.org.siri.siri.AssistanceFacilityEnumeration;
import uk.org.siri.siri.FareClassFacilityEnumeration;
import uk.org.siri.siri.HireFacilityEnumeration;
import uk.org.siri.siri.LuggageFacilityEnumeration;
import uk.org.siri.siri.MobilityFacilityEnumeration;
import uk.org.siri.siri.NuisanceFacilityEnumeration;
import uk.org.siri.siri.PassengerCommsFacilityEnumeration;
import uk.org.siri.siri.PassengerInformationFacilityEnumeration;
import uk.org.siri.siri.RefreshmentFacilityEnumeration;
import uk.org.siri.siri.SanitaryFacilityEnumeration;
import uk.org.siri.siri.TicketingFacilityEnumeration;


/**
 * Structured attribute classification with associated text.
 * 
 * <p>Java class for GeneralAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralAttributeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.vdv.de/trias}InternationalTextStructure" maxOccurs="unbounded"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;group ref="{http://www.vdv.de/trias}AllFacilitiesGroup"/>
 *         &lt;element name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Importance" type="{http://www.vdv.de/trias}PercentType" minOccurs="0"/>
 *         &lt;element name="InfoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.vdv.de/trias}GeneralAttributeStatusEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralAttributeStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "text",
    "code",
    "fareClassFacility",
    "ticketingFacility",
    "nuisanceFacility",
    "mobilityFacility",
    "passengerInformationFacility",
    "passengerCommsFacility",
    "refreshmentFacility",
    "accessFacility",
    "sanitaryFacility",
    "luggageFacility",
    "accommodationFacility",
    "assistanceFacility",
    "hireFacility",
    "mandatory",
    "importance",
    "infoURL",
    "status"
})
@XmlSeeAlso({
    ServiceAttribute.class
})
public class GeneralAttribute {

    @XmlElement(name = "Text", namespace = "http://www.vdv.de/trias", required = true)
    protected List<InternationalText> text;
    @XmlElement(name = "Code", namespace = "http://www.vdv.de/trias", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String code;
    @XmlElement(name = "FareClassFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FareClassFacilityEnumeration> fareClassFacility;
    @XmlElement(name = "TicketingFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<TicketingFacilityEnumeration> ticketingFacility;
    @XmlElement(name = "NuisanceFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<NuisanceFacilityEnumeration> nuisanceFacility;
    @XmlElement(name = "MobilityFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<MobilityFacilityEnumeration> mobilityFacility;
    @XmlElement(name = "PassengerInformationFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PassengerInformationFacilityEnumeration> passengerInformationFacility;
    @XmlElement(name = "PassengerCommsFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PassengerCommsFacilityEnumeration> passengerCommsFacility;
    @XmlElement(name = "RefreshmentFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RefreshmentFacilityEnumeration> refreshmentFacility;
    @XmlElement(name = "AccessFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccessFacilityEnumeration> accessFacility;
    @XmlElement(name = "SanitaryFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<SanitaryFacilityEnumeration> sanitaryFacility;
    @XmlElement(name = "LuggageFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<LuggageFacilityEnumeration> luggageFacility;
    @XmlElement(name = "AccommodationFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccommodationFacilityEnumeration> accommodationFacility;
    @XmlElement(name = "AssistanceFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AssistanceFacilityEnumeration> assistanceFacility;
    @XmlElement(name = "HireFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<HireFacilityEnumeration> hireFacility;
    @XmlElement(name = "Mandatory", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean mandatory;
    @XmlElement(name = "Importance", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer importance;
    @XmlElement(name = "InfoURL", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "anyURI")
    protected String infoURL;
    @XmlElement(name = "Status", namespace = "http://www.vdv.de/trias", defaultValue = "Unknown")
    @XmlSchemaType(name = "string")
    protected GeneralAttributeStatusEnumeration status;

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalText }
     * 
     * 
     */
    public List<InternationalText> getText() {
        if (text == null) {
            text = new ArrayList<InternationalText>();
        }
        return this.text;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralAttribute setCode(String value) {
        this.code = value;
        return this;
    }

    /**
     * Gets the value of the fareClassFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClassFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClassFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassFacilityEnumeration }
     * 
     * 
     */
    public List<FareClassFacilityEnumeration> getFareClassFacility() {
        if (fareClassFacility == null) {
            fareClassFacility = new ArrayList<FareClassFacilityEnumeration>();
        }
        return this.fareClassFacility;
    }

    /**
     * Gets the value of the ticketingFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getTicketingFacility() {
        if (ticketingFacility == null) {
            ticketingFacility = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.ticketingFacility;
    }

    /**
     * Gets the value of the nuisanceFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nuisanceFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuisanceFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuisanceFacilityEnumeration }
     * 
     * 
     */
    public List<NuisanceFacilityEnumeration> getNuisanceFacility() {
        if (nuisanceFacility == null) {
            nuisanceFacility = new ArrayList<NuisanceFacilityEnumeration>();
        }
        return this.nuisanceFacility;
    }

    /**
     * Gets the value of the mobilityFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilityFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilityFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityFacilityEnumeration }
     * 
     * 
     */
    public List<MobilityFacilityEnumeration> getMobilityFacility() {
        if (mobilityFacility == null) {
            mobilityFacility = new ArrayList<MobilityFacilityEnumeration>();
        }
        return this.mobilityFacility;
    }

    /**
     * Gets the value of the passengerInformationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerInformationFacilityEnumeration> getPassengerInformationFacility() {
        if (passengerInformationFacility == null) {
            passengerInformationFacility = new ArrayList<PassengerInformationFacilityEnumeration>();
        }
        return this.passengerInformationFacility;
    }

    /**
     * Gets the value of the passengerCommsFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCommsFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCommsFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCommsFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerCommsFacilityEnumeration> getPassengerCommsFacility() {
        if (passengerCommsFacility == null) {
            passengerCommsFacility = new ArrayList<PassengerCommsFacilityEnumeration>();
        }
        return this.passengerCommsFacility;
    }

    /**
     * Gets the value of the refreshmentFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refreshmentFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefreshmentFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefreshmentFacilityEnumeration }
     * 
     * 
     */
    public List<RefreshmentFacilityEnumeration> getRefreshmentFacility() {
        if (refreshmentFacility == null) {
            refreshmentFacility = new ArrayList<RefreshmentFacilityEnumeration>();
        }
        return this.refreshmentFacility;
    }

    /**
     * Gets the value of the accessFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacility() {
        if (accessFacility == null) {
            accessFacility = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacility;
    }

    /**
     * Gets the value of the sanitaryFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanitaryFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitaryFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryFacilityEnumeration }
     * 
     * 
     */
    public List<SanitaryFacilityEnumeration> getSanitaryFacility() {
        if (sanitaryFacility == null) {
            sanitaryFacility = new ArrayList<SanitaryFacilityEnumeration>();
        }
        return this.sanitaryFacility;
    }

    /**
     * Gets the value of the luggageFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageFacilityEnumeration }
     * 
     * 
     */
    public List<LuggageFacilityEnumeration> getLuggageFacility() {
        if (luggageFacility == null) {
            luggageFacility = new ArrayList<LuggageFacilityEnumeration>();
        }
        return this.luggageFacility;
    }

    /**
     * Gets the value of the accommodationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationFacilityEnumeration }
     * 
     * 
     */
    public List<AccommodationFacilityEnumeration> getAccommodationFacility() {
        if (accommodationFacility == null) {
            accommodationFacility = new ArrayList<AccommodationFacilityEnumeration>();
        }
        return this.accommodationFacility;
    }

    /**
     * Gets the value of the assistanceFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assistanceFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssistanceFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssistanceFacilityEnumeration }
     * 
     * 
     */
    public List<AssistanceFacilityEnumeration> getAssistanceFacility() {
        if (assistanceFacility == null) {
            assistanceFacility = new ArrayList<AssistanceFacilityEnumeration>();
        }
        return this.assistanceFacility;
    }

    /**
     * Gets the value of the hireFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hireFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHireFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HireFacilityEnumeration }
     * 
     * 
     */
    public List<HireFacilityEnumeration> getHireFacility() {
        if (hireFacility == null) {
            hireFacility = new ArrayList<HireFacilityEnumeration>();
        }
        return this.hireFacility;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GeneralAttribute setMandatory(Boolean value) {
        this.mandatory = value;
        return this;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public GeneralAttribute setImportance(Integer value) {
        this.importance = value;
        return this;
    }

    /**
     * Gets the value of the infoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoURL() {
        return infoURL;
    }

    /**
     * Sets the value of the infoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralAttribute setInfoURL(String value) {
        this.infoURL = value;
        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralAttributeStatusEnumeration }
     *     
     */
    public GeneralAttributeStatusEnumeration getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralAttributeStatusEnumeration }
     *     
     */
    public GeneralAttribute setStatus(GeneralAttributeStatusEnumeration value) {
        this.status = value;
        return this;
    }

}