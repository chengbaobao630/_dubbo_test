package cc.home;

import cc.home.exporter.TestExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Created by cheng on 2017/2/10 0010.
 */
@Configuration
public class MyExporterConfig {


    @Bean("remoteService")
    public HttpInvokerProxyFactoryBean invokerServiceExporter(){
        HttpInvokerProxyFactoryBean factoryBean=new HttpInvokerProxyFactoryBean();
        factoryBean.setServiceInterface(TestExporter.class);
        factoryBean.setServiceUrl("http://localhost:7022/cc.home.exporter1");
        return factoryBean;
    }
}
