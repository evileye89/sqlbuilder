package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.And;
import de.sqlbuilder.facade.GroupBy;
import de.sqlbuilder.facade.Or;
import de.sqlbuilder.facade.OrderBy;

/**
 * OR keyword formatting.
 */
public class OrKeyword extends KeywordImpl implements Or, And, GroupBy, OrderBy {
  private final String column;
  private final String operator;
  private final String value;

  /**
   * Constructor.
   *
   * @param parent previous keyword
   * @param column column name
   * @param operator operator for where clause condition
   * @param value value
   */
  public OrKeyword(Keyword parent, String column, String operator, String value) {
    super(parent);
    this.column = column;
    this.operator = operator;
    this.value = value;
  }

  @Override
  public String format() {
    return String.format(" OR %s %s %s", column, operator, value);
  }
}
