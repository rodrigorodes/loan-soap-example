
package pt.axians.loan.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emprestimoRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emprestimoRequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emprestimos" type="{http://ws.loan.axians.pt/}loanList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emprestimoRequestResponse", propOrder = {
    "emprestimos"
})
public class EmprestimoRequestResponse {

    protected LoanList emprestimos;

    /**
     * Gets the value of the emprestimos property.
     * 
     * @return
     *     possible object is
     *     {@link LoanList }
     *     
     */
    public LoanList getEmprestimos() {
        return emprestimos;
    }

    /**
     * Sets the value of the emprestimos property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanList }
     *     
     */
    public void setEmprestimos(LoanList value) {
        this.emprestimos = value;
    }

}
