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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


import lombok.ToString;
@ToString
/**
 * Type for Delivery for ProductionTimetable Capability
 * 
 * <p>Java class for ProductionTimetableCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetablePermissions" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" fixed="1.4" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTimetableCapabilitiesResponseStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "productionTimetableServiceCapabilities",
    "productionTimetablePermissions",
    "extensions"
})
public class ProductionTimetableCapabilitiesResponse
    extends AbstractServiceCapabilitiesResponse
{

    @XmlElement(name = "ProductionTimetableServiceCapabilities", namespace = "http://www.siri.org.uk/siri")
    protected ProductionTimetableServiceCapabilities productionTimetableServiceCapabilities;
    @XmlElement(name = "ProductionTimetablePermissions", namespace = "http://www.siri.org.uk/siri")
    protected ProductionTimetablePermissions productionTimetablePermissions;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the productionTimetableServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilities }
     *     
     */
    public ProductionTimetableServiceCapabilities getProductionTimetableServiceCapabilities() {
        return productionTimetableServiceCapabilities;
    }

    /**
     * Sets the value of the productionTimetableServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilities }
     *     
     */
    public ProductionTimetableCapabilitiesResponse setProductionTimetableServiceCapabilities(ProductionTimetableServiceCapabilities value) {
        this.productionTimetableServiceCapabilities = value;
        return this;
    }

    /**
     * Gets the value of the productionTimetablePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetablePermissions }
     *     
     */
    public ProductionTimetablePermissions getProductionTimetablePermissions() {
        return productionTimetablePermissions;
    }

    /**
     * Sets the value of the productionTimetablePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetablePermissions }
     *     
     */
    public ProductionTimetableCapabilitiesResponse setProductionTimetablePermissions(ProductionTimetablePermissions value) {
        this.productionTimetablePermissions = value;
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
    public ProductionTimetableCapabilitiesResponse setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.4";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProductionTimetableCapabilitiesResponse setVersion(String value) {
        this.version = value;
        return this;
    }

}
