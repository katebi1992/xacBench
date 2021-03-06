//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.01 at 04:14:23 PM CEST 
//


package edu.unsw.cse.xacml.profiles._2_0_.policy;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CombinerParametersType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CombinerParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}CombinerParameter" maxOccurs="unbounded"
 * minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinerParametersType", propOrder = {
        "combinerParameter"
})
@XmlSeeAlso({
        RuleCombinerParametersType.class,
        PolicySetCombinerParametersType.class,
        PolicyCombinerParametersType.class
})
public class CombinerParametersType {

    @XmlElement(name = "CombinerParameter")
    protected List<CombinerParameterType> combinerParameter;

    /**
     * Gets the value of the combinerParameter property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the combinerParameter property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinerParameter().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list {@link CombinerParameterType }
     */
    public List<CombinerParameterType> getCombinerParameter() {
        if (combinerParameter == null) {
            combinerParameter = new ArrayList<CombinerParameterType>();
        }
        return this.combinerParameter;
    }

}
