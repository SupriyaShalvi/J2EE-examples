import java.io.BufferedReader;
import java.io.DataInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Record {

	public static ArrayList<Student> studentList = new ArrayList<Student>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)

	{
		while (true) {

			/*
			 * System.out.println(".......Enter your Choice..........");
			 * System.out.println("1. Add student record");
			 * System.out.println("2. View student record");
			 * System.out.println("3. Exit"); int choice=sc.nextInt();
			 */
			int ch = displayMenu();
			
			switch (ch) {
			case 1: {
				
				String nm = readName();

				
				int a = readAge();

				System.out.println("Enter maths score:");
				
				int mm = readMark();

				System.out.println("Enter english score:");
				
				int em = readMark();

				System.out.println("Enter science score:");
				
				int scem = readMark();

				System.out.println("Enter hindi score:");
				
				int hm = readMark();

				System.out.println("Enter social score:");
				
				int sm = readMark();

				float avg = calculateAvg(mm, em, scem, hm, sm);

				int rNo = generateRollNumber();
				
				Student st = new Student(nm, rNo, a, mm, em, scem, hm, sm, avg);
				studentList.add(st);
				System.out.println("Number of students in the list: "
						+ studentList.size());
				System.out.println("Your roll No. is: " + rNo);
				break;
			}

			case 2: {
				BufferedReader br;
				String studentRollNo = null;
				int studentRollNoInt = 0;
				int flag;

				br = new BufferedReader(new InputStreamReader(System.in));

				do {
					flag = 0;
					System.out.print("Enter Roll number : ");
					try {
						studentRollNo = br.readLine();
					} catch (IOException ioe) {
						System.out.println("IO Error");

					}

					try {
						studentRollNoInt = Integer.parseInt(studentRollNo);

						if (isPresentRollNo(studentRollNoInt) == true) 
							displayRecord(studentRollNoInt);
						else
						{
							System.out.println("Invalid roll number!");

							flag = 1;
						}
	
						

						}
					

					catch (NumberFormatException nfe) {
						System.out.println("Please enter numeric value");
						flag = 1;

					}

				} while (flag == 1);
							
				break;

			}
			case 3:
			{
				//System.out.println("Enter roll no:");
				//int rNo = sc.nextInt();
				BufferedReader br;
				String studentRollNo = null;
				int studentRollNoInt = 0;
				int flag;

				br = new BufferedReader(new InputStreamReader(System.in));

				do {
					flag = 0;
					System.out.print("Enter Roll number : ");
					try {
						studentRollNo = br.readLine();
					} catch (IOException ioe) {
						System.out.println("IO Error");

					}

					try {
						studentRollNoInt = Integer.parseInt(studentRollNo);

						if (isPresentRollNo(studentRollNoInt) == true) 
					
							writeDetails(studentRollNoInt);
						
						else
						{
							System.out.println("Invalid roll number!");

							flag = 1;
						}
	
						

						}
					

					catch (NumberFormatException nfe) {
						System.out.println("Please enter numeric value");
						flag = 1;

					}

				} while (flag == 1);
				
			}
			case 4:{
				readFile();
				break;
			}

			case 5: {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid user input ");
				break;
			}
			}

		}

	}

	public static int displayMenu() {
		System.out.println(".......Enter your Choice..........");
		System.out.println("1. Add student record");
		System.out.println("2. View student record");
		System.out.println("3. Write student records");
		System.out.println("4. Read student record");
		System.out.println("5. Exit");
		int choice = sc.nextInt();
		return choice;
	}

	public static String readName() {
		BufferedReader br;
		String studentName = null;
		int flag;
		br = new BufferedReader(new InputStreamReader(System.in));
		do {
			flag = 0;
			System.out.print("Enter name : ");
			try {
				studentName = br.readLine();
				if (isNumb(studentName) == true)
				{
					System.out.println("Enter character only");
					flag=1;
				}
				else
			        flag = 0;
			} catch (IOException ioe) {
				System.out.println("IO Error");
				flag = 1;
			}

		} while (flag == 1);
		return studentName;

	}

	public static boolean isNumb(String str) {
		String s = str;
		for (int i = 0; i < s.length(); i++) {
			// If we find a non-digit character we return false.
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

	public static int readAge() {
		BufferedReader br;
		String studentAge = null;
		int studentAgeInt = 0;
		int flag;

		br = new BufferedReader(new InputStreamReader(System.in));

		do {
			flag = 0;
			System.out.print("Enter age : ");
			try {
				studentAge = br.readLine();
			} catch (IOException ioe) {
				System.out.println("IO Error");

			}

			try {
				studentAgeInt = Integer.parseInt(studentAge);

				if (studentAgeInt < 5 || studentAgeInt > 20) {
					System.out.println("Age range is between 5 and 20. Please ensure you are in the correct age group.");

					flag = 1;

				}
			}

			catch (NumberFormatException nfe) {
				System.out.println("Please give valid input");
				flag = 1;

			}

		} while (flag == 1);
		return studentAgeInt;

	}

	
	public static int readMark() {
		BufferedReader br;
		String studentMarks = null;
		int studentMarksInt = 0;
		int flag;

		br = new BufferedReader(new InputStreamReader(System.in));

		do {
			flag = 0;

			try {
				studentMarks = br.readLine();
			} catch (IOException ioe) {
				System.out.println("IO Error");

			}

			try {
				studentMarksInt = Integer.parseInt(studentMarks);

				
				if (studentMarksInt < 0 || studentMarksInt > 100) {
					System.out.println("range is between 0 and 100! Enter the mark again:");
					flag=1;
				
				}
				else
					flag=0;
				
					
			}

			catch (NumberFormatException nfe) {
				System.out.println("Please enter numeric value! Enter the mark again:");
				flag = 1;
			}

		} while (flag == 1);
		return studentMarksInt;
		}
	
	public static int generateRollNumber() {
		return (int) (Math.random() * 1000);
	}

	public static float calculateAvg(int math_marks, int english_marks,
			int science_marks, int hindi_marks, int social_marks) {
		float avg = ((math_marks + english_marks + science_marks + hindi_marks + social_marks) / 5);
		return avg;
	}

	public static boolean isPresentRollNo(int rollNo) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getRollNo() == rollNo)
				return true;
		}
		return false;
	}

	public static void displayRecord(int rollNo) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getRollNo() == rollNo) {
				System.out.println("Name : " + studentList.get(i).getName());
				System.out.println("Age : " + studentList.get(i).getAge());
				System.out.println("Average marks obtained : "
						+ studentList.get(i).getAvg());
			}
		}
	}
	public static void writeDetails(int rollNo)
	{
		try
		{
			//FileWriter outFile=new FileWriter(args[0]);
			PrintWriter out=new PrintWriter("C:/Documents and Settings/398839/Desktop/write");
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getRollNo() == rollNo) {
					out.println("Roll number : " + studentList.get(i).getRollNo());
					out.println("Name : " + studentList.get(i).getName());
					out.println("Age : " + studentList.get(i).getAge());
					out.println("Average marks obtained : "
							+ studentList.get(i).getAvg());
					System.out.println("Records written successfully " );
					out.close();
				}
			
			
		}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
public static void readFile() {

	try{
	FileInputStream fis = new FileInputStream("C:/Documents and Settings/398839/Desktop/rdms.txt");

	   DataInputStream dis = new DataInputStream(fis);
	   BufferedReader br = new BufferedReader(new InputStreamReader(dis));
	   String strLine;

	   while ((strLine = br.readLine()) != null) {

	    System.out.println(strLine);
	   }

	   fis.close();
	   dis.close();


	} catch (FileNotFoundException e1) {
		System.out.println("This is FileNotFoundException.");
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		System.out.println("This is IOException.");
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}




}
}

