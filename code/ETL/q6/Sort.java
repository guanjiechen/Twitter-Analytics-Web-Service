package sort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Sort {
	public static void main(String[] args) throws IOException {

		HashMap<Long, Long> map = new HashMap<Long, Long>();
		PrintWriter writer = new PrintWriter("/Users/Zhang/Desktop/output2",
				"UTF-8");
		FileInputStream fis = new FileInputStream("/Users/Zhang/Desktop/input1");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line;
		while ((line = br.readLine()) != null) {
			String[] parts = line.split("\t");
			Long first = Long.parseLong(parts[0]);
			Long second = Long.parseLong(parts[1]);
			map.put(first, second);
		}
		br.close();
		Map<Long, Long> result = mapsort.sortit(map);
		Iterator it = result.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			writer.println(entry.getKey() + "\t" + entry.getValue());
			it.remove();
		}
		writer.close();
	}
}

class mapsort {
	public static Map sortit(Map mapunsorted) {
		Map mapsort = new TreeMap(new mycomparator(mapunsorted));
		mapsort.putAll(mapunsorted);
		return mapsort;
	}
}

class mycomparator implements Comparator {
	Map map;
	
	public mycomparator(Map map) {
		this.map = map;
	}

	public int compare(Object first, Object second) {
		Comparable valueA = (Comparable) map.get(first);
		Comparable valueB = (Comparable) map.get(second);
		return valueA.compareTo(valueB);
	}
}