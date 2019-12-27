package fr.leroideskiwis.iadefi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    IndexChecker checker = new IndexChecker();
	    checker.addSentence("Aword");
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

	    Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    checker.check(sentence);

	    checker.displayIfHigher(0.01);
    }
}
