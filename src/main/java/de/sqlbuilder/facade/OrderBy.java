package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.OrderByKeyword;

public interface OrderBy extends Keyword {

  default OrderByKeyword orderBy(String column, String direction) {
    return new OrderByKeyword(this, column, direction);
  }

}
