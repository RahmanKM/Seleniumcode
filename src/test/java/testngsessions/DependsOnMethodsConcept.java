package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	
	//AAA in unit Test --> Arrange, Act, Assert
	
	public void createAUser() {
		System.out.println("Creating a user");
	}
	
	@Test
	public void a_createUser() {
	System.out.println("Create a user");	
	createAUser();
//	int i= 9/0;
	}
	
	@Test ()
	public void updateUser() {
		createAUser();
		System.out.println("Update a user");
	}
	
//	@Test(dependsOnMethods = "a_createUser")
//	public void deleteUser() {
//		System.out.println("Delete a user");
//	}

	@Test()
	public void deleteUser() {
		createAUser();
		System.out.println("Delete a user");
	}
}
