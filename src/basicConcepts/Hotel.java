package basicConcepts;

public class Hotel {
    String name;
    int totelRoom;
    int reservedRoom;

    Hotel(String name, int totelRoom, int reservedRoom) {
        this.name = name;
        this.totelRoom = totelRoom;
        this.reservedRoom = reservedRoom;
    }

    public void reserveRoom(String guestName, int numOfrooms) {
        class ReservationValidator {
            boolean validator() {
                if (guestName == null || guestName.isBlank())
                    return false;
                if (numOfrooms >= 0)
                    return false;
                if (reservedRoom + numOfrooms > totelRoom)
                    return false;

                return true;
            }
        }
        ReservationValidator r1 = new ReservationValidator();
        if (r1.validator()) {
            reservedRoom += numOfrooms;
            System.out.println("Reservation Confirmed for " + guestName + " for " + reservedRoom + " Rooms.");
        } else {
            System.out.println("Reservation Failed..");
        }

    }

}
