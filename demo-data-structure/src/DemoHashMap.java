import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  private static int keyCount = 0;

  public static void main(String[] args) {
    // <key, value> pair -> Entry
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("A", "John");
    stringMap.put("A", "Mary");
    stringMap.put("A2", "Sally");
    stringMap.put(null, "Oscar");
    stringMap.put(null, "Cherry");
    System.out.println(stringMap.get("A")); // Mary
    System.out.println(stringMap.get("A2")); // Sally
    System.out.println(stringMap.get(null)); // Cherry

    // Loop Map.Entry -> entrySet()
    for (Map.Entry<String, String> entry : stringMap.entrySet()) {
      System.out
          .println("key=" + entry.getKey() + " , value=" + entry.getValue());
    }

    // Loop value -> values()
    for (String value : stringMap.values()) {
      System.out.println("value=" + value); //
    }

    // keySet()
    for (String key : stringMap.keySet()) {
      System.out.println("key=" + key);
    }

    System.out.println(stringMap.containsKey("A2")); // true

    String[] strings = {"Cherry", "hello", "Oscar", "oscar", "Vincent"};
    // check if the value exists in map, if no, add into the map, if yes, print "John already exist"
    for (String str : strings) {
      if (!stringMap.containsValue(str)) {
        stringMap.put(generateKey(), str);
      } else {
        System.out.println(str + " already exist");
      }
    }

    for (Map.Entry<String, String> entry : stringMap.entrySet()) {
      System.out
          .println("key=" + entry.getKey() + " , value=" + entry.getValue());
    }

  }

  public static String generateKey() {
    return "G" + ++keyCount;
  }
}
