package com.mx.Controller;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;
	import com.mx.Entidad.Curso;
	import com.mx.Repositorio.CursoRepository;
	import java.util.List;

	@RestController
	@RequestMapping("/api/cursos")
	public class CursoController {

	    @Autowired
	    private CursoRepository cursoRepository;

	    // Crear un curso
	    @PostMapping
	    public Curso crearCurso(@RequestBody Curso curso) {
	        return cursoRepository.save(curso);
	    }

	    // Listar todos los cursos
	    @GetMapping
	    public List<Curso> listarCursos() {
	        return cursoRepository.findAll();
	    }

	    // Eliminar curso por ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> eliminarCurso(@PathVariable Long id) {
	        if (cursoRepository.existsById(id)) {
	            cursoRepository.deleteById(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	
}
