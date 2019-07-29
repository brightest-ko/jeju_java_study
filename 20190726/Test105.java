package temp;

import java.sql.*;
import java.util.*;

//javac -d . Test105.java
//java -classpath .;ojdbc14.jar temp.Test105
public class Test105{
    public static void main(String[] args) throws Exception{
	
//		BangMyungDAO.addGul("끝이 보이냐?");
        List<BangMyungVO> ls2 = BangMyungDAO.findAll();
         
        for(BangMyungVO t : ls2){
            System.out.println( t.getNo()+"\t"+t.getGul()+"\t"+t.getTheTime());
		}
	}
}