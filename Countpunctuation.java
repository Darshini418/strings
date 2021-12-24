import java.util.*;
import java.io.*;
public class Countpunctuation{
public static void main(String[] args){
int count = 0;
String str = "This year said";'This year made me to learn that there is some truth to every lie.'
for(int i=0;i<str.length();i++)
{
if(str.charAt(i) =='!'||str.charAt(i) ==','||str.charAt(i) ==';'str.charAt(i) =='.'||str.charAt(i) =='?'||str.charAt(i) =='-'||
str.charAt(i) =='\'||str.charAt(i) =='\'||str.charAt(i) ==':')
{
count++;
}
}
System.out.println("The number of punctuations exists ithe string is:" +count);
}
}