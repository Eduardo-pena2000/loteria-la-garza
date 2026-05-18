package androidx.media3.exoplayer.smoothstreaming;

import R2.f;
import Y2.l;
import f3.a;
import f3.b;
import g3.j;
import g3.m;
import g3.w;
import k3.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class SsMediaSource$Factory implements w.a {
    public final b a;
    public final f.a b;
    public j c;
    public Y2.w d;
    public k e;
    public long f;

    public SsMediaSource$Factory(f.a aVar) {
        this(new a(aVar), aVar);
    }

    public SsMediaSource$Factory a(boolean z) {
        this.a.a(z);
        return this;
    }

    public SsMediaSource$Factory(b bVar, f.a aVar) {
        this.a = (b) P2.a.e(bVar);
        this.b = aVar;
        this.d = new l();
        this.e = new k3.j();
        this.f = 30000L;
        this.c = new m();
        a(true);
    }
}
