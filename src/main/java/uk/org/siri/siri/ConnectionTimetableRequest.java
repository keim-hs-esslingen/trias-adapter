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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Request for Connection Timetable Service 
 * 
 * <p>Java class for ConnectionTimetableRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionTimetableTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionTimetableRequestPolicyGroup"/>
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
@XmlType(name = "ConnectionTimetableRequestStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "arrivalWindow",
    "connectionLinkRef",
    "lineRef",
    "directionRef",
    "language"
})
@ToString
public class ConnectionTimetableRequest
    extends AbstractFunctionalServiceRequest
{

    @XmlElement(name = "ArrivalWindow", namespace = "http://www.siri.org.uk/siri")
    protected ClosedTimestampRange arrivalWindow;
    @XmlElement(name = "ConnectionLinkRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected ConnectionLinkRef connectionLinkRef;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri")
    protected LineRef lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri")
    protected DirectionRef directionRef;
    @XmlElement(name = "Language", namespace = "http://www.siri.org.uk/siri", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the arrivalWindow property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedTimestampRange }
     *     
     */
    public ClosedTimestampRange getArrivalWindow() {
        return arrivalWindow;
    }

    /**
     * Sets the value of the arrivalWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedTimestampRange }
     *     
     */
    public ConnectionTimetableRequest setArrivalWindow(ClosedTimestampRange value) {
        this.arrivalWindow = value;
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
    public ConnectionTimetableRequest setConnectionLinkRef(ConnectionLinkRef value) {
        this.connectionLinkRef = value;
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
    public ConnectionTimetableRequest setLineRef(LineRef value) {
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
    public ConnectionTimetableRequest setDirectionRef(DirectionRef value) {
        this.directionRef = value;
        return this;
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
    public ConnectionTimetableRequest setLanguage(String value) {
        this.language = value;
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
    public ConnectionTimetableRequest setVersion(String value) {
        this.version = value;
        return this;
    }

}
