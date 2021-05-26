/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author junior
 */
public class RMI extends UnicastRemoteObject implements Suma
{

    @Override
    public int sum(int a, int b) throws RemoteException 
    {
        return a+b;
    }

    @Override
    public int rest(int a, int b) throws RemoteException 
    {  
        return a-b;
    }

    @Override
    public int mult(int a, int b) throws RemoteException 
    {
        return a*b;
    }

    @Override
    public float div(int a, int b) throws RemoteException 
    {
        return a/b;
    }
    
}
