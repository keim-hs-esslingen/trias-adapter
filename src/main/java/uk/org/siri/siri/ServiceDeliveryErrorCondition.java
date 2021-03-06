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
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Standard ErrorConditiosn for Service request
 * 
 * <p>Java class for ServiceDeliveryErrorCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryErrorConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.siri.org.uk/siri}ServiceRequestErrorGroup"/>
 *         &lt;/choice>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryErrorConditionStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "noInfoForTopicError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
@ToString
public class ServiceDeliveryErrorCondition {

    @XmlElement(name = "CapabilityNotSupportedError", namespace = "http://www.siri.org.uk/siri")
    protected CapabilityNotSupportedError capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError", namespace = "http://www.siri.org.uk/siri")
    protected AccessNotAllowedError accessNotAllowedError;
    @XmlElement(name = "NoInfoForTopicError", namespace = "http://www.siri.org.uk/siri")
    protected NoInfoForTopicError noInfoForTopicError;
    @XmlElement(name = "AllowedResourceUsageExceededError", namespace = "http://www.siri.org.uk/siri")
    protected AllowedResourceUsageExceededError allowedResourceUsageExceededError;
    @XmlElement(name = "OtherError", namespace = "http://www.siri.org.uk/siri")
    protected OtherError otherError;
    @XmlElement(name = "Description", namespace = "http://www.siri.org.uk/siri")
    protected ErrorDescription description;

    /**
     * Gets the value of the capabilityNotSupportedError property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedError }
     *     
     */
    public CapabilityNotSupportedError getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Sets the value of the capabilityNotSupportedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedError }
     *     
     */
    public ServiceDeliveryErrorCondition setCapabilityNotSupportedError(CapabilityNotSupportedError value) {
        this.capabilityNotSupportedError = value;
        return this;
    }

    /**
     * Gets the value of the accessNotAllowedError property.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedError }
     *     
     */
    public AccessNotAllowedError getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Sets the value of the accessNotAllowedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedError }
     *     
     */
    public ServiceDeliveryErrorCondition setAccessNotAllowedError(AccessNotAllowedError value) {
        this.accessNotAllowedError = value;
        return this;
    }

    /**
     * Gets the value of the noInfoForTopicError property.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicError }
     *     
     */
    public NoInfoForTopicError getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Sets the value of the noInfoForTopicError property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicError }
     *     
     */
    public ServiceDeliveryErrorCondition setNoInfoForTopicError(NoInfoForTopicError value) {
        this.noInfoForTopicError = value;
        return this;
    }

    /**
     * Gets the value of the allowedResourceUsageExceededError property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededError }
     *     
     */
    public AllowedResourceUsageExceededError getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Sets the value of the allowedResourceUsageExceededError property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededError }
     *     
     */
    public ServiceDeliveryErrorCondition setAllowedResourceUsageExceededError(AllowedResourceUsageExceededError value) {
        this.allowedResourceUsageExceededError = value;
        return this;
    }

    /**
     * Gets the value of the otherError property.
     * 
     * @return
     *     possible object is
     *     {@link OtherError }
     *     
     */
    public OtherError getOtherError() {
        return otherError;
    }

    /**
     * Sets the value of the otherError property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherError }
     *     
     */
    public ServiceDeliveryErrorCondition setOtherError(OtherError value) {
        this.otherError = value;
        return this;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescription }
     *     
     */
    public ErrorDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescription }
     *     
     */
    public ServiceDeliveryErrorCondition setDescription(ErrorDescription value) {
        this.description = value;
        return this;
    }

}
