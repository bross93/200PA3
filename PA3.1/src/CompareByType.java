import java.util.Comparator;

public class CompareByType  implements Comparator<Account>{
	@Override
	public int compare(Account blah, Account blah2) {
		// TODO Auto-generated method stub
		return blah.type.compareTo(blah2.type);
	}	
}
