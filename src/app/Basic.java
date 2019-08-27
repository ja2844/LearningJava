package app;

public class Basic {
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
    //str1 會在String池建立"Hello"這個實例 為常量
    //str3 會在String池找"Hello"這個實例，所以str1與str3指向同個實例
    //new string則是建一個新的實例，非常量不會存在String池
    public static void Str() {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        String str3 ="Hello";
        System.out.println(str1 == str3);
        String str4 = "He"+"llo";
        System.out.println(str1 == str4);
    }
}