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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


import lombok.ToString;
@ToString
/**
 * Service that provides shared vehicles.
 * 
 * <p>Java class for SharingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharingServiceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.vdv.de/trias}OperatorRef"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharingModel" type="{http://www.vdv.de/trias}SharingModelEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.vdv.de/trias}SharingServiceUsageGroup" minOccurs="0"/>
 *         &lt;element name="InfoURL" type="{http://www.vdv.de/trias}WebLinkStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharingServiceStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "operatorRef",
    "name",
    "sharingModel",
    "timeBufferBefore",
    "timeBufferAfter",
    "infoURL"
})
public class SharingService {

    @XmlElement(name = "OperatorRef", namespace = "http://www.vdv.de/trias", required = true)
    protected OperatorRef operatorRef;
    @XmlElement(name = "Name", namespace = "http://www.vdv.de/trias")
    protected String name;
    @XmlElement(name = "SharingModel", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "NMTOKEN")
    protected SharingModelEnumeration sharingModel;
    @XmlElement(name = "TimeBufferBefore", namespace = "http://www.vdv.de/trias")
    protected Duration timeBufferBefore;
    @XmlElement(name = "TimeBufferAfter", namespace = "http://www.vdv.de/trias")
    protected Duration timeBufferAfter;
    @XmlElement(name = "InfoURL", namespace = "http://www.vdv.de/trias")
    protected WebLink infoURL;

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRef }
     *     
     */
    public OperatorRef getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRef }
     *     
     */
    public SharingService setOperatorRef(OperatorRef value) {
        this.operatorRef = value;
        return this;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SharingService setName(String value) {
        this.name = value;
        return this;
    }

    /**
     * Gets the value of the sharingModel property.
     * 
     * @return
     *     possible object is
     *     {@link SharingModelEnumeration }
     *     
     */
    public SharingModelEnumeration getSharingModel() {
        return sharingModel;
    }

    /**
     * Sets the value of the sharingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingModelEnumeration }
     *     
     */
    public SharingService setSharingModel(SharingModelEnumeration value) {
        this.sharingModel = value;
        return this;
    }

    /**
     * Gets the value of the timeBufferBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeBufferBefore() {
        return timeBufferBefore;
    }

    /**
     * Sets the value of the timeBufferBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public SharingService setTimeBufferBefore(Duration value) {
        this.timeBufferBefore = value;
        return this;
    }

    /**
     * Gets the value of the timeBufferAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeBufferAfter() {
        return timeBufferAfter;
    }

    /**
     * Sets the value of the timeBufferAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public SharingService setTimeBufferAfter(Duration value) {
        this.timeBufferAfter = value;
        return this;
    }

    /**
     * Gets the value of the infoURL property.
     * 
     * @return
     *     possible object is
     *     {@link WebLink }
     *     
     */
    public WebLink getInfoURL() {
        return infoURL;
    }

    /**
     * Sets the value of the infoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLink }
     *     
     */
    public SharingService setInfoURL(WebLink value) {
        this.infoURL = value;
        return this;
    }

}
