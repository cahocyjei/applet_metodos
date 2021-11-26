import javax.swing.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletMetodo extends Applet {

    public void init() {
        setLayout(null);
        setSize(600,700);
        Contenedor contenedor= new Contenedor();
        contenedor.setBounds(50,50,500,600);
        add(contenedor);
    }

    private class Contenedor extends JMenuBar implements ActionListener {

        private JTextField tnCuenta,tnCliente,tsCuenta;
        private JTextArea pantalla;
        public Contenedor(){
        setLayout(null);

        Cliente cliente= new Cliente("Esteban","Echevarría");
        Cuenta cuenta= new Cuenta();
        cuenta.setTitular(cliente);
        cuenta.setSaldo(50000);

        //
        JLabel lnCuent=new JLabel("Número de Cuenta");
        lnCuent.setBounds(5,10,150,20);
        add(lnCuent);
        //
        tnCuenta=new JTextField(String.valueOf(cuenta.getNumeroCuenta()));
        tnCuenta.setBounds(5,35,150,20);
        add(tnCuenta);
        //
        JLabel lnCliente= new JLabel("Nombre Cliente");
        lnCliente.setBounds(5,60,150,20);
        add(lnCliente);
        //
        tnCliente= new JTextField();
        tnCliente.setText(cuenta.getTitular().getNombre() + " " + cuenta.getTitular().getApellido());
        tnCliente.setBounds(5,85,300,20);
        add(tnCliente);
        //
        JLabel lsCuenta= new JLabel("Saldo Cuenta");
        lsCuenta.setBounds(5,110,150,20);
        add(lsCuenta);
        //
        tsCuenta= new JTextField();
        tsCuenta.setText(String.valueOf(cuenta.getSaldo()));
        tsCuenta.setBounds(5,135,150,20);
        add(tsCuenta);
        //
        JButton despliegue= new JButton("Despliegue Cuenta");
        despliegue.setBounds(150,200,150,20);
        despliegue.addActionListener(this);
        add(despliegue);
        //
        pantalla= new JTextArea(10,15);
        pantalla.setLineWrap(true);
        JScrollPane scrollP= new JScrollPane(pantalla,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollP.setBounds(190,290,300,150);
        add(scrollP);

        JLabel resultado= new JLabel("Resultado");
        resultado.setBounds(100,340,150,20);
        add(resultado);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            pantalla.append(tnCliente.getText() + " " + tnCuenta.getText() + "   $ "
                    + tsCuenta.getText());
        }
    }
}