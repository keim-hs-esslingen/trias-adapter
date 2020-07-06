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


/**
 * Supplementary diversion advice.
 * 
 * <p>Java class for Diversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diversion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="diversionAdvice" type="{http://datex2.eu/schema/1_0/1_0}DiversionAdviceEnum"/>
 *         &lt;element name="diversionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diversion", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "diversionAdvice",
    "diversionExtension"
})
public class Diversion
    extends Advice
{

    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
    @XmlSchemaType(name = "string")
    protected DiversionAdviceEnum diversionAdvice;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected ExtensionType diversionExtension;

    /**
     * Gets the value of the diversionAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link DiversionAdviceEnum }
     *     
     */
    public DiversionAdviceEnum getDiversionAdvice() {
        return diversionAdvice;
    }

    /**
     * Sets the value of the diversionAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiversionAdviceEnum }
     *     
     */
    public void setDiversionAdvice(DiversionAdviceEnum value) {
        this.diversionAdvice = value;
    }

    /**
     * Gets the value of the diversionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDiversionExtension() {
        return diversionExtension;
    }

    /**
     * Sets the value of the diversionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDiversionExtension(ExtensionType value) {
        this.diversionExtension = value;
    }

}
