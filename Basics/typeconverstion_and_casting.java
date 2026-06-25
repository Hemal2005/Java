class Type{
    public static void main(){
        
        int a = 257;
        byte k = (byte) a; //Type casting (i.e expilicit casting)(op:1 because perfoms mod by range amd gives remainder)
        int b = 50;
        double c = b; //Type conversion(impilicit casting)

        float f = 5.6f;
        int t = (int) f;//op:5
        System.out.println(k);
        System.out.println(c);

    }
}

//another concept named type promotion