package ide;

import resources.AnimatedButton;
import resources.Button;
import resources.CountDownButton;


public class EditorApplication {
    public static void main(String[] args){

        DeveloperAssistantPlugin.getSuggestions(AnimatedButton.class)
                                .forEach(System.out::println);

    }
}
