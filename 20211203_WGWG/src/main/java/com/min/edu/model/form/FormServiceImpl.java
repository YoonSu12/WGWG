package com.min.edu.model.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.vo.Form;
import com.min.edu.vo.FormClassification;

@Service
public class FormServiceImpl implements IFormService {

	@Autowired
	private IFormDao dao;
	
	
	@Override
	public List<FormClassification> selectFormcList() {
		return dao.selectFormcList();
	}

	@Override
	public List<Form> selectFormList() {
		return dao.selectFormList();
	}

	@Override
	public Form selectFormDetail(int form_no) {
		return dao.selectFormDetail(form_no);
	}

}