package pt.axians.loan.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
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
