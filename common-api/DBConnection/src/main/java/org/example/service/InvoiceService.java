package org.example.service;

import org.example.entity.Invoice;

public interface InvoiceService {
    void addInvoice(Invoice invoice);
    void deleteInvoiceById(int id);
    void updateInvoice(Invoice invoice);
    Invoice getInvoiceById(int id);
}