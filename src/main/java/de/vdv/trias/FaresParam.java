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
 * Parameters for fares request.
 * 
 * <p>Java class for FaresParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaresParamStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}FaresDataFilterGroup"/>
 *         &lt;element name="Traveller" type="{http://www.vdv.de/trias}FaresPassengerStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaresParamStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "fareAuthorityFilter",
    "passengerCategory",
    "travelClass",
    "traveller"
})
public class FaresParam {

    @XmlElement(name = "FareAuthorityFilter", namespace = "http://www.vdv.de/trias")
    protected List<FaresAuthorityRef> fareAuthorityFilter;
    @XmlElement(name = "PassengerCategory", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> passengerCategory;
    @XmlElement(name = "TravelClass", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "NMTOKEN")
    protected TravelClassEnumeration travelClass;
    @XmlElement(name = "Traveller", namespace = "http://www.vdv.de/trias")
    protected List<FaresPassenger> traveller;

    /**
     * Gets the value of the fareAuthorityFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareAuthorityFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareAuthorityFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaresAuthorityRef }
     * 
     * 
     */
    public List<FaresAuthorityRef> getFareAuthorityFilter() {
        if (fareAuthorityFilter == null) {
            fareAuthorityFilter = new ArrayList<FaresAuthorityRef>();
        }
        return this.fareAuthorityFilter;
    }

    /**
     * Gets the value of the passengerCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryEnumeration }
     * 
     * 
     */
    public List<PassengerCategoryEnumeration> getPassengerCategory() {
        if (passengerCategory == null) {
            passengerCategory = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.passengerCategory;
    }

    /**
     * Gets the value of the travelClass property.
     * 
     * @return
     *     possible object is
     *     {@link TravelClassEnumeration }
     *     
     */
    public TravelClassEnumeration getTravelClass() {
        return travelClass;
    }

    /**
     * Sets the value of the travelClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClassEnumeration }
     *     
     */
    public FaresParam setTravelClass(TravelClassEnumeration value) {
        this.travelClass = value;
        return this;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraveller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaresPassenger }
     * 
     * 
     */
    public List<FaresPassenger> getTraveller() {
        if (traveller == null) {
            traveller = new ArrayList<FaresPassenger>();
        }
        return this.traveller;
    }

}