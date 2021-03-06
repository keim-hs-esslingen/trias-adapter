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
import javax.xml.datatype.Duration;


/**
 * Type for Stop Monitoring Capabilities.
 * 
 * <p>Java class for StopMonitoringServiceCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="ByStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDestination" minOccurs="0"/>
 *                   &lt;element name="FilterByVisitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}StopMonitoringCapabilityRequestPolicyStructure">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringVolumeGroup"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.siri.org.uk/siri}CapabilitySubscriptionPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}MonitoringCapabilityAccessControlStructure" minOccurs="0"/>
 *         &lt;element name="ResponseFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasLineNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringServiceCapabilitiesStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures"
})
@ToString
public class StopMonitoringServiceCapabilities
    extends AbstractCapabilities
{

    @XmlElement(name = "TopicFiltering", namespace = "http://www.siri.org.uk/siri")
    protected StopMonitoringServiceCapabilities.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy", namespace = "http://www.siri.org.uk/siri")
    protected StopMonitoringServiceCapabilities.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy", namespace = "http://www.siri.org.uk/siri")
    protected CapabilitySubscriptionPolicy subscriptionPolicy;
    @XmlElement(name = "AccessControl", namespace = "http://www.siri.org.uk/siri")
    protected MonitoringCapabilityAccessControl accessControl;
    @XmlElement(name = "ResponseFeatures", namespace = "http://www.siri.org.uk/siri")
    protected StopMonitoringServiceCapabilities.ResponseFeatures responseFeatures;

    /**
     * Gets the value of the topicFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilities.TopicFiltering }
     *     
     */
    public StopMonitoringServiceCapabilities.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Sets the value of the topicFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilities.TopicFiltering }
     *     
     */
    public void setTopicFiltering(StopMonitoringServiceCapabilities.TopicFiltering value) {
        this.topicFiltering = value;
    }

    /**
     * Gets the value of the requestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilities.RequestPolicy }
     *     
     */
    public StopMonitoringServiceCapabilities.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Sets the value of the requestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilities.RequestPolicy }
     *     
     */
    public void setRequestPolicy(StopMonitoringServiceCapabilities.RequestPolicy value) {
        this.requestPolicy = value;
    }

    /**
     * Gets the value of the subscriptionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitySubscriptionPolicy }
     *     
     */
    public CapabilitySubscriptionPolicy getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Sets the value of the subscriptionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitySubscriptionPolicy }
     *     
     */
    public StopMonitoringServiceCapabilities setSubscriptionPolicy(CapabilitySubscriptionPolicy value) {
        this.subscriptionPolicy = value;
        return this;
    }

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringCapabilityAccessControl }
     *     
     */
    public MonitoringCapabilityAccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringCapabilityAccessControl }
     *     
     */
    public StopMonitoringServiceCapabilities setAccessControl(MonitoringCapabilityAccessControl value) {
        this.accessControl = value;
        return this;
    }

    /**
     * Gets the value of the responseFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilities.ResponseFeatures }
     *     
     */
    public StopMonitoringServiceCapabilities.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Sets the value of the responseFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilities.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(StopMonitoringServiceCapabilities.ResponseFeatures value) {
        this.responseFeatures = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.siri.org.uk/siri}StopMonitoringCapabilityRequestPolicyStructure">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringVolumeGroup"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasDetailLevel",
        "defaultDetailLevel",
        "hasMaximumVisits",
        "hasMinimumVisitsPerLine",
        "hasNumberOfOnwardsCalls",
        "hasNumberOfPreviousCalls"
    })
    public static class RequestPolicy
        extends StopMonitoringCapabilityRequestPolicy
    {

        @XmlElement(name = "HasDetailLevel", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
        protected Boolean hasDetailLevel;
        @XmlElement(name = "DefaultDetailLevel", namespace = "http://www.siri.org.uk/siri", defaultValue = "normal")
        @XmlSchemaType(name = "NMTOKEN")
        protected StopMonitoringDetailEnumeration defaultDetailLevel;
        @XmlElement(name = "HasMaximumVisits", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected Boolean hasMaximumVisits;
        @XmlElement(name = "HasMinimumVisitsPerLine", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected Boolean hasMinimumVisitsPerLine;
        @XmlElement(name = "HasNumberOfOnwardsCalls", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
        protected Boolean hasNumberOfOnwardsCalls;
        @XmlElement(name = "HasNumberOfPreviousCalls", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
        protected Boolean hasNumberOfPreviousCalls;

        /**
         * Gets the value of the hasDetailLevel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasDetailLevel() {
            return hasDetailLevel;
        }

        /**
         * Sets the value of the hasDetailLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasDetailLevel(Boolean value) {
            this.hasDetailLevel = value;
        }

        /**
         * Gets the value of the defaultDetailLevel property.
         * 
         * @return
         *     possible object is
         *     {@link StopMonitoringDetailEnumeration }
         *     
         */
        public StopMonitoringDetailEnumeration getDefaultDetailLevel() {
            return defaultDetailLevel;
        }

        /**
         * Sets the value of the defaultDetailLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopMonitoringDetailEnumeration }
         *     
         */
        public void setDefaultDetailLevel(StopMonitoringDetailEnumeration value) {
            this.defaultDetailLevel = value;
        }

        /**
         * Gets the value of the hasMaximumVisits property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumVisits() {
            return hasMaximumVisits;
        }

        /**
         * Sets the value of the hasMaximumVisits property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumVisits(Boolean value) {
            this.hasMaximumVisits = value;
        }

        /**
         * Gets the value of the hasMinimumVisitsPerLine property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMinimumVisitsPerLine() {
            return hasMinimumVisitsPerLine;
        }

        /**
         * Sets the value of the hasMinimumVisitsPerLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMinimumVisitsPerLine(Boolean value) {
            this.hasMinimumVisitsPerLine = value;
        }

        /**
         * Gets the value of the hasNumberOfOnwardsCalls property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNumberOfOnwardsCalls() {
            return hasNumberOfOnwardsCalls;
        }

        /**
         * Sets the value of the hasNumberOfOnwardsCalls property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNumberOfOnwardsCalls(Boolean value) {
            this.hasNumberOfOnwardsCalls = value;
        }

        /**
         * Gets the value of the hasNumberOfPreviousCalls property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNumberOfPreviousCalls() {
            return hasNumberOfPreviousCalls;
        }

        /**
         * Sets the value of the hasNumberOfPreviousCalls property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNumberOfPreviousCalls(Boolean value) {
            this.hasNumberOfPreviousCalls = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HasLineNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasLineNotices"
    })
    public static class ResponseFeatures {

        @XmlElement(name = "HasLineNotices", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected Boolean hasLineNotices;

        /**
         * Gets the value of the hasLineNotices property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasLineNotices() {
            return hasLineNotices;
        }

        /**
         * Sets the value of the hasLineNotices property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasLineNotices(Boolean value) {
            this.hasLineNotices = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
     *         &lt;element name="ByStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDestination" minOccurs="0"/>
     *         &lt;element name="FilterByVisitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultPreviewInterval",
        "byStartTime",
        "filterByMonitoringRef",
        "filterByLineRef",
        "filterByDirectionRef",
        "filterByDestination",
        "filterByVisitType"
    })
    public static class TopicFiltering {

        @XmlElement(name = "DefaultPreviewInterval", namespace = "http://www.siri.org.uk/siri", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "ByStartTime", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected Boolean byStartTime;
        @XmlElement(name = "FilterByMonitoringRef", namespace = "http://www.siri.org.uk/siri")
        protected boolean filterByMonitoringRef;
        @XmlElement(name = "FilterByLineRef", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByDirectionRef", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected Boolean filterByDirectionRef;
        @XmlElement(name = "FilterByDestination", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
        protected Boolean filterByDestination;
        @XmlElement(name = "FilterByVisitType", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
        protected Boolean filterByVisitType;

        /**
         * Gets the value of the defaultPreviewInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDefaultPreviewInterval() {
            return defaultPreviewInterval;
        }

        /**
         * Sets the value of the defaultPreviewInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDefaultPreviewInterval(Duration value) {
            this.defaultPreviewInterval = value;
        }

        /**
         * Gets the value of the byStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isByStartTime() {
            return byStartTime;
        }

        /**
         * Sets the value of the byStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setByStartTime(Boolean value) {
            this.byStartTime = value;
        }

        /**
         * Gets the value of the filterByMonitoringRef property.
         * 
         */
        public boolean isFilterByMonitoringRef() {
            return filterByMonitoringRef;
        }

        /**
         * Sets the value of the filterByMonitoringRef property.
         * 
         */
        public void setFilterByMonitoringRef(boolean value) {
            this.filterByMonitoringRef = value;
        }

        /**
         * Gets the value of the filterByLineRef property.
         * 
         */
        public boolean isFilterByLineRef() {
            return filterByLineRef;
        }

        /**
         * Sets the value of the filterByLineRef property.
         * 
         */
        public void setFilterByLineRef(boolean value) {
            this.filterByLineRef = value;
        }

        /**
         * Gets the value of the filterByDirectionRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByDirectionRef() {
            return filterByDirectionRef;
        }

        /**
         * Sets the value of the filterByDirectionRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByDirectionRef(Boolean value) {
            this.filterByDirectionRef = value;
        }

        /**
         * Gets the value of the filterByDestination property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByDestination() {
            return filterByDestination;
        }

        /**
         * Sets the value of the filterByDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByDestination(Boolean value) {
            this.filterByDestination = value;
        }

        /**
         * Gets the value of the filterByVisitType property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByVisitType() {
            return filterByVisitType;
        }

        /**
         * Sets the value of the filterByVisitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByVisitType(Boolean value) {
            this.filterByVisitType = value;
        }

    }

}
