import java.util.*;
import java.io.*;
public class Countcharacter{
public static void main(String[] args){
String string = "It is end of the year";
int count = 0;
//count each character except space
for(int i=0;i<string.length();i++){
if(string.charAt(i)!=' ')
count++;
}
System.out.println("The number of characters in a string:"+count);
}
}