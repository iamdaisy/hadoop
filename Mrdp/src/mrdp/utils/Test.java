package mrdp.utils;

public class Test {
	public static void main(String[] args) {

		String str ="Id=\"8\" Reputation=\"6007\"";
		String[] result = str.split("\"");

		for(int i=0; i < result.length; i++){         
			System.out.println(i + "¹øÂ° : " + result[i]);
	        }         

		for (int i=0; i < result.length - 1; i+=2) {
			String key = result[i].trim();
			String val = result[i + 1];
			System.out.println("key : " + key.substring(0, key.length() - 1));
			System.out.println("val : " + val);
		}
	}

}
