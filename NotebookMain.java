
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Scanner;

public class NotebookMain {
    public static void main(String[] args) {
        Notebook Dell = new Notebook("16", "black", "256","i7-1255U" );
        Notebook Dell2 = new Notebook("16", "silver", "256","i7-1255U" );
        Notebook Hp = new Notebook("8", "silver", "256","AMD Ryzen™ 3" );
        Notebook Asus = new Notebook("16", "black", "512","Core™ i7" );
        Notebook Asus2 = new Notebook("16", "Ponder Blue", "512","Core™ i5" );

        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(Dell, Dell2, Hp, Asus, Asus2));
        
        filterNotebooks(notebooks);
    }

    private static void filterNotebooks(Set<Notebook> notebooks) {
        Map<String, String> criteriaMap = getFilterCriteria();
        Map<String, String> filterValues = getFilterValues(criteriaMap);

        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);

        for (Map.Entry<String, String> entry : filterValues.entrySet()) {
            String criteria = entry.getKey();
            String value = entry.getValue();

            filteredNotebooks.removeIf(notebook -> !notebook.matchesCriteria(criteria, value));
        }

        System.out.println("Filtered Notebooks:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
  
    private static Map<String, String> getFilterCriteria() {
        Map<String, String> criteriaMap = new HashMap<>();
        criteriaMap.put("1", "Ram");
        criteriaMap.put("2", "Hdd");
        criteriaMap.put("3", "Prosessor");
        criteriaMap.put("4", "color");
        // Add more criteria as needed
        return criteriaMap;
    }

    private static Map<String, String> getFilterValues(Map<String, String> criteriaMap) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> filterValues = new HashMap<>();

        for (Map.Entry<String, String> entry : criteriaMap.entrySet()) {
            String criteria = entry.getKey();
            String attribute = entry.getValue();

            System.out.print("Enter minimum value for " + attribute + ": ");
            String value = scanner.nextLine();

            filterValues.put(criteria, value);
        }

        return filterValues;
    }
}