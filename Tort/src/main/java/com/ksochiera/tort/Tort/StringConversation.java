package com.ksochiera.tort.Tort;

public class StringConversation {
	public String[] splitTextbox(String input) {
		String [] output= input.split("\n");
		return output;
	}
	public String[] divideRow(String input) {
		String[] output=input.split(";");
		return output;
	}
}
