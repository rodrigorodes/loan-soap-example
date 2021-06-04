package pt.axians.loan.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 JAX-B
A classe acima cont�m as seguintes anota��es:
@XmlRootElement : o nome do elemento XML raiz � derivado do nome da classe e tamb�m podemos especificar o nome do elemento raiz do XML usando seu atributo name
@XmlType : define a ordem em que os campos s�o escritos no arquivo XML
@XmlElement : define o nome real do elemento XML que ser� usado
@XmlAttribute : define se o campo id � mapeado como um atributo em vez de um elemento
@XmlTransient : anota os campos que n�o queremos que sejam inclu�dos no XML

 * @author rodrigo.mendes-silva
 *
 */


// Especifica��o JAX-B 
@XmlRootElement
// Configurar o tipo de acesso via atributos
@XmlAccessorType(XmlAccessType.FIELD)
public class LoanList {

	@XmlElement(name = "loan", required = true)
	private List<Loan> loans = new ArrayList<Loan>();

	//JAX-B precisa desse construtor
	LoanList() {
	}

	public LoanList(List<Loan> loans) {
		this.loans = loans;
	}
	
}
