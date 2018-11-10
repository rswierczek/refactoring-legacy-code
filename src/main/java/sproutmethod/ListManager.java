package sproutmethod;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    private List<TransactionEntry> entries = new ArrayList<>();

    public void add(List<TransactionEntry> entries){
        entries.addAll(entries);
    }

    public boolean hasEntry(TransactionEntry entry) {
        return entries.contains(entry);
    }
}
