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
public class CourseTest {
    
    @Test
    public void testDefaultConstructor() {
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Assert.assertEquals("LP1", c.getCode());
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        Course c = new Course("APD1", "Análise de Projeto e Desenvolvimento 1", 6, 40);
        Course d = new Course("APD1", "Análise de Projeto e Desenvolvimento 1", 6, 40);
        Assert.assertEquals(true, c.equals(d));
    }
    
    @Test 
    public void testToString() {
        Course c = new Course("LP1", "Linguagem de Programação 1", 6, 50);
        Assert.assertEquals("Code LP1 - Title: Linguagem de Programação 1 - NumCredits: 6 - MaxStudents: 50", c.toString());
    }
}
