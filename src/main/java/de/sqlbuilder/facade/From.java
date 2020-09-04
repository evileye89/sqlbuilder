package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.keywords.FromKeyword;

public interface From extends Keyword {

  default FromKeyword from(String table) {
    return new FromKeyword(this, table);
  }

}
