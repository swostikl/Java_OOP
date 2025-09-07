package Task3;

import java.io.*;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //getters
    public String getName(){
        return name;
    }
     public int getId(){
        return id;
     }
     public int getAge(){
        return age;
     }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
     @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
     }

}
