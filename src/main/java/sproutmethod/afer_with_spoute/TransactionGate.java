package sproutmethod.afer_with_spoute;

import sproutmethod.TransactionBundle;
import sproutmethod.TransactionEntry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransactionGate {
    private TransactionBundle transactionBundle = new TransactionBundle();

    public void postEntries(List<TransactionEntry> entries) {
        List entriesToAdd = uniqueEntries(entries);
        for (Iterator<TransactionEntry> it = entriesToAdd.iterator(); it.hasNext(); ) {
            TransactionEntry entry = it.next();
            entry.postDate();
        }
        transactionBundle.getListManager().add(entries);
    }

    List uniqueEntries(List<TransactionEntry> entries) {
        List result = new ArrayList();
        for (Iterator<TransactionEntry> it = entries.iterator(); it.hasNext(); ) {
            TransactionEntry entry = it.next();
            if (!transactionBundle.getListManager().hasEntry(entry)) {
                result.add(entry);
            }
        }
        return result;
    }
}
