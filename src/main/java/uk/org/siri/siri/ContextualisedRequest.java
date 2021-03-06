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
import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;
import de.vdv.trias.AbstractTriasServiceRequest;


/**
 * Type for General SIRI Request.
 * 
 * <p>Java class for ContextualisedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextualisedRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRequestContext" type="{http://www.siri.org.uk/siri}ServiceRequestContextStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}RequestTimestamp"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestorEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextualisedRequestStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "serviceRequestContext",
    "requestTimestamp",
    "address",
    "requestorRef",
    "messageIdentifier"
})
@XmlSeeAlso({
    AbstractTriasServiceRequest.class,
    ServiceRequest.class
})
@ToString
public class ContextualisedRequest {

    @XmlElement(name = "ServiceRequestContext", namespace = "http://www.siri.org.uk/siri")
    protected ServiceRequestContext serviceRequestContext;
    @XmlElement(name = "RequestTimestamp", namespace = "http://www.siri.org.uk/siri", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime requestTimestamp;
    @XmlElement(name = "Address", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "RequestorRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected ParticipantRef requestorRef;
    @XmlElement(name = "MessageIdentifier", namespace = "http://www.siri.org.uk/siri")
    protected MessageQualifier messageIdentifier;

    /**
     * Gets the value of the serviceRequestContext property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestContext }
     *     
     */
    public ServiceRequestContext getServiceRequestContext() {
        return serviceRequestContext;
    }

    /**
     * Sets the value of the serviceRequestContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestContext }
     *     
     */
    public ContextualisedRequest setServiceRequestContext(ServiceRequestContext value) {
        this.serviceRequestContext = value;
        return this;
    }

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContextualisedRequest setRequestTimestamp(ZonedDateTime value) {
        this.requestTimestamp = value;
        return this;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContextualisedRequest setAddress(String value) {
        this.address = value;
        return this;
    }

    /**
     * Gets the value of the requestorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRef }
     *     
     */
    public ParticipantRef getRequestorRef() {
        return requestorRef;
    }

    /**
     * Sets the value of the requestorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRef }
     *     
     */
    public ContextualisedRequest setRequestorRef(ParticipantRef value) {
        this.requestorRef = value;
        return this;
    }

    /**
     * Gets the value of the messageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifier }
     *     
     */
    public MessageQualifier getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Sets the value of the messageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifier }
     *     
     */
    public ContextualisedRequest setMessageIdentifier(MessageQualifier value) {
        this.messageIdentifier = value;
        return this;
    }

}
