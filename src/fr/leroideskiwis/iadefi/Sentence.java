package fr.leroideskiwis.iadefi;

public class Sentence {

    private double pourc = -1;
    public final String sentence;

    public Sentence(String sentence){
        this.sentence = sentence.toLowerCase();
    }

    public void check(String toCheck){
        int total = 0;
        toCheck = toCheck.toLowerCase();


        char[] checkChars = toCheck.toCharArray();
        char[] sentenceChars = sentence.toCharArray();

        int indexCheck = 0;
        int indexSentence = 0;
       /*
          "Aword" -> "word"
          "w" -> "A"
          "w" -> "w"
          "o" -> "o"

        */
        while(indexSentence < sentence.length() && indexCheck < toCheck.length()){

            if(checkChars[indexCheck] == sentenceChars[indexSentence]){
                indexSentence++;
                total++;
            }
            else indexCheck++;
        }

        pourc = ( total * 100 ) / Math.sqrt(toCheck.length() * sentence.length());
    }

    public double getPourc(){
        return pourc;
    }

    @Override
    public String toString() {
        return sentence+" : "+pourc+"%";
    }
}
