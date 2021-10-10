package com.libercom.lab3;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class TextParser {
    public long numberOfWords;
    public long numberOfSentences;
    public long numberOfLetters;
    public long numberOfVowels;
    public long numberOfConsonants;
    public String longestWord;
    public List<String> mostUsedWords;

    TextParser() {
        this.numberOfWords = 0;
    }

    public void parse(String text) {
        Pattern p = Pattern.compile("[\\w-]+");
        Matcher m = p.matcher(text);
        int longestWordLength = 0;
        HashMap<String, Integer> wordsOccurrences = new HashMap<>();

        while (m.find()) {
            String str = m.group();
            wordsOccurrences.merge(str, 1, Integer::sum);

            if (str.length() > longestWordLength)
            {
                this.longestWord = str;
                longestWordLength = str.length();
            }

            this.numberOfWords++;
        }

        List<Entry<String, Integer>> list = new LinkedList<>(wordsOccurrences.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        this.mostUsedWords = list.stream().limit(5).map(Entry::getKey).collect(Collectors.toList());

        p = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        m = p.matcher(text);
        this.numberOfLetters = m.results().count();

        p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        m = p.matcher(text);
        this.numberOfVowels = m.results().count();
        this.numberOfConsonants = this.numberOfLetters - this.numberOfVowels;

        p = Pattern.compile("[.!?]+");
        m = p.matcher(text);
        this.numberOfSentences = m.results().count();
    }

    public void getResults() {
        System.out.println("Number of words: " + this.numberOfWords);
        System.out.println("Number of letters: " + this.numberOfLetters);
        System.out.println("Number of vowels: " + this.numberOfVowels);
        System.out.println("Number of consonants: " + this.numberOfConsonants);
        System.out.println("Number of sentences: " + this.numberOfSentences);
        System.out.println("The longest word: " + this.longestWord);
        System.out.println("Top 5 words: " + this.mostUsedWords.toString());
    }
}

public class Lab3 {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();

        textParser.parse("You are a genius!! How did you solve that? Teach me. Please, teach me!");
        textParser.getResults();
    }
}
