package data;

public class CuentaBancaria {
	

	    private static String nombreBanco = "Banco Estudiantil";
	    private static int totalCuentasCreadas = 0;

	   
	    private String numeroCuenta;
	    private String titular;
	    private double saldo;

	    
	    public CuentaBancaria(String numeroCuenta, String titular,
	            double saldoInicial) {

	        this.numeroCuenta = numeroCuenta;

	        if (titular.equals("")) {
	            this.titular = "Sin nombre";
	        } else {
	            this.titular = titular;
	        }

	        if (saldoInicial < 0) {
	            this.saldo = 0;
	        } else {
	            this.saldo = saldoInicial;
	        }

	        totalCuentasCreadas = totalCuentasCreadas + 1;
	    }

	    
	    public void depositar(double monto) {

	        if (monto > 0) {

	            
	            double bonificacion = 0;

	            
	            if (monto >= 500) {
	                bonificacion = 10;

	                System.out.println("Se agregó una bonificación de $10");
	            }

	            saldo = saldo + monto + bonificacion;

	            System.out.println("Depósito realizado correctamente");

	        } else {
	            System.out.println("El monto del depósito no es válido");
	        }
	    }

	    public boolean retirar(double monto) {

	        double comision = 1;

	        if (monto <= 0) {
	            System.out.println("El monto del retiro no es válido");
	            return false;
	        }

	        if (monto + comision <= saldo) {
	            saldo = saldo - monto - comision;

	            System.out.println("Retiro realizado correctamente");
	            System.out.println("Comisión cobrada: $1");

	            return true;
	        } else {
	            System.out.println("Fondos insuficientes");
	            return false;
	        }
	    }

	    public String getNumeroCuenta() {
	        return numeroCuenta;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public static String getNombreBanco() {
	        return nombreBanco;
	    }

	    public static int getTotalCuentas() {
	        return totalCuentasCreadas;
	    }

	    public void setTitular(String titular) {

	        if (!titular.equals("")) {
	            this.titular = titular;
	        } else {
	            System.out.println("El nombre del titular no puede estar vacío");
	        }
	    }
	}


