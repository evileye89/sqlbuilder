package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.ValuesKeyword;

public interface Values extends Keyword {

  default ValuesKeyword values(String value, String... values) {
    return new ValuesKeyword(this, value, values);
  }

}
