package Part3;

public class Configuration {
	
	static String appName;
	static String version;
	
	static {
		appName = "My Application";
        version = "1.0.0";
        System.out.println("Static block executed");
	}
	
	void display() {
        System.out.println("App Name: " + appName + ", Version: " + version);
    }
	
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.display();
	}

}
