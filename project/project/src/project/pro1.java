package project;

public class pro1 {
	public static void main(String[] args) {
		String s="hai";
		pro1 a = new pro1();
		String st=a.reverse(s);
		System.out.println(st);
				
	}		
	public  String reverse(String st) {
			char c[]=st.toCharArray();
			st="";
			for(int i=0;i<c.length;i++) {
				int j=i;
				while(i<c.length&&c[i]!=' ') {
					i++;
				}
				int k=i-1;
			    while(k>=j) {
					st=st+c[k];
					k--;
				}
			    if(i<c.length)
			    	st=st+c[i];
			    
			}
			return st;
	
		}
	}


