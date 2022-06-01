package com.example.demo.service;

import com.example.demo.entity.CAttachment;

import java.util.List;
import java.util.Map;

public interface IAttachmentService {
	public void addFileIntoToDB(CAttachment attachment);
	public List<CAttachment> list(int constractId);
	public void addFileIntoToDB(List<CAttachment> attachment);
	public void deleteAttachment (int id);
}
