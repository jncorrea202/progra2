package data;

public class Principal {


	    public static void main(String[] args) {

	        CuentaBancaria cuenta1 = new CuentaBancaria("001","Juanito Lopez",1000);

	        CuentaBancaria cuenta2 = new CuentaBancaria("002","Marriana Monteros",300);

	        System.out.println("Banco: " + CuentaBancaria.getNombreBanco());

	        System.out.println();

	        System.out.println("OPERACIONES DE LA CUENTA 1");

	        cuenta1.depositar(500);
	        cuenta1.retirar(200);

	        System.out.println();

	        System.out.println("OPERACIONES DE LA CUENTA 2");

	        cuenta2.depositar(100);
	        cuenta2.retirar(500);

	        System.out.println();

	        System.out.println("DATOS DE LA CUENTA 1");
	        System.out.println("Número: "
	                + cuenta1.getNumeroCuenta());
	        System.out.println("Titular: "
	                + cuenta1.getTitular());
	        System.out.println("Saldo: $"
	                + cuenta1.getSaldo());

	        System.out.println();

	        System.out.println("DATOS DE LA CUENTA 2");
	        System.out.println("Número: " + cuenta2.getNumeroCuenta());
	        System.out.println("Titular: "+ cuenta2.getTitular());
	        System.out.println("Saldo: $" + cuenta2.getSaldo());

	        System.out.println();

	        System.out.println("Total de cuentas creadas: " + CuentaBancaria.getTotalCuentas());
	    }
	}

