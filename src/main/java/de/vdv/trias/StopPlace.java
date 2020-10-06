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
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Complete Model of a stop place.
 * 
 * <p>Java class for StopPlace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}StopPlaceGroup"/>
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/trias}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.vdv.de/trias}LocalityRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.vdv.de/trias}StopAttributesGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "stopPlaceRef",
    "stopPlaceName",
    "nameSuffix",
    "privateCode",
    "localityRef",
    "wheelchairAccessible",
    "lighting",
    "covered"
})
public class StopPlace {

    @XmlElement(name = "StopPlaceRef", namespace = "http://www.vdv.de/trias", required = true)
    protected StopPlaceRef stopPlaceRef;
    @XmlElement(name = "StopPlaceName", namespace = "http://www.vdv.de/trias", required = true)
    protected List<InternationalText> stopPlaceName;
    @XmlElement(name = "NameSuffix", namespace = "http://www.vdv.de/trias")
    protected List<InternationalText> nameSuffix;
    @XmlElement(name = "PrivateCode", namespace = "http://www.vdv.de/trias")
    protected List<PrivateCode> privateCode;
    @XmlElement(name = "LocalityRef", namespace = "http://www.vdv.de/trias")
    protected LocalityRef localityRef;
    @XmlElement(name = "WheelchairAccessible", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean wheelchairAccessible;
    @XmlElement(name = "Lighting", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean lighting;
    @XmlElement(name = "Covered", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean covered;

    /**
     * Gets the value of the stopPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRef }
     *     
     */
    public StopPlaceRef getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Sets the value of the stopPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRef }
     *     
     */
    public StopPlace setStopPlaceRef(StopPlaceRef value) {
        this.stopPlaceRef = value;
        return this;
    }

    /**
     * Gets the value of the stopPlaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPlaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalText }
     * 
     * 
     */
    public List<InternationalText> getStopPlaceName() {
        if (stopPlaceName == null) {
            stopPlaceName = new ArrayList<InternationalText>();
        }
        return this.stopPlaceName;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalText }
     * 
     * 
     */
    public List<InternationalText> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<InternationalText>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCode }
     * 
     * 
     */
    public List<PrivateCode> getPrivateCode() {
        if (privateCode == null) {
            privateCode = new ArrayList<PrivateCode>();
        }
        return this.privateCode;
    }

    /**
     * Gets the value of the localityRef property.
     * 
     * @return
     *     possible object is
     *     {@link LocalityRef }
     *     
     */
    public LocalityRef getLocalityRef() {
        return localityRef;
    }

    /**
     * Sets the value of the localityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalityRef }
     *     
     */
    public StopPlace setLocalityRef(LocalityRef value) {
        this.localityRef = value;
        return this;
    }

    /**
     * Gets the value of the wheelchairAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairAccessible() {
        return wheelchairAccessible;
    }

    /**
     * Sets the value of the wheelchairAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StopPlace setWheelchairAccessible(Boolean value) {
        this.wheelchairAccessible = value;
        return this;
    }

    /**
     * Gets the value of the lighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLighting() {
        return lighting;
    }

    /**
     * Sets the value of the lighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StopPlace setLighting(Boolean value) {
        this.lighting = value;
        return this;
    }

    /**
     * Gets the value of the covered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCovered() {
        return covered;
    }

    /**
     * Sets the value of the covered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StopPlace setCovered(Boolean value) {
        this.covered = value;
        return this;
    }

}
