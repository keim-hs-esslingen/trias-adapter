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


package de.vdv.trias;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for MapServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapServiceRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.vdv.de/trias}MapPropertiesGroup"/>
 *         &lt;element name="ImageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Layer" type="{http://www.vdv.de/trias}MapLayersEnumeration" maxOccurs="unbounded"/>
 *         &lt;element name="Opaqueness" type="{http://www.vdv.de/trias}PercentType" minOccurs="0"/>
 *         &lt;element name="BackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapServiceRequestStructure", namespace = "http://www.vdv.de/trias", propOrder = {
    "aspect",
    "size",
    "imageType",
    "layer",
    "opaqueness",
    "backgroundColor",
    "extension"
})
public class MapServiceRequest {

    @XmlElement(name = "Aspect", namespace = "http://www.vdv.de/trias", required = true)
    protected MapAspect aspect;
    @XmlElement(name = "Size", namespace = "http://www.vdv.de/trias", required = true)
    protected MapSize size;
    @XmlElement(name = "ImageType", namespace = "http://www.vdv.de/trias")
    protected String imageType;
    @XmlElement(name = "Layer", namespace = "http://www.vdv.de/trias", required = true)
    @XmlSchemaType(name = "string")
    protected List<MapLayersEnumeration> layer;
    @XmlElement(name = "Opaqueness", namespace = "http://www.vdv.de/trias")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer opaqueness;
    @XmlElement(name = "BackgroundColor", namespace = "http://www.vdv.de/trias")
    protected String backgroundColor;
    @XmlElement(name = "Extension", namespace = "http://www.vdv.de/trias")
    protected Object extension;

    /**
     * Gets the value of the aspect property.
     * 
     * @return
     *     possible object is
     *     {@link MapAspect }
     *     
     */
    public MapAspect getAspect() {
        return aspect;
    }

    /**
     * Sets the value of the aspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapAspect }
     *     
     */
    public MapServiceRequest setAspect(MapAspect value) {
        this.aspect = value;
        return this;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link MapSize }
     *     
     */
    public MapSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSize }
     *     
     */
    public MapServiceRequest setSize(MapSize value) {
        this.size = value;
        return this;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MapServiceRequest setImageType(String value) {
        this.imageType = value;
        return this;
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapLayersEnumeration }
     * 
     * 
     */
    public List<MapLayersEnumeration> getLayer() {
        if (layer == null) {
            layer = new ArrayList<MapLayersEnumeration>();
        }
        return this.layer;
    }

    /**
     * Gets the value of the opaqueness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpaqueness() {
        return opaqueness;
    }

    /**
     * Sets the value of the opaqueness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public MapServiceRequest setOpaqueness(Integer value) {
        this.opaqueness = value;
        return this;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MapServiceRequest setBackgroundColor(String value) {
        this.backgroundColor = value;
        return this;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public MapServiceRequest setExtension(Object value) {
        this.extension = value;
        return this;
    }

}
