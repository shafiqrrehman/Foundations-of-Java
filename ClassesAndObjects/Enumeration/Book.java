public enum Book {

	JHTP( "Java How to Program", "2012" ),
	CHTP( "C How to Program", "2007" ),
	IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
	CPPHTP( "C++ How to Program", "2012" ),
	VBHTP( "Visual Basic 2010 How to Program", "2011" ),
	VSHARPHTP( "Visual C# 2010 How to Program", "2011" );

	private final String title;
	private final String copyrightYear;

	Book( String bookTitle, String bookCopyrightYear ) {

		title = bookTitle;
		copyrightYear = bookCopyrightYear;
	}

	public String getTitle() {

		return title;
	}

	public String getCopyrightYear() {

		return copyrightYear;
	}
}