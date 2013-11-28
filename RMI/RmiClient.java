import java.rmi.*;
import java.net.*;

public class RmiClient {
	
	public static void main(String args[]) throws RemoteException, MalformedURLException {

		String url="rmi://127.0.0.1/mathServer";
		MathServer xyz = null;
		try {
			xyz = (MathServer)Naming.lookup(url);
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result = xyz.AddNumbers(10,5);
		int multyplyResult = xyz.MultiplyNumbers(5,6);
		System.out.println(result);
		System.out.println(multyplyResult);
	}
}