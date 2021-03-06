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


package eu.datex2.schema._1_0._1_0;

import lombok.ToString;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The DATEX II logical model comprising exchange, content payload and management sub-models.
 * 
 * <p>Java class for D2LogicalModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D2LogicalModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchange" type="{http://datex2.eu/schema/1_0/1_0}Exchange"/>
 *         &lt;element name="payloadPublication" type="{http://datex2.eu/schema/1_0/1_0}PayloadPublication" minOccurs="0"/>
 *         &lt;element name="d2LogicalModelExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2LogicalModel", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "exchange",
    "payloadPublication",
    "d2LogicalModelExtension"
})
@ToString
public class D2LogicalModel {

    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
    protected Exchange exchange;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected PayloadPublication payloadPublication;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected ExtensionType d2LogicalModelExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    protected String modelBaseVersion;

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link Exchange }
     *     
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exchange }
     *     
     */
    public D2LogicalModel setExchange(Exchange value) {
        this.exchange = value;
        return this;
    }

    /**
     * Gets the value of the payloadPublication property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadPublication }
     *     
     */
    public PayloadPublication getPayloadPublication() {
        return payloadPublication;
    }

    /**
     * Sets the value of the payloadPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadPublication }
     *     
     */
    public D2LogicalModel setPayloadPublication(PayloadPublication value) {
        this.payloadPublication = value;
        return this;
    }

    /**
     * Gets the value of the d2LogicalModelExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getD2LogicalModelExtension() {
        return d2LogicalModelExtension;
    }

    /**
     * Sets the value of the d2LogicalModelExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public D2LogicalModel setD2LogicalModelExtension(ExtensionType value) {
        this.d2LogicalModelExtension = value;
        return this;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "1.0";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public D2LogicalModel setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
        return this;
    }

}
