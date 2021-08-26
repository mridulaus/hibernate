package com.xworkz.birds.dao;

import com.xworkz.birds.entity.BirdEntity;

public interface BirdsDAO {
int save(BirdEntity entity);

BirdEntity readById(int id);
}
