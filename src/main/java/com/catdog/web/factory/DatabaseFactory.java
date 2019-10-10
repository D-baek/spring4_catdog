package com.catdog.web.factory;
import com.catdog.web.enums.Vendor;

public class DatabaseFactory {
	public static Database createDatabase(String vendor) {
		Database db = null;
		switch (Vendor.valueOf(vendor)) {
		case ORACLE: db = new Oracle();
			break;
		}
		return db;
	}
}
