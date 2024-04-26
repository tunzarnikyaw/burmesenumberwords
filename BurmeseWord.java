public class BurmeseWord{
    public static String getw(int n){
        String w[] = {"သုည","တစ်","နှစ်","သုံး","လေး","ငါး","ခြောက်","ခုနစ်","ရှစ်","ကိုး"},
        t[] = {"","ဆယ်","ရာ","ထောင်","သောင်း","သိန်း","သန်း"},
        x = "";
        boolean s=false;
        for(int i=0; i<7; i++){
            if(n%10>0)
                if(i<4){
                    x= w[n%10]+t[i]+(s?"့ ":" ")+x;
                    s=true;
                }
                else{
                    x=w[n%10]+t[i]+" "+x;
                }
            n/=10;
        }
        return x;
    }
}