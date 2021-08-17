package ngtlearning;

public class NOTES {

	/**
	 * 4 TYPES OF JAVA'S ACCESS MODIFIERS (ways to control accessibility of a class/interface and its members):::
	 * public (the least restrictive; accessible across all packages)
	 * -Chart of its capabilities:
	 * 							Same Package			Different Package
	 *   Sub-Class					YES							YES
	 *   Unrelated Class			YES							YES
	 * protected (accessible to all classes/interfaces in the same package, as well as all sub-classes, even in separate packages)
	 * -Chart of its capabilities:
	 * 							Same Package			Different Package
	 *   Sub-Class					YES							YES
	 *   Unrelated Class			YES							NO
	 * default (by default (no modifiers), accessible to classes/interfaces in the same package)
	 * -Chart of its capabilities:
	 * 							Same Package			Different Package
	 *   Sub-Class					YES							NO
	 *   Unrelated Class			YES							NO
	 * private (the most restrictive; accessible only to itself!)
	 * -Chart of its capabilities:
	 * 							Same Package			Different Package
	 *   Sub-Class					NO							NO
	 *   Unrelated Class			NO							NO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
