import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderTSV {
    Data data;

    public ReaderTSV(Data data) {
        this.data = data;
    }

    public void read(String filePath){
        String row;
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        ArrayList <Double> angle = new ArrayList<>();
        ArrayList <Double> time = new ArrayList<>();
        ArrayList <Double> gyro = new ArrayList<>();
        ArrayList <Double> accelerometer = new ArrayList<>();
        try {
            row = csvReader.readLine();
            while ((row = csvReader.readLine()) != null) {
                String [] data = row.split("\t");
                angle.add(Double.parseDouble(data[0].replaceAll(",",".")));
                time.add(Double.parseDouble(data[2].replaceAll(",",".")));
                gyro.add(Double.parseDouble(data[3].replaceAll(",",".")));
                accelerometer.add(Double.parseDouble(data[4].replaceAll(",",".")));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        data.setTrueAngles(angle.stream().mapToDouble(i->i).toArray());
        data.setTimes(time.stream().mapToDouble(i->i).toArray());
        data.setGyro(gyro.stream().mapToDouble(i->i).toArray());
        data.setAccelerator(accelerometer.stream().mapToDouble(i->i).toArray());
    }
}
