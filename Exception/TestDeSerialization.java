import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerialization 
{       

 public static void main(String [] args){
 Animal an10 = null;
    try
        {
                FileInputStream fis = new FileInputStream("//172.18.65.9/ILP-OpenStore/animal.xyz");
          
  ObjectInputStream ois = new ObjectInputStream(fis);

                an10 = (Animal) ois.readObject();
          
  ois.close();
               fis.close();
      }
         catch(IOException i){
           i.printStackTrace();
           return;
        }
  catch(ClassNotFoundException c){
           c.printStackTrace();
       }
         
        System.out.println("an10 : an5 :" + an10.getLegs());
        System.out.println("an10 : an5 :" + an10.getFoodHabit());
}
}