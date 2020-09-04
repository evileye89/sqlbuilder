package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.OrKeyword;

public interface Or extends Keyword {

  default OrKeyword or(String column, String operator, String value) {
    return new OrKeyword(this, column, operator, value);
  }

}
