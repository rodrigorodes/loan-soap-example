
package pt.axians.loan.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pt.axians.loan.client package. 
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

    private final static QName _FilterList_QNAME = new QName("http://ws.loan.axians.pt/", "filterList");
    private final static QName _Token_QNAME = new QName("http://ws.loan.axians.pt/", "token");
    private final static QName _Filter_QNAME = new QName("http://ws.loan.axians.pt/", "filter");
    private final static QName _AuthorizationFault_QNAME = new QName("http://ws.loan.axians.pt/", "AuthorizationFault");
    private final static QName _Loan_QNAME = new QName("http://ws.loan.axians.pt/", "loan");
    private final static QName _LoanList_QNAME = new QName("http://ws.loan.axians.pt/", "loanList");
    private final static QName _LoanRequest_QNAME = new QName("http://ws.loan.axians.pt/", "loanRequest");
    private final static QName _LoanRequestResponse_QNAME = new QName("http://ws.loan.axians.pt/", "loanRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pt.axians.loan.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
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
     * Create an instance of {@link LoanRequest }
     * 
     */
    public LoanRequest createLoanRequest() {
        return new LoanRequest();
    }

    /**
     * Create an instance of {@link LoanRequestResponse }
     * 
     */
    public LoanRequestResponse createLoanRequestResponse() {
        return new LoanRequestResponse();
    }

    /**
     * Create an instance of {@link FilterList }
     * 
     */
    public FilterList createFilterList() {
        return new FilterList();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "AuthorizationFault")
    public JAXBElement<String> createAuthorizationFault(String value) {
        return new JAXBElement<String>(_AuthorizationFault_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "loanRequest")
    public JAXBElement<LoanRequest> createLoanRequest(LoanRequest value) {
        return new JAXBElement<LoanRequest>(_LoanRequest_QNAME, LoanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.loan.axians.pt/", name = "loanRequestResponse")
    public JAXBElement<LoanRequestResponse> createLoanRequestResponse(LoanRequestResponse value) {
        return new JAXBElement<LoanRequestResponse>(_LoanRequestResponse_QNAME, LoanRequestResponse.class, null, value);
    }

}
