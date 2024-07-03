package ejercicio3;

public class HumanWorker implements Eatable,Workable {
    public HumanWorker() {
    }

    public void eat() {
        System.out.println("Comiendo...");
    }

    public void work() {
        System.out.println("Trabajando...");
    }
}
