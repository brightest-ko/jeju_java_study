package temp;
import java.net.*;
import java.io.*;

public class HW2C{
	public static void main(String[] args) throws Exception{
	
//2.���� ����
		Socket skt = new Socket("192.168.200.139",1123); //ipconfig
		
		
//3.���� �̸� ������ ����
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		System.out.println("�ٿ���� ���ϸ��� �Է��ϼ���");
		String filename = br.readLine();

		ObjectOutputStream outfilename = new ObjectOutputStream(skt.getOutputStream());		
		outfilename.writeObject(filename);

		
//8.200/404������
		ObjectInputStream instatus = new ObjectInputStream(skt.getInputStream());
		String status = (String)instatus.readObject();
		System.out.println(status);
		InputStream infile=null;
		OutputStream outfile=null; 
		if(status.equals("200")){
//9.200 �����ϸ� ������ �޴´�.
			infile = skt.getInputStream();
			outfile = new FileOutputStream(filename);
		
			//��û���� ����. �ܿ�ÿ�
			int r = 0;
			byte[] buf = new byte[1024*8];
			while((r=infile.read(buf))!= -1){
				outfile.write(buf, 0, r);
			}
			System.out.println("========�ٿ�Ϸ�========");
		}else{
//10.404 ���ϸ��� ������ , �ٿ���и� ����ش�.
			System.out.println("========�ٿ����========");
		}
		
		infile.close();
		outfile.close();
		instatus.close();
		
		outfilename.flush();
		outfilename.close();
		
		skt.close();
	}

}