package com.cg.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IExpenseDao;
import com.cg.expensebean.ExpenseBean;

@Transactional
@Service
public class ExpenseServiceImpl implements IExpenseService{
	
	@Autowired
	IExpenseDao dao;
	
	
	@Override
	public String addInfo(ExpenseBean expense) {
		
			dao.save(expense);
			return "Success";
	}


	@Override
	public ExpenseBean getInfo(int expenseCode) {
	
		ExpenseBean eb=dao.findById(expenseCode).get();
		
		return eb;
		
	}


	@Override
	public void updateExpense(ExpenseBean expense) {
		dao.save(expense);
		
	}


	@Override
	public List<ExpenseBean> getAll() {
		
		return dao.findAll();
	}


	@Override
	public void deleteExpense(int expenseCode) {
		ExpenseBean expense=dao.findById(expenseCode).get();
		dao.delete(expense);
		
	}
	
	

}
