package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.WhereKeyword;

public interface Where extends Keyword {

  default WhereKeyword where(String column, String operator, String value) {
    return new WhereKeyword(this, column, operator, value);
  }

  default WhereKeyword where(String clause) {
    return new WhereKeyword(this, clause);
  }
}
