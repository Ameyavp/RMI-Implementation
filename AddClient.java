import java.rmi.*;
public class AddClient{
public static void main(String args[])throws Exception{
try{
String ServerUrl = "rmi://"+args[0]+"/AddServer";
AddServerInterface a1 = (AddServerInterface)Naming.lookup(ServerUrl);
System.out.println("first no:"+args[1]);
int d1 = Integer.parseInt(args[1]);
System.out.println("second no:"+ args[2]);
int d2 = Integer.parseInt(args[2]);
int sum = a1.Add(d1, d2);
System.out.println("sum is:" + sum);
}
catch(Exception e){
}
}}
