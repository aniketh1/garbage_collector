public class Finalize {
    protected void finalize(){
        System.out.println("Garbage collected");
    }
    public static void main(String args[]){
        Finalize f = new Finalize();
        f = null;
        System.gc();
        System.out.println("it is in main method");
    }
}
