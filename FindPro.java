public class FindPro{
 public int FindPro(int num1, int num2, int num3, int num4){
 return num1*num2*num3*num4;
	
 }
 public static void main(String args[]){
 FindPro obj= new FindPro();
 int Pro= obj.FindPro(12,12,20,40);
 System.out.println("Product of four Numbers : "+ Pro);
 }
}
 