package annotation.assignment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Batch {
	@Autowired
//	@Qualifier(value = "getnames")
	private List<String> names;
	@Autowired
//	@Qualifier(value = "getyop")
	private List<Integer> yop;
	@Autowired
//	@Qualifier(value = "getperc")
	private List<Double> perc;
	@Autowired
//	@Qualifier(value = "getphone")
	private Set<Long> phone;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<Integer> getYop() {
		return yop;
	}

	public void setYop(List<Integer> yop) {
		this.yop = yop;
	}

	public List<Double> getPerc() {
		return perc;
	}

	public void setPerc(List<Double> perc) {
		this.perc = perc;
	}

	public Set<Long> getPhone() {
		return phone;
	}

	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}

}
