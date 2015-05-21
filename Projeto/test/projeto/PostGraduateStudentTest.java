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
        Assert.assertEquals("Ana Cristina", pgs.getTSupervisor());
    }

    /**
     * Test of getThesisTitle method, of class PostGraduateStudent.
     */
    @Test
    public void testGetThesisTitle() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("Título da Tese", pgs.getThesisTitle());
    }

    /**
     * Test of getTSupervisor method, of class PostGraduateStudent.
     */
    @Test
    public void testGetTSupervisor() {
        PostGraduateStudent pgs = new PostGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Título da Tese", "Ana Cristina");
        Assert.assertEquals("Ana Cristina", pgs.getTSupervisor());
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
