import java.util.Comparator;


public class CompareByName  implements Comparator<Account>{
	@Override
	public int compare(Account blah, Account blah2) {
		// TODO Auto-generated method stub
		return blah.name.compareTo(blah2.name);
	}	
}