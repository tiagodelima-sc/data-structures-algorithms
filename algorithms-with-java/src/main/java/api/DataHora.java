package api;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataHora {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DataHora();
		
	}
	
	public DataHora() {
		
		Period p = Period.parse("P1Y12M");
		
		System.out.println(p.getMonths()+" "+p.getYears());
		
		/*formatadoresEspecializaddos2();
		formatadoresEspecializadosPattern();
		formatadoresPredefinidos2();
		formatadoresLocalizados();
		formatadoresPredefinidos();
		
		metodosClassePeriod();
		classeLocalTime();
		classeLocalDate();
		classeLocalDateTime();
		 */
		 
	}
	
	void formatadoresLocalizados() {
		LocalDate ld = LocalDate.now();
		System.out.println("SHORT: "+ ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
		System.out.println("MEDIUM: "+ ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println("LONG: "+ ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println("FULL: "+ ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println("LOCALTIME");
		
		LocalTime lt = LocalTime.now();
		
		lt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
		
		System.out.println("SHORT: "+ DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(lt));
		System.out.println("MEDIUM: "+DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(lt));
		
	}
	
	void formatadoresEspecializaddos2() {
		
		
		String [] minutes = {"m","mm"};
		String [] hours = {"h","hh"};
		String [] days = {"d","dd"};
		String [] months = {"M","MM","MMM","MMMM","MMMMM"};
		String [] years = {"y","yy","yyyy"};
		String converts = "-> "; // seta para direita
		
		LocalDateTime ldt = LocalDateTime.parse("2015-01-01T01:01:01");
		System.out.print("Hours:  ");
		
		Arrays.asList(hours).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p))+" ");
		});
		

		System.out.print("\nMinutes:  ");
		
		Arrays.asList(minutes).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p))+" ");
		});

		System.out.print("\nMonths:  ");
		
		Arrays.asList(months).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p))+" ");
		});
		
		
		System.out.print("\nDays:  ");
		
		Arrays.asList(days).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p))+" ");
		});	
		
		
		System.out.print("\nYears:  ");
		
		Arrays.asList(years).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p))+" ");
		});
		
	}
	
	void formatadoresEspecializadosPattern() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		System.out.println(formatter.format(LocalDateTime.now()));
		
		System.out.println(LocalDateTime.now().format(formatter));
		
		TemporalAccessor parse = formatter.parse("26-05-2022 08:05:44");
		LocalDateTime from = LocalDateTime.from(parse);
		System.out.println(from);
		
		
	}
	
	void formatadoresPredefinidos2() {
		
		DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
		LocalDateTime ldtNow = LocalDateTime.now();
		
		System.out.println(ldtNow);
		
		String format = isoDateTime.format(ldtNow);
		System.out.println(format);
		
		DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
		System.out.println(isoDate.format(ldtNow));
		
		DateTimeFormatter isoTime = DateTimeFormatter.ISO_TIME;
		System.out.println(isoTime.format(ldtNow));
		
		//FORMAT STYLE
		
		DateTimeFormatter oflocalizedDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(oflocalizedDateTime.format(ldtNow));
		
		DateTimeFormatter oflocalizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(oflocalizedDate.format(ldtNow));
		
		DateTimeFormatter oflocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(oflocalizedTime.format(ldtNow));
		
	}
	
	void formatadoresPredefinidos() {
		
		LocalDate ld = LocalDate.now();
		
		List<DateTimeFormatter> ldtFormatterList = new ArrayList<>();
		ldtFormatterList.add(DateTimeFormatter.ISO_TIME);//14:10:23.2457951
		ldtFormatterList.add(DateTimeFormatter.ISO_DATE);//2022-05-26
		ldtFormatterList.add(DateTimeFormatter.ISO_DATE_TIME);//2022-05-26T14:10:23.2457951
		
		ldtFormatterList.add(DateTimeFormatter.ISO_LOCAL_DATE);//2022-05-26
		ldtFormatterList.add(DateTimeFormatter.ISO_LOCAL_TIME);//14:10:23.2457951
		ldtFormatterList.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);//2022-05-26T14:10:23.2457951
		
		ldtFormatterList.add(DateTimeFormatter.BASIC_ISO_DATE);//20220526 Basic ISO date	
		ldtFormatterList.add(DateTimeFormatter.ISO_ORDINAL_DATE);//2022-146 Year and day of year
		
		LocalDateTime ldt = LocalDateTime.now();
		
		ldtFormatterList.forEach(c -> System.out.println(ldt.format(c)));
		
		/*
		System.out.println(ld);
		System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		OffsetDateTime odt = OffsetDateTime.now();// -03:00 com timezone  UTC/Greenwich
		System.out.println(odt.format(DateTimeFormatter.ISO_DATE));
		System.out.println(odt.format(DateTimeFormatter.ISO_OFFSET_DATE));
		System.out.println(odt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(zdt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		System.out.println(zdt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
		*/
	}
	
	void metodosClassePeriod() {
		System.out.println("METODOS PERIOD");

		
		System.out.println(Period.ofYears(1));//1 ano
		System.out.println(Period.of(3,4,10));//P3Y4M10D
		
		Period p1 = Period.ofYears(1);
		Period p2 = Period.ofMonths(12);
		Period p3 = Period.ofWeeks(52);
		Period p4 = Period.ofDays(366);
		Period p5 = Period.of(1, 12, 366);
		
		LocalDate ld1 = LocalDate.of(2000, Month.JANUARY, 1);
		LocalDate ld2 = null;
		ld2 = ld1.plus(p1).plus(p2).plus(p3).plus(p4).plus(p5);
		System.out.println(ld1);
		System.out.println("Before: "+ld1 + " After: "+ ld2);
		
		System.out.println(Period.parse("P41Y2M3D"));//41 anos, 2 meses e 3 dias
		System.out.println(Period.parse("P4W").getDays() + " Days");//4 semanas

		Period pd1 = Period.of(1, 1, 1);
		pd1 = pd1.withYears(5); //altera somente o Ano, cria uma cópia
		System.out.println(pd1);
		System.out.println(pd1.getYears());
		
		System.out.println(Period.of(10, 2, 33).plus(Period.ofYears(50)));
		
		
		final String WAR_OF_1812_START_DATE = "1812-06-18";
		final String WAR_OF_1812_END_DATE = "1815-09-19";
		
		
		LocalDate warBegins = LocalDate.parse(WAR_OF_1812_START_DATE);
		LocalDate warEnds = LocalDate.parse(WAR_OF_1812_END_DATE);
		
		Period periodBetween = Period.between(warBegins, warEnds);
		
		System.out.println(periodBetween);
		System.out.println(periodBetween.getDays() + " Days " + periodBetween.getMonths() + " months " + periodBetween.getYears() + " years ");

	}
	
	
	void classeLocalDateTime() {
				
		System.out.println("DATETIME");
		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
		System.out.println(LocalDateTime.parse("2015-01-01T12:00:00"));
		System.out.println(LocalDateTime.of(2015,1,1,1,0));
		System.out.println(LocalDateTime.parse("2015-01-01 12:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm") ));
			
		System.out.println("Prefixos de metodos data e hora");

		LocalDate ld = LocalDate.of(2022, 12, 10);
		LocalTime lt = LocalTime.of(10, 5);
		
		System.out.println("OF "+lt);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		
		//parse
		System.out.println("PARSE "+ LocalDateTime.parse("2020-01-01T10:00:00"));
		//get
		System.out.println("GET "+ldt.getDayOfMonth());
		//IS
		LocalTime lt2 = LocalTime.of(2, 15);
		System.out.println("IS "+ lt2.isAfter(lt));
		//WITH -> altera a hora
		System.out.println("Original "+ lt + "WithHour "+ lt.withHour(2));
		//plus, minus
		System.out.println("PlusMinus TIME: " + lt.plusHours(2).plusMinutes(10).minusHours(1).plusSeconds(2));
		System.out.println("PlusMinus DATE: "+ ld.plus(Period.of(2, 3, 1).minus(Period.ofMonths(1).plusDays(1))));
		
		//TO
		System.out.println("TO "+ lt.toNanoOfDay());
		
		// AT -> combina um objeto com outro
		System.out.println("AT "+ ld.atStartOfDay());
		
		System.out.println();
		
	}

	void classeLocalTime() {
		
		
		//LocalTime inclui várias declarações de métodos que dão suporte a criação de um horário sem fuso e sem data
		System.out.println("METODOS CLASSE LocalTime");
		System.out.println(LocalTime.now());
		//int hour, int minute
		System.out.println(LocalTime.of(13,25));//13:25
		//int hour, int minute, int sec
		System.out.println(LocalTime.of(13,25,10));//13:25:10
		//hour
		System.out.println(LocalTime.parse("10:10"));//10:10
		System.out.println(LocalTime.parse("10:10", DateTimeFormatter.ISO_TIME));//10:10
				
		
		System.out.println(LocalTime.NOON);// 12:00
		System.out.println(LocalTime.MIN);//00:00
		System.out.println(LocalTime.MAX);//23:59:59.999999999
		System.out.println(LocalTime.MIDNIGHT);//00:00
		System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));//região
		
		
	}
	
	void classeLocalDate() {
		System.out.println("METODOS CLASSE LocalDate");
		
		
		System.out.println(LocalDate.now());
		//year, month, dayOfMonth
		System.out.println(LocalDate.of(2022, Month.APRIL, 10));//2022-04-10

		System.out.println(LocalDate.parse("2022-05-22", DateTimeFormatter.ISO_DATE));//2022-05-22
		
				
		
	}

}
