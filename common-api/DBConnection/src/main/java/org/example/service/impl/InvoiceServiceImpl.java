package org.example.service.impl;

import org.example.entity.Invoice;
import org.example.persistence.InvoiceMapper;
import org.example.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("InvoiceService")
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceMapper invoiceMapper;

    @Override
    public void addInvoice(Invoice invoice) {
        invoiceMapper.insert(invoice);
    }

    @Override
    public void deleteInvoiceById(int id) {
        invoiceMapper.deleteById(id);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        invoiceMapper.updateById(invoice);
    }

    @Override
    public Invoice getInvoiceById(int id) {
        return invoiceMapper.selectById(id);
    }
}
