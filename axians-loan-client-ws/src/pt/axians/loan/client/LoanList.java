
package pt.axians.loan.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emprestimo" type="{http://ws.loan.axians.pt/}loan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanList", propOrder = {
    "emprestimo"
})
public class LoanList {

    protected List<Loan> emprestimo;

    /**
     * Gets the value of the emprestimo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emprestimo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmprestimo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Loan }
     * 
     * 
     */
    public List<Loan> getEmprestimo() {
        if (emprestimo == null) {
            emprestimo = new ArrayList<Loan>();
        }
        return this.emprestimo;
    }

}
