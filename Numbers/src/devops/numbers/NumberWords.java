package devops.numbers;

public class NumberWords {
	 String ones[] = {" ", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", 
			 "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
			 "EIGHTEEN", "NINETEEN"
     };
	 
    String tens[] = {" ", " ", "TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
  

	public String toWords( int num ) {
		String result = String.valueOf(num) ;
		
//		if (num ==1){
//			result=ones[1];
//		}
//		if (num ==50){
//			result=tens[num / 10] + " " + ones[num % 10];
//		}
		
	    if (num > 0) {
	    	 result ="Number not in range";
	     }

	     if (num > 19 && num <100) {
	         result = tens[num / 10] + " " + ones[num % 10];
	     }
         if (num>99 && num <1000){
	    	 result = ones[num/100] +" "+ "HUNDREDS" + " "+ tens[(num % 100)/10] + " " + ones[(num % 100) % 10];
	     }
	     	     
	     else {
	    	 if(num<19){
	    	 result = ones[num];}
	     }
		
		
		
		return result.trim() ;
	}

}
