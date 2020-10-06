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
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * Type for information about the lines affected by an Situation
 * 
 * <p>Java class for AffectedLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedLineStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}LineGroup"/>
 *         &lt;element name="Destinations" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.siri.org.uk/siri}DirectionStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Routes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedRoute" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "AffectedLineStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "affectedOperator",
    "lineRef",
    "destinations",
    "direction",
    "routes",
    "sections",
    "extensions"
})
public class AffectedLine {

    @XmlElement(name = "AffectedOperator", namespace = "http://www.siri.org.uk/siri")
    protected List<AffectedOperator> affectedOperator;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected List<LineRef> lineRef;
    @XmlElement(name = "Destinations", namespace = "http://www.siri.org.uk/siri")
    protected List<AffectedStopPoint> destinations;
    @XmlElement(name = "Direction", namespace = "http://www.siri.org.uk/siri")
    protected List<Direction> direction;
    @XmlElement(name = "Routes", namespace = "http://www.siri.org.uk/siri")
    protected AffectedLine.Routes routes;
    @XmlElement(name = "Sections", namespace = "http://www.siri.org.uk/siri")
    protected AffectedLine.Sections sections;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the affectedOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedOperator }
     * 
     * 
     */
    public List<AffectedOperator> getAffectedOperator() {
        if (affectedOperator == null) {
            affectedOperator = new ArrayList<AffectedOperator>();
        }
        return this.affectedOperator;
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
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPoint }
     * 
     * 
     */
    public List<AffectedStopPoint> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPoint>();
        }
        return this.destinations;
    }

    /**
     * Gets the value of the direction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction }
     * 
     * 
     */
    public List<Direction> getDirection() {
        if (direction == null) {
            direction = new ArrayList<Direction>();
        }
        return this.direction;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLine.Routes }
     *     
     */
    public AffectedLine.Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLine.Routes }
     *     
     */
    public void setRoutes(AffectedLine.Routes value) {
        this.routes = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLine.Sections }
     *     
     */
    public AffectedLine.Sections getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLine.Sections }
     *     
     */
    public void setSections(AffectedLine.Sections value) {
        this.sections = value;
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
    public AffectedLine setExtensions(Extensions value) {
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
     *         &lt;element name="AffectedRoute" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/>
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
        "affectedRoute"
    })
    public static class Routes {

        @XmlElement(name = "AffectedRoute", namespace = "http://www.siri.org.uk/siri", required = true)
        protected List<AffectedRoute> affectedRoute;

        /**
         * Gets the value of the affectedRoute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedRoute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedRoute }
         * 
         * 
         */
        public List<AffectedRoute> getAffectedRoute() {
            if (affectedRoute == null) {
                affectedRoute = new ArrayList<AffectedRoute>();
            }
            return this.affectedRoute;
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
     *         &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/>
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
        "affectedSection"
    })
    public static class Sections {

        @XmlElement(name = "AffectedSection", namespace = "http://www.siri.org.uk/siri", required = true)
        protected List<AffectedSection> affectedSection;

        /**
         * Gets the value of the affectedSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedSection }
         * 
         * 
         */
        public List<AffectedSection> getAffectedSection() {
            if (affectedSection == null) {
                affectedSection = new ArrayList<AffectedSection>();
            }
            return this.affectedSection;
        }

    }

}
