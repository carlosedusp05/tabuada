package br.dev.carlos.tabuadaa.model;

public class Tabuada {
	
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
    public void setMultipilicando(double multiplicando){
    	this.multiplicando = multiplicando;
    }
    
    public double getMultipilicando(){
    	return multiplicando;
    }
    
    public void setMinimoMultiplicador(double minimoMultiplicador){
    	this.minimoMultiplicador = minimoMultiplicador;
    	
    }
    
    public double getMinimoMultiplicador(){
    	return minimoMultiplicador;
    }
    
    public void setMaximoMultiplicador(double maximoMultiplicador){
    	this.maximoMultiplicador = maximoMultiplicador;
    }
    
    public double getMaximoMultiploicador(){
    	return maximoMultiplicador;
    }
    
    public void mostrarTabuada() {
    	
    	while (minimoMultiplicador <= maximoMultiplicador) {
    		double produto = multiplicando * minimoMultiplicador;
    		System.out.println(multiplicando + " x " + minimoMultiplicador + " = " + produto );
    		minimoMultiplicador = minimoMultiplicador + 1;
    	}
    }
}
         
