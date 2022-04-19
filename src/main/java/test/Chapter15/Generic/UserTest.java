package test.Chapter15.Generic; 

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* User Tester. 
* 
* @author <Authors name> 
* @since <pre>04/18/2022</pre> 
* @version 1.0 
*/ 
public class UserTest extends TestCase { 
public UserTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: toString() 
* 
*/ 
public void testToString() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(UserTest.class); 
} 
} 
