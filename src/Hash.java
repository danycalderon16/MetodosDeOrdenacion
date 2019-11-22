

public class Hash {

    public static String hash(int i) {
        String c=i+"";
        String hash="";
        int s = c.length()/4;
        int f = c.length();
        
        for (int j = 0; j < 4; j++) {
        }
        
        for(int j =0;j<4;j++){
            int m = f-(j*2+s);
            int n = f-j*2;
            String a = c.substring(m,n);
            int b = Integer.parseInt(a.substring(0, 1))+Integer.parseInt(a.substring(1,2));
            String d = String.valueOf(b);
            if(d.length()>1)
                b=Integer.parseInt(d.substring(0, 1))+Integer.parseInt(d.substring(1,2));
            hash = hash + b+"";
        }
        return hash;
    }

    public static void main(String[] args) {
        System.out.println(hash(18401090));
        System.out.println(hash(18401091));
        System.out.println(hash(18401092));
        System.out.println(hash(18401093));
        System.out.println(hash(18401094));
        System.out.println(hash(18401095));
    }
   
}
