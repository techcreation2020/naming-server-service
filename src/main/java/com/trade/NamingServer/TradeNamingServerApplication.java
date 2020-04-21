package com.trade.NamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TradeNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeNamingServerApplication.class, args);
	}

}
