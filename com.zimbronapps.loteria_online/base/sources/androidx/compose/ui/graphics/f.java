package androidx.compose.ui.graphics;

import P0.L0;
import Qa.l;
import v0.E1;
import v0.a1;
import v0.t1;
import v0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, l lVar) {
        return eVar.then(new BlockGraphicsLayerElement(lVar));
    }

    public static final /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i) {
        return d(eVar, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, e1, z, u1Var, j2, j3, i, c.b.B(), null);
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, Object obj) {
        return b(eVar, (i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) == 0 ? f3 : 1.0f, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, (i2 & 64) != 0 ? 0.0f : f7, (i2 & 128) != 0 ? 0.0f : f8, (i2 & 256) == 0 ? f9 : 0.0f, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? j.b.a() : j, (i2 & 2048) != 0 ? t1.a() : e1, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : u1Var, (i2 & 16384) != 0 ? a1.a() : j2, (i2 & 32768) != 0 ? a1.a() : j3, (i2 & 65536) != 0 ? e.b.a() : i);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, d dVar) {
        return eVar.then(new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, e1, z, u1Var, j2, j3, i, i2, dVar, null));
    }

    public static /* synthetic */ androidx.compose.ui.e e(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, E1 e1, boolean z, u1 u1Var, long j2, long j3, int i, int i2, d dVar, int i3, Object obj) {
        return d(eVar, (i3 & 1) != 0 ? 1.0f : f, (i3 & 2) != 0 ? 1.0f : f2, (i3 & 4) == 0 ? f3 : 1.0f, (i3 & 8) != 0 ? 0.0f : f4, (i3 & 16) != 0 ? 0.0f : f5, (i3 & 32) != 0 ? 0.0f : f6, (i3 & 64) != 0 ? 0.0f : f7, (i3 & 128) != 0 ? 0.0f : f8, (i3 & 256) == 0 ? f9 : 0.0f, (i3 & 512) != 0 ? 8.0f : f10, (i3 & 1024) != 0 ? j.b.a() : j, (i3 & 2048) != 0 ? t1.a() : e1, (i3 & 4096) != 0 ? false : z, (i3 & 8192) != 0 ? null : u1Var, (i3 & 16384) != 0 ? a1.a() : j2, (32768 & i3) != 0 ? a1.a() : j3, (65536 & i3) != 0 ? e.b.a() : i, (i3 & 131072) != 0 ? c.b.B() : i2, (i3 & 262144) == 0 ? dVar : null);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar) {
        return L0.b() ? eVar.then(e(androidx.compose.ui.e.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : eVar;
    }
}
