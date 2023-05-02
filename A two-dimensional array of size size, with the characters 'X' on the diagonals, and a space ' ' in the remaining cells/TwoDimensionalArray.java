package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] symbol = new char [size][size];
        for(int i = 0; i < symbol.length; i++) {
            for (int j = 0; j < symbol.length; j++){
                int index = symbol.length - 1;
                symbol [i][j] = ' ';
                for (int a = 0; a < symbol.length; a++){
                    if (i == j) {
                        symbol [i][j] = SYMBOL;
                    } else if (i == a && j == index - a) {
                        symbol [i][j] = SYMBOL;
                    }
                }

            }



        }

        return symbol;
    }
}
//TODO: Написать метод, который создаст двумерный массив char заданного размера.
// массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
// [X,  , X]
// [ , X,  ]
// [X,  , X]