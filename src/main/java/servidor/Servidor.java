/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author junior
 */
public class Servidor 
{
    public static void main(String[] args)
    {
        try
        {
            String IPad = InetAddress.getLocalHost().toString();
            Registry r = LocateRegistry.createRegistry(1099);
            r.rebind("Suma", new RMI());
            JOptionPane.showMessageDialog(null, "El servidor esta conectado ");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El servidor no se conecto "+e);
        }
        
    }
}
