//Counting the number of words

public class numberOfWords {
    public static void main(String[] args) {
        String str = "I am Writting   an    Java       program      ";
        str = str.replaceAll("\\s+", " ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);
    }
}
