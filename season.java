/*
* season.java
* 
* The following program uses a method called season that takes as parameters two integers
representing a month and day and returns a String indicating the season
for that month and day.
*
* By Nathan Betz
*/

public class season {
    
  public String season(int month, int day) {
    
	if ((month == 12 && day >= 16)
        || month == 1 
        || month == 2 
      	|| (month == 3 && day <= 15)) {
		  return "winter";
      	}
    
    if ((month == 3 && day >= 16)
        || month == 4 
        || month == 5 
      	|| (month == 6 && day <= 15)) {
		  return "spring";
      	}
    
    if ((month == 6 && day >= 16)
        || month == 7 
        || month == 8 
      	|| (month == 9 && day <= 15)) {
		  return "summer";
      	}
    
    if ((month == 9 && day >= 16)
        || month == 10 
        || month == 11 
      	|| (month == 12 && day <= 15)) {
		  return "fall";
      	}
    
  }
}

