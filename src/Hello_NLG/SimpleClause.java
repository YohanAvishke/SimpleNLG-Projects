package Hello_NLG;

import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.realiser.english.*;
import simplenlg.phrasespec.*;
import simplenlg.features.*;

public class SimpleClause {
    public static void main(String[] args) {
        Lexicon lexicon = Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory = new NLGFactory(lexicon);
        Realiser realiser = new Realiser(lexicon);

        SPhraseSpec p = nlgFactory.createClause();
        p.setSubject("Mary");
        p.setObject("the monkey");
        p.setVerb("chase");

        String output2 = realiser.realiseSentence(p); // Realiser created earlier.
        System.out.println(output2);
    }
}
