package lab04;

public class MathDemo {
    public static int min(int a, int b){
        if (a<b) {
            return a;
        }
        else return b;
    }
    
    public static int max(int a, int b){
        if(a<b){
            return b;
        }
        else return a;
    }

    public static int sum(int[] args){
        int s=0;
        for(int i : args){
            s+=i;
        }
        return s;
    }

    public static float mean(int[] args){
        if (args.length==0){return 0;}
        float m=0;
        for(int i:args){
            m+=i;
        }
        return m/args.length;
    }

    public static int factorial (int n){
        int f=1;
        for (int i=1;i<n+1;i++){
            f*=i;
        }
        return f;
    }
// f) if the methods is static,there is no need for creating object to use this methods.

}
