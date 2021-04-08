package com.devsuperior.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.payroll.entities.Payment;
import com.devsuperior.payroll.entities.Worker;
import com.devsuperior.payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {


	@Autowired
	WorkerFeignClient workerFeignClient ;
	
	
	public Payment getPayment(Long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
	}
}
