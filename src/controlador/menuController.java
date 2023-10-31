package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import vista.ArqueoCaja;
import vista.Cheque;
import vista.ComprobanteCajaChica;
import vista.ComprobanteDiario;
import vista.ComprobantePago;
import vista.FacturaContado;
import vista.FacturaCredito;
import vista.Menu;
import vista.ReciboCaja;

public class menuController implements ActionListener{

    private Menu vista; 
    ComprobanteDiario panelComprobanteDiario = new ComprobanteDiario();
    ComprobantePago panelComprobantePago = new ComprobantePago();
    Cheque panelCheque = new Cheque();
    ReciboCaja panleReciboCaja = new ReciboCaja();
    ComprobanteCajaChica panelComprobanteCajaChica = new ComprobanteCajaChica();
    ArqueoCaja panelArqueoCaja = new ArqueoCaja();
    FacturaContado panelFacturaContado = new FacturaContado();
    FacturaCredito panelFacturaCredito = new FacturaCredito();
    

    
    public menuController(Menu vista){
    this.vista = vista;
    this.vista.btnComprobantePago.addActionListener(this);
    this.vista.btnComprobanteDiario.addActionListener(this);
    this.vista.btnReciboCaja.addActionListener(this);
    this.vista.btnReciboDebito.addActionListener(this);
    this.vista.btnReciboCredito.addActionListener(this);
    this.vista.btnComprobanteCajaChica.addActionListener(this);
    this.vista.btnFacturaContado.addActionListener(this);
    this.vista.btnFacturaCredito.addActionListener(this);
    this.vista.btnArqueoCaja.addActionListener(this);
    this.vista.btnCheque.addActionListener(this);
    this.vista.btnConciliacionBancaria.addActionListener(this);
    
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setTitle("Sistema de Regsitro");
        vista.setIconImage(vista.getIconImage());
    }
    public void cambiarPanel(JPanel content,JPanel jp) {
    jp.setVisible(true); // hace visible al panel
    jp.setSize(684, 300); // da el tamaño del panel
    jp.setLocation(0, 0); // centra el panel

    content.removeAll(); // esto elimina lo que se encontraba en content
    content.setLayout(new BorderLayout()); // Establecer el LayoutManager del contenedor Content en BorderLayout
    content.add(jp, BorderLayout.CENTER); // Agregar el panel principal al centro del contenedor Content
    jp.setPreferredSize(content.getSize()); // Asegurarse de que el panel principal ocupe todo el espacio disponible

    content.revalidate(); // notifica al contenedor Content que su diseño ha cambiado y necesita ser validado.
    content.repaint(); // repinta el contenedor Content para que se muestren los cambios realizados.
     }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.btnComprobantePago){
            cambiarPanel(vista.content, panelComprobantePago);
        }
        if(e.getSource() == vista.btnComprobanteDiario){
            cambiarPanel(vista.content, panelComprobanteDiario);
        }
        if(e.getSource() == vista.btnReciboCaja){
            cambiarPanel(vista.content, panleReciboCaja);
        }
        if(e.getSource() == vista.btnReciboDebito){
          //  cambiarPanel(vista.content, panel);
        }
        if(e.getSource() == vista.btnReciboCredito){
          //  cambiarPanel(vista.content, panel);
        }
        if(e.getSource() == vista.btnComprobanteCajaChica){
            cambiarPanel(vista.content, panelComprobanteCajaChica);
        }
        if(e.getSource() == vista.btnFacturaContado){
            cambiarPanel(vista.content, panelFacturaContado);
        }
        if(e.getSource() == vista.btnFacturaCredito){
            cambiarPanel(vista.content, panelFacturaCredito);
        }
        if(e.getSource() == vista.btnArqueoCaja){
            cambiarPanel(vista.content, panelArqueoCaja);
        }
        if(e.getSource() == vista.btnCheque){
            cambiarPanel(vista.content, panelCheque);
        }
        if(e.getSource() == vista.btnConciliacionBancaria){
       //     cambiarPanel(vista.content, panel);
        }
    }
    
}
