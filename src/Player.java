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

    // ----- uc4 -------
    public  void updateTillReaches100(){
        int count = 0;
        while(position <= 100){
            if(position < 0){
                position = 0;
            }
            updatePosition();
            count++;
        }
        System.out.println("Number of steps taken to reach 100 : " + count);
        System.out.println("Player Reaches 100");
    }

}
