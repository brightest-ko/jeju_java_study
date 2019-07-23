package temp;
import java.net.*;
import java.io.*;

public class HW2C{
	public static void main(String[] args) throws Exception{
	
//2.서버 접속
		Socket skt = new Socket("192.168.200.139",1123); //ipconfig
		
		
//3.파일 이름 서버로 보내
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		System.out.println("다운받을 파일명을 입력하세요");
		String filename = br.readLine();

		ObjectOutputStream outfilename = new ObjectOutputStream(skt.getOutputStream());		
		outfilename.writeObject(filename);

		
//8.200/404받을때
		ObjectInputStream instatus = new ObjectInputStream(skt.getInputStream());
		String status = (String)instatus.readObject();
		System.out.println(status);
		InputStream infile=null;
		OutputStream outfile=null; 
		if(status.equals("200")){
//9.200 성공하면 파일을 받는다.
			infile = skt.getInputStream();
			outfile = new FileOutputStream(filename);
		
			//엄청많이 쓴다. 외우시오
			int r = 0;
			byte[] buf = new byte[1024*8];
			while((r=infile.read(buf))!= -1){
				outfile.write(buf, 0, r);
			}
			System.out.println("========다운완료========");
		}else{
//10.404 파일명이 없을땐 , 다운실패를 띄워준다.
			System.out.println("========다운실패========");
		}
		
		infile.close();
		outfile.close();
		instatus.close();
		
		outfilename.flush();
		outfilename.close();
		
		skt.close();
	}

}