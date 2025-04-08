package enucom;
import java.util.ArrayList;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        List<Estudiante> estudiantes = new ArrayList<>();

	        estudiantes.add(new Estudiante(1, "Ana", 19, "Ingeniería"));
	        estudiantes.add(new Estudiante(2, "Luis", 21, "Derecho"));
	        estudiantes.add(new Estudiante(3, "Carlos", 22, "Medicina"));
	        estudiantes.add(new Estudiante(4, "Sofía", 20, "Arquitectura"));
	        estudiantes.add(new Estudiante(5, "Diego", 23, "Informática"));

	        System.out.println("Estudiantes mayores de 20 años:");
	        for (Estudiante e : estudiantes) {
	            if (e.getEdad() > 20) {
	                e.imprimirDatos();
	                System.out.println(); 
	            }
	        }
	    }
	}


