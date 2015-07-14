package compareVersion;

public class CompareVersion {
	public static int compareVersion1(String ver1, String ver2) {
		String[] v1 = ver1.split("\\.");
		String[] v2 = ver2.split("\\.");

		int longestLength = v1.length > v2.length ? v1.length : v2.length;
		
		for (int i = 0; i < longestLength; i++) {
			int version1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
			int version2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;
			if (version1 > version2) {
				return 1;
			}
			if (version1 < version2) {
				return -1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		System.out.println(compareVersion1("12.0.0.1","12.0.0.2"));
	}
}
