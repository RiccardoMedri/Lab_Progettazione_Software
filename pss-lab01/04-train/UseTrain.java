class UseTrain {
    public static void main(String[] args) {
        /*
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         */
        Train primotreno = new Train();
        primotreno.build(500, 150, 350);
         /*
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         */
        primotreno.reserveFirstClassSeats(29);
        primotreno.reserveSecondClassSeats(147);
        /*
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         */
        System.out.println("La percentuale totale di posti prenotati è del " + primotreno.getTotOccupancyRatio() + "%");
        System.out.println("La percentuale di posti prenotati in prima classe è del " + primotreno.getFirstClassOccupancyRatio() + "%");
        System.out.println("La percentuale di posti prenotati in seconda classe è del " + primotreno.getSecondClassOccupancyRatio() + "%");
         /*
         * 4) Cancellare tutte le prenotazioni
         */
        primotreno.deleteAllReservations();
        /*
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */
        primotreno.reserveFirstClassSeats(55);
        primotreno.reserveSecondClassSeats(260);
        System.out.println("La percentuale totale di posti prenotati è del " + primotreno.getTotOccupancyRatio() + "%");
        System.out.println("La percentuale di posti prenotati in prima classe è del " + primotreno.getFirstClassOccupancyRatio() + "%");
        System.out.println("La percentuale di posti prenotati in seconda classe è del " + primotreno.getSecondClassOccupancyRatio() + "%");
    }
}
