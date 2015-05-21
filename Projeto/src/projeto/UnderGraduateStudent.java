/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Lucas
 */
public class UnderGraduateStudent
    extends Student{
    
    private String major;
    private String minor;
    
    public UnderGraduateStudent(long ID, String name, String address, String phone, String email, String major, String minor){
        super(ID, name, address, phone, email);
        this.major = major;
        this.minor = minor;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMinor(){
        return minor;
    }
    public void setMinor(String minor) {
        this.minor = minor;
    }
    @Override
    public String toString(){
        return "ID: " + super.ID + " - Name: " + super.name + " - Address: " + super.address + " - Phone: " + super.phone + " - Email: " + super.email + " - Major: " + this.major + " - Minor: " + this.minor;
    }
    
}
