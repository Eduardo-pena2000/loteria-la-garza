package org.apache.tika.detect;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TypeDetector implements Detector {
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        MediaType parse;
        String str = metadata.get("Content-Type");
        return (str == null || (parse = MediaType.parse(str)) == null) ? MediaType.OCTET_STREAM : parse;
    }
}
