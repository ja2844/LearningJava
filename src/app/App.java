package app;

public class App {
    public static void main(String[] args) throws Exception {
        boolean mboolean =true;
        Byte mByte =100;
        Long mLong=1000l;
       // calculate(mboolean,mByte, mLong);
        System.out.println(mLong);
        Str();
    }
    public static void calculate(boolean mboolean,byte mByte,long mLong ){
        if(mboolean == true){
            mByte += 1;
            System.out.print(mByte);
        }
        else{
            System.out.print(mLong);
        }
    }
    public static void Str() {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        String str3 ="Hello";
        System.out.println(str1 == str3);
    }
}