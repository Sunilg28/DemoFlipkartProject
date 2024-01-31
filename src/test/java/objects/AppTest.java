package objects;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.App;

public class AppTest {
	
	@Test
	public void testlogin1()  //negative TC
	{
		App myapp = new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
	}
	
	@Test
	public void testlogin2()  //positive TC
	{
		App myapp = new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
	}

}
