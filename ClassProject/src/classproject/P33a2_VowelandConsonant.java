package classproject;

import java.util.Scanner;

class P33a2_VowelandConsonant{
	public static void main(String[ ] arg){
            
//	int i=0;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a character : ");
//	char ch=sc.next( ).charAt(0);	 		
//	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//	{
//	System.out.println("Entered character "+ch+" is:  Vowel"); 
//	}
//	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
//		System.out.println("Entered character "+ch+" is: Consonant");
//	      else
//		System.out.println("Not an alphabet");	
        
    
            Scanner letter = new Scanner(System.in);
            System.out.println("Enter your Latter: ");
            String n = letter.nextLine();
            String l = n.toLowerCase();

        if (l == "a" || l == "e" || l == "i" || l == "o" || l == "u")
                System.out.println("Vowel");
            
        else  System.out.println("Consonant");
            
        
        
        
        
        
}
}