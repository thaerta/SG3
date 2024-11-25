public class Calculator {
    public int countDigits(int num ){
//       String l = Integer.toString(num);
//       return l.length();
        int count = 0;
         while (num != 0){
          count+=1;
          num=num/10;
         }
         return  count;
    }

    public boolean evenOdd(int num){
       int oddNumbers = 0;
       int evenNumbers = 0 ;
       while(num != 0 ){

           if (num%2 ==0){
               evenNumbers = evenNumbers + num % 10 ;
           }else {
               oddNumbers = oddNumbers + num % 10 ;
           }
           num = num / 10 ;
       }
       if (evenNumbers > oddNumbers){
           return true;

       }
       return false ;
    }


    public int getLastDigit (int num){

        return num % 10 ;
    }

    public int gitDigit (int num, int k){

        for (int i=0; i<k;i++){

            num = num / 10 ;
        }
            return getLastDigit(num);
    }
    public int setDigit (int num,int k , int d){
        int numOfDigits = countDigits(num);
        int digit = gitDigit(num,k);
        int currentDigit = getLastDigit(num) ;
        int toAddNumber = 0;
        int count = 0 ;
        while(currentDigit != digit){
            int temp = currentDigit;
            for(int i = 0; i < count ; i ++ ){
                temp = temp * 10;
            }
            toAddNumber = toAddNumber + temp;
            num = num / 10 ;
            currentDigit = getLastDigit(num);
            count += 1;
        }
        num = num /10 ;
        num = num * 10 ;
        if ( numOfDigits == k ){
            num = d;
        }
        if ( numOfDigits != k ){
            num = num + d ;
        }
        for(int i = 0; i < k ; i ++ ){
            num = num * 10 ;
        }
        num = num + toAddNumber;
        return num ;
    }

    public int gitDigit2 (int num){

        return gitDigit(num,countDigits(num)-1);

    }

    public int countMinDigit (int num){
        int min = num;
        int neNum = num;
        int a;
        int b;
        int sum = 0;
        int count = countDigits(num);
        for (int i = 0; i < count; i++) {
            a = neNum % 10;
            if (a < min)
                min = a;
            neNum = neNum / 10;
        }
        for (int i = 0; i < count; i++) {
            b = num % 10;
            if (b == min)
                sum++;

            num = num / 10;
        }
        return sum;

    }

    public boolean search (int num){
        int revers = +num;
        int sum = 0;
        while (num != 0) {

            int remender = num % 10;
            num = num / 10;
            sum = sum * 10 + remender;

        }
        if (sum == revers) {
            return true;
        } else {
            return false;
        }
    }






}
