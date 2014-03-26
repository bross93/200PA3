import java.util.Comparator;


public class CompareByCity  implements Comparator<Account>{
	@Override
	public int compare(Account blah, Account blah2) {
		// TODO Auto-generated method stub
		return blah.city.compareTo(blah2.city);
	}	
}
