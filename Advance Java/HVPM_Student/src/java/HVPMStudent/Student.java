/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HVPMStudent;

/**
 *
 * @author Lenovo
 */
public class Student {
   private String RollNO;
   private String Name;
   private String Address;
   private String City;

    public Student() {
    }

    public Student(String RollNO, String Name, String Address, String City) {
        this.RollNO = RollNO;
        this.Name = Name;
        this.Address = Address;
        this.City = City;
    }

    public String getRollNO() {
        return RollNO;
    }

    public void setRollNO(String RollNO) {
        this.RollNO = RollNO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
   

        
}
