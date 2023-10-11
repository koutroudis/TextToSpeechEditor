package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import commands.EditDocument;

class usThree {
    private String file;
    private String s;
    private boolean check;
    @Test
    void test() throws IOException {
        EditDocument e = new EditDocument();
        file=e.openFile();
        s=e.beforeSave("title:alexauthor:nikoudate:Sat May 23 18:43:51 EEST 2020savedate:Sat May 23 18:44:11 EEST 2020--------------------------------------hello worldhow you doing");
        check=e.checkFiles(s, file);
        assertEquals(true,check);
    }

}
