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
 * TripInfoRefine request structure.
 * 
 * <p>Java class for TripInfoRefineRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripInfoRefineRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefineParams" type="{http://www.vdv.de/trias}TripInfoRefineParamStructure" minOccurs="0"/>
 *         &lt;element name="TripInfoResult" type="{http://www.vdv.de/trias}TripInfoResultStructure"/>
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
@XmlType(name = "TripInfoRefineRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "refineParams",
    "tripInfoResult",
    "extension"
})
public class TripInfoRefineRequestStructure {

    @XmlElement(name = "RefineParams", namespace = "http://www.vdv.de/trias")
    protected TripInfoRefineParamStructure refineParams;
    @XmlElement(name = "TripInfoResult", namespace = "http://www.vdv.de/trias", required = true)
    protected TripInfoResultStructure tripInfoResult;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the refineParams property.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoRefineParamStructure }
     *     
     */
    public TripInfoRefineParamStructure getRefineParams() {
        return refineParams;
    }

    /**
     * Sets the value of the refineParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoRefineParamStructure }
     *     
     */
    public void setRefineParams(TripInfoRefineParamStructure value) {
        this.refineParams = value;
    }

    /**
     * Gets the value of the tripInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TripInfoResultStructure }
     *     
     */
    public TripInfoResultStructure getTripInfoResult() {
        return tripInfoResult;
    }

    /**
     * Sets the value of the tripInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripInfoResultStructure }
     *     
     */
    public void setTripInfoResult(TripInfoResultStructure value) {
        this.tripInfoResult = value;
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
    public void setExtension(Object value) {
        this.extension = value;
    }

}
