package one;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) {
		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		format = new SimpleDateFormat("dd-M-yyyy");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		format = new SimpleDateFormat("dd MMMM YYYY");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		format = new SimpleDateFormat("EEEE, dd MMM YYYY");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
		
		try{
			Date strToDate = format.parse(DateToStr);
			System.out.println(curDate);
		}
		catch (ParseException e){
			e.printStackTrace();
			
			
		}

	}

}
