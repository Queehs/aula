package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	JTextField txtVisor = new JTextField();
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	
	JButton btnSeta = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnNegate = new JButton("±");
	JButton btnRaiz = new JButton("RQ");
	
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDiv = new JButton("/");
	JButton btnPorc = new JButton("%");
	
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btn1x = new JButton("1/x");
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnSub = new JButton("-");
	JButton btnIgual = new JButton("=");
	
	JButton btn0 = new JButton("0");
	JButton btnVir = new JButton(",");
	JButton btnAdi = new JButton("+");
	
	double valor, valor2, total;
	String op;

	public Calculadora(){
		super ("Calculadora"); 						//Determina o rótulo na janela
		
		Container paine = this.getContentPane(); 	//Classe responsável pela fixação dos itens da tela
		paine.setLayout(null); 						// Define o posicionamente dos objetos na tela
		paine.add(txtVisor);
		txtVisor.setBounds(20, 20, 320, 40);
		
		paine.add(btnMC);
		btnMC.setBounds(30, 80, 55, 55);
		paine.add(btnMR);
		btnMR.setBounds(90, 80, 55, 55);
		paine.add(btnMS);
		btnMS.setBounds(150, 80, 55, 55);
		paine.add(btnMais);
		btnMais.setBounds(210, 80, 55, 55);
		paine.add(btnMenos);
		btnMenos.setBounds(270, 80, 55, 55);
		
		paine.add(btnSeta);
		btnSeta.setBounds(30, 140, 55, 55);
		paine.add(btnCE);
		btnCE.setBounds(90, 140, 55, 55);
		paine.add(btnC);
		btnC.setBounds(150, 140, 55, 55);
		btnC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(null);
			}
		});
		paine.add(btnNegate);
		btnNegate.setBounds(210, 140, 55, 55);
		btnNegate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "-");
			}
		});
		paine.add(btnRaiz);
		btnRaiz.setBounds(270, 140, 55, 55);
		
		paine.add(btn7);
		btn7.setBounds(30, 200, 55, 55);
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		paine.add(btn8);
		btn8.setBounds(90, 200, 55, 55);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		paine.add(btn9);
		btn9.setBounds(150, 200, 55, 55);
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		paine.add(btnDiv);
		btnDiv.setBounds(210, 200, 55, 55);
		btnDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				op = "div";
			}
		});
		paine.add(btnPorc);
		btnPorc.setBounds(270, 200, 55, 55);
		
		paine.add(btn4);
		btn4.setBounds(30, 260, 55, 55);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		paine.add(btn5);
		btn5.setBounds(90, 260, 55, 55);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		paine.add(btn6);
		btn6.setBounds(150, 260, 55, 55);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		paine.add(btnMult);
		btnMult.setBounds(210, 260, 55, 55);
		btnMult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(null);
				op = "multi";
			}
		});
		paine.add(btn1x);
		btn1x.setBounds(270, 260, 55, 55);
		
		paine.add(btn1);
		btn1.setBounds(30, 320, 55, 55);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		paine.add(btn2);
		btn2.setBounds(90, 320, 55, 55);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		paine.add(btn3);
		btn3.setBounds(150, 320, 55, 55);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		paine.add(btnSub);
		btnSub.setBounds(210, 320, 55, 55);
		btnSub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(null);
				op = "sub";
			}
		});
		paine.add(btnIgual);
		btnIgual.setBounds(270, 320, 55, 115);
		btnIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Calculos calc = new Calculos();
				if(op.equals("soma")){
					valor2 = Double.parseDouble(txtVisor.getText());
					total = calc.soma(valor, valor2);
				}else if (op.equals("sub")){
					valor2 = Double.parseDouble(txtVisor.getText());
					total = calc.subtracao(valor, valor2);
				}else if (op.equals("multi")){
					valor2 = Double.parseDouble(txtVisor.getText());
					total = calc.multiplicacao(valor, valor2);
				}else if (op.equals("div")){
					valor2 = Double.parseDouble(txtVisor.getText());
					total = calc.divisao(valor, valor2);
				}
				
				txtVisor.setText(null);
				txtVisor.setText(String.valueOf(total));
			}
		});
		
		paine.add(btn0);
		btn0.setBounds(30, 380, 115, 55);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		paine.add(btnVir);
		btnVir.setBounds(150, 380, 55, 55);
		/*btnVir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + ",");
			}
		});*/
		paine.add(btnAdi);
		btnAdi.setBounds(210, 380, 55, 55);
		btnAdi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(null);
				op = "soma";
			}
		});
		
		this.setVisible(true); 							//Dertermina se vai ficar visível para o usuário
		this.setSize(370, 480); 						// Determina o tamanho da janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main (String args[]){
		
		Calculadora calc = new Calculadora();
		Calculos a = new Calculos();
		
		
		
		
		
	}
	
}
