package com.pos.demo.controller;

import com.pos.demo.dao.OrderDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/orders")
@RestController
@RequiredArgsConstructor
public class OrderController {

  private final OrderDao orderDao;
}
