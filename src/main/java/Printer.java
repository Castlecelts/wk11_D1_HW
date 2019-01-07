public class Printer {
    private double paperInPrinter;
    private double tonerInPrinter;

    public Printer(double paperInPrinter, double tonerInPrinter){
        this.paperInPrinter = paperInPrinter;
        this.tonerInPrinter = tonerInPrinter;
    }

    public double availablePaper() {
        return this.paperInPrinter;
    }

    public double availableToner(){
        return this.tonerInPrinter;
    }

    public String printOrder(double pages, double copies){
        if (this.paperInPrinter >= (pages * copies)) {
            this.paperInPrinter -= (pages * copies);
            this.tonerInPrinter -= (pages * copies);
            return "Printing your order";
        }
        else{
            return "Not enough paper";
        }
    }

    public void refillPaper(int amountOfNewPaper) {
        this.paperInPrinter += amountOfNewPaper;
    }
}
