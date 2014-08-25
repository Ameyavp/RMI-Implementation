import java.rmi.*;
import java.rmi.server.*;
public class AddServerImplements extends UnicastRemoteObject implements
AddServerInterface{
public AddServerImplements()throws RemoteException{
}
public int Add(int d1, int d2)throws RemoteException{
return(d1 + d2);
}
}
