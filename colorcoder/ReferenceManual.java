package colorcoder;

public class ReferenceManual {
	static void printReferenceManual() {
		System.out.println("Pair No.  Major Color  Minor Color");
		for(int pairNumber =1; pairNumber<=25; pairNumber++) {
			ColorPair colorPair = ColorPair.GetColorFromPairNumber(pairNumber);
			System.out.println(pairNumber+ "         "+ colorPair.getMajor()+ "            "+colorPair.getMinor());
		}
	}

}
