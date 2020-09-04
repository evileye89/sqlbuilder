package de.sqlbuilder.keywords;

import de.sqlbuilder.StartKeywordImpl;
import de.sqlbuilder.facade.Values;
import de.sqlbuilder.helper.StringHelper;
import java.util.Arrays;

/**
 * INSERT INTO keyword formatting.
 */
public class InsertKeyword extends StartKeywordImpl implements Values {
  private final String table;
  private final String[] columns;

  /**
   * Constructor.
   *
   * @param table table name
   * @param columns list of column names
   */
  public InsertKeyword(String table, String ... columns) {
    this.table = table;
    this.columns = columns;
  }

  @Override
  public String format() {
    if (columns.length == 0) {
      return String.format("INSERT INTO %s", table);
    } else {
      return String.format("INSERT INTO %s (%s)",
                           table,
                           StringHelper.join(Arrays.stream(columns), ", "));
    }
  }
}
