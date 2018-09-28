public class InitializationWithDefaults {

	private boolean booleanMember;
	private byte byteMember;
	private short shortMember;
	private long longMember;
	private int intMember;
	private float floatMember;
	private double doubleMember;
	private Object objectMember;

	public InitializationWithDefaults() {

		System.out.println( "booleanMember " + booleanMember );
		System.out.println( "byteMember " + byteMember );
		System.out.println( "shortMember " + shortMember );
		System.out.println( "longMember " + longMember );
		System.out.println( "intMember " + intMember );
		System.out.println( "floatMember " + floatMember );
		System.out.println( "doubleMember " + doubleMember );
		System.out.println( "objectMember" +objectMember );
	}
}