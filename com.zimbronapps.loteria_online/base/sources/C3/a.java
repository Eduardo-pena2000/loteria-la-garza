package c3;

import android.media.MediaCodec;
import c3.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ j.d b;

    public /* synthetic */ a(b bVar, j.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        b.p(this.a, this.b, mediaCodec, j, j2);
    }
}
