import java.util.HashMap;

public class Teste {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Dudu", 1);
        a.put("Duda", 2);
        a.put("Carlos", 3);
        for (String s : a.keySet()){
            s.indexOf(1);
        }
    }
}
