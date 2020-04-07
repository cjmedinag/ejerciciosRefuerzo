package co.com.sofka.app.cuenta;

public class Cuenta {
    private final String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double ingresarDineroCuenta(double cantidad){
        if(cantidad >= 0){
            this.cantidad = this.cantidad + cantidad;
        }
        return this.cantidad;
    }

    public double retirarDineroCuenta(double cantidad){
        if(this.cantidad - cantidad <= 0 ){
            this.cantidad = 0;
            return  this.cantidad;
        }else {
            this.cantidad = this.cantidad - cantidad;
            return  this.cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
