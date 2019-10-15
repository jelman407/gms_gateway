package com.kt.gms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.kt.gms.configuration.RibbonConfiguration;


@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GmsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmsGatewayApplication.class, args);
	}

}
