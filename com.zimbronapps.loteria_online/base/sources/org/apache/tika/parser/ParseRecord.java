package org.apache.tika.parser;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParseRecord {
    private static final int MAX_EXCEPTIONS = 100;
    private static final int MAX_METADATA_LIST_SIZE = 100;
    private static int MAX_PARSERS = 100;
    private static final int MAX_WARNINGS = 100;
    private int depth = 0;
    private final Set parsers = new LinkedHashSet();
    private final List exceptions = new ArrayList();
    private final List warnings = new ArrayList();
    private final List metadataList = new ArrayList();
    private boolean writeLimitReached = false;

    public void addException(Exception exc) {
        if (this.exceptions.size() < 100) {
            this.exceptions.add(exc);
        }
    }

    public void addMetadata(Metadata metadata) {
        if (this.metadataList.size() < 100) {
            this.metadataList.add(metadata);
        }
    }

    public void addParserClass(String str) {
        if (this.parsers.size() < MAX_PARSERS) {
            this.parsers.add(str);
        }
    }

    public void addWarning(String str) {
        if (this.warnings.size() < 100) {
            this.warnings.add(str);
        }
    }

    public void afterParse() {
        this.depth--;
    }

    public void beforeParse() {
        this.depth++;
    }

    public int getDepth() {
        return this.depth;
    }

    public List getExceptions() {
        return this.exceptions;
    }

    public List getMetadataList() {
        return this.metadataList;
    }

    public String[] getParsers() {
        return (String[]) this.parsers.toArray(new String[0]);
    }

    public List getWarnings() {
        return this.warnings;
    }

    public boolean isWriteLimitReached() {
        return this.writeLimitReached;
    }

    public void setWriteLimitReached(boolean z) {
        this.writeLimitReached = z;
    }
}
