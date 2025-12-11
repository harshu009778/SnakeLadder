public class Player {
    int position = 0;
    int number ;


    // ---- uc2 ----
    public void generateNumber(){
        number = (int) ((Math.random()*100) % 6) + 1;
        System.out.println("Randomly generated Number : "+ number);
    }

     // ------ uc3 --------
    public void updatePosition(){
        int option = (int) ((Math.random()*100) % 3); // 0 1 2
        // 0 - no play
        // 1 - ladder
        // 2 - snake

        if(option == 0){
            position = position;
        }
        else if(option == 1){
            position += number;
        }
        else if(option == 2){
            position -= number;
        }
    }

}
