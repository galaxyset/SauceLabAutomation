package com.hcl.selenium;

import com.hcl.utility.Utils;

public class PasswordEncryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pwd  ="softgen123";
		
		Utils.pwdEncrypt(pwd);
		Utils.pwdDecrypt("U291bXlhMTIz");
		
	}

}
