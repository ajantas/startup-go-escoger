package com.startup.oath.repositories;

import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.startup.oath.model.MobileData;

@Repository
public class CassandraMobileRepository implements MobileRepository {

	private final CassandraOperations cassandraTemplate;

	public CassandraMobileRepository(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
	}

	@Override
	public MobileData save(MobileData mobile) {
		return this.cassandraTemplate.insert(mobile);
	}

}
