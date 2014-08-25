import java.net.*;
import java.rmi.*;
public class AddServer{
public static void main(String args[])throws Exception{
try {
AddServerImplements a = new AddServerImplements();
Naming.rebind("AddServer", a);
}
catch(Exception e){
}
}
}
