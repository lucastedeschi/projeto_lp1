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
public class PostGraduateStudent 
    extends Student{
    
    private String thesisTitle;
    private String supervisor;
    
    public PostGraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle, String supervisor){
        super(ID, name, address, phone, email);
        this.thesisTitle = thesisTitle;
        this.supervisor = supervisor;
    }
    public String getThesisTitle(){
        return this.thesisTitle;
    }
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }
    public String getSupervisor(){
        return this.supervisor;
    }
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    @Override
    public String toString(){
        return "ID: " + super.ID + " - Name: " + super.name + " - Address: " + super.address + " - Phone: " + super.phone + " - Email: " + super.email + " - Thesis Title: " + this.thesisTitle + " - Supervisor: " + this.supervisor;
    }
}
