package M0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface v extends e.b {
    default int maxIntrinsicHeight(m mVar, l lVar, int i) {
        return E.a.a(this, mVar, lVar, i);
    }

    default int maxIntrinsicWidth(m mVar, l lVar, int i) {
        return E.a.b(this, mVar, lVar, i);
    }

    C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a, long j);

    default int minIntrinsicHeight(m mVar, l lVar, int i) {
        return E.a.c(this, mVar, lVar, i);
    }

    default int minIntrinsicWidth(m mVar, l lVar, int i) {
        return E.a.d(this, mVar, lVar, i);
    }
}
