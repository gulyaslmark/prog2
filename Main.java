package main;


public class Main {
    
    public static void ascending(int a, int b, int c){
        if( a < b && a < c){
            if(b < c){
                System.out.println(a+" "+b+" "+c);
            }
            else{
                System.out.println(a+" "+c+" "+b);
            }
        }
        else if( b < a && b < c){
            if(a < c){
                System.out.println(b+" "+a+" "+c);
            }
            else{
                System.out.println(b+" "+c+" "+a);
            }
        }
        else if(c < a && c < b){
            if(a < b){
                System.out.println(c+" "+a+" "+b);
            }
            else{
                System.out.println(c+" "+b+" "+a);
            }
        }
    }
    public static void min(double a, double b, double c){
        double min = 0;
        if(a < b && a < c){
            min = a;
        }
        else if(b < a && b < c){
            min = b;
        }
        else if(c < a && c < b){
            min = c;
        }
        System.out.println("Minimum:" + min);
        double max = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        if(a > b && a > c){
            max = a;
        }
        else if(b > c && b > a){
            max = b;
        }
        else if(c > a && c > b){
            max = c;
        }
        System.out.println("Maximum:" + max);
    }
    public static void kiir_sorrend(double a, double b, double c, double d){
        if( d >= 0){
            System.out.println(a+" "+c+" "+b+" "+d);
        }
        else{
            System.out.println(a+" "+b+" "+d+" "+c);
        }
    }
    
    public static boolean haromszog_e(double a, double b, double c){
        if( a+b > c && a+c > b && b+c > a){
            return true;
        }
        return false;
    }
    
    public static int hany_szokoev(int ev1, int ev2){
        int db = 0;
        for(int i = ev1+1; i < ev2; i++){
            if((i%4 == 0 && i%100 != 0) || i%400 == 0){
                db++;
            }
        }
        return db;
    }
    
    public static void erdemjegy(int jegy){
        switch(jegy){
            case 1: System.out.println("Egyes");break;
            case 2: System.out.println("Kettes");break;
            case 3: System.out.println("Hármas");break;
            case 4: System.out.println("Négyes");break;
            case 5: System.out.println("Ötös");break;
            default: System.out.println("Nincs ilyen jegy");
        }
    }
    
    public static int hanyados(int a,int b){
        int hanyados = 0;
        while(a >= b){
            hanyados += 1;
            a -= b;
        }
        return hanyados;
    }
    
    public static boolean is_prim(int n){
        if( n <= 1 ){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void fibo(int n){
        int f0 = 0;
        int f1 = 1;
        int szamlalo = 0;
        while(szamlalo < n){
            System.out.print(f0+" ");
            f1 = f0 + f1;
            f0 = f1 - f0;
            szamlalo++;
        }
        System.out.println("");
    }
    
    public static int fordit(int n){
        int uj_szam = 0;
        while(n > 0){
            int szj = n%10;
            n = n/10;
            uj_szam = uj_szam*10+szj;
        }
        return uj_szam;
    }
    
    public static long faktorialis(int n){
        long result = 1;
        for(int i=n; i>=1; i--){
            result *= i;
        }
        return result;
    }
    
    public static void osztaho(int n1, int n2, int k){
        for(int i=n1+1; i<n2; i++){
            if( i%k == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
    
    public static int legkisebb_fibo(int n){
        int f0 = 0;
        int f1 = 1;
        while(f0 <= n){
            f1 = f0 + f1;
            f0 = f1 - f0;
        }
        return f0;
    }
    
    public static void egyenlo(){
        int sum = 0;
        for(int i=1; i<1000; i++){
            int szam = i;
            while(szam>0){
                int szj;
                szj = szam%10;
                szam = szam/10;
                sum += Math.pow(szj,3);
            }
            if(sum == i){
                System.out.print(i+" ");
            }
            sum = 0;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Pont p1 = new Pont(5,6);
        Pont p2 = new Pont(4,3);
        Pont p3 = new Pont(1,2);
        Pont p4 = new Pont(2,3);
        
        p1.setY(p1.getY()+5);
        p2.setY(p1.getY()+5);
        p3.setX(p3.getX()-3.4);
        p4.setX(p4.getX()-3.4);
        
        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
        System.out.println(p3.getX() + ", " + p3.getY());
        System.out.println(p4.getX() + ", " + p4.getY());
        
        //2. feladat
        
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6,4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println(rp1);
        System.out.println(rp2);
        System.out.println(rp3);
        
        //3. feladat
        
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,36.9);
        
        System.out.println(r1);
        System.out.println(r2);
       
      
        
        ascending(7, 1, 3);
        min(4.3, -4.8, -7);
        kiir_sorrend(5, 8.3, 4.1, 2.9);
        System.out.println(haromszog_e(1, 1, 3));
        System.out.println(hany_szokoev(2000, 2016));
        erdemjegy(5);
        System.out.println(hanyados(20, 4));
        System.out.println(is_prim(9));
        fibo(9);
        System.out.println(fordit(321));
        System.out.println(faktorialis(5));
        osztaho(20, 120, 5);
        System.out.println(legkisebb_fibo(7));
        egyenlo();
        
        
    }
      
    }
