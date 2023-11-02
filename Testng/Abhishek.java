package Testng;

import org.testng.annotations.Test;


public class Abhishek {
  @Test(dataProvider = "getdata")
  public void Data_Matrix(String username,String password ,String Chrome) {
  }

  @DataProvider
  public Object[][] getdata() {
	  Object [][] data = new Object[3][4];
	  data[0][0] = "Username";
	  data[0][1]="password";
	  data[0][2]=121212;
	  data[0][3]="Mozilla";
	  
	  data[1][0] = "Username1";
	  data[1][1]="password1";
	  data[1][2]=1212123;
	  data[1][3]="Chrome";
	  
	  data[2][0] = "Username2";
	  data[2][1]="password2";
	  data[2][2]=1212125;
	  data[2][3]="MicrosoftEdge";
	 	return data;
    
  }
}
