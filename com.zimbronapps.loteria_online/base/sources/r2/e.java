package R2;

import M2.z;
import P2.K;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends b {
    public j e;
    public byte[] f;
    public int g;
    public int h;

    public e() {
        super(false);
    }

    public void close() {
        if (this.f != null) {
            this.f = null;
            r();
        }
        this.e = null;
    }

    public long g(j jVar) {
        s(jVar);
        this.e = jVar;
        Uri normalizeScheme = jVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        P2.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] c1 = K.c1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (c1.length != 2) {
            throw z.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = c1[1];
        if (c1[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw z.b("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f = K.r0(URLDecoder.decode(str, s7.e.a.name()));
        }
        long j = jVar.g;
        byte[] bArr = this.f;
        if (j > bArr.length) {
            this.f = null;
            throw new g(2008);
        }
        int i = (int) j;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        long j2 = jVar.h;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        t(jVar);
        long j3 = jVar.h;
        return j3 != -1 ? j3 : this.h;
    }

    public Uri o() {
        j jVar = this.e;
        if (jVar != null) {
            return jVar.a;
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(K.i(this.f), this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        q(min);
        return min;
    }
}
