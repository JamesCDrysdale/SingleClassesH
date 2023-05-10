import org.example.Printer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer inkJet;

    @Before
    public void setUp() {
        inkJet = new Printer(10, 5);
    }

    @Test
    public void printerHasANumberOfPagesLeft(){
        assertEquals(10, inkJet.getPages());
    }

    @Test
    public void printerHasToner(){
        assertEquals(5, inkJet.getToner());
    }

    @Test
    public void printWhenEnoughPagesAndReducePaperAccordingly(){
        inkJet.print(1, 2); // 2 copies of a single page doc - total pages = 2
        assertEquals(8, inkJet.getPages());
    }

    @Test
    public void printDoNotUsePaperIfNotEnoughPages(){
        inkJet.print(5, 3); // not enough toner or paper
        assertEquals(10, inkJet.getPages());
    }

    @Test
    public void printingReducesTonerByPagesUsed(){
        inkJet.print(1,2); // 2 pages should reduce toner by 2
        assertEquals(3, inkJet.getToner());
    }

    @Test
    public void printWillNotReduceTonerIfTooManyPagesToPrint(){
        inkJet.print(3,2); // 6 pages - enough paper but not enough toner
        assertEquals(5, inkJet.getToner());
    }
}
