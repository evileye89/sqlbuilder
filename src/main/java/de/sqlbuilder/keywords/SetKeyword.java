package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.Set;
import de.sqlbuilder.facade.Where;

/**
 * SET keyword formatting.
 */
public class SetKeyword extends KeywordImpl implements Set, Where {
  private String column;
  private String value;

  /**
   * Constructor.
   *
   * @param parent previous keyword
   * @param column column name
   * @param value value
   */
  public SetKeyword(Keyword parent, String column, String value) {
    super(parent);
    this.column = column;
    this.value = value;
  }

  @Override
  public String format() {
    if (this.parent instanceof SetKeyword) {
      return String.format(", %s=%s", column, value);
    } else {
      return String.format(" SET %s=%s", column, value);
    }
  }
}
