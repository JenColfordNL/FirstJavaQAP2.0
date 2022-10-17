package com.keyin;

public class FindWord {

    public boolean FindSequenceInWord(String wordToFind, String charSequence){
        return charSequence.contains(wordToFind);
    }
    public boolean FindLetterInWord(String letterToFind, String charSequence){
        return charSequence.contains(letterToFind);
    }
    public boolean FindPatternInSentence(String patternToFind, String charSequence){
        return charSequence.contains(patternToFind);
    }


}
