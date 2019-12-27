package fr.leroideskiwis.iadefi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		long start = System.currentTimeMillis();

	    IndexChecker checker = new IndexChecker();
	    checker.addSentence("word");
	    checker.addSentence("ça va ?");
	    checker.addSentence("Comment va tu ?");
	    checker.addSentence("Wesh gros");
	    checker.addSentence("Salut");
	    checker.addSentence("Bonjour");
	    checker.addSentence("Au revoir");
	    checker.addSentence("Weeb");
	    checker.addSentence("sentence");
	    checker.addSentence("Le conseil a decidé de vous éliminer, et leur sentence est irrévocable.");
		checker.addSentence("tg");
		checker.addSentence("LeRoiDesKiwis");
		checker.addSentence("trap");

		long startCheck = System.currentTimeMillis();

	    checker.check(sentence);

	    //checker.display();
	    checker.displayIfHigher(1.0);

	    long end = System.currentTimeMillis();
		System.out.println();
	    System.out.println("---------");
	    System.out.println();

	    System.out.println("Temps avec ajouts : "+(end-start)+"ms");
	    System.out.println("Temps sans ajouts : "+(end-start)+"ms");
    }
}
