package de.sqlbuilder;

public abstract class KeywordImpl implements Keyword {
  protected Keyword parent;

  public KeywordImpl(Keyword parent) {
    this.parent = parent;
  }

  @Override
  public String build() {
    return parent.build() + format();
  }

  public abstract String format();
}
