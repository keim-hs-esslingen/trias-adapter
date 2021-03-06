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

import lombok.ToString;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatingModeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="operatingMode0"/>
 *     &lt;enumeration value="operatingMode1"/>
 *     &lt;enumeration value="operatingMode2"/>
 *     &lt;enumeration value="operatingMode3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatingModeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum OperatingModeEnum {


    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("operatingMode0")
    OPERATING_MODE_0("operatingMode0"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("operatingMode1")
    OPERATING_MODE_1("operatingMode1"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("operatingMode2")
    OPERATING_MODE_2("operatingMode2"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("operatingMode3")
    OPERATING_MODE_3("operatingMode3");
    private final String value;

    OperatingModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingModeEnum fromValue(String v) {
        for (OperatingModeEnum c: OperatingModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
