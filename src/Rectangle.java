import java.io.Console;
import java.util.Scanner;
public class Rectangle {

    private int height, width;

    public Rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public void drawFilled() {
       drawFilled('*');

    }
    public void drawFilled(char sign) {
        for (int i = 0; i < height; i++) {
            for (int s = 0; s < width; s++) {

                System.out.print(sign);
            }
            System.out.println();
        }

    }

    public void drawEmpty() {
        drawEmpty('*');
    }

        public void drawEmpty ( char sign){
        System.out.println("78787878787878787878");
            for (int i = 0; i < height; i++) {

                if (i == 0 || i == (height-1)) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(sign);
                    }
                    System.out.println();
                } else {
                    for (int j = 0; j < width; j++) {
                        if (j == 0 || j == (width-1)) {
                            System.out.print(sign);


                        } else {
                            System.out.print(" ");
                        }

                    }
                }
                System.out.println();

            }


        }
    public void readRectFromConsole(){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the width");
        int w =input.nextInt();
        System.out.println("please enter the height");
        int h =input.nextInt();
        this.width=w;
        this.height=h;


    }
    }






