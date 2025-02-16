package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {}

    /**
     * Constructor con parámetros.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo actual.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o supera el saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

    /**
     * Método para realizar operaciones de cuenta.
     * @param cantidad Cantidad con la que se realizarán operaciones.
     */
    public void operativaCuenta(float cantidad) {
        try {
            retirar(cantidad);
            System.out.println("Retiro exitoso.");
        } catch (Exception e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }

        try {
            ingresar(cantidad);
            System.out.println("Ingreso exitoso.");
        } catch (Exception e) {
            System.out.println("Error al ingresar: " + e.getMessage());
        }
    }

    // Getters y setters para encapsulación

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
