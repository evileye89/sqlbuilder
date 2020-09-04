package de.sqlbuilder.keywords;

import de.sqlbuilder.StartKeywordImpl;
import de.sqlbuilder.facade.From;
import de.sqlbuilder.helper.StringHelper;
import java.util.Arrays;

/**
 * SELECT DISTINCT keyword formatting.
 */
public class SelectDistinctKeyword extends StartKeywordImpl implements From {
  private String[] columns;

  /**
   * Constructor.
   *
   * @param columns list of column names
   */
  public SelectDistinctKeyword(String ... columns) {
    this.columns = columns;
  }

  @Override
  public String format() {
    String text = columns.length == 0 ? "*" : StringHelper.join(Arrays.stream(columns), ", ");

    return String.format("SELECT DISTINCT %s", text);
  }
}
