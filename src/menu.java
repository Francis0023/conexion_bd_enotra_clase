import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {
    JPanel forma1;
    private JButton conectarALaBaseButton;
    private JLabel mensaje1;

    public menu() {
        conectarALaBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Nombre de la clase de la conexion
                conexionbd miconexion=new conexionbd();
                // Conexion con la base de datos
                miconexion.conexionlocaL("jdbc:mysql://localhost:3306/estudiantes","root","");
                //
                mensaje1.setText(miconexion.getMensaje());
            }

        });

    }
}
