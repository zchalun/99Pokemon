package sql;

import java.sql.*;

public class sqlControl {

	private Connection conn;
	private Statement stat;
	private PreparedStatement prep;

	/*
	 * This is a SQLite Manager for people who don't know how to use sqlite CLI
	 */
	public static void main(String[] args) {
		sqlControl sql = new sqlControl();

		try {
			sql.connect("");
			sql.genTable("");
			sql.exec();
			System.out.println("SQLite commands successfully executed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void connect(String name) throws Exception {
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:" + name.replace("\\s", "") + ".db");
		stat = conn.createStatement();
	}

	private void genTable(String name) throws Exception {
		//to be changed
		//stat.execute("create table if not exists " + name.replace("\\s", "")
			//	+ " (id INTEGER PRIMARY KEY AUTOINCREMENT, question varchar(1023), a varchar(255), b char, c integer, d varchar(255), e varchar(255), ans varchar(255), hint varchar(255));");
	}

	private void addRow() throws Exception {
		//prep = conn.prepareStatement("insert into " + name.replace("\\s", "")
				//+ " (question, a, b, c, d, e, ans, hint) values (?, ?, ?, ?, ?, ?, ?, ?)");
		// change to fields later
	}

	// execute all sql syntax
	private void exec() throws SQLException {
		prep.execute();
	}
}
