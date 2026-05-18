package o3;

import java.io.EOFException;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements O {
    public final byte[] a = new byte[4096];

    public void d(P2.z zVar, int i, int i2) {
        zVar.U(i);
    }

    public int e(M2.i iVar, int i, boolean z, int i2) {
        int read = iVar.read(this.a, 0, Math.min(this.a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void b(M2.q qVar) {
    }

    public void a(long j, int i, int i2, int i3, O.a aVar) {
    }
}
