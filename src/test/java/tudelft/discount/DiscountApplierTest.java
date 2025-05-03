package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class DiscountApplierTest {

    @Test
    void testSetNewPricesHomeCategory() {
        // Crear un mock de ProductDao
        ProductDao mockDao = mock(ProductDao.class);

        // Crear una lista de productos con categorías "HOME" y "BUSINESS"
        Product homeProduct = new Product("Product1", "HOME", 100);
        Product businessProduct = new Product("Product2", "BUSINESS", 200);
        List<Product> products = Arrays.asList(homeProduct, businessProduct);

        // Configurar el mock para devolver los productos
        when(mockDao.all()).thenReturn(products);

        // Crear la instancia de DiscountApplier con el mock de ProductDao
        DiscountApplier discountApplier = new DiscountApplier(mockDao);

        // Llamar al método para aplicar los descuentos
        discountApplier.setNewPrices();

        // Verificar que los precios fueron actualizados correctamente
        assertEquals(90, homeProduct.getPrice()); // 100 * 0.9 = 90
        assertEquals(220, businessProduct.getPrice()); // 200 * 1.1 = 220
    }

    @Test
    void testSetNewPricesNoProducts() {
        // Crear un mock de ProductDao
        ProductDao mockDao = mock(ProductDao.class);

        // Configurar el mock para devolver una lista vacía
        when(mockDao.all()).thenReturn(Arrays.asList());

        // Crear la instancia de DiscountApplier con el mock de ProductDao
        DiscountApplier discountApplier = new DiscountApplier(mockDao);

        // Llamar al método para aplicar los descuentos
        discountApplier.setNewPrices();

        // Verificar que no se produce ningún cambio en los precios (la lista está vacía)
        verify(mockDao, times(1)).all();
    }
}
