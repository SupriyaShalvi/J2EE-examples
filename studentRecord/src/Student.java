import java.util.*;

public class Student {
 String name;
 int rollNo;
 int age;
 int math_marks;
 int english_marks;
 int science_marks;
 int hindi_marks;
 int social_marks;
 float averageMarks;
 //private ArrayList<Student> studentList = new ArrayList<Student>();
 

 public Student(String nm, int rNo, int a, int mm,int em,int scem,int hm,int sm,float avg) {
  name = nm;
  age = a;
  rollNo=rNo;
  math_marks= mm;
  english_marks=em;
  science_marks=scem;
  hindi_marks=hm;
  social_marks=sm;
  averageMarks=avg;
 }

 public String getName() {
  return name;
 }
 
 public float getAvg() {
  return averageMarks;
 }
 public int getRollNo() {
  return rollNo;
 }
public void setRollNo(int rollNo) {
  this.rollNo=rollNo;
 }

 public int getAge() {
  return age;
 }
 public int getMathMarks() {
  return math_marks;
 }
 public int getEnglishMarks() {
  return english_marks;
 }
 public int getScienceMarks() {
  return science_marks;
 }
 public int getHindiMarks() {
  return hindi_marks;
 }
 public int getSocialMarks() {
  return social_marks;
 }

 /*public void celebrate_BDAY(int b_day_no) {
  age = b_day_no;
 }*/

 public void setAge(int newage) {
  if (age > 0 && age<20)
   age = newage;
  else
   System.out.println("Age cannot be negative or more than 20 years");
 }


}