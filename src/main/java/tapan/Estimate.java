package tapan;
import java.util.Scanner;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class Estimation{
	private static final Logger LOGGER1 =LogManager.getLogger(Estimation.class);
	String  Material_Standard;
	double Area;
	String Fully_Automated;
	Estimation(String  Material_Standard,double Area,String Fully_Automated)
	{
		this.Material_Standard=Material_Standard;
		this.Area=Area;
		this.Fully_Automated=Fully_Automated;
		LOGGER1.info("Into Estimation Class");
	}
	OutputStreamWriter sw=new OutputStreamWriter(System.out);
	void Estimate_House_price(String  Material_Standard,double Area,String Fully_Automated)throws IOException
	{
		LOGGER1.info("Into Estimate_House_price method");
		double total_cost;
		if(Material_Standard.equals("standardmaterials") && Fully_Automated.equals("No"))
		{
			total_cost=1200*Area;
			sw.write("The estimated cost of house if we use standard materials is ="+total_cost);
			sw.flush();
			sw.write('\n');
		}
		else if(Material_Standard.equals("abovestandardmaterials") && Fully_Automated.equals("No"))
		{
			total_cost=1500*Area;
			sw.write("The estimated cost of house if we use above standard materials is ="+total_cost);
			sw.flush();
			sw.write('\n');
		}
		else  if(Material_Standard.equals("highstandardmaterials") && Fully_Automated.equals("No"))
		{
			total_cost=1800*Area;
			sw.write("The estimated cost of house if we use high standard materials is ="+total_cost);
			sw.flush();
			sw.write('\n');
		}
		else if(Material_Standard.equals("highstandardmaterials") && Fully_Automated.equals("Yes"))
			{
				total_cost=2500*Area;
				sw.write("The estimated cost of house if we use high standard materials and require fully automated home is ="+total_cost);
				sw.flush();
				sw.write('\n');
			}
		else if(Material_Standard.equals("abovestandardmaterials") && Fully_Automated.equals("Yes"))
		{
			sw.write("Wrong Input");
			sw.flush();
			sw.write('\n');
		}
		else
		{
			sw.write("Wrong Input");
			sw.flush();
			sw.write('\n');
		}
	}
}
public class Estimate {
	private static final Logger LOGGER =LogManager.getLogger(Estimate.class);
	public static void main(String args[])throws IOException
	{
		
		Scanner sc=new Scanner(System.in);
		OutputStreamWriter sw=new OutputStreamWriter(System.out);
		LOGGER.info("Into Estimate Class");
    	LOGGER.info("Into Main() of Estimate Class");
		String  Material_Standard;
		double Area;
		char ch;
		String Fully_Automated;
		Estimation ob=new Estimation("standard_materials",100,"No");
		
		do {
			LOGGER.info("Estimate");
			sw.write("*****EPAM ASSIGNMENT 4 PART QUESTION 2******");
			sw.write('\n');
			sw.write("Enter the materials standard from this categories(standardmaterials/abovestandardmaterials/highstandardmaterials)=");
			sw.flush();
			Material_Standard=sc.nextLine();
			sw.write('\n');
			//sc.nextLine();
			sw.write("Enter the area of the house =");
			sw.flush();
			Area=sc.nextInt();
			sw.write('\n');
			sc.nextLine();
			sw.write("Do you want a fully automated house(Yes/No)");
			sw.flush();
			Fully_Automated=sc.nextLine();
			//sc.nextLine();
			sw.write('\n');	
			ob.Estimate_House_price( Material_Standard,Area,Fully_Automated);
			sw.write("Do you want to continue (y/n)");
			sw.flush();
			ch=sc.next().charAt(0);
			sw.write('\n');
			sc.nextLine();
		}while(ch!='n');
		sc.nextLine();
		LOGGER.info("End of Main()");
	}

}


