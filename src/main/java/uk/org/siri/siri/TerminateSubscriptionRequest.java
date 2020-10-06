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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Type for Request to terminate of a subscription or subscriptions
 * 
 * <p>Java class for TerminateSubscriptionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminateSubscriptionTopicGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionRequestStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "subscriberRef",
    "all",
    "subscriptionRef"
})
public class TerminateSubscriptionRequest
    extends Request
{

    @XmlElement(name = "SubscriberRef", namespace = "http://www.siri.org.uk/siri")
    protected ParticipantRef subscriberRef;
    @XmlElement(name = "All", namespace = "http://www.siri.org.uk/siri")
    protected String all;
    @XmlElement(name = "SubscriptionRef", namespace = "http://www.siri.org.uk/siri")
    protected List<SubscriptionQualifier> subscriptionRef;

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
    public TerminateSubscriptionRequest setSubscriberRef(ParticipantRef value) {
        this.subscriberRef = value;
        return this;
    }

    /**
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TerminateSubscriptionRequest setAll(String value) {
        this.all = value;
        return this;
    }

    /**
     * Gets the value of the subscriptionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionQualifier }
     * 
     * 
     */
    public List<SubscriptionQualifier> getSubscriptionRef() {
        if (subscriptionRef == null) {
            subscriptionRef = new ArrayList<SubscriptionQualifier>();
        }
        return this.subscriptionRef;
    }

}
