public interface Disk {


    void spinDisk();

    void stopDisk();
    void storeData();
    void writeData(String dataContent);
    void readData();
    void reportInfo();
}
