package features;

public class AMS {
	
	public static void main(String[] args) {
		Service service = new Service();
		service.addAccount("Ben", "Donaldson", "1");
		System.out.println(service.getAccount(1).getLastName());
		System.out.println(service.getAllAccounts().keySet());
	}

}
