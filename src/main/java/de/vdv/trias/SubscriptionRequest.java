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

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import uk.org.siri.siri.FacilityMonitoringSubscription;
import uk.org.siri.siri.SituationExchangeSubscription;


/**
 * Subscription request structure - wrapping generic SIRI request element.
 * 
 * <p>Java class for SubscriptionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.vdv.de/trias}AbstractTriasSubscriptionRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}AlertSettingsGroup"/>
 *         &lt;group ref="{http://www.vdv.de/trias}SubscriptionRequestGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "alertTimeWindow",
    "maximumAlertFrequency",
    "maximumTimeBeforeEvent",
    "situationExchangeSubscriptionRequest",
    "facilityMonitoringSubscriptionRequest",
    "tripMonitoringSubscriptionRequest",
    "connectionProtectionSubscriptionRequest"
})
@ToString
public class SubscriptionRequest
    extends AbstractTriasSubscriptionRequest
{

    @XmlElement(name = "AlertTimeWindow", namespace = "http://www.vdv.de/trias")
    protected List<WeekdayTimePeriod> alertTimeWindow;
    @XmlElement(name = "MaximumAlertFrequency", namespace = "http://www.vdv.de/trias")
    protected Duration maximumAlertFrequency;
    @XmlElement(name = "MaximumTimeBeforeEvent", namespace = "http://www.vdv.de/trias")
    protected Duration maximumTimeBeforeEvent;
    @XmlElement(name = "SituationExchangeSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected SituationExchangeSubscription situationExchangeSubscriptionRequest;
    @XmlElement(name = "FacilityMonitoringSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected FacilityMonitoringSubscription facilityMonitoringSubscriptionRequest;
    @XmlElement(name = "TripMonitoringSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected TripMonitoringSubscriptionRequest tripMonitoringSubscriptionRequest;
    @XmlElement(name = "ConnectionProtectionSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected ConnectionProtectionSubscriptionRequest connectionProtectionSubscriptionRequest;

    /**
     * Gets the value of the alertTimeWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertTimeWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertTimeWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekdayTimePeriod }
     * 
     * 
     */
    public List<WeekdayTimePeriod> getAlertTimeWindow() {
        if (alertTimeWindow == null) {
            alertTimeWindow = new ArrayList<WeekdayTimePeriod>();
        }
        return this.alertTimeWindow;
    }

    /**
     * Gets the value of the maximumAlertFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumAlertFrequency() {
        return maximumAlertFrequency;
    }

    /**
     * Sets the value of the maximumAlertFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public SubscriptionRequest setMaximumAlertFrequency(Duration value) {
        this.maximumAlertFrequency = value;
        return this;
    }

    /**
     * Gets the value of the maximumTimeBeforeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTimeBeforeEvent() {
        return maximumTimeBeforeEvent;
    }

    /**
     * Sets the value of the maximumTimeBeforeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public SubscriptionRequest setMaximumTimeBeforeEvent(Duration value) {
        this.maximumTimeBeforeEvent = value;
        return this;
    }

    /**
     * Gets the value of the situationExchangeSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeSubscription }
     *     
     */
    public SituationExchangeSubscription getSituationExchangeSubscriptionRequest() {
        return situationExchangeSubscriptionRequest;
    }

    /**
     * Sets the value of the situationExchangeSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeSubscription }
     *     
     */
    public SubscriptionRequest setSituationExchangeSubscriptionRequest(SituationExchangeSubscription value) {
        this.situationExchangeSubscriptionRequest = value;
        return this;
    }

    /**
     * Gets the value of the facilityMonitoringSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringSubscription }
     *     
     */
    public FacilityMonitoringSubscription getFacilityMonitoringSubscriptionRequest() {
        return facilityMonitoringSubscriptionRequest;
    }

    /**
     * Sets the value of the facilityMonitoringSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringSubscription }
     *     
     */
    public SubscriptionRequest setFacilityMonitoringSubscriptionRequest(FacilityMonitoringSubscription value) {
        this.facilityMonitoringSubscriptionRequest = value;
        return this;
    }

    /**
     * Gets the value of the tripMonitoringSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TripMonitoringSubscriptionRequest }
     *     
     */
    public TripMonitoringSubscriptionRequest getTripMonitoringSubscriptionRequest() {
        return tripMonitoringSubscriptionRequest;
    }

    /**
     * Sets the value of the tripMonitoringSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripMonitoringSubscriptionRequest }
     *     
     */
    public SubscriptionRequest setTripMonitoringSubscriptionRequest(TripMonitoringSubscriptionRequest value) {
        this.tripMonitoringSubscriptionRequest = value;
        return this;
    }

    /**
     * Gets the value of the connectionProtectionSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionProtectionSubscriptionRequest }
     *     
     */
    public ConnectionProtectionSubscriptionRequest getConnectionProtectionSubscriptionRequest() {
        return connectionProtectionSubscriptionRequest;
    }

    /**
     * Sets the value of the connectionProtectionSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionProtectionSubscriptionRequest }
     *     
     */
    public SubscriptionRequest setConnectionProtectionSubscriptionRequest(ConnectionProtectionSubscriptionRequest value) {
        this.connectionProtectionSubscriptionRequest = value;
        return this;
    }

}
