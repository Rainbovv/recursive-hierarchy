package ide;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeveloperAssistantPlugin {
    public static List<String> getSuggestions(Class<?> sourceClass){

        List<String> result = new ArrayList<>();

//        Arrays.asList(sourceClass.getMethods()).forEach(method -> result.add(method.toString()));
//
//        result.removeIf(m -> !m.contains(sourceClass.getPackageName() + "."));
//        result.replaceAll(m -> m.substring(m.lastIndexOf(".") + 1));

        for (Method m: sourceClass.getMethods()) {
            String method = m.toString();
            if (!method.contains(sourceClass.getClass().getPackageName() + "."))
                result.add(method.substring(method.lastIndexOf(".") + 1));
        }

        return result;
    }
}
