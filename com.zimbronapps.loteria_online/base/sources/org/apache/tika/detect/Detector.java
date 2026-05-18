package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Detector extends Serializable {
    MediaType detect(InputStream inputStream, Metadata metadata) throws IOException;
}
