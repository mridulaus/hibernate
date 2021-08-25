package com.xworkz.dryfruits.dao;

import com.xworkz.dryfruits.dto.DryFruitsDTO;

public interface DryFruitsDAO  {
int save(DryFruitsDTO entity);

int read(DryFruitsDTO entity);

int update(DryFruitsDTO entity);

int delete(DryFruitsDTO entity);
}
