/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author rgondek
 */
public class RegistrationTest {
    
    @Test
    public void testDefaultConstructor() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Registration r = new Registration(ugs, c, 2015, 2);
        Assert.assertEquals(true, r.getStudent().equals(ugs));
        Assert.assertEquals(true, r.getCourse().equals(c));
        Assert.assertEquals(2015, r.getAcadYear());
        Assert.assertEquals(2, r.getSemester());
    }

    /**
     * Test of getStudent method, of class Registration.
     */
    @Test
    public void testGetStudent() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Registration r = new Registration(ugs, c, 2015, 2);
        Assert.assertEquals(true, r.getStudent().equals(ugs));
    }

    /**
     * Test of getCourse method, of class Registration.
     */
    @Test
    public void testGetCourse() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Registration r = new Registration(ugs, c, 2015, 2);
        Assert.assertEquals(true, r.getCourse().equals(c));
    }

    /**
     * Test of getAcadYear method, of class Registration.
     */
    @Test
    public void testGetAcadYear() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Registration r = new Registration(ugs, c, 2015, 2);
        Assert.assertEquals(2015, r.getAcadYear());
    }

    /**
     * Test of getSemester method, of class Registration.
     */
    @Test
    public void testGetSemester() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Registration r = new Registration(ugs, c, 2015, 2);
        Assert.assertEquals(2, r.getSemester());
    }
    
}
