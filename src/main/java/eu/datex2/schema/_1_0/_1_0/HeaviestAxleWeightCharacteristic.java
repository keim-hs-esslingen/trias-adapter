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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Weight characteristic of the heaviest axle on the vehicle.
 * 
 * <p>Java class for HeaviestAxleWeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaviestAxleWeightCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/1_0/1_0}ComparisonOperatorEnum"/>
 *         &lt;element name="heaviestAxleWeight" type="{http://datex2.eu/schema/1_0/1_0}Tonnes"/>
 *         &lt;element name="heaviestAxleWeightCharacteristicExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaviestAxleWeightCharacteristic", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "comparisonOperator",
    "heaviestAxleWeight",
    "heaviestAxleWeightCharacteristicExtension"
})
public class HeaviestAxleWeightCharacteristic {

    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected float heaviestAxleWeight;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected ExtensionType heaviestAxleWeightCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public HeaviestAxleWeightCharacteristic setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
        return this;
    }

    /**
     * Gets the value of the heaviestAxleWeight property.
     * 
     */
    public float getHeaviestAxleWeight() {
        return heaviestAxleWeight;
    }

    /**
     * Sets the value of the heaviestAxleWeight property.
     * 
     */
    public HeaviestAxleWeightCharacteristic setHeaviestAxleWeight(float value) {
        this.heaviestAxleWeight = value;
        return this;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaviestAxleWeightCharacteristicExtension() {
        return heaviestAxleWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the heaviestAxleWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public HeaviestAxleWeightCharacteristic setHeaviestAxleWeightCharacteristicExtension(ExtensionType value) {
        this.heaviestAxleWeightCharacteristicExtension = value;
        return this;
    }

}
