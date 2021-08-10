package app;

import org.testng.annotations.Test;

public class All_Apps extends Multi_App_Call{
  @Test(priority = 1)
  public void Apps() throws Exception {
	 		
	  call("HomeLayout App1");
		
  }
}
