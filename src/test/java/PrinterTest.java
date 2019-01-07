import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.availablePaper(), 0.01);
    }

    @Test
    public void canPrintOrderTrue(){
        assertEquals("Printing your order", printer.printOrder(2, 5));
    }

    @Test
    public void canRemovePaperAfterTrueOrder(){
        printer.printOrder(2, 5);
        assertEquals(90, printer.availablePaper(), 0.01);
    }

    @Test
    public void cantPrintOrder(){
        assertEquals("Not enough paper", printer.printOrder(10, 12));
    }

    @Test
    public void cantRemovePaperAfterFalseOrder(){
        printer.printOrder(10, 12);
        assertEquals(100, printer.availablePaper(), 0.01);
    }

    @Test
    public void canRefillPaper(){
        printer.printOrder(5, 10);
        printer.refillPaper(40);
        assertEquals(90, printer.availablePaper(), 0.01);
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.availableToner(), 0.01);
    }

    @Test
    public void canReduceTonerWhenPrintingTrue(){
        printer.printOrder(2, 5);
        assertEquals(490, printer.availableToner(), 0.01);
    }


}
