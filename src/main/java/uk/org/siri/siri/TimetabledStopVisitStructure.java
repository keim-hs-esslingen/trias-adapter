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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for Timetabled Visit of a vehicle to a stop. May provide information about the arrival, the departure or both.
 * 
 * <p>Java class for TimetabledStopVisitStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimetabledStopVisitStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;element name="MonitoringRef" type="{http://www.siri.org.uk/siri}MonitoringRefStructure"/>
 *         &lt;element name="TargetedVehicleJourney" type="{http://www.siri.org.uk/siri}TargetedVehicleJourneyStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimetabledStopVisitStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "monitoringRef",
    "targetedVehicleJourney",
    "extensions"
})
public class TimetabledStopVisitStructure
    extends AbstractIdentifiedItemStructure
{

    @XmlElement(name = "MonitoringRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "TargetedVehicleJourney", namespace = "http://www.siri.org.uk/siri", required = true)
    protected TargetedVehicleJourneyStructure targetedVehicleJourney;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the monitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Sets the value of the monitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    /**
     * Gets the value of the targetedVehicleJourney property.
     * 
     * @return
     *     possible object is
     *     {@link TargetedVehicleJourneyStructure }
     *     
     */
    public TargetedVehicleJourneyStructure getTargetedVehicleJourney() {
        return targetedVehicleJourney;
    }

    /**
     * Sets the value of the targetedVehicleJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetedVehicleJourneyStructure }
     *     
     */
    public void setTargetedVehicleJourney(TargetedVehicleJourneyStructure value) {
        this.targetedVehicleJourney = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
