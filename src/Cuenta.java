import javax.swing.*;

public class Cuenta {
    private int numeroCuenta;
    private static int id= 1001;
    private double saldo;
    private Cliente titular;

    public Cuenta() {
        numeroCuenta= id ;
        id++;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        if (saldo>=50000){
            this.saldo = saldo;
        }else{
            JOptionPane.showInputDialog("El monto minimo es de $50.000");
        }

    }
}