package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.helper.StringHelper;

import java.util.Arrays;

/**
 * VALUES keyword formatting.
 */
public class ValuesKeyword extends KeywordImpl {
  private final String value;
  private final String[] values;

  /**
   * Constructor.
   *
   * @param parent previous keyword
   * @param value first value (one needed)
   * @param values other values
   */
  public ValuesKeyword(Keyword parent, String value, String ... values) {
    super(parent);
    this.value = value;
    this.values = values;
  }

  @Override
  public String format() {
    if (values.length == 0) {
      return String.format(" VALUES (%s)", value);
    } else {
      return String.format(" VALUES (%s, %s)",
                           value,
                           StringHelper.join(Arrays.stream(values), ", "));
    }
  }
}
