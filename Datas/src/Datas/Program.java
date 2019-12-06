package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("28/06/1999");
		Date y2 = sdf2.parse("28/06/1999 15:42:07");
		
		System.out.println(y1 + "\n" + y2);
		
		/*
		 * formatar a data para o formato de sdf1 e sdf2
		 */
		System.out.println("y1: "+sdf1.format(y1));
		System.out.println("y2: "+sdf2.format(y2));
		
		/*
		 * criar uma variavel com a data atual
		 */
		Date dataAtual = new Date();
		System.out.println("dataAtual: "+sdf2.format(dataAtual));
		
		
		/*
		 * padrao ISO 8601
		 */
		Date data = Date.from(Instant.parse("2018-06-28T15:42:07Z"));
		System.out.println(data);
	}
}
