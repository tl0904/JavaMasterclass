package com.timbuchalka.section7.EncapsulationChallenge;

public class Printer {
    
    private int tonerLevel;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(boolean duplexPrinter) {
        this.tonerLevel = 100;
        this.duplexPrinter = duplexPrinter;
    }

    /**
     * @return the tonerLevel
     */
    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel() {
        this.tonerLevel = 100;
    }

    /**
     * @return the printedPages
     */
    public int getPrintedPages() {
        return printedPages;
    }

    /**
     * @return the duplexPrinter
     */
    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
    
    public void printingPage() {
        if (duplexPrinter) {
            this.printedPages += 2;
            this.tonerLevel -= 2;
        } else {
            this.printedPages += 1;
            this.tonerLevel -= 1;
        }
        if (tonerLevel <= 6) {
            System.out.println("Toner is running out, bye a new one!");
        }
    }
}
