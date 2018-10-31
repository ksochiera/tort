package com.ksochiera.tort.Tort;

import java.util.ArrayList;
import java.util.List;

import junit.*;
import junit.framework.Assert;
public class StringConversationsSpec {
	
	public void divideTextintoRows() {
		
		String input= "2018-06-20;Hiszpania;Portugalia"
				+ "2018-06-20;Maroko;Iran";
		String[] output= {"2018-06-20;Hiszpania;Portugalia","2018-06-20;Maroko;Iran"};
		StringConversation stringConversion= new StringConversation();
		String[] actual=stringConversion.split(input);
		Assert.assertEquals(output,actual);
	}

}
