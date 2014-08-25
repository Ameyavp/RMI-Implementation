import java.rmi.*;
public interface AddServerInterface extends Remote{
int Add(int d1, int d2)throws Exception;
}
