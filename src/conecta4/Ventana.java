/**
 * Esta clase se encarga de todos los compnentes de la vista o GUI de la aplicacion
 *
 */
package conecta4;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Geraldine Lopez Villaneda Neydor Avila Navarrete
 *
 */
public class Ventana extends javax.swing.JFrame {

    private Arbitro arbitro = new Arbitro();

    /**
     * Constructor de la clase Ventana()
     */
    public Ventana() {
        initComponents();
        fichaAColocar.setIcon(arbitro.getFichas().getRojo());
    }

    //Metodo que asigna el icono a la aplicacion, en la parte de la barra de tareas y en la barra superior de la ventana de la APP
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/icono.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fichaAColocar = new javax.swing.JLabel();
        fondoTablero = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnReglas = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conecta 4");
        setIconImage(getIconImage());
        setName("Conecta 4"); // NOI18N
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        fichaAColocar.setName("J1"); // NOI18N

        fondoTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tablero.png"))); // NOI18N
        fondoTablero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondoTableroMouseMoved(evt);
            }
        });
        fondoTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoTableroMouseClicked(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setRequestFocusEnabled(false);
        btnReiniciar.setRolloverEnabled(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnReglas.setText("Reglas del Juego");
        btnReglas.setToolTipText("Consiste en alinear cuatro fichas, cada jugador debe introducir una ficha en la columna \nque desee (mientras que no esté llena) y esta caerá en la posición más baja. \nGana el primero que consiga alinear cuatro fichas del mismo color ya sea en horizontal, vertical o diagonal. \nSi el tablero está lleno y ninguno ha ganado, hay empate.");
        btnReglas.setRequestFocusEnabled(false);
        btnReglas.setRolloverEnabled(false);
        btnReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fondoTablero)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fichaAColocar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnReglas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fichaAColocar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fondoTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo que registra cada movimiento del mouse para que la ficha siga al
     * puntero dentro de la ventana o JFrame
     */
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        int x = evt.getX() - 72;
        fichaAColocar.setLocation(x, 20);
        fichaAColocar.repaint();
    }//GEN-LAST:event_formMouseMoved
    /**
     * Este metodo realiza recibe una accion clickeo del mouse Realiza una serie
     * de operaciones donde determina el draw(dibujo) de cada una de las fichas
     * a jugar. Igualmente muestra los mensaje de empate o si hay un jugador que
     * ha ganado la partida, donde
     */
    private void fondoTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoTableroMouseClicked
        Fichas jugada = arbitro.colocarFicha(evt.getX(), fichaAColocar.getName());
        //If que verifica cuando se esta dando clic en una
        //columna donde esta ya se encuentra llena de fichas.
        if (jugada.getCoordenadaX() == 100) {
            return;
        }
        //condicional que verifica si hay empate a partir del metodo de la clase arbitro
        if (arbitro.empate() == true) {
            //If que determina si salir del APP o jugar otra partida a partir de la desicion del usuario
            if (JOptionPane.showConfirmDialog(null, "Empate!!!! Desea seguir jugando?", "EMPATE!", JOptionPane.YES_NO_OPTION) == 1) {
                System.exit(0);
            } else {
                arbitro = new Arbitro();
                this.repaint();
            }
        }
        //Condicional que determina si ya hay ganador a partir del metodo "arbitro.verificarGanadorJuego()" donde este
        //retorna un numero a partir de cual jugador gano, es decir, el rojo o el amarillo.
        if (arbitro.verificarGanadorJuego() != 0) {
            arbitro.dibujarConecta4Ganador(this.getGraphics());
            //If que determina si ha ganado el jugador 2 o el de la ficha amarilla
            if (!"J1".equals(fichaAColocar.getName())) {
                if (JOptionPane.showConfirmDialog(this, "Ha ganado el jugador de color amarillo!. Desea jugar otra vez?", "Felicidades!!!!", JOptionPane.YES_NO_OPTION) == 1) {
                    System.exit(0);
                } else {
                    arbitro = new Arbitro();
                    this.repaint();
                }
                //Else que determina si ha ganado el jugador 1 o el de la ficha roja
            } else {
                if (JOptionPane.showConfirmDialog(this, "Ha ganado el jugador de color rojo!. Desea jugar otra vez?", "Felicidades!!!!", JOptionPane.YES_NO_OPTION) == 1) {
                    System.exit(0);
                } else {
                    arbitro = new Arbitro();
                    this.repaint();
                }
            }
        }
        //if que determina dibujar las fichas sobre el tablero, dependiendo del jugador que tiro la ficha
        if (!"J1".equals(fichaAColocar.getName())) {
            fondoTablero.getGraphics().drawImage(arbitro.getFichas().getAmarillo().getImage(), jugada.getCoordenadaX() - 101, jugada.getCoordenadaY() - 80, null);
            fichaAColocar.setIcon(arbitro.getFichas().getRojo());
            fichaAColocar.setName("J1");
        } else {
            fondoTablero.getGraphics().drawImage(arbitro.getFichas().getRojo().getImage(), jugada.getCoordenadaX() - 101, jugada.getCoordenadaY() - 81, null);
            fichaAColocar.setIcon(arbitro.getFichas().getAmarillo());
            fichaAColocar.setName("J2");
        }
    }//GEN-LAST:event_fondoTableroMouseClicked
    /**
     * Metodo que registra cada movimiento del mouse para que la ficha siga al
     * puntero dentro del Jlabel que tiene la imagen de fondo
     */
    private void fondoTableroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoTableroMouseMoved
        int x = evt.getX() - 72;
        fichaAColocar.setLocation(x, 20);
        fichaAColocar.repaint();
    }//GEN-LAST:event_fondoTableroMouseMoved
    /**
     * Metodo que percibe la accion o pulsacion del boton de reinicio este
     * genera una nueva partida, repintando el tablero y reiniciando el arbitro
     */
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        arbitro = new Arbitro();
        this.repaint();
    }//GEN-LAST:event_btnReiniciarActionPerformed
    /**
     * Metodo que percibe la accion o pulsacion del boton las reglas este genera
     * un mensaje con las reglas del juego
     */
    private void btnReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglasActionPerformed
        JOptionPane.showMessageDialog(fichaAColocar, "Consiste en alinear cuatro fichas, cada jugador debe introducir \nuna ficha en la columna que desee (mientras que no esté llena) "
                + "y esta caerá en la posición más baja.\n "
                + "Gana el primero que consiga alinear cuatro fichas del mismo color ya sea en horizontal, vertical o diagonal. \n"
                + "Si el tablero está lleno y ninguno ha ganado, hay empate.");
    }//GEN-LAST:event_btnReglasActionPerformed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
       
    }//GEN-LAST:event_formWindowIconified

    /**
     * @param args the command line arguments
     */
    /**
     * Metodo main()
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReglas;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel fichaAColocar;
    private javax.swing.JLabel fondoTablero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
