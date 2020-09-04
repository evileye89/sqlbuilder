package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.AndKeyword;

public interface And extends Keyword {

  default AndKeyword and(String column, String operator, String value) {
    return new AndKeyword(this, column, operator, value);
  }

}
