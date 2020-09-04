package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.SetKeyword;

public interface Set extends Keyword {

  default SetKeyword set(String column, String value) {
    return new SetKeyword(this, column, value);
  }

}
