public class Test {
    public static void main(String[] args) {
        //Yavili miru rytsarya
        Knight knight = new Knight();
        //Otpravlyayem yego za printsessoy
        knight.goAndSaveThePrincess();
    }
}

class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        System.out.println("Da idu uzhe...");
    }

    private void sharpenBlade() {
        System.out.println("Tochim mech");
    }
    private void getFood() {
        System.out.println("Sobirayem konservy");
    }
    private void assembleTeam() {
        System.out.println("Budim oruzhenostsa");
    }
}