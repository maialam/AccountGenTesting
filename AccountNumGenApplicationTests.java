package com.qa.AccountNumGen;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.account.rest.AccountGenRest;
import com.qa.account.service.AccountService;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class AccountNumGenApplicationTests {
	
	private static final String random = "Alex Jones";

	@InjectMocks
	private AccountGenRest endpoint;
	
	@Mock 
	private AccountService service;
	
	@Test
	public void testCreateAccount() {
		Mockito.when(service.createAccountNumber()).thenReturn(random);
		Assert.assertEquals(random, endpoint.createAccountNumber());
		Mockito.verify(service).createAccountNumber();
	}
	
}




