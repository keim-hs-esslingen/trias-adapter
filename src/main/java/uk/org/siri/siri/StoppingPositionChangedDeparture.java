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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Change to a Distributor stop position.
 * 
 * <p>Java class for StoppingPositionChangedDeparture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoppingPositionChangedDepartureStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractDistributorItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ChangeNote" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *         &lt;element name="NewLocation" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
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
@XmlType(name = "StoppingPositionChangedDepartureStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "changeNote",
    "newLocation",
    "extensions"
})
public class StoppingPositionChangedDeparture
    extends AbstractDistributorItem
{

    @XmlElement(name = "ChangeNote", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguagePlaceName changeNote;
    @XmlElement(name = "NewLocation", namespace = "http://www.siri.org.uk/siri")
    protected Location newLocation;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected Extensions extensions;

    /**
     * Gets the value of the changeNote property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguagePlaceName }
     *     
     */
    public NaturalLanguagePlaceName getChangeNote() {
        return changeNote;
    }

    /**
     * Sets the value of the changeNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguagePlaceName }
     *     
     */
    public StoppingPositionChangedDeparture setChangeNote(NaturalLanguagePlaceName value) {
        this.changeNote = value;
        return this;
    }

    /**
     * Gets the value of the newLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getNewLocation() {
        return newLocation;
    }

    /**
     * Sets the value of the newLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public StoppingPositionChangedDeparture setNewLocation(Location value) {
        this.newLocation = value;
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
    public StoppingPositionChangedDeparture setExtensions(Extensions value) {
        this.extensions = value;
        return this;
    }

}