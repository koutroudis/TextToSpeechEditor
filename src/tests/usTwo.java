package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commands.EditDocument;


class usTwo {
	private String x,y;
	private boolean check1;
	
	

	@Test
	void test() {
		EditDocument edit = new EditDocument("Ena nero kura baggelio","Ena nero kura baggelio kruo nero","kruo nero");
		x = "Ena nero kura baggelio";
		String kapa = edit.addArea("Ena nero kura baggelio","kruo nero"); 
		y = kapa;
		check1 = edit.isTrue(x,y);
		assertEquals(true,check1);
	}

}
