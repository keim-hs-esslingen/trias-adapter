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

import lombok.ToString;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;
import eu.datex2.schema._1_0._1_0.InformationStatusEnum;
import uk.org.ifopt.acsb.PassengerAccessibilityNeeds;
import uk.org.ifopt.ifopt.AccessModesEnumeration;
import uk.org.ifopt.ifopt.CountryRef;
import uk.org.ifopt.ifopt.StopPlaceRef;


/**
 * Service Request Type for Situation Exchange Service
 * 
 * <p>Java class for SituationExchangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeRequestPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" fixed="1.4" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationExchangeRequestStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "previewInterval",
    "startTime",
    "vehicleMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "metroSubmode",
    "railSubmode",
    "tramSubmode",
    "waterSubmode",
    "accessMode",
    "severity",
    "scope",
    "predictability",
    "keywords",
    "verification",
    "progress",
    "reality",
    "operatorRef",
    "operationalUnitRef",
    "networkRef",
    "lineRef",
    "stopPointRef",
    "connectionLinkRef",
    "facilityRef",
    "stopPlaceRef",
    "vehicleJourneyRef",
    "interchangeRef",
    "vehicleRef",
    "countryRef",
    "placeRef",
    "location",
    "situationRoadFilter",
    "accessibilityNeedFilter",
    "language",
    "maximumNumberOfSituationElements",
    "extensions"
})
@ToString
public class SituationExchangeRequest
    extends AbstractFunctionalServiceRequest
{

    @XmlElement(name = "PreviewInterval", namespace = "http://www.siri.org.uk/siri")
    protected Duration previewInterval;
    @XmlElement(name = "StartTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startTime;
    @XmlElement(name = "VehicleMode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModesOfTransportEnumeration vehicleMode;
    @XmlElement(name = "AirSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodesOfTransportEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodesOfTransportEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodesOfTransportEnumeration coachSubmode;
    @XmlElement(name = "MetroSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodesOfTransportEnumeration metroSubmode;
    @XmlElement(name = "RailSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodesOfTransportEnumeration railSubmode;
    @XmlElement(name = "TramSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodesOfTransportEnumeration tramSubmode;
    @XmlElement(name = "WaterSubmode", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodesOfTransportEnumeration waterSubmode;
    @XmlElement(name = "AccessMode", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected AccessModesEnumeration accessMode;
    @XmlElement(name = "Severity", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Scope", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<ScopeTypeEnumeration> scope;
    @XmlElement(name = "Predictability", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected PredictabilityEnumeration predictability;
    @XmlList
    @XmlElement(name = "Keywords", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> keywords;
    @XmlElement(name = "Verification", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", namespace = "http://www.siri.org.uk/siri", defaultValue = "open")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<WorkflowStatusEnumeration> progress;
    @XmlElement(name = "Reality", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "string")
    protected InformationStatusEnum reality;
    @XmlElement(name = "OperatorRef", namespace = "http://www.siri.org.uk/siri")
    protected OperatorRef operatorRef;
    @XmlElement(name = "OperationalUnitRef", namespace = "http://www.siri.org.uk/siri")
    protected List<OperationalUnitRef> operationalUnitRef;
    @XmlElement(name = "NetworkRef", namespace = "http://www.siri.org.uk/siri")
    protected OperatorRef networkRef;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri")
    protected List<LineRef> lineRef;
    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPointRef stopPointRef;
    @XmlElement(name = "ConnectionLinkRef", namespace = "http://www.siri.org.uk/siri")
    protected List<ConnectionLinkRef> connectionLinkRef;
    @XmlElement(name = "FacilityRef", namespace = "http://www.siri.org.uk/siri")
    protected List<FacilityRef> facilityRef;
    @XmlElement(name = "StopPlaceRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPlaceRef stopPlaceRef;
    @XmlElement(name = "VehicleJourneyRef", namespace = "http://www.siri.org.uk/siri")
    protected VehicleJourneyRef vehicleJourneyRef;
    @XmlElement(name = "InterchangeRef", namespace = "http://www.siri.org.uk/siri")
    protected InterchangeRef interchangeRef;
    @XmlElement(name = "VehicleRef", namespace = "http://www.siri.org.uk/siri")
    protected VehicleRef vehicleRef;
    @XmlElement(name = "CountryRef", namespace = "http://www.siri.org.uk/siri")
    protected CountryRef countryRef;
    @XmlElement(name = "PlaceRef", namespace = "http://www.siri.org.uk/siri")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String placeRef;
    @XmlElement(name = "Location", namespace = "http://www.siri.org.uk/siri")
    protected List<Location> location;
    @XmlElement(name = "SituationRoadFilter", namespace = "http://www.siri.org.uk/siri")
    protected SituationExchangeRequest.SituationRoadFilter situationRoadFilter;
    @XmlElement(name = "AccessibilityNeedFilter", namespace = "http://www.siri.org.uk/siri")
    protected List<PassengerAccessibilityNeeds> accessibilityNeedFilter;
    @XmlElement(name = "Language", namespace = "http://www.siri.org.uk/siri", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "MaximumNumberOfSituationElements", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfSituationElements;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the previewInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviewInterval() {
        return previewInterval;
    }

    /**
     * Sets the value of the previewInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public SituationExchangeRequest setPreviewInterval(Duration value) {
        this.previewInterval = value;
        return this;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SituationExchangeRequest setStartTime(ZonedDateTime value) {
        this.startTime = value;
        return this;
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public VehicleModesOfTransportEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Sets the value of the vehicleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setVehicleMode(VehicleModesOfTransportEnumeration value) {
        this.vehicleMode = value;
        return this;
    }

    /**
     * Gets the value of the airSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public AirSubmodesOfTransportEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Sets the value of the airSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setAirSubmode(AirSubmodesOfTransportEnumeration value) {
        this.airSubmode = value;
        return this;
    }

    /**
     * Gets the value of the busSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public BusSubmodesOfTransportEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Sets the value of the busSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setBusSubmode(BusSubmodesOfTransportEnumeration value) {
        this.busSubmode = value;
        return this;
    }

    /**
     * Gets the value of the coachSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Sets the value of the coachSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        this.coachSubmode = value;
        return this;
    }

    /**
     * Gets the value of the metroSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Sets the value of the metroSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        this.metroSubmode = value;
        return this;
    }

    /**
     * Gets the value of the railSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public RailSubmodesOfTransportEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Sets the value of the railSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setRailSubmode(RailSubmodesOfTransportEnumeration value) {
        this.railSubmode = value;
        return this;
    }

    /**
     * Gets the value of the tramSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public TramSubmodesOfTransportEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Sets the value of the tramSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setTramSubmode(TramSubmodesOfTransportEnumeration value) {
        this.tramSubmode = value;
        return this;
    }

    /**
     * Gets the value of the waterSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Sets the value of the waterSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodesOfTransportEnumeration }
     *     
     */
    public SituationExchangeRequest setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        this.waterSubmode = value;
        return this;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public AccessModesEnumeration getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModesEnumeration }
     *     
     */
    public SituationExchangeRequest setAccessMode(AccessModesEnumeration value) {
        this.accessMode = value;
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
    public SituationExchangeRequest setSeverity(SeverityEnumeration value) {
        this.severity = value;
        return this;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeTypeEnumeration }
     * 
     * 
     */
    public List<ScopeTypeEnumeration> getScope() {
        if (scope == null) {
            scope = new ArrayList<ScopeTypeEnumeration>();
        }
        return this.scope;
    }

    /**
     * Gets the value of the predictability property.
     * 
     * @return
     *     possible object is
     *     {@link PredictabilityEnumeration }
     *     
     */
    public PredictabilityEnumeration getPredictability() {
        return predictability;
    }

    /**
     * Sets the value of the predictability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictabilityEnumeration }
     *     
     */
    public SituationExchangeRequest setPredictability(PredictabilityEnumeration value) {
        this.predictability = value;
        return this;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public VerificationStatusEnumeration getVerification() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public SituationExchangeRequest setVerification(VerificationStatusEnumeration value) {
        this.verification = value;
        return this;
    }

    /**
     * Gets the value of the progress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowStatusEnumeration }
     * 
     * 
     */
    public List<WorkflowStatusEnumeration> getProgress() {
        if (progress == null) {
            progress = new ArrayList<WorkflowStatusEnumeration>();
        }
        return this.progress;
    }

    /**
     * Gets the value of the reality property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getReality() {
        return reality;
    }

    /**
     * Sets the value of the reality property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public SituationExchangeRequest setReality(InformationStatusEnum value) {
        this.reality = value;
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
    public SituationExchangeRequest setOperatorRef(OperatorRef value) {
        this.operatorRef = value;
        return this;
    }

    /**
     * Gets the value of the operationalUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalUnitRef }
     * 
     * 
     */
    public List<OperationalUnitRef> getOperationalUnitRef() {
        if (operationalUnitRef == null) {
            operationalUnitRef = new ArrayList<OperationalUnitRef>();
        }
        return this.operationalUnitRef;
    }

    /**
     * Gets the value of the networkRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRef }
     *     
     */
    public OperatorRef getNetworkRef() {
        return networkRef;
    }

    /**
     * Sets the value of the networkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRef }
     *     
     */
    public SituationExchangeRequest setNetworkRef(OperatorRef value) {
        this.networkRef = value;
        return this;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineRef }
     * 
     * 
     */
    public List<LineRef> getLineRef() {
        if (lineRef == null) {
            lineRef = new ArrayList<LineRef>();
        }
        return this.lineRef;
    }

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRef }
     *     
     */
    public StopPointRef getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRef }
     *     
     */
    public SituationExchangeRequest setStopPointRef(StopPointRef value) {
        this.stopPointRef = value;
        return this;
    }

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLinkRef }
     * 
     * 
     */
    public List<ConnectionLinkRef> getConnectionLinkRef() {
        if (connectionLinkRef == null) {
            connectionLinkRef = new ArrayList<ConnectionLinkRef>();
        }
        return this.connectionLinkRef;
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityRef }
     * 
     * 
     */
    public List<FacilityRef> getFacilityRef() {
        if (facilityRef == null) {
            facilityRef = new ArrayList<FacilityRef>();
        }
        return this.facilityRef;
    }

    /**
     * Gets the value of the stopPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRef }
     *     
     */
    public StopPlaceRef getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Sets the value of the stopPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRef }
     *     
     */
    public SituationExchangeRequest setStopPlaceRef(StopPlaceRef value) {
        this.stopPlaceRef = value;
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
    public SituationExchangeRequest setVehicleJourneyRef(VehicleJourneyRef value) {
        this.vehicleJourneyRef = value;
        return this;
    }

    /**
     * Gets the value of the interchangeRef property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRef }
     *     
     */
    public InterchangeRef getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Sets the value of the interchangeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRef }
     *     
     */
    public SituationExchangeRequest setInterchangeRef(InterchangeRef value) {
        this.interchangeRef = value;
        return this;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRef }
     *     
     */
    public VehicleRef getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Sets the value of the vehicleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRef }
     *     
     */
    public SituationExchangeRequest setVehicleRef(VehicleRef value) {
        this.vehicleRef = value;
        return this;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public SituationExchangeRequest setCountryRef(CountryRef value) {
        this.countryRef = value;
        return this;
    }

    /**
     * Gets the value of the placeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceRef() {
        return placeRef;
    }

    /**
     * Sets the value of the placeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SituationExchangeRequest setPlaceRef(String value) {
        this.placeRef = value;
        return this;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

    /**
     * Gets the value of the situationRoadFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeRequest.SituationRoadFilter }
     *     
     */
    public SituationExchangeRequest.SituationRoadFilter getSituationRoadFilter() {
        return situationRoadFilter;
    }

    /**
     * Sets the value of the situationRoadFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeRequest.SituationRoadFilter }
     *     
     */
    public void setSituationRoadFilter(SituationExchangeRequest.SituationRoadFilter value) {
        this.situationRoadFilter = value;
    }

    /**
     * Gets the value of the accessibilityNeedFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityNeedFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityNeedFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerAccessibilityNeeds }
     * 
     * 
     */
    public List<PassengerAccessibilityNeeds> getAccessibilityNeedFilter() {
        if (accessibilityNeedFilter == null) {
            accessibilityNeedFilter = new ArrayList<PassengerAccessibilityNeeds>();
        }
        return this.accessibilityNeedFilter;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SituationExchangeRequest setLanguage(String value) {
        this.language = value;
        return this;
    }

    /**
     * Gets the value of the maximumNumberOfSituationElements property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfSituationElements() {
        return maximumNumberOfSituationElements;
    }

    /**
     * Sets the value of the maximumNumberOfSituationElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public SituationExchangeRequest setMaximumNumberOfSituationElements(BigInteger value) {
        this.maximumNumberOfSituationElements = value;
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
    public SituationExchangeRequest setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.4";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SituationExchangeRequest setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="RoadFilter" type="{http://www.siri.org.uk/siri}RoadFilterStructure" maxOccurs="unbounded"/>
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
        "roadFilter"
    })
    public static class SituationRoadFilter {

        @XmlElement(name = "RoadFilter", namespace = "http://www.siri.org.uk/siri", required = true)
        protected List<RoadFilter> roadFilter;

        /**
         * Gets the value of the roadFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roadFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoadFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoadFilter }
         * 
         * 
         */
        public List<RoadFilter> getRoadFilter() {
            if (roadFilter == null) {
                roadFilter = new ArrayList<RoadFilter>();
            }
            return this.roadFilter;
        }

    }

}
