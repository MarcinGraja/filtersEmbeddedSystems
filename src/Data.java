public class Data {
    private double[] trueAngles;
    private double[] times;
    private double[] gyro;
    private double[] accelerator;
    private double[] angularVelocities;
    private double[] complimentaryFilter;
    private double[] step5Filter;
    private double[] step10Filter;

    public double getTrueAngle(int i) {
        return trueAngles[i];
    }

    public double getTime(int i) {
        return times[i];
    }

    public double getGyro(int i) {
        return gyro[i];
    }

    public double getAccelerator(int i) {
        return accelerator[i];
    }

    public double[] getTrueAngles() {
        return trueAngles;
    }

    public void setTrueAngles(double[] trueAngles) {
        this.trueAngles = trueAngles;
    }

    public double[] getTimes() {
        return times;
    }

    public void setTimes(double[] times) {
        this.times = times;
    }

    public double[] getGyro() {
        return gyro;
    }

    public void setGyro(double[] gyro) {
        this.gyro = gyro;
    }

    public double[] getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(double[] accelerator) {
        this.accelerator = accelerator;
    }

    public double[] getAngularVelocities() {
        return angularVelocities;
    }

    public void setAngularVelocities(double[] angularVelocities) {
        this.angularVelocities = angularVelocities;
    }

    public double[] getComplimentaryFilter() {
        return complimentaryFilter;
    }

    public void setComplimentaryFilter(double[] complimentaryFilter) {
        this.complimentaryFilter = complimentaryFilter;
    }

    public double[] getStep5Filter() {
        return step5Filter;
    }

    public void setStep5Filter(double[] step5Filter) {
        this.step5Filter = step5Filter;
    }

    public double[] getStep10Filter() {
        return step10Filter;
    }

    public void setStep10Filter(double[] step10Filter) {
        this.step10Filter = step10Filter;
    }
}
