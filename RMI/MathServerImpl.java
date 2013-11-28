import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServerImpl extends UnicastRemoteObject implements MathServer {

	public MathServerImpl() throws RemoteException {
		super();
	}

	public int AddNumbers(int firstnumber,int secondnumber) throws RemoteException {
		return firstnumber + secondnumber;
	}

	public int MultiplyNumbers(int firstnumber,int secondnumber) throws RemoteException {
		return firstnumber * secondnumber;
	}
}