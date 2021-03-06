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

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure to retrieve current facility status information.
 * 
 * <p>Java class for FacilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}FacilityDataFilterGroup"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "facilityRef",
    "ownerRef",
    "stopPointRef",
    "stopPlaceRef",
    "operatorRef",
    "lineRef",
    "journeyRef",
    "vehicleRef",
    "extension"
})
@ToString
public class FacilityRequest {

    @XmlElement(name = "FacilityRef", namespace = "http://www.vdv.de/trias")
    protected List<FacilityRef> facilityRef;
    @XmlElement(name = "OwnerRef", namespace = "http://www.vdv.de/trias")
    protected List<OwnerRef> ownerRef;
    @XmlElement(name = "StopPointRef", namespace = "http://www.vdv.de/trias")
    protected List<StopPointRef> stopPointRef;
    @XmlElement(name = "StopPlaceRef", namespace = "http://www.vdv.de/trias")
    protected List<StopPlaceRef> stopPlaceRef;
    @XmlElement(name = "OperatorRef", namespace = "http://www.vdv.de/trias")
    protected List<OperatorRef> operatorRef;
    @XmlElement(name = "LineRef", namespace = "http://www.vdv.de/trias")
    protected List<LineRef> lineRef;
    @XmlElement(name = "JourneyRef", namespace = "http://www.vdv.de/trias")
    protected List<JourneyRef> journeyRef;
    @XmlElement(name = "VehicleRef", namespace = "http://www.vdv.de/trias")
    protected List<VehicleRef> vehicleRef;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the facilityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityRef }
     * 
     * 
     */
    public List<FacilityRef> getFacilityRef() {
        if (facilityRef == null) {
            facilityRef = new ArrayList<FacilityRef>();
        }
        return this.facilityRef;
    }

    /**
     * Gets the value of the ownerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnerRef }
     * 
     * 
     */
    public List<OwnerRef> getOwnerRef() {
        if (ownerRef == null) {
            ownerRef = new ArrayList<OwnerRef>();
        }
        return this.ownerRef;
    }

    /**
     * Gets the value of the stopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopPointRef }
     * 
     * 
     */
    public List<StopPointRef> getStopPointRef() {
        if (stopPointRef == null) {
            stopPointRef = new ArrayList<StopPointRef>();
        }
        return this.stopPointRef;
    }

    /**
     * Gets the value of the stopPlaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPlaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPlaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopPlaceRef }
     * 
     * 
     */
    public List<StopPlaceRef> getStopPlaceRef() {
        if (stopPlaceRef == null) {
            stopPlaceRef = new ArrayList<StopPlaceRef>();
        }
        return this.stopPlaceRef;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRef }
     * 
     * 
     */
    public List<OperatorRef> getOperatorRef() {
        if (operatorRef == null) {
            operatorRef = new ArrayList<OperatorRef>();
        }
        return this.operatorRef;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineRef }
     * 
     * 
     */
    public List<LineRef> getLineRef() {
        if (lineRef == null) {
            lineRef = new ArrayList<LineRef>();
        }
        return this.lineRef;
    }

    /**
     * Gets the value of the journeyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyRef }
     * 
     * 
     */
    public List<JourneyRef> getJourneyRef() {
        if (journeyRef == null) {
            journeyRef = new ArrayList<JourneyRef>();
        }
        return this.journeyRef;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRef }
     * 
     * 
     */
    public List<VehicleRef> getVehicleRef() {
        if (vehicleRef == null) {
            vehicleRef = new ArrayList<VehicleRef>();
        }
        return this.vehicleRef;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FacilityRequest setExtension(Object value) {
        this.extension = value;
        return this;
    }

}
