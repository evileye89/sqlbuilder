package de.sqlbuilder.facade;

import de.sqlbuilder.Keyword;
import de.sqlbuilder.helper.IsolationOption;
import de.sqlbuilder.keywords.IsolationKeyword;

public interface Isolation extends Keyword {

    default IsolationKeyword with(IsolationOption option) {
        return new IsolationKeyword(this, option);
    }
}
