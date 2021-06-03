
package pt.axians.loan.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanType" type="{http://ws.loan.axians.pt/}loanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter", propOrder = {
    "loanType"
})
public class Filter {

    @XmlSchemaType(name = "string")
    protected LoanType loanType;

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link LoanType }
     *     
     */
    public LoanType getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanType }
     *     
     */
    public void setLoanType(LoanType value) {
        this.loanType = value;
    }

}
