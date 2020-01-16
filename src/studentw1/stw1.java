/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentw1;

/**
 *
 * @author Steve
 */
public class stw1 {
    private String name;
    private  int stid;
    private int age;

    public stw1( int age, int stid, String name)
    {
        this.age=age;
        this.name=name;
        this.stid=stid;
    }
    public stw1()
    {
        this.age=10;
        this.name="steve";
        this.stid=1234;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }
   
    @Override
    public String toString() {
        return  "name=" + name + ", stid=" + stid + ", age=" + age ;
    }
    
}
