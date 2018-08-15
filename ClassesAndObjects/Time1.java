public class Time1 {

	private int hour;
	private int minute;
	private int second;

	// set new time using universal time format: 
	// throw an exception if the hour, minute and second is invalid
	public void setTime ( int h, int m, int s ) {

		if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 24 ) && 
			( s >= 0 && s < 24 ) ) {
			
			hour = h;
			minute = m;
			second = s;
		}
		else
			throw new IllegalArgumentException( 
				"hour, minute and/or second was out of range" );
	} // end method setTime

	// convert to String in Universal-time format (HH:MM:SS)
	public String toUniversalString() {

		return String.format( "%02d:%02d:%02d", hour, minute, second );
	} // end method toUniversalString

	public String toString() {

		return String.format( "%d:%02d:%02d %s", 
			( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ), 
			minute, second, ( hour < 12 ? "AM" : "PM" ) );
	} // end method toString
} // end class Time1