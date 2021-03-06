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

import lombok.ToString;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import eu.datex2.schema._1_0._1_0.DirectionEnum;


/**
 * Type for Parameters to filter Situation Exchange  requests, based on the situation Road, Logically ANDed with other values.
 * 
 * <p>Java class for RoadFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadFilterStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/1_0/1_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="referencePointIdentifier" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadFilterStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "roadNumber",
    "directionBound",
    "referencePointIdentifier"
})
@ToString
public class RoadFilter {

    @XmlElement(namespace = "http://www.siri.org.uk/siri")
    protected String roadNumber;
    @XmlElement(namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected DirectionEnum directionBound;
    @XmlElement(namespace = "http://www.siri.org.uk/siri")
    protected String referencePointIdentifier;

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RoadFilter setRoadNumber(String value) {
        this.roadNumber = value;
        return this;
    }

    /**
     * Gets the value of the directionBound property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Sets the value of the directionBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public RoadFilter setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
        return this;
    }

    /**
     * Gets the value of the referencePointIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePointIdentifier() {
        return referencePointIdentifier;
    }

    /**
     * Sets the value of the referencePointIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RoadFilter setReferencePointIdentifier(String value) {
        this.referencePointIdentifier = value;
        return this;
    }

}
