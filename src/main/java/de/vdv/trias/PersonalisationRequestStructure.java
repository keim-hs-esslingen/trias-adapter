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
 * <p>Java class for PersonalisationRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalisationRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SaveValue" type="{http://www.vdv.de/trias}PersonalisationSaveValueRequestStructure"/>
 *         &lt;element name="RetrieveValue" type="{http://www.vdv.de/trias}PersonalisationRetrieveValueRequestStructure"/>
 *         &lt;element name="DeleteValue" type="{http://www.vdv.de/trias}PersonalisationDeleteValueRequestStructure"/>
 *         &lt;element name="EnumerateValue" type="{http://www.vdv.de/trias}PersonalisationEnumerateValuesRequestStructure"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalisationRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "saveValue",
    "retrieveValue",
    "deleteValue",
    "enumerateValue"
})
public class PersonalisationRequestStructure {

    @XmlElement(name = "SaveValue", namespace = "http://www.vdv.de/trias")
    protected PersonalisationSaveValueRequestStructure saveValue;
    @XmlElement(name = "RetrieveValue", namespace = "http://www.vdv.de/trias")
    protected PersonalisationRetrieveValueRequestStructure retrieveValue;
    @XmlElement(name = "DeleteValue", namespace = "http://www.vdv.de/trias")
    protected PersonalisationDeleteValueRequestStructure deleteValue;
    @XmlElement(name = "EnumerateValue", namespace = "http://www.vdv.de/trias")
    protected PersonalisationEnumerateValuesRequestStructure enumerateValue;

    /**
     * Gets the value of the saveValue property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalisationSaveValueRequestStructure }
     *     
     */
    public PersonalisationSaveValueRequestStructure getSaveValue() {
        return saveValue;
    }

    /**
     * Sets the value of the saveValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalisationSaveValueRequestStructure }
     *     
     */
    public void setSaveValue(PersonalisationSaveValueRequestStructure value) {
        this.saveValue = value;
    }

    /**
     * Gets the value of the retrieveValue property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalisationRetrieveValueRequestStructure }
     *     
     */
    public PersonalisationRetrieveValueRequestStructure getRetrieveValue() {
        return retrieveValue;
    }

    /**
     * Sets the value of the retrieveValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalisationRetrieveValueRequestStructure }
     *     
     */
    public void setRetrieveValue(PersonalisationRetrieveValueRequestStructure value) {
        this.retrieveValue = value;
    }

    /**
     * Gets the value of the deleteValue property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalisationDeleteValueRequestStructure }
     *     
     */
    public PersonalisationDeleteValueRequestStructure getDeleteValue() {
        return deleteValue;
    }

    /**
     * Sets the value of the deleteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalisationDeleteValueRequestStructure }
     *     
     */
    public void setDeleteValue(PersonalisationDeleteValueRequestStructure value) {
        this.deleteValue = value;
    }

    /**
     * Gets the value of the enumerateValue property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalisationEnumerateValuesRequestStructure }
     *     
     */
    public PersonalisationEnumerateValuesRequestStructure getEnumerateValue() {
        return enumerateValue;
    }

    /**
     * Sets the value of the enumerateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalisationEnumerateValuesRequestStructure }
     *     
     */
    public void setEnumerateValue(PersonalisationEnumerateValuesRequestStructure value) {
        this.enumerateValue = value;
    }

}
