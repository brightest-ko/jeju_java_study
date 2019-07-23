// 2번과제 - 소리바다
/*
	오전에 수업한 소켓 프로그래밍을 바탕으로 
	  client 				Server
	 소켓 생성 		----	소켓생성
	 outputStream생성 ----	inputStream생성
	 inputStream 생성 ----	outputSteam 생성
	 
	 "music.mp3" 	---->	
	 ObjectOutput/ObjectInput Stream 사용해서 writeUTF형식으로 클라이언트에서 서보로 보내면
	 서버에서 readUTF로 해당 파일을 있는지를 조사 . --> 이거만 안배운거 나머지는 배운거야 공부해 
	 readInt() < ---- 있으면 200 
					  없으면 404  writeInt()
	
	404 이면 끝
	200 이면 파일 다운로드 
*/
package temp;
import java.net.*;
import java.io.*;

public class HW2S{
	public static void main(String[] args) throws Exception{
//1.서버 열기
		ServerSocket svr = new ServerSocket(1123); //ipconfig
		System.out.println("before accept()");
		Socket skt = svr.accept();
		System.out.println("after accept()");
		
		
//4.file 이름 받기
		ObjectInputStream infilename = new ObjectInputStream(skt.getInputStream());
		String filename = (String)infilename.readObject();
		System.out.println(filename);
		
		
//5.file 존재 확인하기
		File f = new File("C:\\A\\"+filename);

		//파일이 없으면 -1, 있으면 ?
		boolean b = f.exists();
		System.out.println(b);
		
		ObjectOutputStream outstatus = new ObjectOutputStream(skt.getOutputStream());		
		InputStream infile = null;
		OutputStream out = null;
		if( b ) {
//6. 있으면 200 보내기	
			outstatus.writeObject("200");
			// file의 길이를 리턴한다(long형 자료)
			System.out.println( f.length() );
			
			
//7. 클라이언트로 파일보내기 
			infile = new FileInputStream("C:\\A\\"+filename);
			out = skt.getOutputStream();
		
			int r = 0;
			byte[] buf = new byte[1024*8];
			while((r=infile.read(buf))!= -1){
				out.write(buf, 0, r);
				
			}
		}else{
//6. 없으면 404 보내기
			outstatus.writeObject("404");
		}
		
		
		outstatus.flush();
		outstatus.close();
		out.flush();
		out.close();
		infile.close();
		infilename.close();
		
		
		skt.close();
		svr.close();
	
	}

}