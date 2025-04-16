package com.reflection.advanced.di;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.reflection.advanced.di.DIContainer;
import com.reflection.advanced.di.UserService;

public class DIContainerTest {

	 @Test
	    public void testDependencyInjection() {
	        UserService userService = new UserService();

	        // Inject dependencies using the DI container
	        DIContainer.injectDependencies(userService);

	        // Check if the dependency was injected
	        assertNotNull("Dependency should be injected", userService.getDatabaseService());
	    }

	    @Test
	    public void testBeforeInjection() {
	        UserService userService = new UserService();

	        // Check if the dependency is null before injection
	        assertNull("Dependency should be null before injection", userService.getDatabaseService());
	    }

    
}
