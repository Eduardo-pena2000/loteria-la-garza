package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ClearByAttachmentTypeMetadataFilter extends MetadataFilter {
    private final Set types;

    public ClearByAttachmentTypeMetadataFilter() {
        this(new HashSet());
    }

    public void filter(Metadata metadata) throws TikaException {
        String str = metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE);
        if (str != null && this.types.contains(str)) {
            for (String str2 : metadata.names()) {
                metadata.remove(str2);
            }
        }
    }

    public List getTypes() {
        return new ArrayList(this.types);
    }

    @Field
    public void setTypes(List list) throws TikaConfigException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                TikaCoreProperties.EmbeddedResourceType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                TikaCoreProperties.EmbeddedResourceType[] values = TikaCoreProperties.EmbeddedResourceType.values();
                int length = values.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    TikaCoreProperties.EmbeddedResourceType embeddedResourceType = values[i];
                    int i3 = i2 + 1;
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(embeddedResourceType.name());
                    i++;
                    i2 = i3;
                }
                throw new TikaConfigException("I'm sorry. I regret I don't recognise " + str + ". I do recognize the following (case-sensitive):" + sb.toString());
            }
        }
        this.types.addAll(list);
    }

    public ClearByAttachmentTypeMetadataFilter(Set set) {
        this.types = set;
    }
}
