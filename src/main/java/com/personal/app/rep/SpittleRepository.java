package com.personal.app.rep;

import java.util.List;

import com.personal.app.model.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
