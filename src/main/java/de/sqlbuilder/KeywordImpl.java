package de.sqlbuilder;

import static de.sqlbuilder.helper.ListHelper.LIST_END;
import static de.sqlbuilder.helper.ListHelper.LIST_START;

public abstract class KeywordImpl implements Keyword {
    protected Keyword parent;

    private boolean nested = false;

    public KeywordImpl(Keyword parent) {
        this.parent = parent;
    }

    @Override
    public String build() {
        return nested ? buildNestedQuery() : buildQuery();
    }

    @Override
    public Keyword nested() {
        nested = true;
        return this;
    }

    private String buildQuery() {
        return parent != null ? parent.build() + format() : format();
    }

    private String buildNestedQuery() {
        if (parent != null) {
            parent.nested();
            return parent.build() + format() + LIST_END;
        }

        return LIST_START + format();
    }

    public abstract String format();

}
