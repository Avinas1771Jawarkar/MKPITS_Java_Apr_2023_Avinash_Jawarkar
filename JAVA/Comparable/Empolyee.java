package Comparable;

import Comparator.Name;

import java.util.LinkedList;

public class Empolyee implements Comparable<Empolyee>{


    private String name;
        private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Empolyee(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Empolyee o) {


        if (name==o.name){
            return 0;
        }
        else if(name.compareTo(o.name)<0){
            return -1;
        }
        else{
            return 1;
        }

    }
}
