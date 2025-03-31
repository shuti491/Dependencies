package dep3;

public class Dep3Mainrunner {
	public static void main(String[] args) {
        new Thread(() -> dep3.Dep1.main(args)).start();
        new Thread(() -> dep3.Dep2.main(args)).start();
    }

}
