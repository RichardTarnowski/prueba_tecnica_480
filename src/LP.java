public class LP implements Disk{
    private String brand;
    private double capacity;
    private String content;
    private String type;
    private String volatileContent;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVolatileContent() {
        return volatileContent;
    }

    public LP(String brand, double capacidad, String contenido, String tipo) {
        this.brand = brand;
        this.capacity = capacidad;
        this.content = contenido;
        this.type = tipo;

    }

    @Override
    public void spinDisk() {
        System.out.println("\nEl disco de vinilo está girando.");
    }
    @Override
    public void stopDisk(){
        System.out.println("\nEl disco de vinilo ha dejado de girar.");
    }


    @Override
    public void storeData() {
        System.out.println("\nLos datos escritos en el disco de vinilo se han almacenado correctamente.");
        this.content = this.volatileContent;
        this.volatileContent = "";
    }

    @Override
    public void writeData(String data) {
        System.out.println("\nDatos escritos en el disco de vinilo con su tecnología correspondiente.");
        this.volatileContent = data;
    }

    @Override
    public void readData() {
        System.out.println("\nDatos leídos del disco de vinilo con su tecnología correspondiente.");
        System.out.println(this.content);
    }

    @Override
    public void reportInfo() {

        System.out.println("\nEsta es la información general del disco de vinilo:" +
                "\nMarca: " + brand + "\nCapacidad: " + capacity +
                "\nContenido: " + content + "\nTipo: " + type);
    }
}
