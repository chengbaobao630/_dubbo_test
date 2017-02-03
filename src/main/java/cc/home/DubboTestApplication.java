package cc.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource({"classpath:spring-dubbo.xml"})
//@ComponentScan(includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Service.class})})
public class DubboTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboTestApplication.class, args);
	}
}
