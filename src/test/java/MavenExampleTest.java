/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.jenkins.mavenexample.MavenExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MavenExampleTest {
    
    @Before
    public void setUp() {
        // Executed before each test case
        // Perform any necessary setup or initialization here
    }
    
    @After
    public void tearDown() {
        // Executed after each test case
        // Perform any necessary cleanup or reset here
    }
    
      @Test
    public void testAdd() {
        int result = MavenExample.add(10);
        Assert.assertEquals(15, result);
    }

    @Test
    public void testAddWithZero() {
        int result = MavenExample.add(0);
        Assert.assertEquals(5, result);
    }
}
