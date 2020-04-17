import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterCSV {
    public static void write(Data data){
        BufferedWriter bufferedWriter;
        try {
             bufferedWriter = new BufferedWriter(new FileWriter("out.csv"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        try {
            bufferedWriter.write(data.getOutAsCSV());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
