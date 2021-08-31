package com.xworkz.birds.dao;

import com.xworkz.birds.entity.BirdEntity;

public interface BirdsDAO {
int save(BirdEntity entity);

BirdEntity readById(int id);
void updateNameById(int id,String name);
void deleteById(int id);


}
