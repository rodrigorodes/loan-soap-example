package pt.axians.loan.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 JAX-B
A classe acima contém as seguintes anotações:
@XmlRootElement : o nome do elemento XML raiz é derivado do nome da classe e também podemos especificar o nome do elemento raiz do XML usando seu atributo name
@XmlType : define a ordem em que os campos são escritos no arquivo XML
@XmlElement : define o nome real do elemento XML que será usado
@XmlAttribute : define se o campo id é mapeado como um atributo em vez de um elemento
@XmlTransient : anota os campos que não queremos que sejam incluídos no XML

 * @author rodrigo.mendes-silva
 *
 */


// Especificação JAX-B 
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
