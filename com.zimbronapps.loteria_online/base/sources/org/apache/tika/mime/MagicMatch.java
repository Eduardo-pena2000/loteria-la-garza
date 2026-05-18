package org.apache.tika.mime;

import Db.h;
import java.io.IOException;
import org.apache.tika.detect.MagicDetector;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class MagicMatch implements Clause {
    private MagicDetector detector = null;
    private final String mask;
    private final MediaType mediaType;
    private final String offset;
    private final String type;
    private final String value;

    public MagicMatch(MediaType mediaType, String str, String str2, String str3, String str4) {
        this.mediaType = mediaType;
        this.type = str;
        this.offset = str2;
        this.value = str3;
        this.mask = str4;
    }

    private synchronized MagicDetector getDetector() {
        try {
            if (this.detector == null) {
                this.detector = MagicDetector.parse(this.mediaType, this.type, this.offset, this.value, this.mask);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.detector;
    }

    public boolean eval(byte[] bArr) {
        try {
            return getDetector().detect(h.a().q(bArr).p(), new Metadata()) != MediaType.OCTET_STREAM;
        } catch (IOException unused) {
            return false;
        }
    }

    public int size() {
        return getDetector().getLength();
    }

    public String toString() {
        return this.mediaType.toString() + " " + this.type + " " + this.offset + " " + this.value + " " + this.mask;
    }
}
