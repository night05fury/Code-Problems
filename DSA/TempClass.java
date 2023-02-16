package DSA;

class TwoDArray{
        public static void main(String[] args) {
            int[][] twoDimentional = {{1,1},{2,2},{3,3},{4,4}};
            for(int i = 0 ; i < 4 ; i++){
                for(int j = 0 ; j < 2; j++){
                    System.out.print(twoDimentional[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

