package ThirdRound.ThirdMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void test4() {
	  System.out.println("This is test4");
	  Assert.assertTrue(true);
  
  }
  @Test
  public void test5()
  {
	  System.out.println("This is test5");
	  Assert.assertTrue(false);
  }
}
