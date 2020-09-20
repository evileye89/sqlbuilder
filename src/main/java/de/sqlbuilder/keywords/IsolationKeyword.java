package de.sqlbuilder.keywords;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.helper.IsolationOption;

public class IsolationKeyword extends KeywordImpl {
    private IsolationOption option;

    public IsolationKeyword(Keyword parent, IsolationOption option) {
        super(parent);
        this.option = option;
    }

    @Override
    public String format() {
        return String.format(" WITH %s", option.name());
    }
}
