package com.darkarth.kafka.demo;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringKafkaDemoConsumidorJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaDemoConsumidorJpaApplication.class, args);
	}

	 @Value("app.db.port")
	 private String dbPort;

	/**
     * Start internal H2 server so we can query the DB from IDE
     *
     * @return H2 Server instance
     * @throws SQLException
     */
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", dbPort);
    }

}
