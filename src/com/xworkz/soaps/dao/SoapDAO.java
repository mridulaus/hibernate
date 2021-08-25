package com.xworkz.soaps.dao;


import com.xworkz.soaps.dto.SoapDTO;

public interface SoapDAO {
int save(SoapDTO entity);
int read(SoapDTO entity);

int update(SoapDTO entity);

int delete(SoapDTO entity);
}
