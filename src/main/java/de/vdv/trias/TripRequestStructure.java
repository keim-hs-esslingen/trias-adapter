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
 * Trip request structure.
 * 
 * <p>Java class for TripRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.vdv.de/trias}LocationContextStructure" maxOccurs="unbounded"/>
 *         &lt;element name="Destination" type="{http://www.vdv.de/trias}LocationContextStructure" maxOccurs="unbounded"/>
 *         &lt;element name="Via" type="{http://www.vdv.de/trias}ViaStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotVia" type="{http://www.vdv.de/trias}NotViaStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoChangeAt" type="{http://www.vdv.de/trias}NoChangeAtStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Params" type="{http://www.vdv.de/trias}TripParamStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "origin",
    "destination",
    "via",
    "notVia",
    "noChangeAt",
    "params"
})
public class TripRequestStructure {

    @XmlElement(name = "Origin", namespace = "http://www.vdv.de/trias", required = true)
    protected List<LocationContextStructure> origin;
    @XmlElement(name = "Destination", namespace = "http://www.vdv.de/trias", required = true)
    protected List<LocationContextStructure> destination;
    @XmlElement(name = "Via", namespace = "http://www.vdv.de/trias")
    protected List<ViaStructure> via;
    @XmlElement(name = "NotVia", namespace = "http://www.vdv.de/trias")
    protected List<NotViaStructure> notVia;
    @XmlElement(name = "NoChangeAt", namespace = "http://www.vdv.de/trias")
    protected List<NoChangeAtStructure> noChangeAt;
    @XmlElement(name = "Params", namespace = "http://www.vdv.de/trias")
    protected TripParamStructure params;

    /**
     * Gets the value of the origin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContextStructure }
     * 
     * 
     */
    public List<LocationContextStructure> getOrigin() {
        if (origin == null) {
            origin = new ArrayList<LocationContextStructure>();
        }
        return this.origin;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContextStructure }
     * 
     * 
     */
    public List<LocationContextStructure> getDestination() {
        if (destination == null) {
            destination = new ArrayList<LocationContextStructure>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViaStructure }
     * 
     * 
     */
    public List<ViaStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ViaStructure>();
        }
        return this.via;
    }

    /**
     * Gets the value of the notVia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notVia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotViaStructure }
     * 
     * 
     */
    public List<NotViaStructure> getNotVia() {
        if (notVia == null) {
            notVia = new ArrayList<NotViaStructure>();
        }
        return this.notVia;
    }

    /**
     * Gets the value of the noChangeAt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noChangeAt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoChangeAt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoChangeAtStructure }
     * 
     * 
     */
    public List<NoChangeAtStructure> getNoChangeAt() {
        if (noChangeAt == null) {
            noChangeAt = new ArrayList<NoChangeAtStructure>();
        }
        return this.noChangeAt;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link TripParamStructure }
     *     
     */
    public TripParamStructure getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripParamStructure }
     *     
     */
    public void setParams(TripParamStructure value) {
        this.params = value;
    }

}
