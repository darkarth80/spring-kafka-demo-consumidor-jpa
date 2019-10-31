package com.darkarth.kafka.demo.integracion.kafka;

import java.util.Date;

import com.darkarth.kafka.demo.entidad.ObjetoRegistro;
import com.darkarth.kafka.demo.servicio.DemoServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorKafka {

    private final Logger LOGGER = LoggerFactory.getLogger(ConsumidorKafka.class);

    @Autowired
    private DemoServicio demoServicio;

    @KafkaListener(topics="security-audit-control-mx", groupId = "onPremSupport")
    public void consumir(String mensaje) {
        LOGGER.debug("Message received: \n{}", mensaje);
        demoServicio.persistir(new ObjetoRegistro(null, mensaje, "", new Date()));
    }

}