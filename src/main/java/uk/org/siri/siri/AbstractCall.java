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


package uk.org.siri.siri;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Abstract Call at stop.
 * 
 * <p>Java class for AbstractCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCallStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCallStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "stopPointRef",
    "visitNumber",
    "order",
    "stopPointName"
})
public class AbstractCall {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopPointRef stopPointRef;
    @XmlElement(name = "VisitNumber", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger visitNumber;
    @XmlElement(name = "Order", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "StopPointName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString stopPointName;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public AbstractCall setStopPointRef(StopPointRef value) {
        this.stopPointRef = value;
        return this;
    }

    /**
     * Gets the value of the visitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Sets the value of the visitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public AbstractCall setVisitNumber(BigInteger value) {
        this.visitNumber = value;
        return this;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public AbstractCall setOrder(BigInteger value) {
        this.order = value;
        return this;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getStopPointName() {
        return stopPointName;
    }

    /**
     * Sets the value of the stopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public AbstractCall setStopPointName(NaturalLanguageString value) {
        this.stopPointName = value;
        return this;
    }

}