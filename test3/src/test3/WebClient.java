package test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WebClient {
	public static void main(String[] args) throws IOException {
		
		String ip = "192.168.112.7";
		int port = 8080;
		String uri = "/day02/index.jsp";
		
		Socket so = new Socket(ip, port);	// 다른 컴퓨터와 연결하기 위한 전화기
		PrintWriter out = new PrintWriter(so.getOutputStream());	// 내컴퓨터에서 대상에게 데이터를 보내는 통로
		Scanner sc = new Scanner(so.getInputStream());				// 대상이 보내는 데이터를 내가 받기 위한 통로
		
		String request = "";
		request += "GET " + uri + "  HTTP/1.1";
		request += "\n";
		
		request += "Host: " + ip + ":" + port;
		request += "\r\n";
		
		request += "\r\n";
		
		out.write(request);
		out.flush();
		
		System.out.println(request);
		System.out.println("=========================================");
		
		String response = "";
		
		while(sc.hasNextLine()) {
			response += sc.nextLine();
			response += "\r\n";
		}
		System.out.println(response);
		
		sc.close();
		out.close();
		so.close();
			
	}

}
