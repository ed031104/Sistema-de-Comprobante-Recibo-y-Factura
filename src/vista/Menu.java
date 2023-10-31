
package vista;

import controlador.menuController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.ParseException;

public class Menu extends javax.swing.JFrame {

   
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Opcmenu1 = new javax.swing.JMenuItem();
        background = new Estilos_panel.jpanelEsquinasRedondas();
        menu = new Estilos_panel.jpanelEsquinasRedondas();
        bgPrincipal = new Estilos_panel.jpanelEsquinasRedondas();
        btnComprobantePago = new javax.swing.JButton();
        bgPrincipal1 = new Estilos_panel.jpanelEsquinasRedondas();
        btnComprobanteDiario = new javax.swing.JButton();
        bgPrincipal2 = new Estilos_panel.jpanelEsquinasRedondas();
        btnReciboCaja = new javax.swing.JButton();
        bgPrincipal3 = new Estilos_panel.jpanelEsquinasRedondas();
        btnReciboDebito = new javax.swing.JButton();
        bgPrincipal4 = new Estilos_panel.jpanelEsquinasRedondas();
        btnReciboCredito = new javax.swing.JButton();
        bgPrincipal5 = new Estilos_panel.jpanelEsquinasRedondas();
        btnComprobanteCajaChica = new javax.swing.JButton();
        bgPrincipal6 = new Estilos_panel.jpanelEsquinasRedondas();
        btnFacturaContado = new javax.swing.JButton();
        bgPrincipal7 = new Estilos_panel.jpanelEsquinasRedondas();
        btnFacturaCredito = new javax.swing.JButton();
        bgPrincipal8 = new Estilos_panel.jpanelEsquinasRedondas();
        btnArqueoCaja = new javax.swing.JButton();
        bgPrincipal9 = new Estilos_panel.jpanelEsquinasRedondas();
        btnCheque = new javax.swing.JButton();
        bgPrincipal10 = new Estilos_panel.jpanelEsquinasRedondas();
        btnConciliacionBancaria = new javax.swing.JButton();
        content = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        brnMenu = new javax.swing.JButton();
        panelFoto = new Estilos_panel.jPanelRedondo();
        txtNombre = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();

        popupMenu.setBackground(new java.awt.Color(255, 255, 255));

        Opcmenu1.setBackground(new java.awt.Color(255, 255, 255));
        Opcmenu1.setText("salir");
        popupMenu.add(Opcmenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1400, 693));
        setSize(new java.awt.Dimension(1200, 550));

        background.setBackground(new java.awt.Color(242, 242, 242));

        menu.setBackground(new java.awt.Color(51, 51, 51));

        bgPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        btnComprobantePago.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnComprobantePago.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobantePago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pago-30.png"))); // NOI18N
        btnComprobantePago.setBorder(null);
        btnComprobantePago.setBorderPainted(false);
        btnComprobantePago.setContentAreaFilled(false);
        btnComprobantePago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprobantePago.setDefaultCapable(false);
        btnComprobantePago.setFocusPainted(false);
        btnComprobantePago.setFocusable(false);
        btnComprobantePago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprobantePago.setIconTextGap(0);
        btnComprobantePago.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnComprobantePago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprobantePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprobantePagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprobantePagoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipalLayout = new javax.swing.GroupLayout(bgPrincipal);
        bgPrincipal.setLayout(bgPrincipalLayout);
        bgPrincipalLayout.setHorizontalGroup(
            bgPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprobantePago, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipalLayout.setVerticalGroup(
            bgPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipalLayout.createSequentialGroup()
                .addComponent(btnComprobantePago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal1.setBackground(new java.awt.Color(51, 51, 51));

        btnComprobanteDiario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnComprobanteDiario.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobanteDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-diario-30.png"))); // NOI18N
        btnComprobanteDiario.setBorder(null);
        btnComprobanteDiario.setBorderPainted(false);
        btnComprobanteDiario.setContentAreaFilled(false);
        btnComprobanteDiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprobanteDiario.setDefaultCapable(false);
        btnComprobanteDiario.setFocusPainted(false);
        btnComprobanteDiario.setFocusable(false);
        btnComprobanteDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprobanteDiario.setIconTextGap(0);
        btnComprobanteDiario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnComprobanteDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprobanteDiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprobanteDiarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprobanteDiarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal1Layout = new javax.swing.GroupLayout(bgPrincipal1);
        bgPrincipal1.setLayout(bgPrincipal1Layout);
        bgPrincipal1Layout.setHorizontalGroup(
            bgPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprobanteDiario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal1Layout.setVerticalGroup(
            bgPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal1Layout.createSequentialGroup()
                .addComponent(btnComprobanteDiario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal2.setBackground(new java.awt.Color(51, 51, 51));

        btnReciboCaja.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnReciboCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnReciboCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caja-30.png"))); // NOI18N
        btnReciboCaja.setBorder(null);
        btnReciboCaja.setBorderPainted(false);
        btnReciboCaja.setContentAreaFilled(false);
        btnReciboCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReciboCaja.setDefaultCapable(false);
        btnReciboCaja.setFocusPainted(false);
        btnReciboCaja.setFocusable(false);
        btnReciboCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReciboCaja.setIconTextGap(0);
        btnReciboCaja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnReciboCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReciboCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReciboCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReciboCajaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal2Layout = new javax.swing.GroupLayout(bgPrincipal2);
        bgPrincipal2.setLayout(bgPrincipal2Layout);
        bgPrincipal2Layout.setHorizontalGroup(
            bgPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReciboCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal2Layout.setVerticalGroup(
            bgPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal2Layout.createSequentialGroup()
                .addComponent(btnReciboCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal3.setBackground(new java.awt.Color(51, 51, 51));

        btnReciboDebito.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnReciboDebito.setForeground(new java.awt.Color(255, 255, 255));
        btnReciboDebito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-compre-con-tarjeta-30.png"))); // NOI18N
        btnReciboDebito.setBorder(null);
        btnReciboDebito.setBorderPainted(false);
        btnReciboDebito.setContentAreaFilled(false);
        btnReciboDebito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReciboDebito.setDefaultCapable(false);
        btnReciboDebito.setFocusPainted(false);
        btnReciboDebito.setFocusable(false);
        btnReciboDebito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReciboDebito.setIconTextGap(0);
        btnReciboDebito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnReciboDebito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReciboDebito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReciboDebitoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReciboDebitoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal3Layout = new javax.swing.GroupLayout(bgPrincipal3);
        bgPrincipal3.setLayout(bgPrincipal3Layout);
        bgPrincipal3Layout.setHorizontalGroup(
            bgPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReciboDebito, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal3Layout.setVerticalGroup(
            bgPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal3Layout.createSequentialGroup()
                .addComponent(btnReciboDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal4.setBackground(new java.awt.Color(51, 51, 51));

        btnReciboCredito.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnReciboCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnReciboCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-efectivo-30.png"))); // NOI18N
        btnReciboCredito.setBorder(null);
        btnReciboCredito.setBorderPainted(false);
        btnReciboCredito.setContentAreaFilled(false);
        btnReciboCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReciboCredito.setDefaultCapable(false);
        btnReciboCredito.setFocusPainted(false);
        btnReciboCredito.setFocusable(false);
        btnReciboCredito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReciboCredito.setIconTextGap(0);
        btnReciboCredito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnReciboCredito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReciboCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReciboCreditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReciboCreditoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal4Layout = new javax.swing.GroupLayout(bgPrincipal4);
        bgPrincipal4.setLayout(bgPrincipal4Layout);
        bgPrincipal4Layout.setHorizontalGroup(
            bgPrincipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReciboCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal4Layout.setVerticalGroup(
            bgPrincipal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal4Layout.createSequentialGroup()
                .addComponent(btnReciboCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal5.setBackground(new java.awt.Color(51, 51, 51));

        btnComprobanteCajaChica.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnComprobanteCajaChica.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobanteCajaChica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caja-registradora-30.png"))); // NOI18N
        btnComprobanteCajaChica.setBorder(null);
        btnComprobanteCajaChica.setBorderPainted(false);
        btnComprobanteCajaChica.setContentAreaFilled(false);
        btnComprobanteCajaChica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprobanteCajaChica.setDefaultCapable(false);
        btnComprobanteCajaChica.setFocusPainted(false);
        btnComprobanteCajaChica.setFocusable(false);
        btnComprobanteCajaChica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprobanteCajaChica.setIconTextGap(0);
        btnComprobanteCajaChica.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnComprobanteCajaChica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprobanteCajaChica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprobanteCajaChicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprobanteCajaChicaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal5Layout = new javax.swing.GroupLayout(bgPrincipal5);
        bgPrincipal5.setLayout(bgPrincipal5Layout);
        bgPrincipal5Layout.setHorizontalGroup(
            bgPrincipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprobanteCajaChica, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal5Layout.setVerticalGroup(
            bgPrincipal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal5Layout.createSequentialGroup()
                .addComponent(btnComprobanteCajaChica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal6.setBackground(new java.awt.Color(51, 51, 51));

        btnFacturaContado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnFacturaContado.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturaContado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-recibo-aprobado-30 (1).png"))); // NOI18N
        btnFacturaContado.setBorder(null);
        btnFacturaContado.setBorderPainted(false);
        btnFacturaContado.setContentAreaFilled(false);
        btnFacturaContado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturaContado.setDefaultCapable(false);
        btnFacturaContado.setFocusPainted(false);
        btnFacturaContado.setFocusable(false);
        btnFacturaContado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturaContado.setIconTextGap(0);
        btnFacturaContado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnFacturaContado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFacturaContado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturaContadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturaContadoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal6Layout = new javax.swing.GroupLayout(bgPrincipal6);
        bgPrincipal6.setLayout(bgPrincipal6Layout);
        bgPrincipal6Layout.setHorizontalGroup(
            bgPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFacturaContado, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal6Layout.setVerticalGroup(
            bgPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal6Layout.createSequentialGroup()
                .addComponent(btnFacturaContado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal7.setBackground(new java.awt.Color(51, 51, 51));

        btnFacturaCredito.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnFacturaCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturaCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-factura-30.png"))); // NOI18N
        btnFacturaCredito.setBorder(null);
        btnFacturaCredito.setBorderPainted(false);
        btnFacturaCredito.setContentAreaFilled(false);
        btnFacturaCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturaCredito.setDefaultCapable(false);
        btnFacturaCredito.setFocusPainted(false);
        btnFacturaCredito.setFocusable(false);
        btnFacturaCredito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturaCredito.setIconTextGap(0);
        btnFacturaCredito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnFacturaCredito.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFacturaCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturaCreditoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturaCreditoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal7Layout = new javax.swing.GroupLayout(bgPrincipal7);
        bgPrincipal7.setLayout(bgPrincipal7Layout);
        bgPrincipal7Layout.setHorizontalGroup(
            bgPrincipal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFacturaCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal7Layout.setVerticalGroup(
            bgPrincipal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal7Layout.createSequentialGroup()
                .addComponent(btnFacturaCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal8.setBackground(new java.awt.Color(51, 51, 51));

        btnArqueoCaja.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnArqueoCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnArqueoCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-vieja-caja-registradora-30.png"))); // NOI18N
        btnArqueoCaja.setBorder(null);
        btnArqueoCaja.setBorderPainted(false);
        btnArqueoCaja.setContentAreaFilled(false);
        btnArqueoCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArqueoCaja.setDefaultCapable(false);
        btnArqueoCaja.setFocusPainted(false);
        btnArqueoCaja.setFocusable(false);
        btnArqueoCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArqueoCaja.setIconTextGap(0);
        btnArqueoCaja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnArqueoCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnArqueoCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnArqueoCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnArqueoCajaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal8Layout = new javax.swing.GroupLayout(bgPrincipal8);
        bgPrincipal8.setLayout(bgPrincipal8Layout);
        bgPrincipal8Layout.setHorizontalGroup(
            bgPrincipal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnArqueoCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal8Layout.setVerticalGroup(
            bgPrincipal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal8Layout.createSequentialGroup()
                .addComponent(btnArqueoCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal9.setBackground(new java.awt.Color(51, 51, 51));

        btnCheque.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCheque.setForeground(new java.awt.Color(255, 255, 255));
        btnCheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-chequera-30.png"))); // NOI18N
        btnCheque.setBorder(null);
        btnCheque.setBorderPainted(false);
        btnCheque.setContentAreaFilled(false);
        btnCheque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheque.setDefaultCapable(false);
        btnCheque.setFocusPainted(false);
        btnCheque.setFocusable(false);
        btnCheque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheque.setIconTextGap(0);
        btnCheque.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCheque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCheque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChequeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChequeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal9Layout = new javax.swing.GroupLayout(bgPrincipal9);
        bgPrincipal9.setLayout(bgPrincipal9Layout);
        bgPrincipal9Layout.setHorizontalGroup(
            bgPrincipal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal9Layout.setVerticalGroup(
            bgPrincipal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal9Layout.createSequentialGroup()
                .addComponent(btnCheque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgPrincipal10.setBackground(new java.awt.Color(51, 51, 51));

        btnConciliacionBancaria.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnConciliacionBancaria.setForeground(new java.awt.Color(255, 255, 255));
        btnConciliacionBancaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-banco-30.png"))); // NOI18N
        btnConciliacionBancaria.setBorder(null);
        btnConciliacionBancaria.setBorderPainted(false);
        btnConciliacionBancaria.setContentAreaFilled(false);
        btnConciliacionBancaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConciliacionBancaria.setDefaultCapable(false);
        btnConciliacionBancaria.setFocusPainted(false);
        btnConciliacionBancaria.setFocusable(false);
        btnConciliacionBancaria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConciliacionBancaria.setIconTextGap(0);
        btnConciliacionBancaria.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnConciliacionBancaria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConciliacionBancaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConciliacionBancariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConciliacionBancariaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgPrincipal10Layout = new javax.swing.GroupLayout(bgPrincipal10);
        bgPrincipal10.setLayout(bgPrincipal10Layout);
        bgPrincipal10Layout.setHorizontalGroup(
            bgPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConciliacionBancaria, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bgPrincipal10Layout.setVerticalGroup(
            bgPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPrincipal10Layout.createSequentialGroup()
                .addComponent(btnConciliacionBancaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgPrincipal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgPrincipal10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(255, 255, 255));

        brnMenu.setBackground(new java.awt.Color(255, 255, 255));
        brnMenu.setFont(new java.awt.Font("sansserif", 0, 27)); // NOI18N
        brnMenu.setForeground(new java.awt.Color(51, 51, 51));
        brnMenu.setText("☰");
        brnMenu.setBorder(null);
        brnMenu.setBorderPainted(false);
        brnMenu.setContentAreaFilled(false);

        panelFoto.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNombre.setText("Nombre");

        txtCargo.setBackground(new java.awt.Color(51, 51, 51));
        txtCargo.setForeground(new java.awt.Color(153, 153, 153));
        txtCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtCargo.setText("Cargo");

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brnMenu)
                    .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                            .addComponent(txtNombre)
                            .addGap(0, 0, 0)
                            .addComponent(txtCargo))))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 537, Short.MAX_VALUE)
                        .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnComprobantePagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobantePagoMouseEntered
        bgPrincipal.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnComprobantePagoMouseEntered

    private void btnComprobantePagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobantePagoMouseExited
        bgPrincipal.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnComprobantePagoMouseExited

    private void btnComprobanteDiarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobanteDiarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprobanteDiarioMouseEntered

    private void btnComprobanteDiarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobanteDiarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprobanteDiarioMouseExited

    private void btnReciboCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboCajaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboCajaMouseEntered

    private void btnReciboCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboCajaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboCajaMouseExited

    private void btnReciboDebitoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboDebitoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboDebitoMouseEntered

    private void btnReciboDebitoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboDebitoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboDebitoMouseExited

    private void btnReciboCreditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboCreditoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboCreditoMouseEntered

    private void btnReciboCreditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboCreditoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboCreditoMouseExited

    private void btnComprobanteCajaChicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobanteCajaChicaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprobanteCajaChicaMouseEntered

    private void btnComprobanteCajaChicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobanteCajaChicaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprobanteCajaChicaMouseExited

    private void btnFacturaContadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaContadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaContadoMouseEntered

    private void btnFacturaContadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaContadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaContadoMouseExited

    private void btnFacturaCreditoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaCreditoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaCreditoMouseEntered

    private void btnFacturaCreditoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaCreditoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaCreditoMouseExited

    private void btnArqueoCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArqueoCajaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArqueoCajaMouseEntered

    private void btnArqueoCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArqueoCajaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArqueoCajaMouseExited

    private void btnChequeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChequeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChequeMouseEntered

    private void btnChequeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChequeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChequeMouseExited

    private void btnConciliacionBancariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConciliacionBancariaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConciliacionBancariaMouseEntered

    private void btnConciliacionBancariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConciliacionBancariaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConciliacionBancariaMouseExited

    
    public static void main(String[] args) throws IOException, ParseException {
        Menu vista = new Menu();
        
        //Abre el frame principal "Menu" y se inicializa sun controlador 
        menuController contorladorMenu = new menuController(vista);
        contorladorMenu.iniciar();
        vista.setVisible(true);
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Opcmenu1;
    private Estilos_panel.jpanelEsquinasRedondas background;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal1;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal10;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal2;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal3;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal4;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal5;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal6;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal7;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal8;
    public Estilos_panel.jpanelEsquinasRedondas bgPrincipal9;
    public javax.swing.JButton brnMenu;
    public javax.swing.JButton btnArqueoCaja;
    public javax.swing.JButton btnCheque;
    public javax.swing.JButton btnComprobanteCajaChica;
    public javax.swing.JButton btnComprobanteDiario;
    public javax.swing.JButton btnComprobantePago;
    public javax.swing.JButton btnConciliacionBancaria;
    public javax.swing.JButton btnFacturaContado;
    public javax.swing.JButton btnFacturaCredito;
    public javax.swing.JButton btnReciboCaja;
    public javax.swing.JButton btnReciboCredito;
    public javax.swing.JButton btnReciboDebito;
    public Estilos_panel.jpanelEsquinasRedondas content;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas menu;
    public Estilos_panel.jPanelRedondo panelFoto;
    public javax.swing.JPopupMenu popupMenu;
    public javax.swing.JLabel txtCargo;
    public javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/code.png"));
        return retValue;
    }

}
