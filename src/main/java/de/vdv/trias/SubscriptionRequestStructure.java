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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import uk.org.siri.siri.FacilityMonitoringSubscriptionStructure;
import uk.org.siri.siri.SituationExchangeSubscriptionStructure;


/**
 * Subscription request structure - wrapping generic SIRI request element.
 * 
 * <p>Java class for SubscriptionRequestStructure complex type.
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
public class SubscriptionRequestStructure
    extends AbstractTriasSubscriptionRequestStructure
{

    @XmlElement(name = "AlertTimeWindow", namespace = "http://www.vdv.de/trias")
    protected List<WeekdayTimePeriodStructure> alertTimeWindow;
    @XmlElement(name = "MaximumAlertFrequency", namespace = "http://www.vdv.de/trias")
    protected Duration maximumAlertFrequency;
    @XmlElement(name = "MaximumTimeBeforeEvent", namespace = "http://www.vdv.de/trias")
    protected Duration maximumTimeBeforeEvent;
    @XmlElement(name = "SituationExchangeSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected SituationExchangeSubscriptionStructure situationExchangeSubscriptionRequest;
    @XmlElement(name = "FacilityMonitoringSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected FacilityMonitoringSubscriptionStructure facilityMonitoringSubscriptionRequest;
    @XmlElement(name = "TripMonitoringSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected TripMonitoringSubscriptionRequestStructure tripMonitoringSubscriptionRequest;
    @XmlElement(name = "ConnectionProtectionSubscriptionRequest", namespace = "http://www.vdv.de/trias")
    protected ConnectionProtectionSubscriptionRequestStructure connectionProtectionSubscriptionRequest;

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
     * {@link WeekdayTimePeriodStructure }
     * 
     * 
     */
    public List<WeekdayTimePeriodStructure> getAlertTimeWindow() {
        if (alertTimeWindow == null) {
            alertTimeWindow = new ArrayList<WeekdayTimePeriodStructure>();
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
    public void setMaximumAlertFrequency(Duration value) {
        this.maximumAlertFrequency = value;
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
    public void setMaximumTimeBeforeEvent(Duration value) {
        this.maximumTimeBeforeEvent = value;
    }

    /**
     * Gets the value of the situationExchangeSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeSubscriptionStructure }
     *     
     */
    public SituationExchangeSubscriptionStructure getSituationExchangeSubscriptionRequest() {
        return situationExchangeSubscriptionRequest;
    }

    /**
     * Sets the value of the situationExchangeSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeSubscriptionStructure }
     *     
     */
    public void setSituationExchangeSubscriptionRequest(SituationExchangeSubscriptionStructure value) {
        this.situationExchangeSubscriptionRequest = value;
    }

    /**
     * Gets the value of the facilityMonitoringSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringSubscriptionStructure }
     *     
     */
    public FacilityMonitoringSubscriptionStructure getFacilityMonitoringSubscriptionRequest() {
        return facilityMonitoringSubscriptionRequest;
    }

    /**
     * Sets the value of the facilityMonitoringSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringSubscriptionStructure }
     *     
     */
    public void setFacilityMonitoringSubscriptionRequest(FacilityMonitoringSubscriptionStructure value) {
        this.facilityMonitoringSubscriptionRequest = value;
    }

    /**
     * Gets the value of the tripMonitoringSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TripMonitoringSubscriptionRequestStructure }
     *     
     */
    public TripMonitoringSubscriptionRequestStructure getTripMonitoringSubscriptionRequest() {
        return tripMonitoringSubscriptionRequest;
    }

    /**
     * Sets the value of the tripMonitoringSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripMonitoringSubscriptionRequestStructure }
     *     
     */
    public void setTripMonitoringSubscriptionRequest(TripMonitoringSubscriptionRequestStructure value) {
        this.tripMonitoringSubscriptionRequest = value;
    }

    /**
     * Gets the value of the connectionProtectionSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionProtectionSubscriptionRequestStructure }
     *     
     */
    public ConnectionProtectionSubscriptionRequestStructure getConnectionProtectionSubscriptionRequest() {
        return connectionProtectionSubscriptionRequest;
    }

    /**
     * Sets the value of the connectionProtectionSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionProtectionSubscriptionRequestStructure }
     *     
     */
    public void setConnectionProtectionSubscriptionRequest(ConnectionProtectionSubscriptionRequestStructure value) {
        this.connectionProtectionSubscriptionRequest = value;
    }

}
