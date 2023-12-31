/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author admin
 */
public class Xfile {

   public static Object readObj(String path) throws FileNotFoundException , IOException, ClassNotFoundException{
       try(
               FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);){
           return ois.readObject();
       }
   }
   public static void writeObj(String path, Object data) throws FileNotFoundException, IOException{
       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));){
           oos.writeObject(data);
       }
   }
   
}
