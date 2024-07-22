package annotation.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"annotation.assignment"})
public class Myconfig {
	@Bean
	public List<String> getnames(){
		return new ArrayList<String>(Arrays.asList("abc","idn","usnd"));
	}
	@Bean
	public List<Integer> getyop(){
		return new ArrayList<Integer>(Arrays.asList(2019,223,2676));
	}
	@Bean
	public List<Double> getperc(){
		return new ArrayList<Double>(Arrays.asList(98.22,838.38,32.83));
	}
	@Bean
	public Set<Long> getphone(){
		return new LinkedHashSet<Long>(Arrays.asList(123456789L,1234567L,12345678L));
	}
}
