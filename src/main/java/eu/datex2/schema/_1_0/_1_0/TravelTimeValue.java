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


package eu.datex2.schema._1_0._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Derived/computed travel time information relating to a specific group of locations.
 * 
 * <p>Java class for TravelTimeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelTimeValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/1_0/1_0}TravelTimeTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/1_0/1_0}TravelTimeTypeEnum" minOccurs="0"/>
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/1_0/1_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="travelTimeValueExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTimeValue", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "travelTime",
    "travelTimeTrendType",
    "travelTimeType",
    "freeFlowSpeed",
    "freeFlowTravelTime",
    "normallyExpectedTravelTime",
    "vehicleType",
    "travelTimeValueExtension"
})
public class TravelTimeValue
    extends BasicDataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected Float travelTime;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    @XmlSchemaType(name = "string")
    protected TravelTimeTrendTypeEnum travelTimeTrendType;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    @XmlSchemaType(name = "string")
    protected TravelTimeTypeEnum travelTimeType;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected Float freeFlowSpeed;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected Float freeFlowTravelTime;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected Float normallyExpectedTravelTime;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0")
    protected ExtensionType travelTimeValueExtension;

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public TravelTimeValue setTravelTime(Float value) {
        this.travelTime = value;
        return this;
    }

    /**
     * Gets the value of the travelTimeTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Sets the value of the travelTimeTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeValue setTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
        return this;
    }

    /**
     * Gets the value of the travelTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Sets the value of the travelTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeValue setTravelTimeType(TravelTimeTypeEnum value) {
        this.travelTimeType = value;
        return this;
    }

    /**
     * Gets the value of the freeFlowSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    /**
     * Sets the value of the freeFlowSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public TravelTimeValue setFreeFlowSpeed(Float value) {
        this.freeFlowSpeed = value;
        return this;
    }

    /**
     * Gets the value of the freeFlowTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowTravelTime() {
        return freeFlowTravelTime;
    }

    /**
     * Sets the value of the freeFlowTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public TravelTimeValue setFreeFlowTravelTime(Float value) {
        this.freeFlowTravelTime = value;
        return this;
    }

    /**
     * Gets the value of the normallyExpectedTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNormallyExpectedTravelTime() {
        return normallyExpectedTravelTime;
    }

    /**
     * Sets the value of the normallyExpectedTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public TravelTimeValue setNormallyExpectedTravelTime(Float value) {
        this.normallyExpectedTravelTime = value;
        return this;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTypeEnum }
     * 
     * 
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the travelTimeValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTravelTimeValueExtension() {
        return travelTimeValueExtension;
    }

    /**
     * Sets the value of the travelTimeValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public TravelTimeValue setTravelTimeValueExtension(ExtensionType value) {
        this.travelTimeValueExtension = value;
        return this;
    }

}
