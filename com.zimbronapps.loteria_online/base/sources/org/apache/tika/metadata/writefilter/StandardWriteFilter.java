package org.apache.tika.metadata.writefilter;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.AccessPermissions;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class StandardWriteFilter implements MetadataWriteFilter, Serializable {
    public static final Set ALWAYS_ADD_FIELDS;
    public static final Set ALWAYS_SET_FIELDS;
    private static final String METADATA_TRUNCATED_KEY;
    private static final String TIKA_CONTENT_KEY;
    private static final String[] TRUE;
    private final Set excludeFields;
    private final boolean includeEmpty;
    private final Set includeFields;
    private final int maxFieldSize;
    private final int maxKeySize;
    private final int maxTotalEstimatedSize;
    private final int maxValuesPerField;
    private final int minimumMaxFieldSizeInAlwaysFields = 300;
    private Map fieldSizes = new HashMap();
    int estimatedSize = 0;

    public static class StringSizePair {
        final int size;
        final String string;
        final boolean truncated;

        public StringSizePair(String str, int i, boolean z) {
            this.string = str;
            this.size = i;
            this.truncated = z;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        ALWAYS_SET_FIELDS = hashSet;
        HashSet hashSet2 = new HashSet();
        ALWAYS_ADD_FIELDS = hashSet2;
        hashSet.add("Content-Length");
        hashSet.add("Content-Type");
        hashSet.add("Content-Encoding");
        hashSet.add(TikaCoreProperties.CONTENT_TYPE_USER_OVERRIDE.getName());
        hashSet.add(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE.getName());
        hashSet.add(TikaCoreProperties.CONTENT_TYPE_HINT.getName());
        Property property = TikaCoreProperties.TIKA_CONTENT;
        hashSet.add(property.getName());
        hashSet.add("resourceName");
        hashSet.add(AccessPermissions.EXTRACT_CONTENT.getName());
        hashSet.add(AccessPermissions.EXTRACT_FOR_ACCESSIBILITY.getName());
        hashSet.add("Content-Disposition");
        hashSet.add(TikaCoreProperties.CONTAINER_EXCEPTION.getName());
        hashSet.add(TikaCoreProperties.EMBEDDED_EXCEPTION.getName());
        hashSet2.add(TikaCoreProperties.TIKA_PARSED_BY.getName());
        METADATA_TRUNCATED_KEY = TikaCoreProperties.TRUNCATED_METADATA.getName();
        TIKA_CONTENT_KEY = property.getName();
        TRUE = new String[]{"true"};
    }

    public StandardWriteFilter(int i, int i2, int i3, int i4, Set set, Set set2, boolean z) {
        this.maxKeySize = i;
        this.maxFieldSize = i2;
        this.maxTotalEstimatedSize = i3;
        this.maxValuesPerField = i4;
        this.includeFields = set;
        this.excludeFields = set2;
        this.includeEmpty = z;
    }

    private void addAlwaysInclude(String str, String str2, Map map) {
        if (TIKA_CONTENT_KEY.equals(str)) {
            map.put(str, new String[]{str2});
            return;
        }
        if (!map.containsKey(str)) {
            setAlwaysInclude(str, str2, map);
            return;
        }
        int estimateSize = estimateSize(str2);
        int max = Math.max(300, this.maxFieldSize);
        if (estimateSize > max) {
            str2 = truncate(str2, max, map);
            estimateSize = estimateSize(str2);
        }
        this.estimatedSize += (map.containsKey(str) ? 0 : estimateSize(str)) + estimateSize;
        map.put(str, appendValue((String[]) map.get(str), str2));
    }

    private String[] appendValue(String[] strArr, String str) {
        if (str == null) {
            return strArr;
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    private static int estimateSize(String str) {
        if (str == null) {
            return 0;
        }
        return str.length() * 2;
    }

    private StringSizePair filterKey(String str, String str2, Map map) {
        int estimateSize = estimateSize(str);
        int i = this.maxKeySize;
        if (estimateSize <= i) {
            return new StringSizePair(str, estimateSize, false);
        }
        String truncate = truncate(str, i, map);
        return new StringSizePair(truncate, estimateSize(truncate), true);
    }

    private boolean include(String str, String str2) {
        return includeField(str) && includeValue(str2);
    }

    private boolean includeField(String str) {
        if (str == null) {
            throw new NullPointerException("property name must not be null");
        }
        if (ALWAYS_SET_FIELDS.contains(str)) {
            return true;
        }
        if (this.excludeFields.contains(str)) {
            return false;
        }
        return this.includeFields.isEmpty() || this.includeFields.contains(str);
    }

    private boolean includeValue(String str) {
        return this.includeEmpty || !StringUtils.isBlank(str);
    }

    private int maxAllowedToAdd(StringSizePair stringSizePair) {
        Integer num = (Integer) this.fieldSizes.get(stringSizePair.string);
        return Math.min(this.maxFieldSize - (num == null ? 0 : num.intValue()), ((this.maxTotalEstimatedSize - this.estimatedSize) - 1) - (num == null ? stringSizePair.size : 0));
    }

    private int maxAllowedToSet(StringSizePair stringSizePair) {
        Integer num = (Integer) this.fieldSizes.get(stringSizePair.string);
        return Math.min(this.maxFieldSize, ((this.maxTotalEstimatedSize - this.estimatedSize) + (num == null ? 0 : num.intValue())) - (num == null ? stringSizePair.size : 0));
    }

    private void setAlwaysInclude(String str, String str2, Map map) {
        if (TIKA_CONTENT_KEY.equals(str)) {
            map.put(str, new String[]{str2});
            return;
        }
        int estimateSize = estimateSize(str2);
        int max = Math.max(300, this.maxFieldSize);
        if (estimateSize > max) {
            str2 = truncate(str2, max, map);
            estimateSize = estimateSize(str2);
        }
        int estimateSize2 = (map.containsKey(str) ? 0 : estimateSize(str)) + estimateSize;
        if (map.containsKey(str)) {
            String[] strArr = (String[]) map.get(str);
            if (strArr.length > 0) {
                estimateSize2 -= estimateSize(strArr[0]);
            }
        }
        this.estimatedSize += estimateSize2;
        map.put(str, new String[]{str2});
    }

    private void setFilterKey(StringSizePair stringSizePair, String str, Map map) {
        if (!map.containsKey(stringSizePair.string) && stringSizePair.size + this.estimatedSize > this.maxTotalEstimatedSize) {
            setTruncated(map);
            return;
        }
        Integer num = (Integer) this.fieldSizes.get(stringSizePair.string);
        int intValue = num == null ? 0 : num.intValue();
        int maxAllowedToSet = maxAllowedToSet(stringSizePair);
        if (maxAllowedToSet <= 0) {
            setTruncated(map);
            return;
        }
        int estimateSize = estimateSize(str);
        if (estimateSize <= maxAllowedToSet || (estimateSize = estimateSize((str = truncate(str, maxAllowedToSet, map)))) != 0) {
            this.estimatedSize += (num == null ? stringSizePair.size : 0) + (estimateSize - intValue);
            this.fieldSizes.put(stringSizePair.string, Integer.valueOf(estimateSize));
            map.put(stringSizePair.string, new String[]{str});
        }
    }

    private void setTruncated(Map map) {
        map.put(METADATA_TRUNCATED_KEY, TRUE);
    }

    private String truncate(String str, int i, Map map) {
        setTruncated(map);
        Charset charset = StandardCharsets.UTF_16BE;
        ByteBuffer wrap = ByteBuffer.wrap(str.getBytes(charset), 0, i);
        CharBuffer allocate = CharBuffer.allocate(i);
        CharsetDecoder newDecoder = charset.newDecoder();
        newDecoder.onMalformedInput(CodingErrorAction.IGNORE);
        newDecoder.decode(wrap, allocate, true);
        newDecoder.flush(allocate);
        return new String(allocate.array(), 0, allocate.position());
    }

    public void add(String str, String str2, Map map) {
        if (include(str, str2)) {
            if (ALWAYS_SET_FIELDS.contains(str)) {
                setAlwaysInclude(str, str2, map);
                return;
            }
            if (ALWAYS_ADD_FIELDS.contains(str)) {
                addAlwaysInclude(str, str2, map);
                return;
            }
            StringSizePair filterKey = filterKey(str, str2, map);
            if (!map.containsKey(filterKey.string)) {
                setFilterKey(filterKey, str2, map);
                return;
            }
            String[] strArr = (String[]) map.get(filterKey.string);
            if (strArr != null && strArr.length >= this.maxValuesPerField) {
                setTruncated(map);
                return;
            }
            Integer num = (Integer) this.fieldSizes.get(filterKey.string);
            int intValue = num == null ? 0 : num.intValue();
            int maxAllowedToAdd = maxAllowedToAdd(filterKey);
            if (maxAllowedToAdd <= 0) {
                setTruncated(map);
                return;
            }
            int estimateSize = estimateSize(str2);
            if (estimateSize <= maxAllowedToAdd || (estimateSize = estimateSize((str2 = truncate(str2, maxAllowedToAdd, map)))) != 0) {
                this.estimatedSize += num == null ? filterKey.size + estimateSize : estimateSize;
                this.fieldSizes.put(filterKey.string, Integer.valueOf(estimateSize + intValue));
                String str3 = filterKey.string;
                map.put(str3, appendValue((String[]) map.get(str3), str2));
            }
        }
    }

    public void filterExisting(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String[] strArr = (String[]) entry.getValue();
            if (includeField(str)) {
                for (String str2 : strArr) {
                    if (include(str, str2)) {
                        add(str, str2, hashMap);
                    }
                }
            }
        }
        map.clear();
        map.putAll(hashMap);
    }

    public void set(String str, String str2, Map map) {
        if (str2 == null) {
            map.remove(str);
            return;
        }
        if (include(str, str2)) {
            if (ALWAYS_SET_FIELDS.contains(str) || ALWAYS_ADD_FIELDS.contains(str)) {
                setAlwaysInclude(str, str2, map);
            } else {
                setFilterKey(filterKey(str, str2, map), str2, map);
            }
        }
    }
}
