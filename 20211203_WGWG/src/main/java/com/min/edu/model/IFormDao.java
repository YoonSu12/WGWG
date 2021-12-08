package com.min.edu.model;

import java.util.List;

import com.min.edu.vo.Form;
import com.min.edu.vo.FormClassification;

public interface IFormDao {

	public List<FormClassification> selectFormcList();
	public List<Form> selectFormList();
}
