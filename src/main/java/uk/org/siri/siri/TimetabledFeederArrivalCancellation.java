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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Timetabled Deletion of a feeder connection.
 * 
 * <p>Java class for TimetabledFeederArrivalCancellation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimetabledFeederArrivalCancellationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractReferencingItemStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeFeederIdentityGroup"/>
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure"/>
 *         &lt;element name="VehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimetabledFeederArrivalCancellationStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "interchangeRef",
    "connectionLinkRef",
    "stopPointRef",
    "visitNumber",
    "order",
    "stopPointName",
    "lineRef",
    "directionRef",
    "vehicleJourneyRef",
    "journeyPatternRef",
    "vehicleMode",
    "routeRef",
    "publishedLineName",
    "directionName",
    "externalLineRef",
    "reason",
    "extensions"
})
@ToString
public class TimetabledFeederArrivalCancellation
    extends AbstractReferencingItem
{

    @XmlElement(name = "InterchangeRef", namespace = "http://www.siri.org.uk/siri")
    protected InterchangeRef interchangeRef;
    @XmlElement(name = "ConnectionLinkRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected ConnectionLinkRef connectionLinkRef;
    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPointRef stopPointRef;
    @XmlElement(name = "VisitNumber", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger visitNumber;
    @XmlElement(name = "Order", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "StopPointName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString stopPointName;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected LineRef lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected DirectionRef directionRef;
    @XmlElement(name = "VehicleJourneyRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected FramedVehicleJourneyRef vehicleJourneyRef;
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
    @XmlElement(name = "Reason", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString reason;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

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
    public TimetabledFeederArrivalCancellation setInterchangeRef(InterchangeRef value) {
        this.interchangeRef = value;
        return this;
    }

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRef }
     *     
     */
    public ConnectionLinkRef getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Sets the value of the connectionLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRef }
     *     
     */
    public TimetabledFeederArrivalCancellation setConnectionLinkRef(ConnectionLinkRef value) {
        this.connectionLinkRef = value;
        return this;
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
    public TimetabledFeederArrivalCancellation setStopPointRef(StopPointRef value) {
        this.stopPointRef = value;
        return this;
    }

    /**
     * Gets the value of the visitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Sets the value of the visitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public TimetabledFeederArrivalCancellation setVisitNumber(BigInteger value) {
        this.visitNumber = value;
        return this;
    }

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
    public TimetabledFeederArrivalCancellation setOrder(BigInteger value) {
        this.order = value;
        return this;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getStopPointName() {
        return stopPointName;
    }

    /**
     * Sets the value of the stopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public TimetabledFeederArrivalCancellation setStopPointName(NaturalLanguageString value) {
        this.stopPointName = value;
        return this;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public LineRef getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRef }
     *     
     */
    public TimetabledFeederArrivalCancellation setLineRef(LineRef value) {
        this.lineRef = value;
        return this;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRef }
     *     
     */
    public DirectionRef getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRef }
     *     
     */
    public TimetabledFeederArrivalCancellation setDirectionRef(DirectionRef value) {
        this.directionRef = value;
        return this;
    }

    /**
     * Gets the value of the vehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link FramedVehicleJourneyRef }
     *     
     */
    public FramedVehicleJourneyRef getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Sets the value of the vehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FramedVehicleJourneyRef }
     *     
     */
    public TimetabledFeederArrivalCancellation setVehicleJourneyRef(FramedVehicleJourneyRef value) {
        this.vehicleJourneyRef = value;
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
    public TimetabledFeederArrivalCancellation setJourneyPatternRef(JourneyPatternRef value) {
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
    public TimetabledFeederArrivalCancellation setRouteRef(RouteRef value) {
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
    public TimetabledFeederArrivalCancellation setPublishedLineName(NaturalLanguageString value) {
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
    public TimetabledFeederArrivalCancellation setDirectionName(NaturalLanguageString value) {
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
    public TimetabledFeederArrivalCancellation setExternalLineRef(LineRef value) {
        this.externalLineRef = value;
        return this;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public TimetabledFeederArrivalCancellation setReason(NaturalLanguageString value) {
        this.reason = value;
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
    public TimetabledFeederArrivalCancellation setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

}
