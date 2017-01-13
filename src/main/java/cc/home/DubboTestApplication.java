package cc.home;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@ComponentScan(includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Service.class})})
public class DubboTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboTestApplication.class, args);
	}
}
