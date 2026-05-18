package org.apache.tika.extractor;

import java.util.Set;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BasicEmbeddedBytesSelector implements EmbeddedBytesSelector {
    private final Set excludeEmbeddedResourceTypes;
    private final Set excludeMimes;
    private final Set includeEmbeddedResourceTypes;
    private final Set includeMimes;

    public BasicEmbeddedBytesSelector(Set set, Set set2, Set set3, Set set4) {
        this.includeMimes = set;
        this.excludeMimes = set2;
        this.includeEmbeddedResourceTypes = set3;
        this.excludeEmbeddedResourceTypes = set4;
    }

    public boolean select(Metadata metadata) {
        MediaType parse;
        String str = metadata.get("Content-Type");
        if (str == null) {
            str = "";
        } else if ((this.includeMimes.size() > 0 || this.excludeMimes.size() > 0) && (parse = MediaType.parse(str)) != null) {
            str = parse.getType() + "/" + parse.getSubtype();
        }
        if (this.excludeMimes.contains(str)) {
            return false;
        }
        if (this.includeMimes.size() > 0 && !this.includeMimes.contains(str)) {
            return false;
        }
        String str2 = metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE);
        if (StringUtils.isBlank(str2)) {
            str2 = "ATTACHMENT";
        }
        return !this.excludeEmbeddedResourceTypes.contains(str2) && this.includeEmbeddedResourceTypes.size() > 0 && this.includeEmbeddedResourceTypes.contains(str2);
    }
}
