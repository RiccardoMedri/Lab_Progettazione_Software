public class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    double nFirstClassReservedSeats;
    double nSecondClassReservedSeats;
    double TotOccupancyRatio;
    double FirstClassOccupancyRatio;
    double SecondClassOccupancyRatio;

    void build(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats) {
        this.TotOccupancyRatio = 0;
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
    }

    void reserveFirstClassSeats(int nFirstClassReservedSeats){
        this.nFirstClassReservedSeats += nFirstClassReservedSeats;
    }

    void reserveSecondClassSeats(int nSecondClassReservedSeats){
        this.nSecondClassReservedSeats += nSecondClassReservedSeats;
    }

    double getTotOccupancyRatio(){
        this.TotOccupancyRatio = ((this.nFirstClassReservedSeats + this.nSecondClassReservedSeats)*100) / this.nTotSeats;
        return this.TotOccupancyRatio;
    }

    double getFirstClassOccupancyRatio(){
        this.FirstClassOccupancyRatio = (this.nFirstClassReservedSeats*100) / this.nFirstClassSeats;
        return this.FirstClassOccupancyRatio;
    }

    double getSecondClassOccupancyRatio(){
        this.SecondClassOccupancyRatio = (this.nSecondClassReservedSeats*100) / this.nSecondClassSeats;
        return this.SecondClassOccupancyRatio;
    }

    void deleteAllReservations(){
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
    
}
