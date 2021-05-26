/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.InetAddress;

/**
 *
 * @author junior
 */
public class cliente 
{
    public static void main(String[] args)
    {
        try
        {
            String host = JOptionPane.showInputDialog("Ingrese la ip del servidor: ");
            Registry miRegistro = LocateRegistry.getRegistry(host, 1099);
            Suma s = (Suma)Naming.lookup("//"+host+"/Suma");
            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a:"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b:"));
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+s.sum(x, y));
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+s.rest(x, y));
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+s.mult(x, y));
            if(y>0)
            {
                JOptionPane.showMessageDialog(null, "El resultado de la division es: "+s.div(x, y));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El servidor no se conecto "+e);
        }
    }
}
