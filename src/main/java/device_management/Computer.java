package device_management;

import behaviours.IINput;
import behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;
    private String dataStream;
    private IOutput outputDevice;
    private IINput inputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, IINput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }

    public String inputData(String data) {
        this.dataStream = data;
        System.out.println(data);
        return this.inputDevice.sendData(data);
    }



}
