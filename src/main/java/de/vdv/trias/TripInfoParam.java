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


/**
 * TripInfo request parameter structure.
 * 
 * <p>Java class for TripInfoParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripInfoParamStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}TripInfoPolicyGroup"/>
 *         &lt;group ref="{http://www.vdv.de/trias}TripInfoContentFilterGroup"/>
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
@XmlType(name = "TripInfoParamStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "useTimetabledDataOnly",
    "includeCalls",
    "includeEstimatedTimes",
    "includePosition",
    "includeService",
    "includeSituationInfo",
    "includeTrackSections",
    "includeTrackProjection",
    "extension"
})
public class TripInfoParam {

    @XmlElement(name = "UseTimetabledDataOnly", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean useTimetabledDataOnly;
    @XmlElement(name = "IncludeCalls", namespace = "http://www.vdv.de/trias", defaultValue = "true")
    protected Boolean includeCalls;
    @XmlElement(name = "IncludeEstimatedTimes", namespace = "http://www.vdv.de/trias", defaultValue = "true")
    protected Boolean includeEstimatedTimes;
    @XmlElement(name = "IncludePosition", namespace = "http://www.vdv.de/trias", defaultValue = "true")
    protected Boolean includePosition;
    @XmlElement(name = "IncludeService", namespace = "http://www.vdv.de/trias", defaultValue = "true")
    protected Boolean includeService;
    @XmlElement(name = "IncludeSituationInfo", namespace = "http://www.vdv.de/trias", defaultValue = "true")
    protected Boolean includeSituationInfo;
    @XmlElement(name = "IncludeTrackSections", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeTrackProjection", namespace = "http://www.vdv.de/trias", defaultValue = "false")
    protected Boolean includeTrackProjection;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the useTimetabledDataOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTimetabledDataOnly() {
        return useTimetabledDataOnly;
    }

    /**
     * Sets the value of the useTimetabledDataOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setUseTimetabledDataOnly(Boolean value) {
        this.useTimetabledDataOnly = value;
        return this;
    }

    /**
     * Gets the value of the includeCalls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCalls() {
        return includeCalls;
    }

    /**
     * Sets the value of the includeCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludeCalls(Boolean value) {
        this.includeCalls = value;
        return this;
    }

    /**
     * Gets the value of the includeEstimatedTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEstimatedTimes() {
        return includeEstimatedTimes;
    }

    /**
     * Sets the value of the includeEstimatedTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludeEstimatedTimes(Boolean value) {
        this.includeEstimatedTimes = value;
        return this;
    }

    /**
     * Gets the value of the includePosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePosition() {
        return includePosition;
    }

    /**
     * Sets the value of the includePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludePosition(Boolean value) {
        this.includePosition = value;
        return this;
    }

    /**
     * Gets the value of the includeService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeService() {
        return includeService;
    }

    /**
     * Sets the value of the includeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludeService(Boolean value) {
        this.includeService = value;
        return this;
    }

    /**
     * Gets the value of the includeSituationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSituationInfo() {
        return includeSituationInfo;
    }

    /**
     * Sets the value of the includeSituationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludeSituationInfo(Boolean value) {
        this.includeSituationInfo = value;
        return this;
    }

    /**
     * Gets the value of the includeTrackSections property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackSections() {
        return includeTrackSections;
    }

    /**
     * Sets the value of the includeTrackSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludeTrackSections(Boolean value) {
        this.includeTrackSections = value;
        return this;
    }

    /**
     * Gets the value of the includeTrackProjection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackProjection() {
        return includeTrackProjection;
    }

    /**
     * Sets the value of the includeTrackProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TripInfoParam setIncludeTrackProjection(Boolean value) {
        this.includeTrackProjection = value;
        return this;
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
    public TripInfoParam setExtension(Object value) {
        this.extension = value;
        return this;
    }

}