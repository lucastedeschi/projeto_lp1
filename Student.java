/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Objects;

/**
 *
 * @author Lucas
 */
public abstract class Student {
    protected long ID;
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    private Object title;
    
    public Student(long ID, String name, String address, String phone, String email){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student)obj;
        if(!Objects.equals(this.ID, other.ID)){
            return false;
        }
        if(this.name != other.name){
            return false;
        }
        return true;
    }
    @Override
    public abstract String toString(); 
    
    public long getID(){
        return this.ID;
    }
}
