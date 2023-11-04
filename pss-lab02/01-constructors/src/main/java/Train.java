package it.unibo.constructors;

class Train {

    static final int DEFAULT_N_FC_SEATS = 50;
    static final int DEFAULT_N_SC_SEATS = 100;
    static final int DEFAULT_TOT_SEATS = 150;

    int seats;
    int firstClassSeats;
    int secondClassSeats;
    int firstClassReserved;
    int secondClassReserved; 

    Train(){                //costruttore che richiama parametri da altri costruttori, devo mettere nel this lo stesso numero di parametri presenti nel costruttore richiamato
        this(500, 150, 350);
    }
    
    Train(int nFCSeats, int nSCSeats){
        this.firstClassSeats = nFCSeats;
        this.secondClassSeats = nSCSeats;
        this.seats = nFCSeats+nSCSeats;
    }

    Train(final int seats, final int firstClassSeats, final int secondClassSeats){    //costruttore base
        this.seats = seats;
        this.firstClassSeats = firstClassSeats;
        this.secondClassSeats = secondClassSeats;
    }

    void verifica(){
        if (this.seats>0 && this.firstClassSeats+this.secondClassSeats==this.seats) {
            System.out.println("Sto treno sta apposto uaglioooooo, mo mangio la parmigiana di mammà \n");
        }
        else {
            System.out.println("ERRORE ERRORE, TRENO NON PARTENOPEO, QUESTO TRENO NON AMA IL VESUVIO \n");
        }
    }

    void deleteAllReservations() {
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    double getFirstClassOccupancyRatio() {
        return this.firstClassReserved * 100d / this.firstClassSeats;
    }

    int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    int getSecondClassSeats() {
        return this.secondClassSeats;
    }

    double getOccupancyRatio() {
        return (this.firstClassReserved + this.secondClassReserved) * 100d / this.seats;
    }

    double getSecondClassOccupancyRatio() {
        return this.secondClassReserved * 100 / this.secondClassSeats;
    }

    int getTotalSeats() {
        return this.seats;
    }

    void printTrainInfo() {
        System.out.println("Train info:");
        System.out.println("-nTotSeats: " + this.seats);
        System.out.println("-nFCSeats: " + this.firstClassSeats);
        System.out.println("-nSCSeats: " + this.secondClassSeats);
        System.out.println("-nFCReservedSeats: " + this.firstClassReserved);
        System.out.println("-nSCReservedSeats: " + this.secondClassReserved + "\n");
    }

    void reserveFirstClassSeats(final int nSeats) {
        this.firstClassReserved += nSeats;
    }

    void reserveSecondClassSeats(final int nSeats) {
        this.secondClassReserved += nSeats;
    }
}
