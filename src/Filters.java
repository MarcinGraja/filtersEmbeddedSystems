public class Filters {

    public static void filters(Data data) {
        double[] angularVelocities = new double[data.getGyro().length];
        double[] complimentaryFilter = new double[data.getGyro().length];
        double[] step5Filter = new double[data.getGyro().length];
        double[] step10Filter = new double[data.getGyro().length];

        angularVelocities[0] = 0;
        for (int i = 1; i < data.getGyro().length; i++) {
            angularVelocities[i] = (data.getGyro(i) - data.getGyro(i - 1)) / (data.getTime(i) - data.getTime(i - 1));
        }
        data.setAngularVelocities(angularVelocities);

        for (int i = 2; i < data.getGyro().length; i++) {
            complimentaryFilter[i] = 0.98 * (complimentaryFilter[i-1] + angularVelocities[i] * (data.getTime(i) - data.getTime(i - 1))) + 0.02 * data.getAccelerator(i);
        }
        data.setComplimentaryFilter(complimentaryFilter);

        for (int i = 0; i < data.getGyro().length; i++) {
            if (i < 4)
                step5Filter[i] = 0;
            else
                step5Filter[i] = (data.getAccelerator(i - 4) + data.getAccelerator(i - 3) + data.getAccelerator(i - 2) + data.getAccelerator(i - 1) + data.getAccelerator(i)) / 5;
        }
        data.setStep5Filter(step5Filter);

        for (int i = 0; i < data.getGyro().length; i++) {
            if (i < 9)
                step10Filter[i] = 0;
            else
                step10Filter[i] = (data.getAccelerator(i - 9) + data.getAccelerator(i - 8) + data.getAccelerator(i - 7) + data.getAccelerator(i - 6) + data.getAccelerator(i - 5)
                        + data.getAccelerator(i - 4) + data.getAccelerator(i - 3) + data.getAccelerator(i - 2) + data.getAccelerator(i - 1) + data.getAccelerator(i)) / 10;
        }
        data.setStep10Filter(step10Filter);
    }
}
