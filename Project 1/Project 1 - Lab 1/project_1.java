import java.util.Scanner;
public class project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TV=0, VCR=0, RC=0, CD=0, TR=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the quantity of TVs sold: ");
		TV = input.nextInt();
		System.out.print("Enter the quantity of VCRs sold: ");
		VCR = input.nextInt();
		System.out.print("Enter the quantity of RCs sold: ");
		RC = input.nextInt();
		System.out.print("Enter the quantity of CDs sold: ");
		CD = input.nextInt();
		System.out.print("Enter the quantity of TRs sold: ");
		TR = input.nextInt();
		System.out.println("QTY" + " DESC" + "             Price"
							+ "      Total");
		double sub_TV = TV*400.00;
		double sub_VCR = VCR*220.00;
		double sub_RC = RC*35.20;
		double sub_CD = CD*300.00;
		double sub_TR = TR*150.00;
		double sub_Total = sub_TV + sub_VCR + sub_RC + sub_CD+ sub_TR;
		double tax_rate = 0.0825;
		double tax_money = sub_Total*tax_rate;
		double Total = sub_Total + tax_money;
		System.out.printf("%2d%12s%7s%-11s%1s%-6.2f\n",TV, "Television"," ", "$400.00", "$",sub_TV);
		System.out.printf("%2d%5s%14s%-11s%1s%-6.2f\n",VCR,"VCR", " ","$220.00","$",sub_VCR);
		System.out.printf("%2d%16s%3s%-11s%1s%-6.2f\n",RC,"Remote Control","","$35.20","$", sub_RC);
		System.out.printf("%2d%11s%8s%-11s%1s%-6.2f\n",CD,"CD Player"," ","$300.00","$",sub_CD);
		System.out.printf("%2d%14s%5s%-11s%1s%-6.2f\n",TR, "Tape Recoder"," ", "$150.00","$",sub_TR);
		System.out.printf("%-22s%-10s%-1s%6.2f\n"," ","Subtotal: ","$", sub_Total);
		System.out.printf("%-18s%-12s%-1s%6.2f\n"," ","Tax (8.25%) : ","$", tax_money);
		System.out.printf("%-24s%-8s%-1s%6.2f\n"," ","Total : ","$", Total );
		
	}

}