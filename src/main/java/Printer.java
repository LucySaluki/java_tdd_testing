public class Printer {
    private int sheetCount;
    private int tonerVolume;

    public Printer(int sheetCount, int tonerVolume){
        this.sheetCount=sheetCount;
        this.tonerVolume=tonerVolume;
    }

    public int getSheets(){
        return this.sheetCount;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public boolean print(int pages, int copies){
        if (pages * copies<=this.sheetCount) {
            this.sheetCount -= (pages * copies);
            this.tonerVolume -=(pages * copies);
            return true;
        } else {
            return false;
        }
    }
}
