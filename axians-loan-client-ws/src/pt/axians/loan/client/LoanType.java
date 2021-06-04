
package pt.axians.loan.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Consigned"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Guarantee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loanType")
@XmlEnum
public enum LoanType {

    @XmlEnumValue("Consigned")
    CONSIGNED("Consigned"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee");
    private final String value;

    LoanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanType fromValue(String v) {
        for (LoanType c: LoanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
