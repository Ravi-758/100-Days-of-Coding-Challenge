import java.util.Date;
import java.text.SimpleDateFormat;
public class GFG {
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println("Current Time is : " + date);
		SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
		String time = formatTime.format(
			date); 
		System.out.println(
			"Current Time in AM/PM Format is : " + time);
	}
}
