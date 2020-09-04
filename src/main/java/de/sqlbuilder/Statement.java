package de.sqlbuilder;

import de.sqlbuilder.keywords.InsertKeyword;
import de.sqlbuilder.keywords.SelectDistinctKeyword;
import de.sqlbuilder.keywords.SelectKeyword;
import de.sqlbuilder.keywords.UpdateKeyword;

public class Statement {

  public InsertKeyword insert(String table, String... columns) {
    return new InsertKeyword(table, columns);
  }

  public SelectKeyword select(String... columns) {
    return new SelectKeyword(columns);
  }

  public SelectDistinctKeyword selectDistinct(String... columns) {
    return new SelectDistinctKeyword(columns);
  }

  public UpdateKeyword update(String table) {
    return new UpdateKeyword(table);
  }
}
