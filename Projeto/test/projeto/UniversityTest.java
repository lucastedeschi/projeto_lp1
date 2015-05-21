/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author rgondek
 */
public class UniversityTest {
    
    @Test
    public void testDefaultConstructor() {
        University u = new University("Mackenzie");
        Assert.assertEquals("[]", u.getCourses());
        Assert.assertEquals("[]", u.getStudents());
    }

    /**
     * Test of addCourse method, of class University.
     */
    @Test
    public void testAddCourse() {
        University u = new University("Mackenzie");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        Assert.assertEquals("Code LP1 - Title: Linguagem de Programação 1 - NumCredits: 6 - MaxStudents: 50", u.getCourse("LP1").toString());
    }

    /**
     * Test of updateCourse method, of class University.
     */
    @Test
    public void testUpdateCourse() {
        University u = new University("Mackenzie");
        u.addCourse("LP1", "L de Programação 1", 6, 50);
        Assert.assertEquals("Code LP1 - Title: L de Programação 1 - NumCredits: 6 - MaxStudents: 50", u.getCourse("LP1").toString());
        u.updateCourse("LP1", "Linguagem de Programação 1", 10, 40);
        Assert.assertEquals("Code LP1 - Title: Linguagem de Programação 1 - NumCredits: 10 - MaxStudents: 40", u.getCourse("LP1").toString());
    }

    /**
     * Test of addUndergraduateStudent method, of class University.
     */
    @Test
    public void testAddUndergraduateStudent() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Major: Bacharel - Minor: Tecnólogo", u.getStudent(41411978).toString());
    }

    /**
     * Test of updateUndergraduateStudent method, of class University.
     */
    @Test
    public void testUpdateUndergraduateStudent() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Major: Bacharel - Minor: Tecnólogo", u.getStudent(41411978).toString());
        u.updateUndergraduateStudent(41411978, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("ID: 41411978 - Name: Lucas - Address: Mauá - Phone: (11) 97275-5022 - Email: lucas@email.com - Major: Bacharel - Minor: Tecnólogo", u.getStudent(41411978).toString());
    }

    /**
     * Test of addPostgraduateStudent method, of class University.
     */
    @Test
    public void testAddPostgraduateStudent() {
        University u = new University("Mackenzie");
        u.addPostgraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Thesis Title: Título da Tese - Supervisor: Ana Cristina", u.getStudent(41411978).toString());
    }

    /**
     * Test of updatePostgraduateStudent method, of class University.
     */
    @Test
    public void testUpdatePostgraduateStudent() {
        University u = new University("Mackenzie");
        u.addPostgraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Thesis Title: Título da Tese - Supervisor: Ana Cristina", u.getStudent(41411978).toString());
        u.updatePostgraduateStudent(41411978, "Rubens", "Caieiras", "(11) 97275-5022", "rubens.gondek@email.com", "Título da Tese", "Takato Kurihara");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Caieiras - Phone: (11) 97275-5022 - Email: rubens.gondek@email.com - Thesis Title: Título da Tese - Supervisor: Takato Kurihara", u.getStudent(41411978).toString());
    }

    /**
     * Test of getCourse method, of class University.
     */
    @Test
    public void testGetCourse() {
        University u = new University("Mackenzie");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Assert.assertEquals(true, u.getCourse("LP1").equals(c));
    }

    /**
     * Test of getStudent method, of class University.
     */
    @Test
    public void testGetStudent() {
        University u = new University("Mackenzie");
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals(true, u.getStudent(41411978).equals(ugs));
    }

    /**
     * Test of getCourses method, of class University.
     */
    @Test
    public void testGetCourses_long() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        u.addCourse("MD", "Matemática Discreta", 4, 40);
        u.registerStudent(41411978, "LP1");
        Assert.assertEquals("[Code LP1 - Title: Linguagem de Programação 1 - NumCredits: 6 - MaxStudents: 50]", u.getCourses(41411978).toString());
    }

    /**
     * Test of getStudents method, of class University.
     */
    @Test
    public void testGetStudents_String() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        u.registerStudent(40869302, "LP1");
        Assert.assertEquals("[ID: 40869302 - Name: Lucas - Address: Mauá - Phone: (11) 97275-5022 - Email: lucas@email.com - Thesis Title: Título da Tese - Supervisor: Ana Cristina]", u.getStudents("LP1").toString());
    }

    /**
     * Test of getRegistration method, of class University.
     */
    @Test
    public void testGetRegistration() {
        University u = new University("Mackenzie");
        PostGraduateStudent pgs = new PostGraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        u.registerStudent(40869302, "LP1");
        Registration r = u.getRegistration(40869302, "LP1");
        Assert.assertEquals(true, r.getStudent().equals(pgs));
        Assert.assertEquals(true, r.getCourse().equals(c));
    }

    /**
     * Test of registerStudent method, of class University.
     */
    @Test
    public void testRegisterStudent() {
        University u = new University("Mackenzie");
        PostGraduateStudent pgs = new PostGraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        u.registerStudent(40869302, "LP1");
        Registration r = u.getRegistration(40869302, "LP1");
        Assert.assertEquals(true, r.getStudent().equals(pgs));
        Assert.assertEquals(true, r.getCourse().equals(c));
    }

    /**
     * Test of deRegisterStudent method, of class University.
     */
    @Test
    public void testDeRegisterStudent() {
        University u = new University("Mackenzie");
        PostGraduateStudent pgs = new PostGraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        u.registerStudent(40869302, "LP1");
        Registration r = u.getRegistration(40869302, "LP1");
        Assert.assertEquals(true, r.getStudent().equals(pgs));
        Assert.assertEquals(true, r.getCourse().equals(c));
        u.deRegisterStudent(40869302, "LP1");
    }

    /**
     * Test of getCourses method, of class University.
     */
    @Test
    public void testGetCourses_0args() {
        University u = new University("Mackenzie");
        u.addCourse("LP1", "Linguagem de Programação 1", 6, 50);
        u.addCourse("MD", "Matemática Discreta", 4, 40);
        Assert.assertEquals("[Code LP1 - Title: Linguagem de Programação 1 - NumCredits: 6 - MaxStudents: 50, Code MD - Title: Matemática Discreta - NumCredits: 4 - MaxStudents: 40]", u.getCourses().toString());
    }

    /**
     * Test of getStudents method, of class University.
     */
    @Test
    public void testGetStudents_0args() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("[ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Major: Bacharel - Minor: Tecnólogo, ID: 40869302 - Name: Lucas - Address: Mauá - Phone: (11) 97275-5022 - Email: lucas@email.com - Thesis Title: Título da Tese - Supervisor: Ana Cristina]", u.getStudents().toString());
    }

    /**
     * Test of getUndergraduateStudents method, of class University.
     */
    @Test
    public void testGetUndergraduateStudents() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("[ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Major: Bacharel - Minor: Tecnólogo]", u.getUndergraduateStudents().toString());
    }

    /**
     * Test of getPostgraduateStudents method, of class University.
     */
    @Test
    public void testGetPostgraduateStudents() {
        University u = new University("Mackenzie");
        u.addUndergraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        u.addPostgraduateStudent(40869302, "Lucas", "Mauá", "(11) 97275-5022", "lucas@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("[ID: 40869302 - Name: Lucas - Address: Mauá - Phone: (11) 97275-5022 - Email: lucas@email.com - Thesis Title: Título da Tese - Supervisor: Ana Cristina]", u.getPostgraduateStudents().toString());
    }
    
}