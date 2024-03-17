import java.util.*;

 class Student {
    String name ;
    int rollno ; 
    int age ;
    float weight;
    float height;

    public void acceptRecord( ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name  :   ");
        this.name = sc.nextLine();
        System.out.print("RollNo    :   ");
        this.rollno = sc.nextInt();
        System.out.print("Age   :   ");
        this.age = sc.nextInt();
        System.out.print("Weight    :   ");
        this.weight = sc.nextFloat();
        System.out.print("Height    :   ");
        this.height = sc.nextFloat();
    }
    public void printRecord ( ){
        System.out.print (this.name +" "+ this.rollno +" "+  this.age +" "+  this.weight +" "+  this.height);
       }

    public static void main(String args[]){
    Student student = new Student();
    student.acceptRecord();
    student.printRecord();       
    }

}
