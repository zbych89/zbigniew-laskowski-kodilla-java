package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave() {
        Product prod1 = new Product("Something");
        Product prod2 = new Product("Something else");
        Product prod3 = new Product("Another thing");
        Item item1 = new Item(prod1,new BigDecimal(12.50),10);
        Item item2 = new Item(prod2,new BigDecimal(8),100);
        Item item3 = new Item(prod3,new BigDecimal(15),8);
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Invoice invoice = new Invoice("A001",items);
        invoiceDao.save(invoice);
        Invoice readInvoice = invoiceDao.findByNumber("A001");
        int id = readInvoice.getId();
        Assert.assertNotEquals(0,id);
        invoiceDao.delete(id);
    }
}
