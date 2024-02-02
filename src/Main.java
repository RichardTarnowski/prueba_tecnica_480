public class Main {
    public static void main(String[] args) {

        Cd testCd = new Cd("Mi marca de CD", 300, "Lore Ipsum CD", "Mi tipo de CD");

        testCd.spinDisk();
        testCd.reportInfo();
        testCd.writeData("Este es mi contenido de prueba cambiado para el CD.");
        testCd.storeData();
        testCd.readData();
        testCd.reportInfo();


        HardDisk testHD = new HardDisk("Mi marca de disco duro", 2000, "Lore Ipsum disco duro", "Mi tipo de disco duro");

        testHD.spinDisk();
        testHD.reportInfo();
        testHD.writeData("Este es mi contenido de prueba cambiado para el disco duro.");
        testHD.storeData();
        testHD.readData();
        testHD.reportInfo();

    }
}