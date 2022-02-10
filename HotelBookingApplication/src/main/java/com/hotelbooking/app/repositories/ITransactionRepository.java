package com.hotelbooking.app.repositories;

import com.hotelbooking.app.entities.Transactions;

public interface ITransactionRepository {
	public Transactions addTransaction(Transactions transaction);
}

