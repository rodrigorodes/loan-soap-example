
package pt.axians.loan.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.axians.loan.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthorizationFault_QNAME = new QName("http://ws.loan.axians.pt/", "AuthorizationFault");
    private final static QName _EmprestimoRequest_QNAME = new QName("http://ws.loan.axians.pt/", "emprestimoRequest");
    private final static QName _EmprestimoRequestResponse_QNAME = new QName("http://ws.loan.axians.pt/", "emprestimoRequestResponse");
    private final static QName _Filter_QNAME = new QName("http://ws.loan.axians.pt/", "filter");
    private final static QName _FilterList_QNAME = new QName("http://ws.loan.axians.pt/", "filterList");
    private final static QName _Loan_QNAME = new QName("http://ws.loan.axians.pt/", "loan");
    private final static QName _LoanList_QNAME = new QName("http://ws.loan.axians.pt/", "loanList");
    private final static QName _Token_QNAME = new QName("http://ws.loan.axians.pt/", "token");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.axians.loan.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmprestimoRequest }
     * 
     */
    public EmprestimoRequest createEmprestimoRequest() {
        return new EmprestimoRequest();
    }

    /**
     * Create an instance of {@link EmprestimoRequestResponse }
     * 
     */
    public EmprestimoRequestResponse createEmprestimoRequestResponse() {
        return new EmprestimoRequestResponse();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link FilterList }
     * 
     */
    public FilterList createFilterList() {
        return new FilterList();
    }

    /**
     * Create an instance of {@link Loan }
     * 
     */
    public Loan createLoan() {
        return new Loan();
    }

    /**
     * Create an instance of {@link LoanList }
     * 
     */
    public LoanList createLoanList() {
        return new LoanList();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "AuthorizationFault")
    public JAXBElement<String> createAuthorizationFault(String value) {
        return new JAXBElement<String>(_AuthorizationFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmprestimoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "emprestimoRequest")
    public JAXBElement<EmprestimoRequest> createEmprestimoRequest(EmprestimoRequest value) {
        return new JAXBElement<EmprestimoRequest>(_EmprestimoRequest_QNAME, EmprestimoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmprestimoRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "emprestimoRequestResponse")
    public JAXBElement<EmprestimoRequestResponse> createEmprestimoRequestResponse(EmprestimoRequestResponse value) {
        return new JAXBElement<EmprestimoRequestResponse>(_EmprestimoRequestResponse_QNAME, EmprestimoRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "filter")
    public JAXBElement<Filter> createFilter(Filter value) {
        return new JAXBElement<Filter>(_Filter_QNAME, Filter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "filterList")
    public JAXBElement<FilterList> createFilterList(FilterList value) {
        return new JAXBElement<FilterList>(_FilterList_QNAME, FilterList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "loan")
    public JAXBElement<Loan> createLoan(Loan value) {
        return new JAXBElement<Loan>(_Loan_QNAME, Loan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "loanList")
    public JAXBElement<LoanList> createLoanList(LoanList value) {
        return new JAXBElement<LoanList>(_LoanList_QNAME, LoanList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

}
