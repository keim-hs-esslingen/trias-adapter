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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Block part elements of Vehicle journey.
 * 
 * <p>Java class for TrainBlockPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainBlockPartStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfBlockParts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="TrainPartRef" type="{http://www.siri.org.uk/siri}TrainPartRefStructure"/>
 *         &lt;element name="PositionOfTrainBlockPart" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainBlockPartStructure", namespace = "http://www.siri.org.uk/siri", propOrder = {
    "numberOfBlockParts",
    "trainPartRef",
    "positionOfTrainBlockPart"
})
@ToString
public class TrainBlockPart {

    @XmlElement(name = "NumberOfBlockParts", namespace = "http://www.siri.org.uk/siri", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlockParts;
    @XmlElement(name = "TrainPartRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected TrainPartRef trainPartRef;
    @XmlElement(name = "PositionOfTrainBlockPart", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageString positionOfTrainBlockPart;

    /**
     * Gets the value of the numberOfBlockParts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBlockParts() {
        return numberOfBlockParts;
    }

    /**
     * Sets the value of the numberOfBlockParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public TrainBlockPart setNumberOfBlockParts(BigInteger value) {
        this.numberOfBlockParts = value;
        return this;
    }

    /**
     * Gets the value of the trainPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrainPartRef }
     *     
     */
    public TrainPartRef getTrainPartRef() {
        return trainPartRef;
    }

    /**
     * Sets the value of the trainPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainPartRef }
     *     
     */
    public TrainBlockPart setTrainPartRef(TrainPartRef value) {
        this.trainPartRef = value;
        return this;
    }

    /**
     * Gets the value of the positionOfTrainBlockPart property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageString }
     *     
     */
    public NaturalLanguageString getPositionOfTrainBlockPart() {
        return positionOfTrainBlockPart;
    }

    /**
     * Sets the value of the positionOfTrainBlockPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageString }
     *     
     */
    public TrainBlockPart setPositionOfTrainBlockPart(NaturalLanguageString value) {
        this.positionOfTrainBlockPart = value;
        return this;
    }

}
