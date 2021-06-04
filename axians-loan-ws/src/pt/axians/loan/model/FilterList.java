package pt.axians.loan.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FilterList {

	@XmlElement(name = "filter")
	private List<Filter> filters;

	//JAX-B precisa desse construtor
	FilterList() {
	}
	
	public FilterList(List<Filter> filters) {
		this.filters = filters;
	}

	public List<Filter> getLista() {
		return filters;
	}
	
}
