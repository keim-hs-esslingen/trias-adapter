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
import javax.xml.datatype.Duration;


import lombok.ToString;
@ToString
/**
 * Data type for Subscription Request for Stop Monitoring Service.
 * 
 * <p>Java class for StopMonitoringSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopMonitoringRequest"/>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringSubscriptionPolicyGroup"/>
 *         &lt;/sequence>
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
@XmlType(name = "StopMonitoringSubscriptionStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "stopMonitoringRequest",
    "incrementalUpdates",
    "changeBeforeUpdates",
    "extensions"
})
public class StopMonitoringSubscription
    extends AbstractSubscription
{

    @XmlElement(name = "StopMonitoringRequest", namespace = "http://www.siri.org.uk/siri", required = true)
    protected StopMonitoringRequest stopMonitoringRequest;
    @XmlElement(name = "IncrementalUpdates", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "ChangeBeforeUpdates", namespace = "http://www.siri.org.uk/siri")
    protected Duration changeBeforeUpdates;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the stopMonitoringRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringRequest }
     *     
     */
    public StopMonitoringRequest getStopMonitoringRequest() {
        return stopMonitoringRequest;
    }

    /**
     * Sets the value of the stopMonitoringRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringRequest }
     *     
     */
    public StopMonitoringSubscription setStopMonitoringRequest(StopMonitoringRequest value) {
        this.stopMonitoringRequest = value;
        return this;
    }

    /**
     * Gets the value of the incrementalUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalUpdates() {
        return incrementalUpdates;
    }

    /**
     * Sets the value of the incrementalUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StopMonitoringSubscription setIncrementalUpdates(Boolean value) {
        this.incrementalUpdates = value;
        return this;
    }

    /**
     * Gets the value of the changeBeforeUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChangeBeforeUpdates() {
        return changeBeforeUpdates;
    }

    /**
     * Sets the value of the changeBeforeUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public StopMonitoringSubscription setChangeBeforeUpdates(Duration value) {
        this.changeBeforeUpdates = value;
        return this;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public StopMonitoringSubscription setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

}
