package sef.module8.activity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Thsi class represents a simple representation of an account encapsulating
 * a name 
 * 
 * @author John Doe
 *
 */
public class Account {
	
//	static final Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-zA-Z])[a-zA-Z\\d]+$");
	static final Pattern alphaPattern = Pattern.compile("^[a-zA-Z]+$");
	static final Pattern numericPattern = Pattern.compile("^\\d+$");
	
	private String accountName;

	/**
	 * Creates an Account object with the specified name.  If the accout name
	 * given violates the minimum requirements, then an AccountException is thrown
	 * 
	 * @param accountName
	 * @throws AccountException
	 */
	public  Account(String accountName) throws AccountException{
		
		if(accountName.length() <= 4) {
			throw new AccountException(AccountException.NAME_TOO_SHORT, accountName);
		}
		boolean atleastOneIsAlpa = alphaPattern.matcher(accountName).find();
		boolean atleastOneIsNumeric = numericPattern.matcher(accountName).find();
		if(atleastOneIsAlpa && atleastOneIsNumeric) {
			throw new AccountException(AccountException.NAME_TOO_SIMPLE, accountName);
		}
			
		this.accountName = accountName;	
	}
	
	
	/**
	 * Returns the account name
	 * 
	 * @return the account name
	 */
	public String getName(){
		return accountName;
	}
}
