package seleniumSessions;


public class Example {
	//static int count;

	public static void main(String[] args) {
	
		
		String str="aaaabbccc";
	//	char ch[]=str.toCharArray();
		int len=str.length();
		String str1=str.replaceAll(str,"");
		System.out.println("str1");
		int len1=str1.length();
		int actlength=len-len1;
		
		System.out.println(actlength);
		
		char ch[]=str.toCharArray();
		
		

		for(int i=0;i<len;i++) {
			int count=0;
			for(int j=i;j<len;j++) {
				 
				
				if (ch[i]==ch[j]) {
					count++;
				
			
			
				
				}
				
				
			}
			
		
			System.out.println(ch[i]+"="+count);
		
			
			
			
		}
		
	}

}
