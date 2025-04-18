class Solution {
    public String intToRoman(int num) {
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};  //I -> X and V -> L and for last consider next one
        String hund[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};  
        String thou[] = {"","M","MM","MMM"};
        return thou[num/1000] + hund[(num%1000)/100]+tens[(num%100)/10]+ones[num%10];
    }
}
