package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.OrderBy;

/** ORDER BY keyword formatting. */
public class OrderByKeyword extends KeywordImpl implements OrderBy {

  private String column;
  private String direction;

  /**
   * Constructor.
   *
   * @param parent previous keyword
   * @param column column name
   * @param direction sort direction
   */
  public OrderByKeyword(Keyword parent, String column, String direction) {
    super(parent);
    this.column = column;
    this.direction = direction;
  }

  @Override
  public String format() {
    if (this.parent instanceof OrderByKeyword) {
      return String.format(", %s %s", column, direction);
    } else {
      return String.format(" ORDER BY %s %s", column, direction);
    }
  }
}
