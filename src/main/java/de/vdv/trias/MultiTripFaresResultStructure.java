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


/**
 * Structure of a Multi Trip Fares Request result
 * 
 * <p>Java class for MultiTripFaresResultStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiTripFaresResultStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/trias}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TripTicketReference" type="{http://www.vdv.de/trias}TripTicketReferenceStructure" maxOccurs="unbounded"/>
 *         &lt;element name="Ticket" type="{http://www.vdv.de/trias}TicketStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PassedZones" type="{http://www.vdv.de/trias}FareZoneListInAreaStructure" minOccurs="0"/>
 *         &lt;element name="StaticInfoUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiTripFaresResultStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "errorMessage",
    "tripTicketReference",
    "ticket",
    "passedZones",
    "staticInfoUrl"
})
public class MultiTripFaresResultStructure {

    @XmlElement(name = "ErrorMessage", namespace = "http://www.vdv.de/trias")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "TripTicketReference", namespace = "http://www.vdv.de/trias", required = true)
    protected List<TripTicketReferenceStructure> tripTicketReference;
    @XmlElement(name = "Ticket", namespace = "http://www.vdv.de/trias")
    protected List<TicketStructure> ticket;
    @XmlElement(name = "PassedZones", namespace = "http://www.vdv.de/trias")
    protected FareZoneListInAreaStructure passedZones;
    @XmlElement(name = "StaticInfoUrl", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "anyURI")
    protected List<String> staticInfoUrl;

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
     * {@link ErrorMessageStructure }
     * 
     * 
     */
    public List<ErrorMessageStructure> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessageStructure>();
        }
        return this.errorMessage;
    }

    /**
     * Gets the value of the tripTicketReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripTicketReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripTicketReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripTicketReferenceStructure }
     * 
     * 
     */
    public List<TripTicketReferenceStructure> getTripTicketReference() {
        if (tripTicketReference == null) {
            tripTicketReference = new ArrayList<TripTicketReferenceStructure>();
        }
        return this.tripTicketReference;
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
     * {@link TicketStructure }
     * 
     * 
     */
    public List<TicketStructure> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<TicketStructure>();
        }
        return this.ticket;
    }

    /**
     * Gets the value of the passedZones property.
     * 
     * @return
     *     possible object is
     *     {@link FareZoneListInAreaStructure }
     *     
     */
    public FareZoneListInAreaStructure getPassedZones() {
        return passedZones;
    }

    /**
     * Sets the value of the passedZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZoneListInAreaStructure }
     *     
     */
    public void setPassedZones(FareZoneListInAreaStructure value) {
        this.passedZones = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getStaticInfoUrl() {
        if (staticInfoUrl == null) {
            staticInfoUrl = new ArrayList<String>();
        }
        return this.staticInfoUrl;
    }

}
