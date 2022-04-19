package test.Chapter15.Generic; 

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* Dao Tester. 
* 
* @author <Authors name> 
* @since <pre>04/18/2022</pre> 
* @version 1.0 
*/ 
public class DaoTest extends TestCase { 
public DaoTest(String name) { 
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
* Method: save(String id, T entity) 
* 
*/ 
public void testSave() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: get(String id) 
* 
*/ 
public void testGet() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(String id, T entity) 
* 
*/ 
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: list() 
* 
*/ 
public void testList() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(String id) 
* 
*/ 
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(DaoTest.class); 
} 
} 
