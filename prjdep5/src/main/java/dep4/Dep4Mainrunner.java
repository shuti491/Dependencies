package dep4;

public class Dep4Mainrunner {
	public static void main(String[] args) {
        new Thread(() -> dep4.Dep1.main(args)).start();
        new Thread(() -> dep4.Dep2.main(args)).start();
    }

}
