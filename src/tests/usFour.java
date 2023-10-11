package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import commands.OpenDocument;



class usFour {

	private String fileOpen;
	private String s;
	private boolean check3;

	@Test
	void test() throws IOException {
		OpenDocument open = new OpenDocument();
		fileOpen=open.openFilename();
		s = open.beforeOpen(" title:alexauthor:nikoudate:Sat May 23 18:43:51 EEST 2020savedate:Sat May 23 18:44:11 EEST 2020--------------------------------------hello worldhow you doing");
		check3=open.checkOpen(s, fileOpen);
		assertEquals(true,check3);
	}

}
