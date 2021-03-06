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

import lombok.ToString;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure of Facility and its Status
 * 
 * <p>Java class for Facility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.vdv.de/trias}VehicleFacility"/>
 *           &lt;element ref="{http://www.vdv.de/trias}InfrastructureFacility"/>
 *         &lt;/choice>
 *         &lt;element name="Condition" type="{http://www.vdv.de/trias}FacilityStatusStructure"/>
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
@XmlType(name = "FacilityStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "vehicleFacility",
    "infrastructureFacility",
    "condition",
    "extension"
})
@ToString
public class Facility {

    @XmlElement(name = "VehicleFacility", namespace = "http://www.vdv.de/trias")
    protected VehicleFacility vehicleFacility;
    @XmlElement(name = "InfrastructureFacility", namespace = "http://www.vdv.de/trias")
    protected InfrastructureFacility infrastructureFacility;
    @XmlElement(name = "Condition", namespace = "http://www.vdv.de/trias", required = true)
    protected FacilityStatus condition;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the vehicleFacility property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFacility }
     *     
     */
    public VehicleFacility getVehicleFacility() {
        return vehicleFacility;
    }

    /**
     * Sets the value of the vehicleFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFacility }
     *     
     */
    public Facility setVehicleFacility(VehicleFacility value) {
        this.vehicleFacility = value;
        return this;
    }

    /**
     * Gets the value of the infrastructureFacility property.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureFacility }
     *     
     */
    public InfrastructureFacility getInfrastructureFacility() {
        return infrastructureFacility;
    }

    /**
     * Sets the value of the infrastructureFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureFacility }
     *     
     */
    public Facility setInfrastructureFacility(InfrastructureFacility value) {
        this.infrastructureFacility = value;
        return this;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatus }
     *     
     */
    public FacilityStatus getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatus }
     *     
     */
    public Facility setCondition(FacilityStatus value) {
        this.condition = value;
        return this;
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
    public Facility setExtension(Object value) {
        this.extension = value;
        return this;
    }

}
