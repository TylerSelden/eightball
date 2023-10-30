import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Hola. I am the magic 8-ball. Ask me a yes or no question: ");
        keyboardInput.nextLine();
        int rand = random(1, 10);
        
        System.out.println("Hmmm....");
        if (rand == 1) {
            System.out.println("I'd say yes.");
        } else if (rand == 2) {
            System.out.println("I'd say no.");
        } else if (rand == 3) {
            System.out.println("Maybe? It's kinda hard to tell.");
        } else if (rand == 4) {
            System.out.println("I'd tell you, but that would cause an immense butterfly effect that would lead to the eventual and inevitable end of the world you know, everyone and everything you've ever known or loved. So I'll just keep it to myself :D");
        } else if (rand == 5) {
            System.out.println("Absolutely not. Honestly, what a dumb question.");
        } else if (rand == 6) {
            System.out.println("I think you should know the answer to *that*.");
        } else if (rand == 7) {
            System.out.println("it smells like sushi");
        } else if (rand == 8) {
            System.out.println("Maybe you should ask me again.");
        } else if (rand == 9) {
            System.out.println("Gonna be completely honest here: I'm a hard-coded Java program running from a pseudorandom number generator. You really expect me to answer that? I literally didn't even store what you inputted as a string. Go ask someone else.");
        } else if (rand == 10) {
            System.out.println("Absolutely.");
        }


        keyboardInput.close();
    }
    private static int random(int min, int max) {
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
}
