package calculator;

import java.util.regex.Pattern;

public class CalculateOperation {

	
	
	private final String _VALID_INPUT_REGEX = "(\\d*\\W{1}\\d+)+";

	public int stringadd(String number1) {
		
		return 0;
	}

    public int stringaddvalid(String number1, String number2) {
		
		return Integer.parseInt(number1) + Integer.parseInt(number2);
	}

     public int stringaddvalid(String number1) throws Exception {
		
		 throw new Exception("Invalid Exception, Please enter data again");
	}

	public Integer stringaddusingdelimiter(String numbers) throws Exception {
		int add=0;
		if(!numbers.isEmpty()) {
			if(isValidInput(numbers)) {
				throw new Exception("Invalid Exception, Please enter data again" + numbers);
			}
			else {
				final String finalNumber[]=numbers.split("\\W");
				System.out.println(finalNumber);
				for (int i=0;i<finalNumber.length;i++) {
					add+=Integer.parseInt(finalNumber[i]);
				}
			}
				
		}
		
		
		return add;
	}

	private boolean isValidInput(String numbers) {
		final Pattern pattern = Pattern.compile(_VALID_INPUT_REGEX);
		return numbers.contains("-") || numbers.contains(".") || !pattern.matcher(numbers).matches();
		
	}   
	
	
}
