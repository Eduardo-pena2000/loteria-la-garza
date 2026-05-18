package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class OverrideDetector implements Detector {
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (str != null) {
            return MediaType.parse(str);
        }
        String str2 = metadata.get(TikaCoreProperties.CONTENT_TYPE_USER_OVERRIDE);
        return str2 != null ? MediaType.parse(str2) : MediaType.OCTET_STREAM;
    }
}
