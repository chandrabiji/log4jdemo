import org.apache.log4j.Logger;

public class Test {
    static Logger log = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		int a = 10,b=0;
		System.out.println("Frist Line");
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.warn("Exception Message "+e.toString());
		}
		System.out.println("Last Line");

	}

}
