package org.subbu.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.io.ClassPathResource;

import java.net.MalformedURLException;

@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws MalformedURLException {


        Object[] sources = {Application.class, new ClassPathResource("groovy/ExampleSurgicalDebugFilterBean.groovy")};
        SpringApplication.run(sources, args);

    }

}
