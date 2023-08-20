public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[5][4];

        for(int i=0; i< letter.length; i++){
            for(int j=0; j < letter[i].length; j++){
                if(i==4 || i==2 || (i==0 && j!=3)){
                    System.out.print(" * ");
                }
                else if(j==0 || (j==2 && i!=3) || (j==3 && i>1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
