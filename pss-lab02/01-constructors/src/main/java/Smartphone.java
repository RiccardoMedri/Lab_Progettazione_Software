package it.unibo.constructors;

class Smartphone {

    static final boolean DEF_HAS_GPS = true;
    static final boolean DEF_HAS_3G = true;
    static final boolean DEF_HAS_NFC = true;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    int nCPU;
    int ram;
    int sdSize;
    String brand;
    String model;
    boolean hasGPS;
    boolean has3G;
    boolean hasNFC;

    Smartphone(final int nCPU, final int ram, final String brand, final String model, final int sdSize, final boolean hasGPS, final boolean has3G, final boolean hasNFC){
        this.nCPU = nCPU;
        this.ram = ram;
        this.brand = brand;
        this.model = model;
        this.sdSize = sdSize;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    Smartphone(final String brand, final String model) {
        this(DEF_N_CPU, DEF_RAM_SIZE, brand, model, DEF_SD_SIZE, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, brand, model, DEF_SD_SIZE, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, brand, model, DEF_SD_SIZE, hasGPS, has3G, DEF_HAS_NFC);
    }

    Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, brand, model, sdSize, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }
    
    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    public static void main(final String[] args) {
        // 1) Creare lo smarthpone HTC One sdSize:1024
        Smartphone telefono = new Smartphone ("HTC", "One", 1024);
        // 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 cpu:4 sdSize:8192 gps:true nfc:true 3g:true
        Smartphone telefono1 = new Smartphone (4, 2048, "Samsung", "Galaxy Note 3", 8192, true, true, true);
        // 3) Creare lo smarthpone Apple iPhone 5S nfc:false
        Smartphone telefono2 = new Smartphone ("Apple","Iphone 5s", false);
        // 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true
        Smartphone telefono3 = new Smartphone ("Google", "Nexus 4", true, true);
        // 5) Utilizzare il metodo printStringRep per stampare in standard output le informazioni di ciascun telefono
        telefono.printStringRep();
        telefono1.printStringRep();
        telefono2.printStringRep();
        telefono3.printStringRep();
    }
}