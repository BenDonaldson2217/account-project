package features;
import com.google.gson.Gson;

public class converter {
	
	public static void main(String[] args) {
		Service service = new Service();
		service.addAccount("Ben","Donaldson","1");
		service.addAccount("Ben","Donaldson","2");
		service.addAccount("Ben","Donaldson","3");
		service.addAccount("Ben","Donaldson","4");
		service.addAccount("Ben","Donaldson","5");
		
		Gson gson = new Gson();
		String jsonStr=gson.toJson(service.getAllAccounts());
		System.out.println(jsonStr);
		
	}

}
