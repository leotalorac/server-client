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
public class Server {
    public static void main(String [] args){
        
        try {
            //create server
            ServerSocket serverSocket = new ServerSocket(8000);
            //listening
            Socket client = serverSocket.accept();
            //flow I/O one for each client
            InputStream flowinput = client.getInputStream();
            OutputStream flowout = client.getOutputStream();
            //decorations 
            BufferedReader read = new BufferedReader(new InputStreamReader(flowinput));
            //secont parameter ->push
            PrintWriter write = new PrintWriter(flowout,true);
            
            String textread ="";
            while(true){
                //recive information
                textread = read.readLine();
                //request
                write.println("ECO " + textread);
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
