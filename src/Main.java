public class Main {
    public static void main(String[] args){
        Data data = new Data();
        ReaderTSV readerTSV = new ReaderTSV(data);
        readerTSV.read();
        Filters.filters(data);
        WriterCSV.write(data);
        return;
    }
}
