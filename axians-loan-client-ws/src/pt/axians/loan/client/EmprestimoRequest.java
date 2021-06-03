
package pt.axians.loan.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emprestimoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emprestimoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtros" type="{http://ws.loan.axians.pt/}filterList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emprestimoRequest", propOrder = {
    "filtros"
})
public class EmprestimoRequest {

    protected FilterList filtros;

    /**
     * Gets the value of the filtros property.
     * 
     * @return
     *     possible object is
     *     {@link FilterList }
     *     
     */
    public FilterList getFiltros() {
        return filtros;
    }

    /**
     * Sets the value of the filtros property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterList }
     *     
     */
    public void setFiltros(FilterList value) {
        this.filtros = value;
    }

}
