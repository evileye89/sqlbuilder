package de.sqlbuilder;

public abstract class StartKeywordImpl implements Keyword {
  @Override
  public String build() {
    return format();
  }

  public abstract String format();
}
