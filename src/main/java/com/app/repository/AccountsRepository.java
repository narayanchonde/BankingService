package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
