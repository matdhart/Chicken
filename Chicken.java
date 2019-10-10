import java.lang.Math;
import java.util.ArrayList;

public class Chicken {


	public static void main(String[] args) {
        String output = "Chicken";
        int repeats = 4;
        int spacing = 255;
        int delay = 30;
        if (args.length == 0) {}
        else if (args.length == 1) {
            output = args[0];
        }//if
        else if (args.length == 2) {
            output = args[0];
            repeats = Integer.parseInt(args[1]);
        }//else if
        else if (args.length == 3) {
            output = args[0];
            repeats = Integer.parseInt(args[1]);
            spacing = Integer.parseInt(args[2]);
        }
        else if (args.length == 4) {
            output = args[0];
            repeats = Integer.parseInt(args[1]);
            spacing = Integer.parseInt(args[2]);
            delay = Integer.parseInt(args[3]);
        }
        else {
            System.out.println("Error incorrect usage:");
            System.out.println("Usage java Chicken [Output:string] [Repeats/line:int] [Spacing:int] [Delay:int]");
        }//else

		while (true) {
            for (int wordPerLine = 0; wordPerLine < repeats; wordPerLine++) {
                for (int i = 0; i < (Math.random() * spacing); i++){
                    System.out.print(" ");
                }//for i
                System.out.print(output);
            }//for wordPerLine
            System.out.println();
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {}
			
		}
	}
}
