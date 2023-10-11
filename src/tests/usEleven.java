package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import commands.TuneEncoding;

class usEleven {
    private String a;
    private boolean check4;

    @Test
    void test() {
        TuneEncoding tune = new TuneEncoding();
        a = tune.checkEncodeAtBash("I am the king");
        check4 = tune.ifTrueAtBash("r zn gsv prmt ", a);
        assertEquals(true,check4);

        
        
    }

}
