package de.sqlbuilder.keywords;

import de.sqlbuilder.KeywordImpl;
import de.sqlbuilder.facade.From;

public class DeleteKeyword extends KeywordImpl implements From {
    public DeleteKeyword() {
        super(null);
    }

    @Override
    public String format() {
        return "DELETE";
    }
}
