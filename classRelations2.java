public class classRelations2 {
    public void blackJack(classRelations1 x){
        System.out.println("*-------------------------*");
        System.out.println("|                         |");
        System.out.println("|       Welcome to the    |");
        System.out.println("|         Blackjack       |");
        System.out.println("|                         |");
        System.out.println("*-------------------------*\n");
        x.dealer1Card = x.rand.nextInt(9) + 1;
        x.dealer2Card = x.rand.nextInt(9) + 1;
        System.out.println("\nDealer's Cards: " + x.dealer1Card + " ,  ?");
        x.player1Card = x.rand.nextInt(9) + 1;
        x.player2Card = x.rand.nextInt(9) + 1;
        System.out.println("Player's Cards: " + x.player1Card + " , " + x.player2Card);
        System.out.println("Total of Player's: " + (x.player1Card+x.player2Card));
        System.out.print("[1] to Stay , [2] to Contunie: ");
        x.answer = x.sc.nextInt();
        int totalDealer = x.dealer1Card + x.dealer2Card;
        int totalPlayer = x.player1Card + x.player2Card;
        while(x.answer != 1){
            int nextCardPlayer = x.rand.nextInt(9) + 1;
            totalPlayer = totalPlayer + nextCardPlayer;
            System.out.println("Player draws: " + nextCardPlayer);

            if(totalPlayer >= 21) {
                answerIsOne(totalDealer, totalPlayer, x);
                break;
            }
            System.out.println("\nDealer's Cards: " + x.dealer1Card + " ,  ?" );
            System.out.println("Total of Player's: " + (totalPlayer));
            System.out.print("[1] to Stay , [2] to Contunie: ");
            x.answer = x.sc.nextInt();
        }
        if(x.answer == 1) {
            answerIsOne(totalDealer, totalPlayer, x);
        }
    }

    static void answerIsOne(int totalDealer, int totalPlayer, classRelations1 x){
            while(totalDealer <= 17) {
                int nextCardDealer = x.rand.nextInt(9) + 1;
                totalDealer = totalDealer + nextCardDealer;
                System.out.println("Dealer draws: " + nextCardDealer);
            }

            System.out.println("Total of Dealer's: " + totalDealer); 
            System.out.println("Total of Player's: " + totalPlayer);

            if(totalDealer == 21) {
                if(totalPlayer == 21){
                    System.out.println("Draw!");
                }else{
                    System.out.println("Dealer Win!");
                }
            }else if(totalDealer > 21) {
                System.out.println("Dealer Lose!");
            }else if(totalDealer < 21) {

                if(totalPlayer == totalDealer){
                    System.out.println("Draw!");
                }

                if(totalPlayer < totalDealer){
                    System.out.println("Dealer Win!");
                }else if(totalPlayer > totalDealer) {
                    System.out.println("Player Win!");
                }
            }
        }
}
