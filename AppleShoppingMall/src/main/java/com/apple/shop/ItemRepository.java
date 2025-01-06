package com.apple.shop;

import org.springframework.data.jpa.repository.JpaRepository;

// repository 인터페이스 만들기
public interface ItemRepository extends JpaRepository<Item, Long> {
}


// test