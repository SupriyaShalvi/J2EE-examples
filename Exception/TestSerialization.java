import java.io.*;

public class TestSerialization {

 public static void main(String[] args) {

  Animal an5 = new Animal();
  an5.setFoodHabit("habit1");
  an5.setLegs(2);

  Animal an2 = new Animal();
  an2.setFoodHabit("habit2");
  an2.setLegs(4);

  Animal an3 = new Animal();
  an3.setFoodHabit("habit3");
  an3.setLegs(8);

  try {
   
   FileOutputStream fos1 = new FileOutputStream("//172.18.65.9/ILP-OpenStore/animal.txt");
   ObjectOutputStream oos = new ObjectOutputStream(fos1);
   oos.writeObject(an5);
   oos.close();
   fos1.close();
  } catch (IOException i) {
   i.printStackTrace();
  } 
 }
}