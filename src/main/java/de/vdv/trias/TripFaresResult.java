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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Structure of a Single Trip Fare Request result
 * 
 * <p>Java class for TripFaresResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripFaresResultStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/trias}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.vdv.de/trias}TripLegRangeGroup" minOccurs="0"/>
 *         &lt;element name="PassedZones" type="{http://www.vdv.de/trias}FareZoneListInAreaStructure" minOccurs="0"/>
 *         &lt;element name="Ticket" type="{http://www.vdv.de/trias}TicketStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StaticInfoUrl" type="{http://www.vdv.de/trias}WebLinkStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFaresResultStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "errorMessage",
    "fromTripLegIdRef",
    "toTripLegIdRef",
    "passedZones",
    "ticket",
    "staticInfoUrl"
})
public class TripFaresResult {

    @XmlElement(name = "ErrorMessage", namespace = "http://www.vdv.de/trias")
    protected List<ErrorMessage> errorMessage;
    @XmlElement(name = "FromTripLegIdRef", namespace = "http://www.vdv.de/trias")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fromTripLegIdRef;
    @XmlElement(name = "ToTripLegIdRef", namespace = "http://www.vdv.de/trias")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String toTripLegIdRef;
    @XmlElement(name = "PassedZones", namespace = "http://www.vdv.de/trias")
    protected FareZoneListInArea passedZones;
    @XmlElement(name = "Ticket", namespace = "http://www.vdv.de/trias")
    protected List<Ticket> ticket;
    @XmlElement(name = "StaticInfoUrl", namespace = "http://www.vdv.de/trias")
    protected List<WebLink> staticInfoUrl;

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessage }
     * 
     * 
     */
    public List<ErrorMessage> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessage>();
        }
        return this.errorMessage;
    }

    /**
     * Gets the value of the fromTripLegIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTripLegIdRef() {
        return fromTripLegIdRef;
    }

    /**
     * Sets the value of the fromTripLegIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripFaresResult setFromTripLegIdRef(String value) {
        this.fromTripLegIdRef = value;
        return this;
    }

    /**
     * Gets the value of the toTripLegIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTripLegIdRef() {
        return toTripLegIdRef;
    }

    /**
     * Sets the value of the toTripLegIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TripFaresResult setToTripLegIdRef(String value) {
        this.toTripLegIdRef = value;
        return this;
    }

    /**
     * Gets the value of the passedZones property.
     * 
     * @return
     *     possible object is
     *     {@link FareZoneListInArea }
     *     
     */
    public FareZoneListInArea getPassedZones() {
        return passedZones;
    }

    /**
     * Sets the value of the passedZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZoneListInArea }
     *     
     */
    public TripFaresResult setPassedZones(FareZoneListInArea value) {
        this.passedZones = value;
        return this;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ticket }
     * 
     * 
     */
    public List<Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<Ticket>();
        }
        return this.ticket;
    }

    /**
     * Gets the value of the staticInfoUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticInfoUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticInfoUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLink }
     * 
     * 
     */
    public List<WebLink> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<WebLink>();
        }
        return this.staticInfoUrl;
    }

}