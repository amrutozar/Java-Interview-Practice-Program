package src1.test;

public class StringProgramTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a string - replace each vowel in that string with immediate next vowel.
	//	e.g. Apple -> Eppli

		String str="Apple";
		
		char[] charArray=str.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<charArray.length;i++) {
			
			if(charArray[i]=='a'||charArray[i]=='A')
			{
				sb.append("e");
			}else if(charArray[i]=='e'||charArray[i]=='E')
			{
				sb.append("i");
			}else if(charArray[i]=='i'||charArray[i]=='I')
			{
				sb.append("o");
			}else if(charArray[i]=='o'||charArray[i]=='O')
			{
				sb.append("u");
			}else if(charArray[i]=='u'||charArray[i]=='U')
			{
				sb.append("a");
			}else 
			{
				sb.append(charArray[i]);
			}
		}
		System.out.println("output="+sb);
	}

}
