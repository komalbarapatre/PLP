package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.expensebean.ExpenseBean;

public interface IExpenseService {

	String addInfo(ExpenseBean expense);

	ExpenseBean getInfo(int expenseCode);

	void updateExpense(ExpenseBean expense);

	List<ExpenseBean> getAll();

	void deleteExpense(int expenseCode);

}
