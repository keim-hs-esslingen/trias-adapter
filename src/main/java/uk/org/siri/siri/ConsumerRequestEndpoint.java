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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Type for Unique reference to this request, created by Consumer. May be  used to reference the request in subsequent interactions. Used by WSDL.. 
 * 
 * <p>Java class for ConsumerRequestEndpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerRequestEndpointStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConsumerRequestEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerRequestEndpointStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "address",
    "consumerRef",
    "messageIdentifier"
})
@XmlSeeAlso({
    DataSupplyRequest.class
})
public class ConsumerRequestEndpoint
    extends AbstractRequest
{

    @XmlElement(name = "Address", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "ConsumerRef", namespace = "http://www.siri.org.uk/siri")
    protected ParticipantRef consumerRef;
    @XmlElement(name = "MessageIdentifier", namespace = "http://www.siri.org.uk/siri")
    protected MessageQualifier messageIdentifier;

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
    public ConsumerRequestEndpoint setAddress(String value) {
        this.address = value;
        return this;
    }

    /**
     * Gets the value of the consumerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRef }
     *     
     */
    public ParticipantRef getConsumerRef() {
        return consumerRef;
    }

    /**
     * Sets the value of the consumerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRef }
     *     
     */
    public ConsumerRequestEndpoint setConsumerRef(ParticipantRef value) {
        this.consumerRef = value;
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
    public ConsumerRequestEndpoint setMessageIdentifier(MessageQualifier value) {
        this.messageIdentifier = value;
        return this;
    }

}
