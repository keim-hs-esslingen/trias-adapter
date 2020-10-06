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


import lombok.ToString;
@ToString
/**
 * Data type for Planned Vehicle Journey (Production Timetable Service).
 * 
 * <p>Java class for DatedVehicleJourney complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatedVehicleJourneyCode" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TimetableAlterationGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DatedServiceInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TimetableRealtimeInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OperationalBlockGroup" minOccurs="0"/>
 *         &lt;element name="DatedCalls">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}DatedCall" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "DatedVehicleJourneyStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "datedVehicleJourneyCode",
    "vehicleJourneyRef",
    "extraJourney",
    "cancellation",
    "journeyPatternRef",
    "vehicleMode",
    "routeRef",
    "publishedLineName",
    "directionName",
    "externalLineRef",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "vehicleJourneyName",
    "journeyNote",
    "destinationDisplay",
    "lineNote",
    "headwayService",
    "monitored",
    "blockRef",
    "courseOfJourneyRef",
    "datedCalls",
    "extensions"
})
public class DatedVehicleJourney {

    @XmlElement(name = "DatedVehicleJourneyCode", namespace = "http://www.siri.org.uk/siri", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String datedVehicleJourneyCode;
    @XmlElement(name = "VehicleJourneyRef", namespace = "http://www.siri.org.uk/siri")
    protected VehicleJourneyRef vehicleJourneyRef;
    @XmlElement(name = "ExtraJourney", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean extraJourney;
    @XmlElement(name = "Cancellation", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean cancellation;
    @XmlElement(name = "JourneyPatternRef", namespace = "http://www.siri.org.uk/siri")
    protected JourneyPatternRef journeyPatternRef;
    @XmlElement(name = "VehicleMode", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<VehicleModesEnumeration> vehicleMode;
    @XmlElement(name = "RouteRef", namespace = "http://www.siri.org.uk/siri")
    protected RouteRef routeRef;
    @XmlElement(name = "PublishedLineName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString publishedLineName;
    @XmlElement(name = "DirectionName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString directionName;
    @XmlElement(name = "ExternalLineRef", namespace = "http://www.siri.org.uk/siri")
    protected LineRef externalLineRef;
    @XmlElement(name = "OperatorRef", namespace = "http://www.siri.org.uk/siri")
    protected OperatorRef operatorRef;
    @XmlElement(name = "ProductCategoryRef", namespace = "http://www.siri.org.uk/siri")
    protected ProductCategoryRef productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef", namespace = "http://www.siri.org.uk/siri")
    protected List<ServiceFeatureRef> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef", namespace = "http://www.siri.org.uk/siri")
    protected List<VehicleFeatureRef> vehicleFeatureRef;
    @XmlElement(name = "VehicleJourneyName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString vehicleJourneyName;
    @XmlElement(name = "JourneyNote", namespace = "http://www.siri.org.uk/siri")
    protected List<NaturalLanguageString> journeyNote;
    @XmlElement(name = "DestinationDisplay", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString destinationDisplay;
    @XmlElement(name = "LineNote", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguagePlaceName lineNote;
    @XmlElement(name = "HeadwayService", namespace = "http://www.siri.org.uk/siri")
    protected Boolean headwayService;
    @XmlElement(name = "Monitored", namespace = "http://www.siri.org.uk/siri", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "BlockRef", namespace = "http://www.siri.org.uk/siri")
    protected BlockRef blockRef;
    @XmlElement(name = "CourseOfJourneyRef", namespace = "http://www.siri.org.uk/siri")
    protected CourseOfJourney courseOfJourneyRef;
    @XmlElement(name = "DatedCalls", namespace = "http://www.siri.org.uk/siri", required = true)
    protected DatedVehicleJourney.DatedCalls datedCalls;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the datedVehicleJourneyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedVehicleJourneyCode() {
        return datedVehicleJourneyCode;
    }

    /**
     * Sets the value of the datedVehicleJourneyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatedVehicleJourney setDatedVehicleJourneyCode(String value) {
        this.datedVehicleJourneyCode = value;
        return this;
    }

    /**
     * Gets the value of the vehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRef }
     *     
     */
    public VehicleJourneyRef getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Sets the value of the vehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRef }
     *     
     */
    public DatedVehicleJourney setVehicleJourneyRef(VehicleJourneyRef value) {
        this.vehicleJourneyRef = value;
        return this;
    }

    /**
     * Gets the value of the extraJourney property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraJourney() {
        return extraJourney;
    }

    /**
     * Sets the value of the extraJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DatedVehicleJourney setExtraJourney(Boolean value) {
        this.extraJourney = value;
        return this;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DatedVehicleJourney setCancellation(Boolean value) {
        this.cancellation = value;
        return this;
    }

    /**
     * Gets the value of the journeyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRef }
     *     
     */
    public JourneyPatternRef getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Sets the value of the journeyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRef }
     *     
     */
    public DatedVehicleJourney setJourneyPatternRef(JourneyPatternRef value) {
        this.journeyPatternRef = value;
        return this;
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModesEnumeration }
     * 
     * 
     */
    public List<VehicleModesEnumeration> getVehicleMode() {
        if (vehicleMode == null) {
            vehicleMode = new ArrayList<VehicleModesEnumeration>();
        }
        return this.vehicleMode;
    }

    /**
     * Gets the value of the routeRef property.
     * 
     * @return
     *     possible object is
     *     {@link RouteRef }
     *     
     */
    public RouteRef getRouteRef() {
        return routeRef;
    }

    /**
     * Sets the value of the routeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRef }
     *     
     */
    public DatedVehicleJourney setRouteRef(RouteRef value) {
        this.routeRef = value;
        return this;
    }

    /**
     * Gets the value of the publishedLineName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Sets the value of the publishedLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public DatedVehicleJourney setPublishedLineName(NaturalLanguageString value) {
        this.publishedLineName = value;
        return this;
    }

    /**
     * Gets the value of the directionName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getDirectionName() {
        return directionName;
    }

    /**
     * Sets the value of the directionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public DatedVehicleJourney setDirectionName(NaturalLanguageString value) {
        this.directionName = value;
        return this;
    }

    /**
     * Gets the value of the externalLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public LineRef getExternalLineRef() {
        return externalLineRef;
    }

    /**
     * Sets the value of the externalLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRef }
     *     
     */
    public DatedVehicleJourney setExternalLineRef(LineRef value) {
        this.externalLineRef = value;
        return this;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRef }
     *     
     */
    public OperatorRef getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRef }
     *     
     */
    public DatedVehicleJourney setOperatorRef(OperatorRef value) {
        this.operatorRef = value;
        return this;
    }

    /**
     * Gets the value of the productCategoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRef }
     *     
     */
    public ProductCategoryRef getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Sets the value of the productCategoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRef }
     *     
     */
    public DatedVehicleJourney setProductCategoryRef(ProductCategoryRef value) {
        this.productCategoryRef = value;
        return this;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities package.Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRef }
     * 
     * 
     */
    public List<ServiceFeatureRef> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<ServiceFeatureRef>();
        }
        return this.serviceFeatureRef;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRef }
     * 
     * 
     */
    public List<VehicleFeatureRef> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRef>();
        }
        return this.vehicleFeatureRef;
    }

    /**
     * Gets the value of the vehicleJourneyName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getVehicleJourneyName() {
        return vehicleJourneyName;
    }

    /**
     * Sets the value of the vehicleJourneyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public DatedVehicleJourney setVehicleJourneyName(NaturalLanguageString value) {
        this.vehicleJourneyName = value;
        return this;
    }

    /**
     * Gets the value of the journeyNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageString }
     * 
     * 
     */
    public List<NaturalLanguageString> getJourneyNote() {
        if (journeyNote == null) {
            journeyNote = new ArrayList<NaturalLanguageString>();
        }
        return this.journeyNote;
    }

    /**
     * Gets the value of the destinationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getDestinationDisplay() {
        return destinationDisplay;
    }

    /**
     * Sets the value of the destinationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public DatedVehicleJourney setDestinationDisplay(NaturalLanguageString value) {
        this.destinationDisplay = value;
        return this;
    }

    /**
     * Gets the value of the lineNote property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguagePlaceName }
     *     
     */
    public NaturalLanguagePlaceName getLineNote() {
        return lineNote;
    }

    /**
     * Sets the value of the lineNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguagePlaceName }
     *     
     */
    public DatedVehicleJourney setLineNote(NaturalLanguagePlaceName value) {
        this.lineNote = value;
        return this;
    }

    /**
     * Gets the value of the headwayService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Sets the value of the headwayService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DatedVehicleJourney setHeadwayService(Boolean value) {
        this.headwayService = value;
        return this;
    }

    /**
     * Gets the value of the monitored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Sets the value of the monitored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DatedVehicleJourney setMonitored(Boolean value) {
        this.monitored = value;
        return this;
    }

    /**
     * Gets the value of the blockRef property.
     * 
     * @return
     *     possible object is
     *     {@link BlockRef }
     *     
     */
    public BlockRef getBlockRef() {
        return blockRef;
    }

    /**
     * Sets the value of the blockRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockRef }
     *     
     */
    public DatedVehicleJourney setBlockRef(BlockRef value) {
        this.blockRef = value;
        return this;
    }

    /**
     * Gets the value of the courseOfJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfJourney }
     *     
     */
    public CourseOfJourney getCourseOfJourneyRef() {
        return courseOfJourneyRef;
    }

    /**
     * Sets the value of the courseOfJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfJourney }
     *     
     */
    public DatedVehicleJourney setCourseOfJourneyRef(CourseOfJourney value) {
        this.courseOfJourneyRef = value;
        return this;
    }

    /**
     * Gets the value of the datedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourney.DatedCalls }
     *     
     */
    public DatedVehicleJourney.DatedCalls getDatedCalls() {
        return datedCalls;
    }

    /**
     * Sets the value of the datedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourney.DatedCalls }
     *     
     */
    public void setDatedCalls(DatedVehicleJourney.DatedCalls value) {
        this.datedCalls = value;
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
    public DatedVehicleJourney setExtensions(Extensions value) {
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}DatedCall" maxOccurs="unbounded" minOccurs="2"/>
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
        "datedCall"
    })
    public static class DatedCalls {

        @XmlElement(name = "DatedCall", namespace = "http://www.siri.org.uk/siri", required = true)
        protected List<DatedCall> datedCall;

        /**
         * Gets the value of the datedCall property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datedCall property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatedCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatedCall }
         * 
         * 
         */
        public List<DatedCall> getDatedCall() {
            if (datedCall == null) {
                datedCall = new ArrayList<DatedCall>();
            }
            return this.datedCall;
        }

    }

}
