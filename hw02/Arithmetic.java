public class Arithmetic
{
public static void main(String[] args)
{
    
    //tax percentage
    double taxpercent=0.06;
    
    //Number of pairs of socks
    int nsocks=3;
    //Cost per pair of socks
    //$ is part of the variable name
    double sockcost$=2.58;
    //Total cost of socks
    double totalsockcost$=sockcost$*nsocks;
    //Sales tax for the purchase of socks
    double salestaxs$=totalsockcost$*taxpercent;
    //Rounded sales tax
    double rtaxs$= (int) (salestaxs$*100)/100.0;
    //Total cost of socks with sales tax
    double finalcosts$=(totalsockcost$+salestaxs$);
    // The rounded final cost of socks
    double roundedcosts$= (int) (finalcosts$*100)/100.00;
    
    
    //Number of drinking glasses
    int nglasses=6;
    //Cost per glass
    double glasscost$=2.29;
    //Total cost of glasses
    double totalglasscost$=glasscost$*nglasses;
    //Sales tax for the purchase of glasses
    double salestaxg$=totalglasscost$*taxpercent;
    //Rounded sales tax
    double rtaxg$= (int) (salestaxg$*100)/100.0;
    //Total cost with sales tax
    double finalcostg$=(totalglasscost$+salestaxg$);
    //The rounded final cost of glasses
    double roundedcostg$= (int) (finalcostg$*100)/100.0;
    
    //Number of boxes of envelopes
    int nenvelopes=1;
    //cost per box of envelopes
    double envelopecost$=3.25;
    //Total cost of envelopes
    double totalenvelopecost$=envelopecost$*nenvelopes;
    //Sales tax for the purchase of envelopes
    double salestaxe$=totalenvelopecost$* taxpercent;
    //Rounded sales tax
    double rtaxe$= (int) (salestaxe$*100)/100.0;
    //Total cost with sales tax
    double finalcoste$=(totalenvelopecost$+salestaxe$);
    //The rounded final cost of envelopes
    double roundedcoste$= (int) (finalcoste$*100)/100.0;
    
    //total purchase cost pre tax
    double totalpurchase1= (totalsockcost$+totalglasscost$+totalenvelopecost$);
    double totalsalestax= (rtaxs$+rtaxg$+rtaxe$);
    double totalpurchase2= (totalpurchase1+totalsalestax);
    
    System.out.println("pairs of socks");
    System.out.println("amount purchased: "+nsocks);
    System.out.println("cost per pair of socks: $"+sockcost$);
    System.out.println("total cost for socks: $"+ roundedcosts$);
    System.out.println("sales tax: $"+ rtaxs$);
    
    System.out.println(" ");
    
    System.out.println("drinking glasses");
    System.out.println("amount purchased: "+nglasses);
    System.out.println("cost per glass: $"+glasscost$);
    System.out.println("total cost for glasses: $"+ roundedcostg$);
    System.out.println("sales tax: $"+rtaxg$);
    
    System.out.println(" ");
    
    System.out.println("envelopes");
    System.out.println("amount purchased: "+nenvelopes);
    System.out.println("cost per envelope: $"+envelopecost$);
    System.out.println("total cost for envelopes: $"+ roundedcoste$);
    System.out.println("sales tax: $"+rtaxe$);
    
    System.out.println(" ");
    
    System.out.println("purchase price pre-tax: $"+totalpurchase1);
    System.out.println("total sales tax: $"+totalsalestax);
    System.out.println("total purchase price: $"+totalpurchase2);
    
    
}
}