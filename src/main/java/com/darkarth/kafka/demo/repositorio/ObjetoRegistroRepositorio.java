package com.darkarth.kafka.demo.repositorio;

import com.darkarth.kafka.demo.entidad.ObjetoRegistro;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz repositorio que implementa el CRUD de manera automática por Spring Data.
 * 
 * Spring generará un bean llamado objetoRegistroRepositorio que estará disponible 
 * para su futura injección.
 * 
 * Al momento de requerirlo, es necesario que se genere la variable bajo ese nombre.
 * 
 * @author Arturo Cuevas
 */
public interface ObjetoRegistroRepositorio extends JpaRepository<ObjetoRegistro, Long> {}