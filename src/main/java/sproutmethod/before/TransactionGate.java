package sproutmethod.before;

import sproutmethod.TransactionBundle;
import sproutmethod.TransactionEntry;

import java.util.Iterator;
import java.util.List;

public class TransactionGate {
    private TransactionBundle transactionBundle = new TransactionBundle();

    public void postEntries(List<TransactionEntry> entries) {
        for (Iterator<TransactionEntry> it = entries.iterator(); it.hasNext(); ) {
            TransactionEntry entry = it.next();
            entry.postDate();

        }
        transactionBundle.getListManager().add(entries);
    }
}
