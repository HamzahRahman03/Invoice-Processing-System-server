package com.invoiceprocessing.server.services;

import java.util.*;
import com.invoiceprocessing.server.model.Invoice;

public interface InvoiceService {

    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getAllInvoices();

    public Invoice deleteInvoice(long id);

}
