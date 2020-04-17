public class Main {
    public static void main(String[] args){
        Data data = new Data();
        ReaderTSV readerTSV = new ReaderTSV(data);
        readerTSV.read("src/resources/mpu6050 - mpu6050.tsv");
        Filters.filters(data);
        WriterCSV.write(data, "out.csv");
        readerTSV.read("src/resources/mpu6050 - mpu6050v2.tsv");
        Filters.filters(data);
        WriterCSV.write(data, "out2.csv");
    }
}
