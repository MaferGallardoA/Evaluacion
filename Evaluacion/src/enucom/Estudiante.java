package enucom;

	public class Estudiante extends Persona {
	    private String carrera;

	    // Constructor
	    public Estudiante(int id, String nombre, int edad, String carrera) {
	        super(id, nombre, edad);
	        this.carrera = carrera;
	    }

	    // Getter y Setter
	    public String getCarrera() {
	        return carrera;
	    }

	    public void setCarrera(String carrera) {
	        this.carrera = carrera;
	    }

	    // Sobrescripcion de l metodo para imprimir datos completos
	    @Override
	    public void imprimirDatos() {
	        super.imprimirDatos();
	        System.out.println("Carrera: " + carrera);
	    }
	}

