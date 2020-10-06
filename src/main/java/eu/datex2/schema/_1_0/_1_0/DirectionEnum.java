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


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for DirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anticlockwise"/>
 *     &lt;enumeration value="clockwise"/>
 *     &lt;enumeration value="northBound"/>
 *     &lt;enumeration value="northEastBound"/>
 *     &lt;enumeration value="eastBound"/>
 *     &lt;enumeration value="southEastBound"/>
 *     &lt;enumeration value="southBound"/>
 *     &lt;enumeration value="southWestBound"/>
 *     &lt;enumeration value="westBound"/>
 *     &lt;enumeration value="northWestBound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DirectionEnum {


    /**
     * In the anticlockwise direction of travel on a ring road.
     * 
     */
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),

    /**
     * In the clockwise direction of travel on a ring road.
     * 
     */
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),

    /**
     * In the north bound direction of travel.
     * 
     */
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),

    /**
     * In the north east bound direction of travel.
     * 
     */
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),

    /**
     * In the east bound direction of travel.
     * 
     */
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),

    /**
     * In the south east bound direction of travel.
     * 
     */
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),

    /**
     * In the south bound direction of travel.
     * 
     */
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),

    /**
     * In the south west bound direction of travel.
     * 
     */
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),

    /**
     * In the west bound direction of travel.
     * 
     */
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),

    /**
     * In the north west bound direction of travel.
     * 
     */
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound");
    private final String value;

    DirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum c: DirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
