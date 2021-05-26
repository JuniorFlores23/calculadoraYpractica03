/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author junior
 */
public interface Suma extends Remote
{
    public int sum(int a, int b) throws RemoteException;
    public int rest(int a, int b) throws RemoteException;
    public int mult(int a, int b) throws RemoteException;
    public float div(int a, int b) throws RemoteException;
}
