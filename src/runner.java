import java.util.Stack;

public class runner {


    public static void main(String[] args) {

//        crossSum();
//        stack();

//        printWord("hi");


    }

    public static void crossSum() {


        int[][] arr = new int [5][5];

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                int randomNumber = (int)(Math.random() * 50) + 1;
                arr[i][j] = randomNumber;
            }
        }

        int highestCross = 0;
        int cross = 0;
        for (int i=1; i<4; i++){
            for (int j=1; j<4; j++){
                cross = (arr[i][j] + arr[i-1][j] + arr[i+1][j] + arr[i][j+1] + arr[i][j-1]);
                if (cross>highestCross){
                    highestCross = cross;
                }
            }
        }

        System.out.print(highestCross);

//        System.out.println(word);
//        return word;
    }

    public static void stack(){

        int[] arr= new int [20];

        for (int i = 0; i<20; i++){
            int randomNumber= (int)(Math.random() * 100) + 1;
            arr[i] = randomNumber;
        }

        //sorting algorithm from stack overflow
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[(j + 1)]) {  //Check if sort is needed
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        Stack<Integer> pancakes = new Stack<Integer>();
        for (int i=0; i<20; i++){
            pancakes.push(arr[i]);
        }

//        System.out.print(pancakes);

        for (int i=0; i<20; i++){
            arr[i] = pancakes.pop();
        }

//        for (int i=0; i<20; i++){
//            System.out.print(arr[i]);
//        }

    }


}
