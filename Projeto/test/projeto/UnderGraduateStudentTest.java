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
public class UnderGraduateStudentTest {
    
    @Test
    public void testDefaultConstructor() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals(41411978, ugs.ID);
        Assert.assertEquals("Rubens", ugs.name);
        Assert.assertEquals("Mairiporã", ugs.address);
        Assert.assertEquals("(11) 97275-5022", ugs.phone);
        Assert.assertEquals("rubens@email.com", ugs.email);
        Assert.assertEquals("Bacharel", ugs.getMajor());
        Assert.assertEquals("Tecnólogo", ugs.getMinor());
    }

    /**
     * Test of getMajor method, of class UnderGraduateStudent.
     */
    @Test
    public void testGetMajor() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("Bacharel", ugs.getMajor());
    }

    /**
     * Test of getMinor method, of class UnderGraduateStudent.
     */
    @Test
    public void testGetMinor() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("Tecnólogo", ugs.getMinor());
    }

    /**
     * Test of toString method, of class UnderGraduateStudent.
     */
    @Test
    public void testToString() {
        UnderGraduateStudent ugs = new UnderGraduateStudent(41411978, "Rubens", "Mairiporã", "(11) 97275-5022", "rubens@email.com", "Bacharel", "Tecnólogo");
        Assert.assertEquals("ID: 41411978 - Name: Rubens - Address: Mairiporã - Phone: (11) 97275-5022 - Email: rubens@email.com - Major: Bacharel - Minor: Tecnólogo", ugs.toString());
    }
    
}
