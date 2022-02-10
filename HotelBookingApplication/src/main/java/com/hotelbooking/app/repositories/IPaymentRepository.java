package com.hotelbooking.app.repositories;

import com.hotelbooking.app.entities.Payments;

public interface IPaymentRepository {
	public Payments addPayment(Payments payment);
}
