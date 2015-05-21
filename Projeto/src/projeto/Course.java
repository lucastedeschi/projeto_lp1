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
public class Course {
    private String code;
    private String title;
    private int numCredits;
    private int maxStudents;
    
    public Course(String code, String title, int numCredits, int maxStudents){
        this.code = code;
        this.title = title;
        this.numCredits = numCredits;
        this.maxStudents = maxStudents;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Course other = (Course)obj;
        if(!Objects.equals(this.code, other.code)){
            return false;
        }
        if(this.title != other.title){
            return false;
        }
        return true;
    }
    public String toString(){
        return "Code " + this.code + " - Title: " + this.title + " - NumCredits: " + this.numCredits + " - MaxStudents: " + this.maxStudents;
    }
    public String getCode(){
        return this.code;
    }
}
