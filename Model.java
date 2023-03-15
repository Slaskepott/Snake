import java.util.ArrayList;

class Model{
    private int antRader,antKolonner;
    private JButton[] spilleBrett;//0=tom, 1=mat, 2=hode, 3=hale
    private int retning;//0=opp, 1=ned, 2=venstre, 3=høyre
    private int[] spillerPlassering;//[0]=rad,[1]=kolonne
    private ArrayList<int[]> slangeKoe = new ArrayList<>();

    public Model(int ar,int ak){
        antRader = ar;
        antKolonner = ak;
        spilleBrett = new int[ar][ak];
        
    }
    
    private static int tilfeldigTall (int a, int b) {
        // Trekk et tilfeldig heltall i intervallet [a..b];
        return (int)(Math.random()*(b-a+1))+a;
    }


}