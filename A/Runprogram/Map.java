package A.Runprogram;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;


class Map extends JFrame implements ActionListener
{  
	
	// Creamos los Imageicons
	  //Atributos
    JButton mapa [][]=new JButton[3][3];
    JLabel etiq=new JLabel("Mansio",JLabel.CENTER);
    //Habitacio 1
    ImageIcon habitacion1_1=new ImageIcon("Habitacion1(biblio).png");
    ImageIcon habitacion1_Jugador=new ImageIcon("Habitacion1(biblio)(Persona).png");
    ImageIcon habitacion1_Jugador_Fantasma=new ImageIcon("Habitacion1(biblio)(Persona+Fantasma).png");
    ImageIcon habitacion1_Fantasma=new ImageIcon("??");
  //Habitacio 2
    ImageIcon habitacion2=new ImageIcon("Habitacion2.png");
    ImageIcon habitacion2_Jugador=new ImageIcon("Habitacion2(Persona).png");
    ImageIcon habitacion2_Jugador_Fantasma=new ImageIcon("Habitacion2(Persona+Fantasma).png");
    ImageIcon habitacion2_Fantasma=new ImageIcon("??");
  //Habitacio 3
    ImageIcon habitacion3_sinllave=new ImageIcon("Habitacion3(sinllave).png");
    ImageIcon habitacion3_sinllave_Jugador=new ImageIcon("??");
    ImageIcon habitacion3_sinllave_Jugador_Fantasma=new ImageIcon("Habitacion3(sinllave)(Persona+Fantasma).png");
    ImageIcon habitacion3_sinllave_Fantasma=new ImageIcon("??");
    ImageIcon habitacion3_llave=new ImageIcon("Habitacion3(conllave).png");
    ImageIcon habitacion3_llave_Jugador=new ImageIcon("Habitacion3(conllave)(Persona).png");
    ImageIcon habitacion3_llave_Jugador_Fantasma=new ImageIcon("Habitacion3(conllave)(Persona+fantasma).png");
    ImageIcon habitacion3_llave_Fantasma=new ImageIcon("??");
    ImageIcon habitacion3_sinllave_escalera=new ImageIcon("Habitacion3(sinllave+ escalera).png");
    ImageIcon habitacion3_sinllave_Jugador_escalera=new ImageIcon("Habitacion3(sinllave+ escalera)(Persona).png");
    ImageIcon habitacion3_sinllave_Jugador_Fantasma_escalera=new ImageIcon("??");
    ImageIcon habitacion3_sinllave_Fantasma_escalera=new ImageIcon("??");
  //Habitacio 4
    ImageIcon habitacion4=new ImageIcon("Habitacion4.png");
    ImageIcon habitacion4_Jugador=new ImageIcon("Habitacion4 (Persona).png");
    ImageIcon habitacion4_Jugador_Fantasma=new ImageIcon("Habitacion4 (Persona+ Fantasma).png");
    ImageIcon habitacion4_Fantasma=new ImageIcon("Habitacion4 (Fantasma).png");
  //Habitacio 5
    ImageIcon habitacion5=new ImageIcon("Habitacion5.png");
    ImageIcon habitacion5_Jugador=new ImageIcon("Habitacion5(Persona).png");
    ImageIcon habitacion5_Jugador_Fantasma=new ImageIcon("Habitacion5(Persona+ Fantasma).png");
    ImageIcon habitacion5_Fantasma=new ImageIcon("Habitacion5(Fantasma).png");
  //Habitacio 6
    ImageIcon habitacion6=new ImageIcon("Habitacion6.png");
    ImageIcon habitacion6_Jugador=new ImageIcon("Habitacion6 (Persona).png");
    ImageIcon habitacion6_Jugador_Fantasma=new ImageIcon("Habitacion6 (Persona+Fantasma).png");
    ImageIcon habitacion6_Fantasma=new ImageIcon("Habitacion6 (Fantasma).png");
  //Habitacio 7
    ImageIcon habitacion7=new ImageIcon("Habitacion7.png");
    ImageIcon habitacion7_Jugador=new ImageIcon("Habitacion7(Persona).png");
    ImageIcon habitacion7_Jugador_Fantasma=new ImageIcon("Habitacion7(Persona + Fantasma).png");
    ImageIcon habitacion7_Fantasma=new ImageIcon("Habitacion7(Fantasma).png");
  //Habitacio 8
    ImageIcon habitacion8=new ImageIcon("Habitacion8.png");
    ImageIcon habitacion8_Jugador=new ImageIcon("Habitacion8(Persona).png");
    ImageIcon habitacion8_Jugador_Fantasma=new ImageIcon("Habitacion8(Persona+ Fantasma).png");
    ImageIcon habitacion8_Fantasma=new ImageIcon("Habitacion8(Fantasma).png");
    ImageIcon habitacion8_Jugador_Salida=new ImageIcon("Habitacion8(Victory).png");
  //Habitacio 9
    ImageIcon habitacion9_escalera=new ImageIcon("Habitacion9 (escalera).png");
    ImageIcon habitacion9_Jugador_escalera=new ImageIcon("Habitacion9 (escalera)(Persona).png");
    ImageIcon habitacion9_Jugador_Fantasma_escalera=new ImageIcon("Habitacion9 (escalera)(Persona + Fantasma).png");
    ImageIcon habitacion9_Fantasma_ecalera=new ImageIcon("Habitacion9 (escalera)(Fantasma).png");
    ImageIcon habitacion9=new ImageIcon("Habitacion9.png");
    ImageIcon habitacion9_Jugador=new ImageIcon("Habitacion9 (Persona).png");
    ImageIcon habitacion9_Jugador_Fantasma=new ImageIcon("Habitacion9 (Persona + Fantasma).png");
    ImageIcon habitacion9_Fantasma=new ImageIcon("Habitacion9 (Fantasma).png");
    
    int Xo,Yo;
    int Xd,Yd;
    boolean origen=true;
    
    Map()
    {
        //    Añadir Panel de tablero
        JPanel Centro=new JPanel();
        
        // Crear jlabels afagim la variable de la imatge
        JLabel habitacio1 = new JLabel();
        habitacio1.setIcon(habitacion1_1);
        JLabel habitacio2 = new JLabel(habitacion2);
        JLabel habitacio3 = new JLabel(habitacion3_llave);
        JLabel habitacio4 = new JLabel(habitacion4);
        JLabel habitacio5 = new JLabel(habitacion5);
        JLabel habitacio6 = new JLabel(habitacion6);
        JLabel habitacio7 = new JLabel(habitacion7);
        JLabel habitacio8 = new JLabel(habitacion8);
        JLabel habitacio9 = new JLabel(habitacion9_escalera);
        
        
        // Mapa
        Centro.setLayout(new GridLayout(3,3));
        
        //Assignar possicio 
        
        Centro.add(habitacio1).setLocation(0,0);
        Centro.add(habitacio2).setLocation(0,1);
        Centro.add(habitacio3).setLocation(0,2);
        Centro.add(habitacio4).setLocation(1,0);
        Centro.add(habitacio5).setLocation(1,1);
        Centro.add(habitacio6).setLocation(1,2);
        Centro.add(habitacio7).setLocation(2,0);
        Centro.add(habitacio8).setLocation(2,1);
        Centro.add(habitacio9).setLocation(2,2);
        add(Centro, "Center");
        add(etiq,"North");
        boolean blanc=true;
        /*for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                {
            	mapa[i][j]=new JButton();
            	mapa[i][j].addActionListener(this);
                    Centro.add(mapa[i][j]);
                    if (i==0 || j==0){
                    	mapa[i][j].setIcon(habitacion1_1);
                    }
                    if (i==0 || j==1){
                    	mapa[i][j].setIcon(habitacion2);
                    }
                    if (i==0 || j==2){
                    	mapa[i][j].setIcon(habitacion3_llave);
                    }
                    if (i==1 || j==0){
                    	mapa[i][j].setIcon(habitacion4);
                    }
                    if (i==1 || j==1){
                    	mapa[i][j].setIcon(habitacion5);
                    }
                    if (i==1 || j==2){
                    	mapa[i][j].setIcon(habitacion6);
                    }
                    if (i==2 || j==0){
                    	mapa[i][j].setIcon(habitacion7);
                    }
                    if (i==2 || j==1){
                    	mapa[i][j].setIcon(habitacion8);
                    }
                    if (i==2 || j==2){
                    	mapa[i][j].setIcon(habitacion9_escalera);
                    }
                }
            blanc=!blanc;
        }
        */
       
            //Cerrar Ventana
          //  add(Centro,"Center");
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
             {
                 System.exit(0);
             }
        });
       
        setTitle("Mansio");   
        setSize(600,500);
        setResizable(false);
        setVisible(true);
    }
    @Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
                 {
                   if(arg0.getSource()==mapa[i][j])
                         {
                 	  	  if (origen) 
                         	{Xo=i;Yo=j;origen=false;}
                           else{	
                 	  
                         	  	if(mapa[i][j].getIcon()==null)
                         	  	{	Xd=i;Yd=j;
                         	  		mapa[Xd][Yd].setIcon(mapa[Xo][Yo].getIcon()); //pones tu ficha X
                         	  		mapa[Xo][Yo].setIcon(null);
                         	  		origen=true;
                         	  	}
                           	}
                         }
                 }
	}  
      public void map() { 
    	  
    	  new Map();
          }

	
        }  