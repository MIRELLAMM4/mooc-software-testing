package tudelft.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        InvoiceDao dao = new InvoiceDao();
        Invoice gino = new Invoice("Gino", 40.0);
        Invoice jair = new Invoice("Jair", 500.0);

        dao.save(gino);
        dao.save(jair);

        InvoiceFilter filter = new InvoiceFilter();
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(gino, result.get(0));
        Assertions.assertEquals(1, result.size());

        dao.close();
    }

}
