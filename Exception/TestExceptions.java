

import java.io.*;

public class TestExceptions {
 public static void main(String[] args) {

  try {
   int num[] = new int[10];
   BufferedReader in = new BufferedReader(new InputStreamReader(
     System.in));
   num[1] = Integer.parseInt(in.readLine());
   num[2] = Integer.parseInt(in.readLine());
   num[15] = Integer.parseInt(in.readLine());


   FileInputStream fis = new FileInputStream("//172.18.65.9/ILP-OpenStore/test.txt");

   DataInputStream dis = new DataInputStream(fis);
   BufferedReader br = new BufferedReader(new InputStreamReader(dis));
   String strLine;

   while ((strLine = br.readLine()) != null) {

    System.out.println(strLine);
   }

   fis.close();
   dis.close();

  } catch (NumberFormatException nfe) {
   System.out.println(" This is NumberFormatException.");

  } catch (FileNotFoundException fnfe) {
   System.out.println("This is FileNotFoundException.");
     
  } catch (IOException ioe) {
   System.out.println("This is IOException.");
  
  }
 }
}