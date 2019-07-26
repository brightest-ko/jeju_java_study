import java.net.*;
import java.io.*;

class A implements Runnable{
	InputStream in = null;
	OutputStream out = null;
	
	public A(InputStream in, OutputStream out){
		this.in = in;
		this.out = out;
	}
	
	//Override
	public void run(){
		try{
		int r = 0;
        byte[] buf = new byte[512];

        while( ( r = in.read( buf ) ) != -1 ) {
            out.write( buf, 0, r );
            out.flush();
        	try{
				//쓰레드를 잠시 멈춰세우는 메소드 -밀리세컨드 단위
				int time =(int)(Math.random() * 100.0);
				Thread.sleep(time);
			}catch( InterruptedException e){}
		}
		}catch(Exception e){}
	}
}
public class TestFileDownS 
{
    public static void main( String[] args ) throws Exception {
		ServerSocket svr = new ServerSocket( 1123 );
		
		
        int alive = 3;
        
		Thread[] threads = new Thread[3];
		for(int i=0;i<alive;i++) {
		    Socket skt = svr.accept();
			System.out.println( skt.getInetAddress().toString() );

			String fle = "C:\\A\\jdk-6u30-apidocs.zip";
            InputStream in = new FileInputStream( fle );
            OutputStream out = skt.getOutputStream();
			
            threads[i] = new Thread(new A(in, out) );
			threads[i] = new Thread(new A(in, out) );
			threads[i] = new Thread(new A(in, out) );
			threads[i].start();
//			new Thread( new A(in, out) ).start();

            out.close();
            in.close();

			skt.close();
        }

		svr.close();
	}
}
