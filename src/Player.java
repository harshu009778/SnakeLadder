public class Player {
    int position = 0;
    int number ;


    // ---- uc2 ----
    public void generateNumber(){
        number = (int) ((Math.random()*100) % 6) + 1;
        System.out.println("Randomly generated Number : "+ number);
    }

}
