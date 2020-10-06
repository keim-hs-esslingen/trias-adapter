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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.acsb.Suitability;


import lombok.ToString;
@ToString
/**
 * Type for disruption.
 * 
 * <p>Java class for PtConsequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtConsequenceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampRangeStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Condition" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.siri.org.uk/siri}SeverityEnumeration"/>
 *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure" minOccurs="0"/>
 *         &lt;element name="Suitabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Advice" type="{http://www.siri.org.uk/siri}PtAdviceStructure" minOccurs="0"/>
 *         &lt;element name="Blocking" type="{http://www.siri.org.uk/siri}BlockingStructure" minOccurs="0"/>
 *         &lt;element name="Boarding" type="{http://www.siri.org.uk/siri}BoardingStructure" minOccurs="0"/>
 *         &lt;element name="Delays" type="{http://www.siri.org.uk/siri}DelaysStructure" minOccurs="0"/>
 *         &lt;element name="Casualties" type="{http://www.siri.org.uk/siri}CasualtiesStructure" minOccurs="0"/>
 *         &lt;element name="Easements" type="{http://www.siri.org.uk/siri}EasementsStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtConsequenceStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "period",
    "condition",
    "severity",
    "affects",
    "suitabilities",
    "advice",
    "blocking",
    "boarding",
    "delays",
    "casualties",
    "easements",
    "extensions"
})
public class PtConsequence {

    @XmlElement(name = "Period", namespace = "http://www.siri.org.uk/siri")
    protected HalfOpenTimestampRange period;
    @XmlElement(name = "Condition", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected ServiceConditionEnumeration condition;
    @XmlElement(name = "Severity", namespace = "http://www.siri.org.uk/siri", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Affects", namespace = "http://www.siri.org.uk/siri")
    protected AffectsScope affects;
    @XmlElement(name = "Suitabilities", namespace = "http://www.siri.org.uk/siri")
    protected PtConsequence.Suitabilities suitabilities;
    @XmlElement(name = "Advice", namespace = "http://www.siri.org.uk/siri")
    protected PtAdvice advice;
    @XmlElement(name = "Blocking", namespace = "http://www.siri.org.uk/siri")
    protected Blocking blocking;
    @XmlElement(name = "Boarding", namespace = "http://www.siri.org.uk/siri")
    protected Boarding boarding;
    @XmlElement(name = "Delays", namespace = "http://www.siri.org.uk/siri")
    protected Delays delays;
    @XmlElement(name = "Casualties", namespace = "http://www.siri.org.uk/siri")
    protected Casualties casualties;
    @XmlElement(name = "Easements", namespace = "http://www.siri.org.uk/siri")
    protected List<Easements> easements;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampRange }
     *     
     */
    public HalfOpenTimestampRange getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampRange }
     *     
     */
    public PtConsequence setPeriod(HalfOpenTimestampRange value) {
        this.period = value;
        return this;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConditionEnumeration }
     *     
     */
    public ServiceConditionEnumeration getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConditionEnumeration }
     *     
     */
    public PtConsequence setCondition(ServiceConditionEnumeration value) {
        this.condition = value;
        return this;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public PtConsequence setSeverity(SeverityEnumeration value) {
        this.severity = value;
        return this;
    }

    /**
     * Gets the value of the affects property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScope }
     *     
     */
    public AffectsScope getAffects() {
        return affects;
    }

    /**
     * Sets the value of the affects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScope }
     *     
     */
    public PtConsequence setAffects(AffectsScope value) {
        this.affects = value;
        return this;
    }

    /**
     * Gets the value of the suitabilities property.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequence.Suitabilities }
     *     
     */
    public PtConsequence.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Sets the value of the suitabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequence.Suitabilities }
     *     
     */
    public void setSuitabilities(PtConsequence.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Gets the value of the advice property.
     * 
     * @return
     *     possible object is
     *     {@link PtAdvice }
     *     
     */
    public PtAdvice getAdvice() {
        return advice;
    }

    /**
     * Sets the value of the advice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtAdvice }
     *     
     */
    public PtConsequence setAdvice(PtAdvice value) {
        this.advice = value;
        return this;
    }

    /**
     * Gets the value of the blocking property.
     * 
     * @return
     *     possible object is
     *     {@link Blocking }
     *     
     */
    public Blocking getBlocking() {
        return blocking;
    }

    /**
     * Sets the value of the blocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocking }
     *     
     */
    public PtConsequence setBlocking(Blocking value) {
        this.blocking = value;
        return this;
    }

    /**
     * Gets the value of the boarding property.
     * 
     * @return
     *     possible object is
     *     {@link Boarding }
     *     
     */
    public Boarding getBoarding() {
        return boarding;
    }

    /**
     * Sets the value of the boarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boarding }
     *     
     */
    public PtConsequence setBoarding(Boarding value) {
        this.boarding = value;
        return this;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public PtConsequence setDelays(Delays value) {
        this.delays = value;
        return this;
    }

    /**
     * Gets the value of the casualties property.
     * 
     * @return
     *     possible object is
     *     {@link Casualties }
     *     
     */
    public Casualties getCasualties() {
        return casualties;
    }

    /**
     * Sets the value of the casualties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Casualties }
     *     
     */
    public PtConsequence setCasualties(Casualties value) {
        this.casualties = value;
        return this;
    }

    /**
     * Gets the value of the easements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the easements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Easements }
     * 
     * 
     */
    public List<Easements> getEasements() {
        if (easements == null) {
            easements = new ArrayList<Easements>();
        }
        return this.easements;
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
    public PtConsequence setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability", namespace = "http://www.siri.org.uk/siri", required = true)
        protected List<Suitability> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Suitability }
         * 
         * 
         */
        public List<Suitability> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<Suitability>();
            }
            return this.suitability;
        }

    }

}
