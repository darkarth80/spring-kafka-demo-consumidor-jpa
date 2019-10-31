package com.darkarth.kafka.demo.util;

public class MensajeUtil {

    public static String obtenApplicationId(String mensaje) {
        int firstIdx = mensaje.indexOf("applicationId=")+14;
        int lastIdx = firstIdx+6;
		return mensaje.substring(firstIdx, lastIdx);
    }

}
