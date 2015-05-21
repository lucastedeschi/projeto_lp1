/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class University {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Registration> registrations;
    
    public University(String name){
        this.name = name;
        courses = new ArrayList<Course>(); 
        students = new ArrayList<Student>();
        registrations = new ArrayList<Registration>();
    }
    public Course addCourse(String code, String title, int numCredits, int maxStudents){
        Course c = new Course(code, title, numCredits, maxStudents);
        courses.add(c);
        return c;
    }
    public Course updateCourse(String code, String title, int numCredits, int maxStudents){
        Course cTest = getCourse(code);
        if(cTest == null){
            throw new IllegalArgumentException("O curso não foi encontrado.");
        }
        else{
            Course c = new Course(code, title, numCredits, maxStudents);
            for (Course cs : courses){
                if (cs.getCode() == c.getCode()){
                    courses.set(courses.indexOf(cs), c);
                }
            }
        }
        return cTest;
    }
    public UnderGraduateStudent addUndergraduateStudent(long ID, String name, String address, String phone, String email, String major, String minor){
        UnderGraduateStudent ugs = new UnderGraduateStudent(ID, name, address, phone, email, major, minor);
        students.add(ugs);
        return ugs;
    }
    public UnderGraduateStudent updateUndergraduateStudent(long ID, String name, String address, String phone, String email, String major, String minor){
        Student sTest = getStudent(ID);
        if(sTest == null){
            throw new IllegalArgumentException("O aluno não foi encontrado.");
        }
        else{
            UnderGraduateStudent ugs = new UnderGraduateStudent(ID, name, address, phone, email, major, minor);
            for (Student s : students){
                if (s instanceof UnderGraduateStudent){
                    if (s.getID() == ugs.getID()){
                        students.set(students.indexOf(s), ugs);
                    }
                }
            }
        }
        return ((UnderGraduateStudent)sTest);
    }
    
    public PostGraduateStudent addPostgraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle, String supervisor){
        PostGraduateStudent pgs = new PostGraduateStudent(ID, name, address, phone, email, thesisTitle, supervisor);
        students.add(pgs);
        return pgs;
    }
    
    public PostGraduateStudent updatePostgraduateStudent(long ID, String name, String address, String phone, String email, String thesisTitle, String supervisor){
        Student sTest = getStudent(ID);
        if(sTest == null){
            throw new IllegalArgumentException("O aluno não foi encontrado.");
        }
        else{
            PostGraduateStudent pgs = new PostGraduateStudent(ID, name, address, phone, email, thesisTitle, supervisor);
            for (Student s : students){
                if (s instanceof PostGraduateStudent){
                    if (s.getID() == pgs.getID()){
                        students.set(students.indexOf(s), pgs);
                    }
                }
            }
        }
        return ((PostGraduateStudent)sTest);
    }
    
    public Course getCourse(String code){
        for(Course c : courses){
            if (c.getCode() == code){
                return c;
            }
        }
        throw new IllegalArgumentException("O curso não foi encontrado.");
    }
    public Student getStudent(long ID){
        for(Student s : students){
            if (s.getID() == ID){
                return s;
            }
        }
        throw new IllegalArgumentException("O aluno não foi encontrado.");
    }
    public ArrayList<Course> getCourses(long studentID){
        ArrayList<Course> c = new ArrayList();
        for(Registration r: registrations){
            if((r.getStudent()).getID() == studentID){
                c.add((r.getCourse()));
            }
        }
        return c;
    }
    public ArrayList<Student> getStudents(String courseCode){
        ArrayList<Student> s = new ArrayList();
        for(Registration r: registrations){
            if((r.getCourse()).getCode() == courseCode){
                s.add((r.getStudent()));
            }
        }
        return s;   
    }
    public Registration getRegistration(long studentID, String courseCode){
        for(Registration r : registrations){
            if ((r.getStudent()).getID() == studentID && (r.getCourse()).getCode() == courseCode){
                return r;
            }
        }
        throw new IllegalArgumentException("A matrícula não foi encontrada.");
    }
    public boolean registerStudent(long studentID, String courseCode){
        Course c = getCourse(courseCode);
        Student s = getStudent(studentID);
        if(c.getMaxStudents() == 0){
            throw new IllegalArgumentException("O número máximo de estudantes foi atingido.");
        }
        if(s == null){
            return false;
        }
        else{
            Registration r = new Registration(getStudent(studentID), getCourse(courseCode), 2015, 02);
            registrations.add(r);
            return true;
       }
    }
    public boolean deRegisterStudent(long studentID, String courseCode){
        registrations.remove(getRegistration(studentID, courseCode));
        return true;
    }
    public String getCourses(){
        return courses.toString();
    }
    public String getStudents(){
        return students.toString();
    }
    public String getUndergraduateStudents(){
        ArrayList<Student> sugs = new ArrayList();
        for(Student s: students){
            if(s instanceof UnderGraduateStudent){
                sugs.add((UnderGraduateStudent) s);
            }
        }
        return sugs.toString();
    }
    public String getPostgraduateStudents(){
        ArrayList<Student> spgs = new ArrayList();
        for(Student s: students){
            if(s instanceof PostGraduateStudent){
                spgs.add((PostGraduateStudent) s);
            }
        }
        return spgs.toString();
    }
    
}