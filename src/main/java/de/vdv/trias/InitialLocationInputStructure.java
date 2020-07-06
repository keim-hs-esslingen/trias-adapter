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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialLocationInputStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialLocationInputStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoPosition" type="{http://www.vdv.de/trias}GeoPositionStructure" minOccurs="0"/>
 *         &lt;element name="GeoRestriction" type="{http://www.vdv.de/trias}GeoRestrictionsStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialLocationInputStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "locationName",
    "geoPosition",
    "geoRestriction"
})
public class InitialLocationInputStructure {

    @XmlElement(name = "LocationName", namespace = "http://www.vdv.de/trias")
    protected String locationName;
    @XmlElement(name = "GeoPosition", namespace = "http://www.vdv.de/trias")
    protected GeoPositionStructure geoPosition;
    @XmlElement(name = "GeoRestriction", namespace = "http://www.vdv.de/trias")
    protected GeoRestrictionsStructure geoRestriction;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the geoPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPositionStructure }
     *     
     */
    public GeoPositionStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Sets the value of the geoPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPositionStructure }
     *     
     */
    public void setGeoPosition(GeoPositionStructure value) {
        this.geoPosition = value;
    }

    /**
     * Gets the value of the geoRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link GeoRestrictionsStructure }
     *     
     */
    public GeoRestrictionsStructure getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * Sets the value of the geoRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoRestrictionsStructure }
     *     
     */
    public void setGeoRestriction(GeoRestrictionsStructure value) {
        this.geoRestriction = value;
    }

}
