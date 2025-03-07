import java.util.Scanner;
class StringOperation{
     int countWords(String text){
        if(text== null || text.trim().isEmpty()) return 0;
        int count=0;
        boolean inWord=false;
        for(int i=0;i<text.length();i++){
            if(Character.isLetterOrDigit(text.charAt(i))){
                if(!inWord){
                    count++;
                    inWord=true;
                }
            }else inWord=false;
        }
        return count;
    }
    int countChar(String text){
        if(text==null || text.length()==0) return 0;
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) !=' ') count++;
        }
        return count;
    }
    int countSentence(String text){
        if(text== null || text.trim().isEmpty()) return 0;
        int count=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='.' || c=='!' || c=='?') count++;
        }
        return count;
    }
    int countSyllables(String text){
        if (text == null || text.trim().isEmpty()) return 0;
        text = text.replaceAll("[^a-z]", ""); // Remove non-letter characters
        int count = 0;
        boolean prevVowel = false;
        String vowels = "aeiou";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) != -1) {
                if (!prevVowel) {
                    count++;
                }
                prevVowel = true;
            } else {
                prevVowel = false;
            }
        }
        return Math.max(count, 1);
    }
    
    double calculateFleschKincaid(int words, int sentences, int syllables) {
        if (words == 0 || sentences == 0) return 0;
        // return 206.835 - (1.015 * ((double) words / sentences)) - (84.6 * ((double) syllables / words));
        return 0.39*(words/(double)sentences)+11.8*(syllables/(double)words)-15.59;
    }

}
class ReadString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a String of text :-");
        String StringText=scan.nextLine();
        scan.close();
        
        //Using In-Built Functions
        // int characterCount = text.length();
        // int wordCount = text.split("\\s+").length;
        // int sentenceCount = text.split("[.!?]+").length;
        
        //Using Self Define functions
        StringOperation SO = new StringOperation();
        int characterCount = SO.countChar(StringText);
        int wordCount = SO.countWords(StringText);
        int sentenceCount = SO.countSentence(StringText);
        int syllableCount = SO.countSyllables(StringText);

        System.out.println("Total Characters: " + characterCount);
        System.out.println("Total Words: " + wordCount);
        System.out.println("Total Sentences: " + sentenceCount);
        System.out.println("Total Syllables: " + syllableCount);

        double FleschKincaidValue= SO.calculateFleschKincaid(wordCount, sentenceCount, syllableCount);
        System.out.println("Total FleschKincaidValue is: " + FleschKincaidValue);

        String readabilityLevel=readability(FleschKincaidValue);
        System.out.println("Readability Level: " + readabilityLevel);
    }
    public static String readability(double FleschKincaidValue){
        if (FleschKincaidValue >= 90) return "Very Easy";
        else if (FleschKincaidValue >= 80) return "Easy";
        else if (FleschKincaidValue >= 70) return "Fairly Easy";
        else if (FleschKincaidValue >= 60) return "Standard";
        else if (FleschKincaidValue >= 50) return "Fairly Difficult";
        else if (FleschKincaidValue >= 30) return "Difficult";
        return "Very Difficult (University level)";
    }
}

