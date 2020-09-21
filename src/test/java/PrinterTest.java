import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer printer;
    @Before
    public void before() {
        printer = new Printer(100, 100);
    }
    @Test
    public void has100SheetsOfPaper(){
        assertEquals(100,printer.getSheets());
    }

    @Test
    public void canReduceSheetCountOnPrint(){
        printer.print(2,2);
        assertEquals(96, printer.getSheets());
    }

    @Test
    public void willNotPrintAsNotEnoughPaper(){
        assertFalse(printer.print(100, 2));
    }

    @Test
    public void willPrintPlentyPaper(){
        assertTrue(printer.print(10, 2));
    }

    @Test
    public void canReduceTonerVolumeOnPrint(){
        printer.print(2,2);
        assertEquals(96, printer.getTonerVolume());
    }
}
