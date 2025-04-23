package br.dev.carlos.tabuadaa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.carlos.tabuadaa.model.Tabuada;

public class TelaTabuada {
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;
	
	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
	public void criarTelaTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(270, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		// Vamos criar os componentes da tela.
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 155, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);
		
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mín. multiplicador: ");
		labelMinMultiplicador.setBounds( 20, 60, 155, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máx. multiplicador: ");
		labelMaxMultiplicador.setBounds( 20, 100, 155, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);
		
		//botões de tela
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds( 20, 135, 95, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(135, 135, 95, 30);
		
		//Criar um objeto scroll
		
		listTabuada = new JList();
				
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 175, 210, 400);
		
		//Obtemos o painel de conteudo e adicionamos o labelMultiplicando nesse painel.
	    tela.getContentPane().add(labelMultiplicando);
	    tela.getContentPane().add(textMultiplicando);
	    tela.getContentPane().add(labelMinMultiplicador);
	    tela.getContentPane().add(textMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
	    tela.getContentPane().add(textMaxMultiplicador);
	    tela.getContentPane().add(buttonCalcular);
	    tela.getContentPane().add(buttonLimpar);
	    tela.getContentPane().add(scrollTabuada);
		
	    //Adicionar ouvintes de eventos aos botões
	    buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada =  new Tabuada();
				
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultipilicando(multiplicandoDouble);
				
				String minMultiplicador = textMinMultiplicador.getText();
				Double minMultiplicadorDouble = Double.valueOf(minMultiplicador);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				
				String maxMultiplicador = textMaxMultiplicador.getText();
				double maxMultiplicadorDouble = Double.valueOf(maxMultiplicador);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				
				String [] tabuadaResultado = tabuada.mostrarTabuada();
				
				listTabuada.setListData(tabuadaResultado);
				
				
			}
		});
	    
	    buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		 textMaxMultiplicador.setText(null);
		 textMinMultiplicador.setText(null);
		 textMultiplicando.setText(null);
		 
		 listTabuada.setListData(new String[0]);
		 
		 textMultiplicando.requestFocus();

			}
		});
		
		// Essa linha deve ser a última linha desse método.
		tela.setVisible(true);
		
	}
	
}
