/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketexample;
import java.io.*;
import java.io.InputStream;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Estudiante
 */
public class Client {
    public static void main(String [] args) throws IOException{
        //create Socket
        Socket client = new Socket("localhost",8000);
        //flow I/O one for each client
            InputStream flowinput = client.getInputStream();
            OutputStream flowout = client.getOutputStream();
        //decorations 
            BufferedReader read = new BufferedReader(new InputStreamReader(flowinput));
        //secont parameter ->push
            PrintWriter write = new PrintWriter(flowout,true);
            
       //solicitar datos
            BufferedReader readuser = new BufferedReader(new InputStreamReader(System.in));
       
            String readmessage ="";
            String usermessage = "";
            
            while(true){
                System.out.println("insert the message:");
                usermessage = readuser.readLine();
                //sent to server
                write.println(usermessage);
                readmessage = read.readLine();
                System.out.println("recibi: " + usermessage);
                System.out.println("me contestaron: " + readmessage);
                
            }
    }
}
