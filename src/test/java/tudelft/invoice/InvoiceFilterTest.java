package tudelft.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        Invoice gino = new Invoice("Gino", 40.0);
        Invoice jair = new Invoice("Jair", 500.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);

        InvoiceFilter filter = new InvoiceFilter();
        List<Invoice> result = filter.filter();

        //Assertions

        dao.close();
    }

}
