package dep2;

public class Dep2Mainrunner {
	public static void main(String[] args) {
        new Thread(() -> dep2.Dep1.main(args)).start();
        new Thread(() -> dep2.Dep2.main(args)).start();
    }

}
