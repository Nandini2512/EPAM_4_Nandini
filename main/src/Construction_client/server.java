package Construction_client;
import java.util.*;
public class server implements construction{
	static String Material_Standard="";
	static int Area;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		server object=new server();
		System.out.format("Enter Material standard : standard materials or above standard materials or high standard materials or high standard materials and fully automated home:");
		 Material_Standard=scan.nextLine();
		 System.out.format("Enter Area if you want fully automated house otherwise make it 0 : ");
		 Area=scan.nextInt();
		 System.out.format("Amount estimated for Construction : %s",object.Constructions_Materials(Material_Standard,Area));
		
	}
	

	public String Constructions_Materials(String Material_Standard, int Area) {
		if(Material_Standard.contentEquals("standard materials")&&Area==0) {
			return "1200INR";
		}
		if(Material_Standard.contentEquals("above standard materials")&&Area==0)
			return "1500INR";
		if(Material_Standard.contentEquals("high standard materials")&&Area==0)
		return "1800INR";
		if(Material_Standard.contentEquals("high standard materials and fully automated home")&&Area>0)
			return "2500INR";
			return null;
	}

}
