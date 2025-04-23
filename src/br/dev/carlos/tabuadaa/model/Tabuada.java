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
    
    public String[] mostrarTabuada() {
    	
    	double tamanho = maximoMultiplicador - minimoMultiplicador + 1;
    	
    	String[] tabuada = new String[(int) tamanho];
    	
    	int indice = 0;
    	while (minimoMultiplicador <= maximoMultiplicador) {
    		double produto = multiplicando * minimoMultiplicador;
    		
    		tabuada[indice] = multiplicando + " x " + minimoMultiplicador + " = " + produto;
    		
    		minimoMultiplicador++; // operador de incremento 
    		indice++;
    		
    	}
    	
    	return tabuada;
   
    }
}
         
