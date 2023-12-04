import static org.junit.Assert.*;
import org.junit.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testFilter() {
    List<String> strs = new ArrayList<>();
    strs.add("a");
    strs.add("b");
    strs.add("apple");
    List<String> filtered = ListExamples.filter(strs, s -> s.charAt(0) == 'a');
    assertEquals(filtered, Arrays.asList("a", "apple"));
  }

  @Test(timeout = 500)
  public void testMerge() {
    List<String> strs1 = new ArrayList<>();
    List<String> strs2 = new ArrayList<>();
    strs1.add("a"); strs1.add("b"); strs1.add("cranberry");
    strs2.add("dragon");
    List<String> merged = ListExamples.merge(strs1, strs2);
    assertEquals(merged, Arrays.asList("a", "b", "cranberry", "dragon"));
  }
}
