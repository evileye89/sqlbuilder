package de.sqlbuilder.keywords;

import de.sqlbuilder.StartKeywordImpl;
import de.sqlbuilder.facade.Set;

/**
 * UPDATE keyword formatting.
 */
public class UpdateKeyword extends StartKeywordImpl implements Set {
  private String table;

  /**
   * Constructor.
   *
   * @param table table name
   */
  public UpdateKeyword(String table) {
    this.table = table;
  }

  @Override
  public String format() {
    return String.format("UPDATE %s", table);
  }
}
