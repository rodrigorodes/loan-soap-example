
package pt.axians.loan.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanRequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loans" type="{http://ws.loan.axians.pt/}loanList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanRequestResponse", propOrder = {
    "loans"
})
public class LoanRequestResponse {

    protected LoanList loans;

    /**
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link LoanList }
     *     
     */
    public LoanList getLoans() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanList }
     *     
     */
    public void setLoans(LoanList value) {
        this.loans = value;
    }

}
