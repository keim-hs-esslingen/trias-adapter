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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationInformationRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInformationRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="InitialInput" type="{http://www.vdv.de/trias}InitialLocationInputStructure"/>
 *           &lt;element name="LocationRef" type="{http://www.vdv.de/trias}LocationRefStructure"/>
 *         &lt;/choice>
 *         &lt;element name="Restrictions" type="{http://www.vdv.de/trias}LocationParamStructure" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInformationRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "initialInput",
    "locationRef",
    "restrictions",
    "extension"
})
public class LocationInformationRequestStructure {

    @XmlElement(name = "InitialInput", namespace = "http://www.vdv.de/trias")
    protected InitialLocationInputStructure initialInput;
    @XmlElement(name = "LocationRef", namespace = "http://www.vdv.de/trias")
    protected LocationRefStructure locationRef;
    @XmlElement(name = "Restrictions", namespace = "http://www.vdv.de/trias")
    protected LocationParamStructure restrictions;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the initialInput property.
     * 
     * @return
     *     possible object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public InitialLocationInputStructure getInitialInput() {
        return initialInput;
    }

    /**
     * Sets the value of the initialInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public void setInitialInput(InitialLocationInputStructure value) {
        this.initialInput = value;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link LocationRefStructure }
     *     
     */
    public LocationRefStructure getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRefStructure }
     *     
     */
    public void setLocationRef(LocationRefStructure value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link LocationParamStructure }
     *     
     */
    public LocationParamStructure getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationParamStructure }
     *     
     */
    public void setRestrictions(LocationParamStructure value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

}
