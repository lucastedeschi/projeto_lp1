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
public class PostGraduateStudentTest {
    
    @Test
    public void testDefaultConstruct() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals(41411978, pgs.ID);
        Assert.assertEquals("Rubens", pgs.name);
        Assert.assertEquals("Mairiporã", pgs.address);
        Assert.assertEquals("(11) 97275-5022", pgs.phone);
        Assert.assertEquals("rubens@email.com", pgs.email);
        Assert.assertEquals("Título da Tese", pgs.getThesisTitle());
        Assert.assertEquals("Ana Cristina", pgs.getSupervisor());
    }

    /**
     * Test of getThesisTitle method, of class PostGraduateStudent.
     */
    @Test
    public void testGetThesisTitle() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("Título da Tese", pgs.getThesisTitle());
    }
    
    @Test
    public void testSetThesisTitle() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        pgs.setThesisTitle("Título da tese alterado");
        Assert.assertEquals("Título da tese alterado", pgs.getThesisTitle());
    }

    /**
     * Test of getTSupervisor method, of class PostGraduateStudent.
     */
    @Test
    public void testGetSupervisor() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("Ana Cristina", pgs.getSupervisor());
    }
    
    @Test
    public void testSetSupervisor() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        pgs.setSupervisor("Ana Cristina 2");
        Assert.assertEquals("Ana Cristina 2", pgs.getSupervisor());
    }

    /**
     * Test of toString method, of class PostGraduateStudent.
     */
    @Test
    public void testToString() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Thesis Title: Título da Tese - Supervisor: Ana Cristina", pgs.toString());
    }
    
}
