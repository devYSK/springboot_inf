package com.ys.springboot;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
//@EnableConfigurationProperties(YoungsooProperties.class)
@RestController
public class SpringbootApplication {

	public static void main(String[] args) throws LifecycleException {
//
//		SpringApplication springApplication = new SpringApplication(SpringApplication.class);
//		springApplication.addListeners(new SampleListener());
//		springApplication.run(args);

		SpringApplication.run(SpringbootApplication.class, args);



	}

}
