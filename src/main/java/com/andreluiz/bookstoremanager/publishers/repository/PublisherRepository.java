package com.andreluiz.bookstoremanager.publishers.repository;

import com.andreluiz.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
