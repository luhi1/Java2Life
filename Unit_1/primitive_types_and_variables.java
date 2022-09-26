public class Test{
    public static void main(String[] args){
        //Whole Numbers
        int myNumber; // int types can store up to 4 bytes (32 bits, 8 bits per byte)
        myNumber = 300000; // stores from -2,147,483,648 to 2,147,483,647
        short smallNumber = 3000; // 2 bytes
        long massiveNumber = 300000; // 8 bytes
        // Not important to know how much each store for now, but when you start to work on larger projects
        // knowing how much an int will need to store can make your program more memory efficient.
        
        //Decimal Points
        float myFloat = 2f; // 4 bytes
        //Floats are not really ever used, and I think CS Awesome does not like floats!
        double myDouble = 2.555555555555555; // 8 bytes
        
        //One or Zero
        boolean myBoolean = true; // 1 bit
        
        //One Character (Alphabetical key on the keyboard or special character)
        char myCharacter = '\u0095'; // 2 bytes
    }
}


                  
