package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.GroupByKeyword;

public interface GroupBy extends Keyword {

  default GroupByKeyword groupBy(String column, String ... columns) {
    return new GroupByKeyword(this, column, columns);
  }

}
