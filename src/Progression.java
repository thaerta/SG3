public class Progression {

    private int Move ;
    private int firstNumber ;

    public  Progression (int Move,int firstNumber){

        this.Move= Move;
        this.firstNumber= firstNumber;


    }

    public  Progression (){

        this.Move= 2 ;

        this.firstNumber= -3 ;

    }

    public int getElement (int k){
        int num = firstNumber;
        for (int  count=0 ; count < k; count++){
            num = num + Move;
        }
        return num;
    }

    public void showProg (int n){
      int num = firstNumber;
        System.out.print(num);
       for (int count = 0; count < n; count++){
        num = num + Move;
           System.out.print(num);
           System.out.print(",");

       }

    }

    public void showProg (){
    showProg(10);
    }

    public void showProgUpTo (int n){

        for (int num = firstNumber; num < n; num = num + Move){
            System.out.print(num + ",");
        }

    }

    public int Sum (int n){

        int num = firstNumber;
        int sum = 0 ;
        for (int  count=0 ; count <= n; num = num + Move){
            sum = sum + num;
            count ++ ;
        }
        return sum;


    }


}
