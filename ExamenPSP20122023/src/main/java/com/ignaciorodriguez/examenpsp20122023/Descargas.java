package com.ignaciorodriguez.examenpsp20122023;

	public class Descargas implements Runnable {
		//para poder tomar el nombre e imprimirlo mas facilmente sin tener que implementar cosas innecesarias
	    private String nombre;
	    //para poder aumentar dependiendo del hilo
	    private int aumento;
	    //generamos el constructor
	    public Descargas(String nombre, int incremento) {
	        this.nombre = nombre;
	        this.aumento = incremento;
	    }
//establecemos el run de los hilos donde con el for de 0 a 100 imprimimos el nombre del hilo, el iterador y un porcentaje
	    public void run() {
  	
	        for (int i = 1; i <= 100; i++) {
	            System.out.println(nombre + ": " + i + "%");
	            try {
	                 Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            i += aumento - 1; 
	        }
	 //imprimimos la descarga        
	        System.out.println("La " + nombre + " se ha completado");
	    }
//creamos el main donde ejecutamos los tres hilos
	    public static void main(String[] args) {
	    	
//tambien se puede modificar los int de dentro de setPriority a  Thread.MAX_PRIORITY Thread.NORM_PRIORITY Thread.MIN_PRIORITY

	        Thread hilo1 = new Thread(new Descargas("descarga 1", 1));
	        hilo1.setPriority(5);
	        Thread hilo2 = new Thread(new Descargas("descarga 2", 2));
	        hilo2.setPriority(1);
	        Thread hilo3 = new Thread(new Descargas("descarga 3", 3));
	        hilo3.setPriority(10);
	        hilo1.start();
	        
	        hilo2.start();
	        
	        hilo3.start();
	      
	        try {
	            hilo1.join();
	            
	            hilo2.join();
	            
	            hilo3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        System.out.println("Las descargas han finalizado");
	    }
	}