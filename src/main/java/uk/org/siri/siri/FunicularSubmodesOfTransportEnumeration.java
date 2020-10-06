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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


import lombok.ToString;
@ToString
/**
 * <p>Java class for FunicularSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunicularSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti10_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti10_1"/>
 *     &lt;enumeration value="loc14_2"/>
 *     &lt;enumeration value="funicular"/>
 *     &lt;enumeration value="pti10_2"/>
 *     &lt;enumeration value="allFunicularServices"/>
 *     &lt;enumeration value="pti10_255"/>
 *     &lt;enumeration value="undefinedFunicular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunicularSubmodesOfTransportEnumeration", namespace = "http://www.siri.org.uk/siri")
@XmlEnum
public enum FunicularSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti10_0")
    PTI_10_0("pti10_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti10_1")
    PTI_10_1("pti10_1"),
    @XmlEnumValue("loc14_2")
    LOC_14_2("loc14_2"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("pti10_2")
    PTI_10_2("pti10_2"),
    @XmlEnumValue("allFunicularServices")
    ALL_FUNICULAR_SERVICES("allFunicularServices"),
    @XmlEnumValue("pti10_255")
    PTI_10_255("pti10_255"),
    @XmlEnumValue("undefinedFunicular")
    UNDEFINED_FUNICULAR("undefinedFunicular");
    private final String value;

    FunicularSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunicularSubmodesOfTransportEnumeration fromValue(String v) {
        for (FunicularSubmodesOfTransportEnumeration c: FunicularSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
