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


package uk.org.ifopt.acsb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Type for of a specific need
 * 
 * <p>Java class for UserNeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserNeedStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}UserNeedGroup"/>
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeedRanking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNeedStructure", namespace = "http://www.ifopt.org.uk/acsb", propOrder = {
    "mobilityNeed",
    "psychosensoryNeed",
    "medicalNeed",
    "encumbranceNeed",
    "excluded",
    "needRanking",
    "extensions"
})
public class UserNeed {

    @XmlElement(name = "MobilityNeed", namespace = "http://www.ifopt.org.uk/acsb")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityEnumeration mobilityNeed;
    @XmlElement(name = "PsychosensoryNeed", namespace = "http://www.ifopt.org.uk/acsb")
    @XmlSchemaType(name = "NMTOKEN")
    protected PyschosensoryNeedEnumeration psychosensoryNeed;
    @XmlElement(name = "MedicalNeed", namespace = "http://www.ifopt.org.uk/acsb")
    protected MedicalNeedEnumeration medicalNeed;
    @XmlElement(name = "EncumbranceNeed", namespace = "http://www.ifopt.org.uk/acsb")
    @XmlSchemaType(name = "NMTOKEN")
    protected EncumbranceEnumeration encumbranceNeed;
    @XmlElement(name = "Excluded", namespace = "http://www.ifopt.org.uk/acsb")
    protected Boolean excluded;
    @XmlElement(name = "NeedRanking", namespace = "http://www.ifopt.org.uk/acsb")
    protected BigInteger needRanking;
    @XmlElement(name = "Extensions", namespace = "http://www.ifopt.org.uk/acsb")
    protected Object extensions;

    /**
     * Gets the value of the mobilityNeed property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnumeration }
     *     
     */
    public MobilityEnumeration getMobilityNeed() {
        return mobilityNeed;
    }

    /**
     * Sets the value of the mobilityNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnumeration }
     *     
     */
    public UserNeed setMobilityNeed(MobilityEnumeration value) {
        this.mobilityNeed = value;
        return this;
    }

    /**
     * Gets the value of the psychosensoryNeed property.
     * 
     * @return
     *     possible object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public PyschosensoryNeedEnumeration getPsychosensoryNeed() {
        return psychosensoryNeed;
    }

    /**
     * Sets the value of the psychosensoryNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public UserNeed setPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        this.psychosensoryNeed = value;
        return this;
    }

    /**
     * Gets the value of the medicalNeed property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public MedicalNeedEnumeration getMedicalNeed() {
        return medicalNeed;
    }

    /**
     * Sets the value of the medicalNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public UserNeed setMedicalNeed(MedicalNeedEnumeration value) {
        this.medicalNeed = value;
        return this;
    }

    /**
     * Gets the value of the encumbranceNeed property.
     * 
     * @return
     *     possible object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public EncumbranceEnumeration getEncumbranceNeed() {
        return encumbranceNeed;
    }

    /**
     * Sets the value of the encumbranceNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public UserNeed setEncumbranceNeed(EncumbranceEnumeration value) {
        this.encumbranceNeed = value;
        return this;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public UserNeed setExcluded(Boolean value) {
        this.excluded = value;
        return this;
    }

    /**
     * Gets the value of the needRanking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeedRanking() {
        return needRanking;
    }

    /**
     * Sets the value of the needRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public UserNeed setNeedRanking(BigInteger value) {
        this.needRanking = value;
        return this;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public UserNeed setExtensions(Object value) {
        this.extensions = value;
        return this;
    }

}
