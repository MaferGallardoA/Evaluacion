package com.mx.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mx.Entidad.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Long>  {

}
