package com.bw.fortcrop.db;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.sql.*;

public class DBAccess {
	public static Connection getConnection(String JNDIName) throws Exception {
		Context initCtx = null;
		Connection conn = null;
		try {
			initCtx = new javax.naming.InitialContext();
			// DataSource ds = (DataSource) initCtx.lookup(JNDIName);
			DataSource ds = (DataSource) initCtx.lookup("java:comp/env/"
					+ JNDIName);
			// DataSource ds = (DataSource) initCtx.lookup("ncds");

			conn = ds.getConnection();
		} catch (NameNotFoundException ne) {
			throw new NameNotFoundException(" JNDI 未找到 " + ne.getMessage());
		} catch (NamingException ex) {
			throw new NamingException(" JNDI 错误 " + ex.getMessage());
		} catch (SQLException es) {
			throw new SQLException(" db 错误 " + es.getMessage());
		}

		return conn;

	}

}
