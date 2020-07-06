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
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for RouteStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouteId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Distance" type="{http://www.vdv.de/trias}DistanceType" minOccurs="0"/>
 *         &lt;element name="RouteLeg" type="{http://www.vdv.de/trias}ContinuousLegStructure" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.vdv.de/trias}SituationFullRef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RouteStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "routeId",
    "duration",
    "startTime",
    "endTime",
    "distance",
    "routeLeg",
    "situationFullRef",
    "extension"
})
public class RouteStructure {

    @XmlElement(name = "RouteId", namespace = "http://www.vdv.de/trias", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String routeId;
    @XmlElement(name = "Duration", namespace = "http://www.vdv.de/trias", required = true)
    protected Duration duration;
    @XmlElement(name = "StartTime", namespace = "http://www.vdv.de/trias", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "EndTime", namespace = "http://www.vdv.de/trias", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endTime;
    @XmlElement(name = "Distance", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distance;
    @XmlElement(name = "RouteLeg", namespace = "http://www.vdv.de/trias", required = true)
    protected List<ContinuousLegStructure> routeLeg;
    @XmlElement(name = "SituationFullRef", namespace = "http://www.vdv.de/trias")
    protected List<SituationFullRefStructure> situationFullRef;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the routeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets the value of the routeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteId(String value) {
        this.routeId = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(ZonedDateTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(ZonedDateTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * Gets the value of the routeLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContinuousLegStructure }
     * 
     * 
     */
    public List<ContinuousLegStructure> getRouteLeg() {
        if (routeLeg == null) {
            routeLeg = new ArrayList<ContinuousLegStructure>();
        }
        return this.routeLeg;
    }

    /**
     * Gets the value of the situationFullRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationFullRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationFullRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationFullRefStructure }
     * 
     * 
     */
    public List<SituationFullRefStructure> getSituationFullRef() {
        if (situationFullRef == null) {
            situationFullRef = new ArrayList<SituationFullRefStructure>();
        }
        return this.situationFullRef;
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
