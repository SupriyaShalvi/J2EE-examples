import java.rmi.*;

public interface MathServer extends Remote {

	public int AddNumbers(int firstnumber,int secondnumber) throws RemoteException;
	public int MultiplyNumbers(int firstnumber,int secondnumber) throws RemoteException;

}