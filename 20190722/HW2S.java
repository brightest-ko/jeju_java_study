// 2������ - �Ҹ��ٴ�
/*
	������ ������ ���� ���α׷����� �������� 
	  client 				Server
	 ���� ���� 		----	���ϻ���
	 outputStream���� ----	inputStream����
	 inputStream ���� ----	outputSteam ����
	 
	 "music.mp3" 	---->	
	 ObjectOutput/ObjectInput Stream ����ؼ� writeUTF�������� Ŭ���̾�Ʈ���� ������ ������
	 �������� readUTF�� �ش� ������ �ִ����� ���� . --> �̰Ÿ� �ȹ��� �������� ���ž� ������ 
	 readInt() < ---- ������ 200 
					  ������ 404  writeInt()
	
	404 �̸� ��
	200 �̸� ���� �ٿ�ε� 
*/
package temp;
import java.net.*;
import java.io.*;

public class HW2S{
	public static void main(String[] args) throws Exception{
//1.���� ����
		ServerSocket svr = new ServerSocket(1123); //ipconfig
		System.out.println("before accept()");
		Socket skt = svr.accept();
		System.out.println("after accept()");
		
		
//4.file �̸� �ޱ�
		ObjectInputStream infilename = new ObjectInputStream(skt.getInputStream());
		String filename = (String)infilename.readObject();
		System.out.println(filename);
		
		
//5.file ���� Ȯ���ϱ�
		File f = new File("C:\\A\\"+filename);

		//������ ������ -1, ������ ?
		boolean b = f.exists();
		System.out.println(b);
		
		ObjectOutputStream outstatus = new ObjectOutputStream(skt.getOutputStream());		
		InputStream infile = null;
		OutputStream out = null;
		if( b ) {
//6. ������ 200 ������	
			outstatus.writeObject("200");
			// file�� ���̸� �����Ѵ�(long�� �ڷ�)
			System.out.println( f.length() );
			
			
//7. Ŭ���̾�Ʈ�� ���Ϻ����� 
			infile = new FileInputStream("C:\\A\\"+filename);
			out = skt.getOutputStream();
		
			int r = 0;
			byte[] buf = new byte[1024*8];
			while((r=infile.read(buf))!= -1){
				out.write(buf, 0, r);
				
			}
		}else{
//6. ������ 404 ������
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