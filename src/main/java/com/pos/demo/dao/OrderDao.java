package com.pos.demo.dao;

import com.pos.demo.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDao {
  private final OrderRepo orderRepo;
}
