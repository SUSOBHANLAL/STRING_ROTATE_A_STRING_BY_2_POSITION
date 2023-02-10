package rotateAStringBy2;

public class susobhan {
	public static void main(String args[])
	{
		String s = "amazon";
		int position =2;
		int  ix= position -1;
		int n = s.length();
		
		
		String rev="";
		for(int i =position;i<n;i++) {
			rev+=s.charAt(i);
		}
		for(int i =0;i<=ix;i++) {
			rev+=s.charAt(i);
		}
		
		System.out.print(rev);

		
	}

}
