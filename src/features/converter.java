package features;
import com.google.gson.Gson;

public class converter {
	
	public static void main(String[] args) {
		Service service = new Service();
		service.addAccount("Ben","Donaldson","1");
		Gson gson = new Gson();
		String jsonStr=gson.toJson(service.getAccount(1));
		System.out.println(jsonStr);
		
	}

}
