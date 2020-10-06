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
import javax.xml.datatype.Duration;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;


import lombok.ToString;
@ToString
/**
 * Type for Response Status
 * 
 * <p>Java class for StatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Status" minOccurs="0"/>
 *         &lt;element name="ErrorCondition" type="{http://www.siri.org.uk/siri}ServiceDeliveryErrorConditionStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SuccessInfoGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResponseStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle"
})
public class StatusResponse
    extends Response
{

    @XmlElement(name = "RequestMessageRef", namespace = "http://www.siri.org.uk/siri")
    protected MessageQualifier requestMessageRef;
    @XmlElement(name = "SubscriberRef", namespace = "http://www.siri.org.uk/siri")
    protected ParticipantRef subscriberRef;
    @XmlElement(name = "SubscriptionFilterRef", namespace = "http://www.siri.org.uk/siri")
    protected SubscriptionFilterRef subscriptionFilterRef;
    @XmlElement(name = "SubscriptionRef", namespace = "http://www.siri.org.uk/siri")
    protected SubscriptionQualifier subscriptionRef;
    @XmlElement(name = "Status", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition", namespace = "http://www.siri.org.uk/siri")
    protected ServiceDeliveryErrorCondition errorCondition;
    @XmlElement(name = "ValidUntil", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime validUntil;
    @XmlElement(name = "ShortestPossibleCycle", namespace = "http://www.siri.org.uk/siri")
    protected Duration shortestPossibleCycle;

    /**
     * Gets the value of the requestMessageRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifier }
     *     
     */
    public MessageQualifier getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Sets the value of the requestMessageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifier }
     *     
     */
    public StatusResponse setRequestMessageRef(MessageQualifier value) {
        this.requestMessageRef = value;
        return this;
    }

    /**
     * Gets the value of the subscriberRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRef }
     *     
     */
    public ParticipantRef getSubscriberRef() {
        return subscriberRef;
    }

    /**
     * Sets the value of the subscriberRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRef }
     *     
     */
    public StatusResponse setSubscriberRef(ParticipantRef value) {
        this.subscriberRef = value;
        return this;
    }

    /**
     * Gets the value of the subscriptionFilterRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionFilterRef }
     *     
     */
    public SubscriptionFilterRef getSubscriptionFilterRef() {
        return subscriptionFilterRef;
    }

    /**
     * Sets the value of the subscriptionFilterRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionFilterRef }
     *     
     */
    public StatusResponse setSubscriptionFilterRef(SubscriptionFilterRef value) {
        this.subscriptionFilterRef = value;
        return this;
    }

    /**
     * Gets the value of the subscriptionRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifier }
     *     
     */
    public SubscriptionQualifier getSubscriptionRef() {
        return subscriptionRef;
    }

    /**
     * Sets the value of the subscriptionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifier }
     *     
     */
    public StatusResponse setSubscriptionRef(SubscriptionQualifier value) {
        this.subscriptionRef = value;
        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StatusResponse setStatus(Boolean value) {
        this.status = value;
        return this;
    }

    /**
     * Gets the value of the errorCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryErrorCondition }
     *     
     */
    public ServiceDeliveryErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Sets the value of the errorCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryErrorCondition }
     *     
     */
    public StatusResponse setErrorCondition(ServiceDeliveryErrorCondition value) {
        this.errorCondition = value;
        return this;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusResponse setValidUntil(ZonedDateTime value) {
        this.validUntil = value;
        return this;
    }

    /**
     * Gets the value of the shortestPossibleCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Sets the value of the shortestPossibleCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public StatusResponse setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
        return this;
    }

}
