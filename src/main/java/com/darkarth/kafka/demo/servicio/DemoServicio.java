package com.darkarth.kafka.demo.servicio;

import java.util.List;

import com.darkarth.kafka.demo.entidad.ObjetoRegistro;
import com.darkarth.kafka.demo.repositorio.ObjetoRegistroRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase servicio para separar la lógica para la obtención de la información.
 * @author Arturo Cuevas
 */
@Service
public class DemoServicio {
    
    @Autowired //Le indicamos a Spring que queremos que injecte la instancia
    private ObjetoRegistroRepositorio objetoRegistroRepositorio;

    /**
     * Método para obtener todos los resultados de la tabla respectiva
     * @return lista Lista de {@code ObjetoRegistro}.
     */
    public List<ObjetoRegistro> obtenerRegistros() {
        return objetoRegistroRepositorio.findAll();
    }

    /**
     * Método para obtener un registro a partir de su id.
     * @param id Id del objeto a buscar.
     * @return objeto {@code ObjetoRegistro}
     */
    public ObjetoRegistro obtener(Long id) {
        return objetoRegistroRepositorio.getOne(id);
    }

    /**
     * Método para guardar en base de datos un objeto o sus cambios.
     * @param obj {@code ObjetoRegistro} a guardar.
     * @return objeto {@code ObjetoRegistro}
     */
    public ObjetoRegistro registrar(ObjetoRegistro obj) {
        return objetoRegistroRepositorio.save(obj);
    }

    /**
     * Método para persistir inmediatamente el objeto o sus cambios.
     * @param obj
     * @return objeto {@code ObjetoRegistro}
     */
    public ObjetoRegistro persistir(ObjetoRegistro obj) {
        return objetoRegistroRepositorio.saveAndFlush(obj);
    }

}