package collections;

import java.util.*;  
  
class Student implements Comparable<Student> {  
    public String name;  
  public Student(String name) {  
    this.name = name;  
  }  
  public int compareTo(Student person) {  
    return name.compareTo(person.name);  
      
  }   
}  
public class UserDefinedClassSortExample {  
  public static void main(String[] args) {  
      ArrayList<Student> al=new ArrayList<Student>();  
      al.add(new Student("Viru"));  
      al.add(new Student("Asir"));  
      al.add(new Student("Rishi"));  
      al.add(new Student("Thiru"));  
      
    Collections.sort(al);  
    for (Student s : al) {  
      System.out.println(s.name);  
    }  
  }  
}  