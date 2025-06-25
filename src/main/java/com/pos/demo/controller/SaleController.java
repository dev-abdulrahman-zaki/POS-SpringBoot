package com.pos.demo.controller;

import com.pos.demo.dao.SaleDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/sales")
@RestController
@RequiredArgsConstructor
public class SaleController {

    private final SaleDao saleDao;

}
