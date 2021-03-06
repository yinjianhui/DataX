package com.baifendian.datax.plugin.reader.hivereader;

/**
 * Created by caojingwei on 2017/6/15.
 */
public class HiveReaderConst {
  public static final String USERNAME = "username";
  public static final String PASSWORD = "password";
  public static final String JDBC_URL = "connection[0].jdbcUrl[0]";
  public static final String TABLE = "connection[0].table[0]";
  public static final String WHERE = "where";
  public static final String QUERY_SQL = "querySql";
  public static final String COLUMN = "column";

  /**
   * hive 驱动名称
   */
  public static final String HIVE_DRIVER = "org.apache.hive.jdbc.HiveDriver";

  /**
   * sql 模板
   */
  public static final String SQL = "select {0} from {1} where {2}";
}
