import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterCSV {
    public static void write(Data data, String filePath){
        BufferedWriter bufferedWriter;
        try {
             bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        try {

            bufferedWriter.write("true angle," +
                    "time[ms]," +
                    "gyro," +
                    "accelerometer," +
                    "filtr komplementarny (żyroskop + akcelerometr)," +
                    "filtr kroczący; średnia z 5 ostatnich pomiarów (akcelerometr)," +
                    "filtr kroczący; średnia z 10 ostatnich pomiarów (akcelerometr)\n");
            double[] times = data.getTimes();
            double[] trueAngles = data.getTrueAngles();
            double[] gyro = data.getGyro();
            double[] accelerator = data.getAccelerator();
            double[] complimentaryFilter = data.getComplimentaryFilter();
            double[] step5Filter = data.getStep5Filter();
            double[] step10Filter = data.getStep10Filter();
            for (int i = 0; i < times.length; i++){
                String string = trueAngles[i] + "," +
                        times[i] + "," +
                        gyro[i] + "," +
                        accelerator[i] + "," +
                        complimentaryFilter[i] + "," +
                        step5Filter[i] + "," +
                        step10Filter[i] + "\n";
                bufferedWriter.write(string);
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
