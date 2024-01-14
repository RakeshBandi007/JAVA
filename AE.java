import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class AE extends Exception 
{
  public AuthenticationException(String message) 
{    super(message);
 }}
public class AED {
 public static void main(String[] args) {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  String pwd;
    try {
      System.out.print("Enter password :: ");
   pwd = br.readLine();
      if(!pwd.equals("123")) 
    throw new AuthenticationException("Incorrect password\nType correct password");
   else
    System.out.println("Welcome User !!!");
   } 
  catch (IOException e) {
   e.printStackTrace();
  } 
  catch (AuthenticationException a) {
   a.printStackTrace();
  }
  System.out.println("BYE BYE");
 }}
