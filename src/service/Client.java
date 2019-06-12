package service;

import org.apache.axis2.AxisFault;
import service.CalculatorServiceStub;

import java.rmi.RemoteException;

public class Client{
    public static void main(String[] args) {
		System.out.println();
	calculBasique();
		System.out.println();
	version();
		System.out.println();
		divisionParZero();
    }

	private static void divisionParZero() {
		try{
			CalculatorServiceStub.Calcul calc = new CalculatorServiceStub.Calcul();
			calc.setArgs0(10);
			calc.setArgs1(0);
			CalculatorServiceStub stub = new CalculatorServiceStub("http://192.168.109.201:8080/axis2/services/Calculator/calcul");
			System.out.println(" calcul du client : " + stub.calcul(calc).get_return());
			System.out.println("fin");
		} catch (RemoteException | CalculatorServiceRemoteExceptionException e) {
			System.out.println("Division par zero");

		}

	}

	private static void version() {
		try{

			CalculatorServiceStub stub = new CalculatorServiceStub("http://192.168.109.201:8080/axis2/services/Calculator/getVersion");
			System.out.println(" version client : " + stub.getVersion(new CalculatorServiceStub.GetVersion()).get_return());
			System.out.println("fin version");

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\n\n\n");
		}
	}

	private static void calculBasique() {
		try{
			CalculatorServiceStub.Calcul calc = new CalculatorServiceStub.Calcul();
			calc.setArgs0(10);
			calc.setArgs1(2);
			CalculatorServiceStub stub = new CalculatorServiceStub("http://192.168.109.201:8080/axis2/services/Calculator/calcul");
			System.out.println(" calcul du client : " + stub.calcul(calc).get_return());
			System.out.println("fin");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("\n\n\n");
		}
	}
}