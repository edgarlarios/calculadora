import java.lang.Math;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame implements ActionListener {

    private JButton botonCalcular, botonSalir,num1,num2,num3,num4,num5,num6,botonBorrar;
    private JButton num7,num8,num9,num0,div,suma,multip,resta,punto,masMenos,raiz;
    private JTextField edt1,edt2;


    public calculadora(){
      //titulo de la ventana
      super("calculadora");


//simbolo de botones y tamaño
      botonCalcular = new JButton("=");
      botonCalcular.setBounds(160,220,47,40);

      botonSalir = new JButton("salir");
      botonSalir.setBounds(10,260,70,40);


       num0=new JButton("0");
       num0.setBounds(10,220,47,40);
       num1 = new JButton("1");
       num1.setBounds(10,180,47,40);
       num2 = new JButton("2");
       num2.setBounds(60,180,47,40);
       num3 = new JButton("3");
       num3.setBounds(110,180,47,40);
       num4 = new JButton("4");
       num4.setBounds(10,140,47,40);
       num5 = new JButton("5");
       num5.setBounds(60,140,47,40);
       num6 = new JButton("6");
       num6.setBounds(110,140,47,40);
       num7 = new JButton("7");
       num7.setBounds(10,100,47,40);
       num8 = new JButton("8");
       num8.setBounds(60,100,47,40);
       num9 = new JButton("9");
       num9.setBounds(110,100,47,40);
       suma = new JButton("+");
       suma.setBounds(160,180,47,40);
       resta = new JButton("-");
       resta.setBounds(110,220,47,40);
       multip = new JButton("x");
       multip.setBounds(160,140,47,40);
       div = new JButton("/");
       div.setBounds(160,100,47,40);
       botonBorrar=new JButton("C");
       botonBorrar.setBounds(160,60,47,40);
       punto=new JButton(".");
       punto.setBounds(60,220,47,40);
       masMenos=new JButton("+/-");
       masMenos.setBounds(110,60,48,40);
       raiz=new JButton("\u221A");
       raiz.setBounds(10,60,48,40);

   //linea de texto para mostrar botones presionados y resultados
       edt1 = new JTextField("");
       edt1.setBounds(10,10,200,20);
       edt2=new JTextField("");
       edt2.setBounds(10,40,200,20);

       edt1.setHorizontalAlignment(JTextField.RIGHT);
       edt1.setText("0");
       edt2.setHorizontalAlignment(JTextField.RIGHT);
       edt2.setText("0");

       //
		botonSalir.addActionListener(this);
		botonCalcular.addActionListener(this);
                num0.addActionListener(this);
                num1.addActionListener(this);
                num2.addActionListener(this);
                num3.addActionListener(this);
                num4.addActionListener(this);
		num5.addActionListener(this);
                num6.addActionListener(this);
                num7.addActionListener(this);
                num8.addActionListener(this);
                num9.addActionListener(this);
	       suma.addActionListener(this);
               resta.addActionListener(this);
               multip.addActionListener(this);
               div.addActionListener(this);
               botonBorrar.addActionListener(this);
               punto.addActionListener(this);
               masMenos.addActionListener(this);
               raiz.addActionListener(this);

      getContentPane().add(num0);
      getContentPane().add(num1);
      getContentPane().add(num2);
      getContentPane().add(num3);
      getContentPane().add(num4);
      getContentPane().add(num5);
      getContentPane().add(num6);
      getContentPane().add(num6);
      getContentPane().add(num7);
      getContentPane().add(num8);
      getContentPane().add(num9);
      getContentPane().add(suma);
      getContentPane().add(resta);
      getContentPane().add(multip);
      getContentPane().add(div);
      getContentPane().add(botonCalcular);
      getContentPane().add(botonSalir);
      getContentPane().add(edt1);
      getContentPane().add(edt2);
      getContentPane().add(masMenos);
      getContentPane().add(botonBorrar);
      getContentPane().add(punto);
      getContentPane().add(raiz);

      getContentPane().setLayout(null);
		setSize(290,350);
		setVisible(true);

	}

    String cadena;
     int sumas= 0;
     int restas=0;
     int  multiplicaciones=0;
     int divisiones=0;
     double resultado;




     public void sumas(String cadena){
         this.resultado=Double.parseDouble(cadena);
         sumas=1;
         this.cadena="";
     }
     public void restas(String cadena){
         this.resultado=Double.parseDouble(cadena);
         restas=1;
         this.cadena="";
     }
     public void multiplicaciones(String cadena){
         this.resultado=Double.parseDouble(cadena);
         multiplicaciones=1;
         this.cadena="";
     }
     public void divisiones(String cadena){
         this.resultado=Double.parseDouble(cadena);
         divisiones=1;
         this.cadena="";
     }

      public double resultado(String res){
          if(sumas==1){
              resultado=resultado + Double.parseDouble(res);
          }
          if(restas==1){
              resultado=resultado - Double.parseDouble(res);
          }
          if(multiplicaciones==1){
              resultado=resultado * Double.parseDouble(res);
          }
          if(divisiones==1){
              resultado=resultado / Double.parseDouble(res);
          }
          sumas=0;
          restas=0;
          multiplicaciones=0;
          divisiones=0;
          return resultado;
      }

	public void actionPerformed(ActionEvent calcu){

            if(calcu.getSource().equals(botonSalir)){
                System.exit(0);
            }

             if(calcu.getSource().equals(botonCalcular)){
                edt1.setText("" + resultado(edt1.getText()));
            }

            if(calcu.getSource().equals(num1)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());

            }
            if(calcu.getSource().equals(num2)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());

            }
            if(calcu.getSource().equals(num3)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num4)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num5)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num6)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num7)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num8)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num9)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());
            }
            if(calcu.getSource().equals(num0)){
                JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());

            }
            if(calcu.getSource().equals(resta)){
                JButton b = (JButton)calcu.getSource();
                restas(edt1.getText());
                edt1.setText("");


            }
             if(calcu.getSource().equals(botonBorrar)){

                 edt1.setText(null);
                 edt2.setText(null);
            }
             if(calcu.getSource().equals(punto)){

              
                     JButton b = (JButton)calcu.getSource();
                edt1.setText(edt1.getText()+ b.getText());


            }
             if(calcu.getSource().equals(masMenos)){


                resultado=Float.parseFloat(edt1.getText());
                resultado=-1*resultado;
                edt1.setText(Float.toString((float) resultado));
	 }
             if(calcu.getSource().equals(suma)){
              JButton b = (JButton)calcu.getSource();
               sumas(edt1.getText());
                edt1.setText("");

             }
          if(calcu.getSource().equals(multip)){

               JButton b = (JButton)calcu.getSource();
               multiplicaciones(edt1.getText());
                edt1.setText("");

          }
          if(calcu.getSource().equals(div)){
               JButton b = (JButton)calcu.getSource();
                divisiones(edt1.getText());
                edt1.setText("");
       }
          if(calcu.getSource().equals(raiz)){
                resultado=Float.parseFloat(edt1.getText());
                resultado=(float) Math.sqrt(resultado);
                edt1.setText(Float.toString((float) resultado));
               
            }
    }
        //EDGAR CELESTINO LARIOS AMEZCUA
    public static void main(String[] args) {
        calculadora x = new calculadora();
    }


}

  