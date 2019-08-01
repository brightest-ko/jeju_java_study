package mains;

import study3.BangMyungDAO;
import study3.BangMyungDAO_OracleImpl;
import study3.BangMyungVO;

public class Test108 {

	public static void main(String[] args) {
		BangMyungDAO dao = new BangMyungDAO_OracleImpl();
		
		BangMyungVO pvo = new BangMyungVO();
		pvo.setGul("HelloWorld");
		
		try {
			dao.add(pvo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
