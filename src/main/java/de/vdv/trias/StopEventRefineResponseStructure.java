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


/**
 * StopEventRefine response structure
 * 
 * <p>Java class for StopEventRefineResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopEventRefineResponseStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.vdv.de/trias}ErrorMessageStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopEventResponseContext" type="{http://www.vdv.de/trias}StopEventResponseContextStructure" minOccurs="0"/>
 *         &lt;element name="StopEventResult" type="{http://www.vdv.de/trias}StopEventResultStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEventRefineResponseStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "errorMessage",
    "stopEventResponseContext",
    "stopEventResult"
})
public class StopEventRefineResponseStructure {

    @XmlElement(name = "ErrorMessage", namespace = "http://www.vdv.de/trias")
    protected List<ErrorMessageStructure> errorMessage;
    @XmlElement(name = "StopEventResponseContext", namespace = "http://www.vdv.de/trias")
    protected StopEventResponseContextStructure stopEventResponseContext;
    @XmlElement(name = "StopEventResult", namespace = "http://www.vdv.de/trias")
    protected List<StopEventResultStructure> stopEventResult;

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageStructure }
     * 
     * 
     */
    public List<ErrorMessageStructure> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessageStructure>();
        }
        return this.errorMessage;
    }

    /**
     * Gets the value of the stopEventResponseContext property.
     * 
     * @return
     *     possible object is
     *     {@link StopEventResponseContextStructure }
     *     
     */
    public StopEventResponseContextStructure getStopEventResponseContext() {
        return stopEventResponseContext;
    }

    /**
     * Sets the value of the stopEventResponseContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopEventResponseContextStructure }
     *     
     */
    public void setStopEventResponseContext(StopEventResponseContextStructure value) {
        this.stopEventResponseContext = value;
    }

    /**
     * Gets the value of the stopEventResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopEventResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopEventResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopEventResultStructure }
     * 
     * 
     */
    public List<StopEventResultStructure> getStopEventResult() {
        if (stopEventResult == null) {
            stopEventResult = new ArrayList<StopEventResultStructure>();
        }
        return this.stopEventResult;
    }

}
