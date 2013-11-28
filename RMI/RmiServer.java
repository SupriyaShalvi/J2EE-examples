import java.rmi.*;
import java.net.*;

public class RmiServer {
	
	public static void main (String args[]) throws RemoteException, MalformedURLException {
	
		MathServerImpl mServer = new MathServerImpl();
		Naming.rebind("mathServer",mServer);
	}
}