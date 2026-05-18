package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ClearByMimeMetadataFilter extends MetadataFilter {
    private final Set mimes;

    public ClearByMimeMetadataFilter() {
        this(new HashSet());
    }

    public void filter(Metadata metadata) throws TikaException {
        String str = metadata.get("Content-Type");
        if (str == null) {
            return;
        }
        MediaType parse = MediaType.parse(str);
        if (parse != null) {
            str = parse.getBaseType().toString();
        }
        if (this.mimes.contains(str)) {
            for (String str2 : metadata.names()) {
                metadata.remove(str2);
            }
        }
    }

    public List getMimes() {
        return new ArrayList(this.mimes);
    }

    @Field
    public void setMimes(List list) {
        this.mimes.addAll(list);
    }

    public ClearByMimeMetadataFilter(Set set) {
        this.mimes = set;
    }
}
