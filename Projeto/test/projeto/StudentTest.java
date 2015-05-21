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
public class StudentTest {
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        UnderGraduateStudent ugs1 = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        UnderGraduateStudent ugs2 = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals(false, pgs.equals(ugs1));
        Assert.assertEquals(true, ugs1.equals(ugs2));
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Major: Bacharel - Minor: Tecnólogo", ugs.toString());
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals(41411978, pgs.getID());
    }
    
    @Test
    public void testGetName() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("Rubens", pgs.getName());
    }
    @Test
    public void testSetName() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        pgs.setName("Lucas");
        Assert.assertEquals("Lucas", pgs.getName());
    }
    @Test
    public void testGetAddress() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("Mairiporã", pgs.getAddress());
    }
    @Test
    public void testSetAddress() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        pgs.setAddress("Mauá");
        Assert.assertEquals("Mauá", pgs.getAddress());
    }
    @Test
    public void testGetPhone() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("(11) 97275-5022", pgs.getPhone());
    }
    @Test
    public void testSetPhone() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        pgs.setPhone("(12) 97275-5022");
        Assert.assertEquals("(12) 97275-5022", pgs.getPhone());
    }
    @Test
    public void testGetEmail() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("rubens@email.com", pgs.getEmail());
    }
    @Test
    public void testSetEmail() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        pgs.setEmail("lucas@email.com");
        Assert.assertEquals("lucas@email.com", pgs.getEmail());
    }
}
