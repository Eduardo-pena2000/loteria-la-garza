package org.apache.tika.metadata.writefilter;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class StandardWriteFilterFactory implements MetadataWriteFilterFactory {
    public static int DEFAULT_MAX_FIELD_SIZE = 102400;
    public static int DEFAULT_MAX_KEY_SIZE = 1024;
    public static int DEFAULT_MAX_VALUES_PER_FIELD = 10;
    public static int DEFAULT_TOTAL_ESTIMATED_BYTES = 10485760;
    private Set excludeFields;
    private boolean includeEmpty;
    private Set includeFields;
    private int maxFieldSize;
    private int maxKeySize;
    private int maxTotalEstimatedBytes;
    private int maxValuesPerField;

    public StandardWriteFilterFactory() {
        Set set = Collections.EMPTY_SET;
        this.includeFields = set;
        this.excludeFields = set;
        this.maxKeySize = DEFAULT_MAX_KEY_SIZE;
        this.maxFieldSize = DEFAULT_MAX_FIELD_SIZE;
        this.maxTotalEstimatedBytes = DEFAULT_TOTAL_ESTIMATED_BYTES;
        this.maxValuesPerField = DEFAULT_MAX_VALUES_PER_FIELD;
        this.includeEmpty = false;
    }

    public Set getIncludeFields() {
        return this.includeFields;
    }

    public int getMaxFieldSize() {
        return this.maxFieldSize;
    }

    public int getMaxKeySize() {
        return this.maxKeySize;
    }

    public int getMaxTotalEstimatedBytes() {
        return this.maxTotalEstimatedBytes;
    }

    public int getMaxValuesPerField() {
        return this.maxValuesPerField;
    }

    public boolean isIncludeEmpty() {
        return this.includeEmpty;
    }

    public MetadataWriteFilter newInstance() {
        if (this.maxFieldSize < 0) {
            throw new IllegalArgumentException("maxFieldSize must be > 0");
        }
        if (this.maxValuesPerField < 1) {
            throw new IllegalArgumentException("maxValuesPerField must be > 0");
        }
        if (this.maxTotalEstimatedBytes >= 0) {
            return new StandardWriteFilter(this.maxKeySize, this.maxFieldSize, this.maxTotalEstimatedBytes, this.maxValuesPerField, this.includeFields, this.excludeFields, this.includeEmpty);
        }
        throw new IllegalArgumentException("max estimated size must be > 0");
    }

    public void setExcludeFields(List list) {
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet(list.size());
        newKeySet.addAll(list);
        this.excludeFields = Collections.unmodifiableSet(newKeySet);
    }

    public void setIncludeEmpty(boolean z) {
        this.includeEmpty = z;
    }

    public void setIncludeFields(List list) {
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet(list.size());
        newKeySet.addAll(list);
        this.includeFields = Collections.unmodifiableSet(newKeySet);
    }

    public void setMaxFieldSize(int i) {
        this.maxFieldSize = i;
    }

    public void setMaxKeySize(int i) {
        this.maxKeySize = i;
    }

    public void setMaxTotalEstimatedBytes(int i) {
        this.maxTotalEstimatedBytes = i;
    }

    public void setMaxValuesPerField(int i) {
        this.maxValuesPerField = i;
    }

    public String toString() {
        return "StandardWriteFilterFactory{includeFields=" + String.valueOf(this.includeFields) + ", maxKeySize=" + this.maxKeySize + ", maxFieldSize=" + this.maxFieldSize + ", maxTotalEstimatedBytes=" + this.maxTotalEstimatedBytes + ", maxValuesPerField=" + this.maxValuesPerField + ", includeEmpty=" + this.includeEmpty + "}";
    }
}
