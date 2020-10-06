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

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;


/**
 * Type for information about a call affected by an Situation
 * 
 * <p>Java class for AffectedCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedCallStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPointStructure">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CallCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealtimeGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopArrivalGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopDepartureGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}HeadwayIntervalGroup"/>
 *         &lt;element name="AffectedInterchange" type="{http://www.siri.org.uk/siri}AffectedInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCallStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "order",
    "callCondition",
    "vehicleAtStop",
    "vehicleLocationAtStop",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "arrivalStatus",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "departureStatus",
    "departurePlatformName",
    "departureBoardingActivity",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "affectedInterchange"
})
public class AffectedCall
    extends AffectedStopPoint
{

    @XmlElement(name = "Order", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "CallCondition", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected RoutePointTypeEnumeration callCondition;
    @XmlElement(name = "VehicleAtStop", namespace = "http://www.siri.org.uk/siri")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "VehicleLocationAtStop", namespace = "http://www.siri.org.uk/siri")
    protected Location vehicleLocationAtStop;
    @XmlElement(name = "AimedArrivalTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;
    @XmlElement(name = "ActualArrivalTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime actualArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedArrivalTime;
    @XmlElement(name = "ArrivalStatus", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected ProgressStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalPlatformName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", namespace = "http://www.siri.org.uk/siri", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "AimedDepartureTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTime;
    @XmlElement(name = "ActualDepartureTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime actualDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedDepartureTime;
    @XmlElement(name = "DepartureStatus", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "NMTOKEN")
    protected ProgressStatusEnumeration departureStatus;
    @XmlElement(name = "DeparturePlatformName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", namespace = "http://www.siri.org.uk/siri", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "AimedHeadwayInterval", namespace = "http://www.siri.org.uk/siri")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval", namespace = "http://www.siri.org.uk/siri")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "AffectedInterchange", namespace = "http://www.siri.org.uk/siri")
    protected List<AffectedInterchange> affectedInterchange;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public AffectedCall setOrder(BigInteger value) {
        this.order = value;
        return this;
    }

    /**
     * Gets the value of the callCondition property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointTypeEnumeration }
     *     
     */
    public RoutePointTypeEnumeration getCallCondition() {
        return callCondition;
    }

    /**
     * Sets the value of the callCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointTypeEnumeration }
     *     
     */
    public AffectedCall setCallCondition(RoutePointTypeEnumeration value) {
        this.callCondition = value;
        return this;
    }

    /**
     * Gets the value of the vehicleAtStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Sets the value of the vehicleAtStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AffectedCall setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
        return this;
    }

    /**
     * Gets the value of the vehicleLocationAtStop property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getVehicleLocationAtStop() {
        return vehicleLocationAtStop;
    }

    /**
     * Sets the value of the vehicleLocationAtStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public AffectedCall setVehicleLocationAtStop(Location value) {
        this.vehicleLocationAtStop = value;
        return this;
    }

    /**
     * Gets the value of the aimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Sets the value of the aimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AffectedCall setAimedArrivalTime(ZonedDateTime value) {
        this.aimedArrivalTime = value;
        return this;
    }

    /**
     * Gets the value of the actualArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Sets the value of the actualArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AffectedCall setActualArrivalTime(ZonedDateTime value) {
        this.actualArrivalTime = value;
        return this;
    }

    /**
     * Gets the value of the expectedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Sets the value of the expectedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AffectedCall setExpectedArrivalTime(ZonedDateTime value) {
        this.expectedArrivalTime = value;
        return this;
    }

    /**
     * Gets the value of the arrivalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressStatusEnumeration }
     *     
     */
    public ProgressStatusEnumeration getArrivalStatus() {
        return arrivalStatus;
    }

    /**
     * Sets the value of the arrivalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressStatusEnumeration }
     *     
     */
    public AffectedCall setArrivalStatus(ProgressStatusEnumeration value) {
        this.arrivalStatus = value;
        return this;
    }

    /**
     * Gets the value of the arrivalPlatformName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Sets the value of the arrivalPlatformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public AffectedCall setArrivalPlatformName(NaturalLanguageString value) {
        this.arrivalPlatformName = value;
        return this;
    }

    /**
     * Gets the value of the arrivalBoardingActivity property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Sets the value of the arrivalBoardingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public AffectedCall setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
        return this;
    }

    /**
     * Gets the value of the aimedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Sets the value of the aimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AffectedCall setAimedDepartureTime(ZonedDateTime value) {
        this.aimedDepartureTime = value;
        return this;
    }

    /**
     * Gets the value of the actualDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Sets the value of the actualDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AffectedCall setActualDepartureTime(ZonedDateTime value) {
        this.actualDepartureTime = value;
        return this;
    }

    /**
     * Gets the value of the expectedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Sets the value of the expectedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AffectedCall setExpectedDepartureTime(ZonedDateTime value) {
        this.expectedDepartureTime = value;
        return this;
    }

    /**
     * Gets the value of the departureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressStatusEnumeration }
     *     
     */
    public ProgressStatusEnumeration getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Sets the value of the departureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressStatusEnumeration }
     *     
     */
    public AffectedCall setDepartureStatus(ProgressStatusEnumeration value) {
        this.departureStatus = value;
        return this;
    }

    /**
     * Gets the value of the departurePlatformName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getDeparturePlatformName() {
        return departurePlatformName;
    }

    /**
     * Sets the value of the departurePlatformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public AffectedCall setDeparturePlatformName(NaturalLanguageString value) {
        this.departurePlatformName = value;
        return this;
    }

    /**
     * Gets the value of the departureBoardingActivity property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Sets the value of the departureBoardingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public AffectedCall setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
        return this;
    }

    /**
     * Gets the value of the aimedHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAimedHeadwayInterval() {
        return aimedHeadwayInterval;
    }

    /**
     * Sets the value of the aimedHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public AffectedCall setAimedHeadwayInterval(Duration value) {
        this.aimedHeadwayInterval = value;
        return this;
    }

    /**
     * Gets the value of the expectedHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedHeadwayInterval() {
        return expectedHeadwayInterval;
    }

    /**
     * Sets the value of the expectedHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public AffectedCall setExpectedHeadwayInterval(Duration value) {
        this.expectedHeadwayInterval = value;
        return this;
    }

    /**
     * Gets the value of the affectedInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedInterchange }
     * 
     * 
     */
    public List<AffectedInterchange> getAffectedInterchange() {
        if (affectedInterchange == null) {
            affectedInterchange = new ArrayList<AffectedInterchange>();
        }
        return this.affectedInterchange;
    }

}