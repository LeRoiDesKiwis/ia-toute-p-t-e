package fr.leroideskiwis.iadefi;

import java.util.ArrayList;
import java.util.List;

public class IndexChecker {

    private List<Sentence> sentences = new ArrayList<>();

    public void check(String toCheck){

        sentences.forEach(sentence -> sentence.checkAll(toCheck));

    }

    public void addSentence(String sentence){
        sentences.add(new Sentence(sentence));
    }

    public void display(){
        for(Sentence sentence : sentences){
            System.out.println(sentence.toString());
        }
    }

    public void displayIfHigher(double pourc){
        for (Sentence sentence : sentences) {
            if(sentence.getPourc() > pourc) System.out.println(sentence.toString());
        }
    }

}
