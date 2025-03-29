package dep1;

public class dep1Mainrunner {
	public static void main(String[] args) {
        new Thread(() -> dep1.Dep1.main(args)).start();
        new Thread(() -> dep1.Dep2.main(args)).start();
    }

}
