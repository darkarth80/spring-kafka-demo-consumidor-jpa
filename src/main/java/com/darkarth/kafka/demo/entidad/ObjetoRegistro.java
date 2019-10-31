package com.darkarth.kafka.demo.entidad;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase a manera de entidad para persistir y manejar los datos en una tabla.
 * 
 * @author Arturo Cuevas
 */
@Entity //Indicamos a Hibernate que esta clase representará una tabla.
@Data //Indicamos que queremos que se generen automáticamente los getters/setters
@AllArgsConstructor
public class ObjetoRegistro {

    @Id //Indicamos que el atributo es el id en la tabla.
    @GeneratedValue(strategy=GenerationType.AUTO) //Indicamos que requerimos que se genere de manera automática este valor.
    private Long id;

    private String contenido;
    private String idAplicacion;
    private Date fechaRegistro;

}