import Singleton.Rebond;

public class LaboRebonds {

    public LaboRebonds () {
        Rebond.getInstance().setTitle("Appli de rebonds");
    }


    public static void main (String[] args) {
        new LaboRebonds();
    }

}
