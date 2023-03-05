public class Driver{
    public static void main(String[] args) {

        UFC ufc285 = new UFC(285);
        ESPN espn = new ESPN(ufc285);

        Punch punch = new Punch();
        Kick kick = new Kick();
        Knockout knockout = new Knockout();

        ufc285.attack(punch);
        ufc285.attack(kick);
        ufc285.attack(knockout);
    
    }
}
 