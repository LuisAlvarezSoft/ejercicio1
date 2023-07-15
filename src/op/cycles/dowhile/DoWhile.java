package op.cycles.dowhile;

    public class DoWhile {
        public int start;
        public int end;
        public void showDoWhile(){
            System.out.println("Showing do while cycle");
            do{
                System.out.println(start);
                start+=2;
            }while (start <= end);
}}
