package de.sqlbuilder.keywords;

import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.Set;

/**
 * UPDATE keyword formatting.
 */
public class UpdateKeyword extends KeywordImpl implements Set {
  private String table;

  /**
   * Constructor.
   *
   * @param table table name
   */
  public UpdateKeyword(String table) {
    super(null);
    this.table = table;
  }

  @Override
  public String format() {
    return String.format("UPDATE %s", table);
  }
}
