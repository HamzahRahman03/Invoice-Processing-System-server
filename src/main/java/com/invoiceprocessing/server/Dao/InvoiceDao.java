package com.invoiceprocessing.server.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoiceprocessing.server.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Long>{

}
