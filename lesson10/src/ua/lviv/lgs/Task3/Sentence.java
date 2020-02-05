package ua.lviv.lgs.Task3;

public class Sentence {
    public int CountWords() {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        int count_word = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count_word++;
            }

        }
        return count_word;

    }
}
