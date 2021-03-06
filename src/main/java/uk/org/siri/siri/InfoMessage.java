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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.hsesslingen.keim.efs.adapter.trias.jaxb.ZonedDateTimeAdapter;


/**
 * Type for an Info Message. @formatRef.
 * 
 * <p>Java class for InfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoMessageStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InfoMessageGroup"/>
 *         &lt;element name="ValidUntilTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="formatRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoMessageStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "infoMessageIdentifier",
    "infoMessageVersion",
    "infoChannelRef",
    "validUntilTime",
    "situationRef",
    "content",
    "extensions"
})
@ToString
public class InfoMessage
    extends AbstractIdentifiedItem
{

    @XmlElement(name = "InfoMessageIdentifier", namespace = "http://www.siri.org.uk/siri", required = true)
    protected InfoMessageRef infoMessageIdentifier;
    @XmlElement(name = "InfoMessageVersion", namespace = "http://www.siri.org.uk/siri")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger infoMessageVersion;
    @XmlElement(name = "InfoChannelRef", namespace = "http://www.siri.org.uk/siri")
    protected InfoChannelRef infoChannelRef;
    @XmlElement(name = "ValidUntilTime", namespace = "http://www.siri.org.uk/siri", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime validUntilTime;
    @XmlElement(name = "SituationRef", namespace = "http://www.siri.org.uk/siri")
    protected SituationRef situationRef;
    @XmlElement(name = "Content", namespace = "http://www.siri.org.uk/siri", required = true)
    protected Object content;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;
    @XmlAttribute(name = "formatRef")
    protected String formatRef;

    /**
     * Gets the value of the infoMessageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessageRef }
     *     
     */
    public InfoMessageRef getInfoMessageIdentifier() {
        return infoMessageIdentifier;
    }

    /**
     * Sets the value of the infoMessageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessageRef }
     *     
     */
    public InfoMessage setInfoMessageIdentifier(InfoMessageRef value) {
        this.infoMessageIdentifier = value;
        return this;
    }

    /**
     * Gets the value of the infoMessageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfoMessageVersion() {
        return infoMessageVersion;
    }

    /**
     * Sets the value of the infoMessageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public InfoMessage setInfoMessageVersion(BigInteger value) {
        this.infoMessageVersion = value;
        return this;
    }

    /**
     * Gets the value of the infoChannelRef property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelRef }
     *     
     */
    public InfoChannelRef getInfoChannelRef() {
        return infoChannelRef;
    }

    /**
     * Sets the value of the infoChannelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelRef }
     *     
     */
    public InfoMessage setInfoChannelRef(InfoChannelRef value) {
        this.infoChannelRef = value;
        return this;
    }

    /**
     * Gets the value of the validUntilTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getValidUntilTime() {
        return validUntilTime;
    }

    /**
     * Sets the value of the validUntilTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InfoMessage setValidUntilTime(ZonedDateTime value) {
        this.validUntilTime = value;
        return this;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRef }
     *     
     */
    public SituationRef getSituationRef() {
        return situationRef;
    }

    /**
     * Sets the value of the situationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRef }
     *     
     */
    public InfoMessage setSituationRef(SituationRef value) {
        this.situationRef = value;
        return this;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public InfoMessage setContent(Object value) {
        this.content = value;
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
    public InfoMessage setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

    /**
     * Gets the value of the formatRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatRef() {
        return formatRef;
    }

    /**
     * Sets the value of the formatRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InfoMessage setFormatRef(String value) {
        this.formatRef = value;
        return this;
    }

}
