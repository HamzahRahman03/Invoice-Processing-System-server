package com.invoiceprocessing.server.controller;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceprocessing.server.model.Invoice;
import com.invoiceprocessing.server.services.InvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@CrossOrigin
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;


    @PostMapping("/invoice")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return this.invoiceService.addInvoice(invoice);
    }    

    @GetMapping("/invoice")
    public List<Invoice> getInvoices() {
        return this.invoiceService.getAllInvoices();
    }

    @DeleteMapping("/invoice/{id}")
    public Invoice deletInvoice(@PathVariable String id){
        return this.invoiceService.deleteInvoice(Long.parseLong(id));
    }
    
}
