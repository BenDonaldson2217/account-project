package features;

import java.util.HashMap;
import java.util.Map;

public class Service {
	int accountCount=0;
	
	Map<Integer, Account> accountList = new HashMap<Integer, Account>();
	
	public void addAccount(String firstName, String lastName, String accountNumber) {
		Account account = new Account(firstName, lastName, accountNumber);
		accountCount += 1;
		accountList.put(accountCount, account);
	}
	
	public Account getAccount(int key) {
		return accountList.get(key);
		
	}
	
	
	

}
