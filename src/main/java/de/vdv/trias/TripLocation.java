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


import lombok.ToString;
@ToString
/**
 * Location of a passenger currently traveling in a vehicle.
 * 
 * <p>Java class for TripLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripLocationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.vdv.de/trias}OperatingDayRef"/>
 *         &lt;element ref="{http://www.vdv.de/trias}JourneyRef"/>
 *         &lt;group ref="{http://www.vdv.de/trias}LineIdentityGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripLocationStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "operatingDayRef",
    "journeyRef",
    "lineRef",
    "directionRef"
})
public class TripLocation {

    @XmlElement(name = "OperatingDayRef", namespace = "http://www.vdv.de/trias", required = true)
    protected OperatingDayRef operatingDayRef;
    @XmlElement(name = "JourneyRef", namespace = "http://www.vdv.de/trias", required = true)
    protected JourneyRef journeyRef;
    @XmlElement(name = "LineRef", namespace = "http://www.vdv.de/trias", required = true)
    protected LineRef lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.vdv.de/trias", required = true)
    protected DirectionRef directionRef;

    /**
     * Gets the value of the operatingDayRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRef }
     *     
     */
    public OperatingDayRef getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Sets the value of the operatingDayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRef }
     *     
     */
    public TripLocation setOperatingDayRef(OperatingDayRef value) {
        this.operatingDayRef = value;
        return this;
    }

    /**
     * Gets the value of the journeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRef }
     *     
     */
    public JourneyRef getJourneyRef() {
        return journeyRef;
    }

    /**
     * Sets the value of the journeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRef }
     *     
     */
    public TripLocation setJourneyRef(JourneyRef value) {
        this.journeyRef = value;
        return this;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public LineRef getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRef }
     *     
     */
    public TripLocation setLineRef(LineRef value) {
        this.lineRef = value;
        return this;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRef }
     *     
     */
    public DirectionRef getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRef }
     *     
     */
    public TripLocation setDirectionRef(DirectionRef value) {
        this.directionRef = value;
        return this;
    }

}
