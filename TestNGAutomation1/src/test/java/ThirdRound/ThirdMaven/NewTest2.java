package ThirdRound.ThirdMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void test2() {
	  
	  System.out.println("This is test2");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void test3() {
	  System.out.println("This is test3");
	  Assert.assertTrue(false);
  }
}
