package demo.fileupload;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileUploadTest {

    FileUpload newTest;

    @BeforeEach
    void setUp() {
        newTest = new FileUpload();
        //System.out.println("File path: " + new File("Books.xlsx").getAbsolutePath());

        File file = new File("temp");
        for(String fileNames : file.list()) System.out.println(fileNames);
    }
/*
    @Test
    void readBooksFromExcelFile() throws IOException {
        String excelFilePath = "temp/Books.xlsx";
        List<Book> listBooks = newTest.readBooksFromExcelFile(excelFilePath);

        for (Book newBook : listBooks) {
            System.out.println(newBook.toString());
        }
    }
*/

    @Test
    void excelRead() {
        String excelFilePath = "temp/Books.xlsx";
        newTest.excelRead(excelFilePath);
    }

    @Test
    void excelReadTwo() {
        String excelFilePath = "temp/Cards.xlsx";
        List<YugiohCard> list = newTest.excelRead(excelFilePath);

        for (YugiohCard card: list) {
            System.out.println(card.toString());
        }
    }

}
