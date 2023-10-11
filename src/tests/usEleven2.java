package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commands.TuneEncoding;

class usEleven2 {
	private String a;
    private boolean check4;
	@Test
	void test() {
		TuneEncoding tune = new TuneEncoding();
		a = tune.checkEncodeRot13("I am the king");
        check4 = tune.ifTrueRot13("V nz gur xvat ", a);
        assertEquals(true,check4);
	}

}
