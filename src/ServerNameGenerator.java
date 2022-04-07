

//2. Server Name Generator
public class ServerNameGenerator {

    private String[] adjectives = {"adorable", "agreeable", "amused", "annoying", "ashamed", "awful", "alert", "angry", "anxious", "arrogant"};
    private String[] nouns = {"animal", "actor", "branch", "brother", "camera", "airport", "boy", "fish", "doctor", "flag"};

    public String[] getAdjectives() {
        return adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    private static String getString(String[] stringArray){
        return stringArray[(int) Math.ceil(Math.random() * stringArray.length -1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        String noun = getString(serverNameGenerator.getNouns());
        String adjective = getString(serverNameGenerator.getAdjectives());
        System.out.printf("%s-%s", adjective, noun);
    }
}
