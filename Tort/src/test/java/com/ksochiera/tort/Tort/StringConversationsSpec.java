package com.ksochiera.tort.Tort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class StringConversationsSpec {
	
	@Test
	public void divideTextintoRows() {
		
		String input= "2018-06-20;Hiszpania;Portugalia\n2018-06-20;Maroko;Iran";
		String[] output= {"2018-06-20;Hiszpania;Portugalia","2018-06-20;Maroko;Iran"};
		StringConversation stringConversion= new StringConversation();
		String[] actual=stringConversion.splitTextbox(input);
		assertArrayEquals(output,actual);
	}
	@Test
	public void divideRow() {
		String input = "1;A;Hiszpania;Portugalia;2018-06-30;Moskwa";
		String[] expected= {"1","A","Hiszpania","Portugalia","2018-06-30","Moskwa"};
		StringConversation stringConversation = new StringConversation();
		String[] actual = stringConversation.divideRow(input);
		assertArrayEquals(expected, actual);
	}

}
