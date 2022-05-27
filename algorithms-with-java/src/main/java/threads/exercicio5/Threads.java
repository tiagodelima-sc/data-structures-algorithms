package threads.exercicio5;

public class Threads implements Runnable {
	
private int id;    
    
    public Threads(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {                
        try {            
            Thread.sleep(500);
            System.out.println("A Thread ID: " + this.id + " executou.");
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }    

}
