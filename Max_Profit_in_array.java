/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author Rishabh
 */
public class Max_Profit_in_array 
{
    static int maxprofit(int price[],int start,int end)
    {
        if (end <=start)
            return 0;
        int profit=0;
        for(int i=start; i<end; i++)
        {
            for(int j=i+1;j<=end;j++)
            {
                if(price[j]>price[i])
                {
                    int curr_profit = price[j] - price[i];
                    profit = Math.max(profit, curr_profit);
            }
        }
    }
    return profit;
}
public static void main(String[] args)
{
    int price[] = { 100, 180, 260, 310,40, 535, 695 };
    int n = price.length;
 
    System.out.print(maxprofit(price, 0, n - 1));
}
}