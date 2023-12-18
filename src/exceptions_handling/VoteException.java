package exceptions_handling;

public class VoteException {

	public static void main(String[] args) {
		class MovieException extends Exception{
			public MovieException(String msg) {
				super(msg);
			}
		}
		 
	}

}
