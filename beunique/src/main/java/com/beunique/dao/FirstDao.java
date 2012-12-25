package com.beunique.dao;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.WriteConcern;

public class FirstDao {

	public static final void main(String [] args) {
		
		Mongo mongo;
		try {
			mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("names");
			System.out.println(db.getCollectionNames());
			
			
			//
			// Create a new JSON document
			//
			BasicDBObject info = new BasicDBObject();
	        info.put("name", "MongoDB2");
	        info.put("fileName", "MongoDB-OSX");
	        info.put("rawName", "mongodb-osx-x86_64.zip");
	 
            //
            // Store document to MongoDB
            //
			collection.insert(info, WriteConcern.SAFE);
			
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
}
