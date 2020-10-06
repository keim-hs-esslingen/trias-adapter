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

import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;


import lombok.ToString;
@ToString
/**
 * Type for Origin and Destination stop of a Vehicle Journey
 * 
 * <p>Java class for DatedVehicleJourneyIndirectRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyIndirectRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element name="AimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DestinationRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element name="AimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedVehicleJourneyIndirectRefStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "originRef",
    "aimedDepartureTime",
    "destinationRef",
    "aimedArrivalTime"
})
public class DatedVehicleJourneyIndirectRef {

    @XmlElement(name = "OriginRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopPointRef originRef;
    @XmlElement(name = "AimedDepartureTime", namespace = "http://www.siri.org.uk/siri", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTime;
    @XmlElement(name = "DestinationRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopPointRef destinationRef;
    @XmlElement(name = "AimedArrivalTime", namespace = "http://www.siri.org.uk/siri", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;

    /**
     * Gets the value of the originRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getOriginRef() {
        return originRef;
    }

    /**
     * Sets the value of the originRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public DatedVehicleJourneyIndirectRef setOriginRef(StopPointRef value) {
        this.originRef = value;
        return this;
    }

    /**
     * Gets the value of the aimedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Sets the value of the aimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatedVehicleJourneyIndirectRef setAimedDepartureTime(ZonedDateTime value) {
        this.aimedDepartureTime = value;
        return this;
    }

    /**
     * Gets the value of the destinationRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getDestinationRef() {
        return destinationRef;
    }

    /**
     * Sets the value of the destinationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public DatedVehicleJourneyIndirectRef setDestinationRef(StopPointRef value) {
        this.destinationRef = value;
        return this;
    }

    /**
     * Gets the value of the aimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Sets the value of the aimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatedVehicleJourneyIndirectRef setAimedArrivalTime(ZonedDateTime value) {
        this.aimedArrivalTime = value;
        return this;
    }

}
