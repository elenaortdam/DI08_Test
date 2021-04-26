/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Elena Ortiz
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.pruebaCapacidad();
    }

    public double pruebaIntegracion() {
        Calculando c = new Calculando();
        return c.divide(2, 1);
    }

    public double pruebaRecuperacionEntradaString(String numero1, String numero2) throws IllegalArgumentException {

        if (numero1 == null | numero2 == null) {
            throw new IllegalArgumentException("Los números no pueden ser nulos");
        }

        if (numero1.isEmpty() | numero2.isEmpty()) {
            throw new IllegalArgumentException("Los números no pueden ser estar vacíos");
        }

        Calculando c = new Calculando();
        Double resultado = 0d;
        try {
            resultado = c.add(Double.valueOf(numero1), Double.valueOf(numero2));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Solo se admiten números");
        }
        return resultado;
    }

    public void pruebaCapacidad() {
        double min = 0;
        double max = 1000;
        double minimoAleatorio = getRandomNumber(min, max);
        double maximoAleatorio = getRandomNumber(min, max);

        Calculando c = new Calculando();
        for (int i = 0; i< 150000 ; i++) {
            System.out.println("-------------- Vuelta: " + i + " -------------------------------------");
            c.add(minimoAleatorio, maximoAleatorio);
            c.subtract(minimoAleatorio, maximoAleatorio);
            c.multiply(minimoAleatorio, maximoAleatorio);
            c.divide(minimoAleatorio, maximoAleatorio);
        }
    }

    private double getRandomNumber(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }
}
