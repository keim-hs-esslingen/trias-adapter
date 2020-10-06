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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Attributes that are not valid on the whole service, but only on part of the journey leg.
 * 
 * <p>Java class for ServiceAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAttributeStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.vdv.de/trias}GeneralAttributeStructure">
 *       &lt;sequence>
 *         &lt;element name="Scope" type="{http://www.vdv.de/trias}AttributeScopeEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.vdv.de/trias}StopSeqIntervalGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAttributeStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "scope",
    "fromStopSeqNumber",
    "toStopSeqNumber"
})
public class ServiceAttribute
    extends GeneralAttribute
{

    @XmlElement(name = "Scope", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "string")
    protected AttributeScopeEnumeration scope;
    @XmlElement(name = "FromStopSeqNumber", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fromStopSeqNumber;
    @XmlElement(name = "ToStopSeqNumber", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toStopSeqNumber;

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeScopeEnumeration }
     *     
     */
    public AttributeScopeEnumeration getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeScopeEnumeration }
     *     
     */
    public ServiceAttribute setScope(AttributeScopeEnumeration value) {
        this.scope = value;
        return this;
    }

    /**
     * Gets the value of the fromStopSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromStopSeqNumber() {
        return fromStopSeqNumber;
    }

    /**
     * Sets the value of the fromStopSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public ServiceAttribute setFromStopSeqNumber(BigInteger value) {
        this.fromStopSeqNumber = value;
        return this;
    }

    /**
     * Gets the value of the toStopSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToStopSeqNumber() {
        return toStopSeqNumber;
    }

    /**
     * Sets the value of the toStopSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public ServiceAttribute setToStopSeqNumber(BigInteger value) {
        this.toStopSeqNumber = value;
        return this;
    }

}
