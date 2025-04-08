package enucom;

public class Persona {
	    private int id;
	    private String nombre;
	    private int edad;

	    // Constructor
	    public Persona(int id, String nombre, int edad) {
	        this.id = id;
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    // Getters y Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    // Método para imprimir datos
	    public void imprimirDatos() {
	        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
	    }
	}


