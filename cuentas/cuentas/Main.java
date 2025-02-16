package cuentas;

import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        System.out.println("El saldo actual es " + cuenta1.estado());
        operativaCuenta(cuenta1, 2300);
    }

    /**
     * Método para realizar operaciones sobre la cuenta.
     * @param cuenta Cuenta sobre la que se opera.
     * @param cantidad Cantidad a utilizar en las operaciones.
     */
    public static void operativaCuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso. Saldo actual: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso exitoso. Saldo actual: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
