package sqatests.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class AlgTest {
	static String[] contentToArray(Map<String, Integer> map) {
		List<String> result = new ArrayList<>();
		if(!map.isEmpty()) {
			map.keySet().stream().forEach(k -> {
				IntStream.range(0, map.get(k)).forEach(i -> {
					result.add(k);
				});
			});
		}
		return result.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		Map<String, Integer> test = new HashMap<>();
		test.put("a", 2);
		test.put("b", 10);
		String[] result = contentToArray(test);
		System.out.println(Arrays.toString(result));
	}
}
