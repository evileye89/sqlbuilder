package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.OrderBy;
import de.sqlbuilder.helper.StringHelper;

import java.util.Arrays;

/**
 * GROUP BY keyword formatting.
 */
public class GroupByKeyword extends KeywordImpl implements OrderBy {
  private final String column;
  private final String[] columns;

  /**
   * Constructor.
   *
   * @param parent previous keyword
   * @param column first column (one needed)
   * @param columns other columns
   */
  public GroupByKeyword(Keyword parent, String column, String... columns) {
    super(parent);
    this.column = column;
    this.columns = columns;
  }

  @Override
  public String format() {
    if (columns.length == 0) {
      return String.format(" GROUP BY %s", column);
    } else {
      return String.format(
          " GROUP BY %s, %s", column, StringHelper.join(Arrays.stream(columns), ", "));
    }
  }
}
