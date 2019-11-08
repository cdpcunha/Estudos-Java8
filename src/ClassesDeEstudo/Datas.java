package ClassesDeEstudo;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Datas {

	public static void EstudoDatas()
	{
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 20);
		System.out.println(olimpiadasRio);
		
		System.out.print("A quanto tempo foram as olimpíadas do Rio : ");
		 long qtTempo = hoje.getYear() - olimpiadasRio.getYear();
		 System.out.println(qtTempo);
		 
		 		 
		 MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		 LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		 long diasAteONatal = LocalDate.now()
		     .until(natalDesseAno, ChronoUnit.DAYS);
		 
		 System.out.println("Dias até o Natal : " + diasAteONatal);
	}
}
