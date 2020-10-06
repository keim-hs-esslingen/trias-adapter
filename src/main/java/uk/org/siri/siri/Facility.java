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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.ifopt.acsb.AccessibilityAssessment;
import uk.org.ifopt.acsb.Accessibility;
import uk.org.ifopt.acsb.Suitability;


import lombok.ToString;
@ToString
/**
 * Type for sescription the facility itself
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
 *         &lt;element name="FacilityCode" type="{http://www.siri.org.uk/siri}FacilityCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="FacilityClass" type="{http://www.siri.org.uk/siri}FacilityCategoryEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OwnerRef" type="{http://www.siri.org.uk/siri}OrganisationRefStructure" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="ValidityCondition" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/>
 *         &lt;element name="FacilityLocation" type="{http://www.siri.org.uk/siri}FacilityLocationStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityAccessibilityGroup"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
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
@XmlType(name = "FacilityStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "facilityCode",
    "description",
    "facilityClass",
    "features",
    "ownerRef",
    "ownerName",
    "validityCondition",
    "facilityLocation",
    "limitations",
    "suitabilities",
    "accessibilityAssessment",
    "extensions"
})
public class Facility {

    @XmlElement(name = "FacilityCode", namespace = "http://www.siri.org.uk/siri")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String facilityCode;
    @XmlElement(name = "Description", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString description;
    @XmlElement(name = "FacilityClass", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FacilityCategoryEnumeration> facilityClass;
    @XmlElement(name = "Features", namespace = "http://www.siri.org.uk/siri")
    protected Facility.Features features;
    @XmlElement(name = "OwnerRef", namespace = "http://www.siri.org.uk/siri")
    protected OrganisationRef ownerRef;
    @XmlElement(name = "OwnerName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString ownerName;
    @XmlElement(name = "ValidityCondition", namespace = "http://www.siri.org.uk/siri")
    protected MonitoringValidityCondition validityCondition;
    @XmlElement(name = "FacilityLocation", namespace = "http://www.siri.org.uk/siri")
    protected FacilityLocation facilityLocation;
    @XmlElement(name = "Limitations", namespace = "http://www.siri.org.uk/siri")
    protected Facility.Limitations limitations;
    @XmlElement(name = "Suitabilities", namespace = "http://www.siri.org.uk/siri")
    protected Facility.Suitabilities suitabilities;
    @XmlElement(name = "AccessibilityAssessment", namespace = "http://www.siri.org.uk/siri")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Facility setFacilityCode(String value) {
        this.facilityCode = value;
        return this;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public Facility setDescription(NaturalLanguageString value) {
        this.description = value;
        return this;
    }

    /**
     * Gets the value of the facilityClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityCategoryEnumeration }
     * 
     * 
     */
    public List<FacilityCategoryEnumeration> getFacilityClass() {
        if (facilityClass == null) {
            facilityClass = new ArrayList<FacilityCategoryEnumeration>();
        }
        return this.facilityClass;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link Facility.Features }
     *     
     */
    public Facility.Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facility.Features }
     *     
     */
    public void setFeatures(Facility.Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the ownerRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRef }
     *     
     */
    public OrganisationRef getOwnerRef() {
        return ownerRef;
    }

    /**
     * Sets the value of the ownerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRef }
     *     
     */
    public Facility setOwnerRef(OrganisationRef value) {
        this.ownerRef = value;
        return this;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public Facility setOwnerName(NaturalLanguageString value) {
        this.ownerName = value;
        return this;
    }

    /**
     * Gets the value of the validityCondition property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityCondition }
     *     
     */
    public MonitoringValidityCondition getValidityCondition() {
        return validityCondition;
    }

    /**
     * Sets the value of the validityCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityCondition }
     *     
     */
    public Facility setValidityCondition(MonitoringValidityCondition value) {
        this.validityCondition = value;
        return this;
    }

    /**
     * Gets the value of the facilityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocation }
     *     
     */
    public FacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    /**
     * Sets the value of the facilityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocation }
     *     
     */
    public Facility setFacilityLocation(FacilityLocation value) {
        this.facilityLocation = value;
        return this;
    }

    /**
     * Gets the value of the limitations property.
     * 
     * @return
     *     possible object is
     *     {@link Facility.Limitations }
     *     
     */
    public Facility.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Sets the value of the limitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facility.Limitations }
     *     
     */
    public void setLimitations(Facility.Limitations value) {
        this.limitations = value;
    }

    /**
     * Gets the value of the suitabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Facility.Suitabilities }
     *     
     */
    public Facility.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Sets the value of the suitabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facility.Suitabilities }
     *     
     */
    public void setSuitabilities(Facility.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Gets the value of the accessibilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Sets the value of the accessibilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public Facility setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
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
    public Facility setExtensions(Extensions value) {
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
     *         &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/>
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
        "feature"
    })
    public static class Features {

        @XmlElement(name = "Feature", namespace = "http://www.siri.org.uk/siri", required = true)
        protected List<AllFacilitiesFeature> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllFacilitiesFeature }
         * 
         * 
         */
        public List<AllFacilitiesFeature> getFeature() {
            if (feature == null) {
                feature = new ArrayList<AllFacilitiesFeature>();
            }
            return this.feature;
        }

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
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/>
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/>
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
        "wheelchairAccess",
        "stepFreeAccess",
        "escalatorFreeAccess",
        "liftFreeAccess",
        "audibleSignalsAvailable",
        "visualSignsAvailable"
    })
    public static class Limitations {

        @XmlElement(name = "WheelchairAccess", namespace = "http://www.ifopt.org.uk/acsb", required = true, defaultValue = "false")
        protected Accessibility wheelchairAccess;
        @XmlElement(name = "StepFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected Accessibility stepFreeAccess;
        @XmlElement(name = "EscalatorFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected Accessibility escalatorFreeAccess;
        @XmlElement(name = "LiftFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected Accessibility liftFreeAccess;
        @XmlElement(name = "AudibleSignalsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "false")
        protected Accessibility audibleSignalsAvailable;
        @XmlElement(name = "VisualSignsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected Accessibility visualSignsAvailable;

        /**
         * Gets the value of the wheelchairAccess property.
         * 
         * @return
         *     possible object is
         *     {@link Accessibility }
         *     
         */
        public Accessibility getWheelchairAccess() {
            return wheelchairAccess;
        }

        /**
         * Sets the value of the wheelchairAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link Accessibility }
         *     
         */
        public void setWheelchairAccess(Accessibility value) {
            this.wheelchairAccess = value;
        }

        /**
         * Gets the value of the stepFreeAccess property.
         * 
         * @return
         *     possible object is
         *     {@link Accessibility }
         *     
         */
        public Accessibility getStepFreeAccess() {
            return stepFreeAccess;
        }

        /**
         * Sets the value of the stepFreeAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link Accessibility }
         *     
         */
        public void setStepFreeAccess(Accessibility value) {
            this.stepFreeAccess = value;
        }

        /**
         * Gets the value of the escalatorFreeAccess property.
         * 
         * @return
         *     possible object is
         *     {@link Accessibility }
         *     
         */
        public Accessibility getEscalatorFreeAccess() {
            return escalatorFreeAccess;
        }

        /**
         * Sets the value of the escalatorFreeAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link Accessibility }
         *     
         */
        public void setEscalatorFreeAccess(Accessibility value) {
            this.escalatorFreeAccess = value;
        }

        /**
         * Gets the value of the liftFreeAccess property.
         * 
         * @return
         *     possible object is
         *     {@link Accessibility }
         *     
         */
        public Accessibility getLiftFreeAccess() {
            return liftFreeAccess;
        }

        /**
         * Sets the value of the liftFreeAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link Accessibility }
         *     
         */
        public void setLiftFreeAccess(Accessibility value) {
            this.liftFreeAccess = value;
        }

        /**
         * Whether a Place has Audible signals for the viusally impaired.
         * 
         * @return
         *     possible object is
         *     {@link Accessibility }
         *     
         */
        public Accessibility getAudibleSignalsAvailable() {
            return audibleSignalsAvailable;
        }

        /**
         * Sets the value of the audibleSignalsAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Accessibility }
         *     
         */
        public void setAudibleSignalsAvailable(Accessibility value) {
            this.audibleSignalsAvailable = value;
        }

        /**
         * Whether a Place hasVisual signals for the hearing impaired.
         * 
         * @return
         *     possible object is
         *     {@link Accessibility }
         *     
         */
        public Accessibility getVisualSignsAvailable() {
            return visualSignsAvailable;
        }

        /**
         * Sets the value of the visualSignsAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Accessibility }
         *     
         */
        public void setVisualSignsAvailable(Accessibility value) {
            this.visualSignsAvailable = value;
        }

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
