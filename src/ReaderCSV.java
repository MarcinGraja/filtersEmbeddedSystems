import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderCSV {
    public void read(){
        String row;
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader("src/resources/mpu6050.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try {
            row = csvReader.readLine();
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                System.out.println("here it is");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
