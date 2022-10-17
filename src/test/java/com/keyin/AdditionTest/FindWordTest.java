package com.keyin.AdditionTest;

import com.keyin.FindWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindWordTest {

    @Test
    public void FindSequenceInWord() {
        FindWord word1 = new FindWord();




        Assertions.assertTrue(word1.FindSequenceInWord("found", "is_found_in_this_sequence?"));
        Assertions.assertFalse(word1.FindSequenceInWord("found_me", "is_found_in_this_sequence?"));
    }

    @Test

    public void FindLetterInWord(){
        FindWord word2 = new FindWord();

        Assertions.assertTrue(word2.FindLetterInWord("o","is_found_in_this_sequence"));
        Assertions.assertFalse(word2.FindLetterInWord("x","is_found_in_this_sequence"));
    }

    @Test
    public void FindPatternInSentence(){
        FindWord word3 = new FindWord();

        Assertions.assertTrue(word3.FindPatternInSentence("unny","the_comedian_was_really_funny"));
        Assertions.assertFalse(word3.FindPatternInSentence("unny","the_comedian_was_really_silly"));

    }
}
