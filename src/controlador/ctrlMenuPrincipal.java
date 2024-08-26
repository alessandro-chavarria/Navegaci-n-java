package controlador;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.amarillo;
import vista.frmMenuPrincipal;
import vista.rojo;
import vista.verde;

public class ctrlMenuPrincipal implements MouseListener{
    
       
    //1- Mandar a llamar a las demas capas
    frmMenuPrincipal vista;
    
    //2- Constructor
    public ctrlMenuPrincipal(frmMenuPrincipal Vista){
        this.vista = Vista;
        
        vista.btnAmarillo.addMouseListener(this);
        vista.btnVerde.addMouseListener(this);
        vista.btnRojo.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
 
        if(e.getSource() == vista.btnVerde){
            //1- Creo un objeto del panel que quiero mostrar
            verde objVerde = new verde();
            
            //2- Limpio el panel contenedor (por si acaso)
            vista.jpContenedor.removeAll();
            
            //3- Muestro el panel que quiero
            vista.jpContenedor.add(objVerde);
            
            //4- Refrescar todo
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        if(e.getSource() == vista.btnAmarillo){
            amarillo objAmarillo = new amarillo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objAmarillo);
            
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        if(e.getSource() == vista.btnRojo){
            rojo objRojo = new rojo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objRojo);
            
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
