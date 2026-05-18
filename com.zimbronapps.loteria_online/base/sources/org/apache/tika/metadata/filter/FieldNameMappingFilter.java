package org.apache.tika.metadata.filter;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FieldNameMappingFilter extends MetadataFilter {
    Map mappings = new LinkedHashMap();
    boolean excludeUnmapped = true;

    public void filter(Metadata metadata) throws TikaException {
        if (!this.excludeUnmapped) {
            for (String str : metadata.names()) {
                if (this.mappings.containsKey(str)) {
                    String[] values = metadata.getValues(str);
                    metadata.remove(str);
                    for (String str2 : values) {
                        metadata.add((String) this.mappings.get(str), str2);
                    }
                }
            }
            return;
        }
        for (String str3 : metadata.names()) {
            if (this.mappings.containsKey(str3)) {
                String[] values2 = metadata.getValues(str3);
                metadata.remove(str3);
                for (String str4 : values2) {
                    metadata.add((String) this.mappings.get(str3), str4);
                }
            } else {
                metadata.remove(str3);
            }
        }
    }

    public Map getMappins() {
        return this.mappings;
    }

    @Field
    public void setExcludeUnmapped(boolean z) {
        this.excludeUnmapped = z;
    }

    @Field
    public void setMappings(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.mappings.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public String toString() {
        return "FieldNameMappingFilter{mappings=" + String.valueOf(this.mappings) + ", excludeUnmapped=" + this.excludeUnmapped + "}";
    }
}
