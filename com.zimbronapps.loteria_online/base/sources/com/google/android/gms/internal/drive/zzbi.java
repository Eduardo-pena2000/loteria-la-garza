package com.google.android.gms.internal.drive;

import H6.H;
import H6.J;
import H6.a;
import H6.g;
import H6.m;
import H6.q;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.drive.DriveId;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbi implements g {
    private static final k zzbz = new k("DriveContentsImpl", "");
    private final a zzes;
    private boolean closed = false;
    private boolean zzet = false;
    private boolean zzeu = false;

    public zzbi(a aVar) {
        this.zzes = (a) t.l(aVar);
    }

    private final i zza(h hVar, q qVar, H h) {
        if (h == null) {
            h = (H) new J().a();
        }
        if (this.zzes.N1() == 268435456) {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if (m.c(h.f()) && !this.zzes.zzb()) {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        h.a(hVar);
        if (this.closed) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (getDriveId() == null) {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (qVar == null) {
            qVar = q.b;
        }
        zzj();
        return hVar.b(new zzbk(this, hVar, qVar, h));
    }

    public static /* synthetic */ k zzx() {
        return zzbz;
    }

    public final i commit(h hVar, q qVar) {
        return zza(hVar, qVar, null);
    }

    public final void discard(h hVar) {
        if (this.closed) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        zzj();
        ((zzbm) hVar.b(new zzbm(this, hVar))).setResultCallback(new zzbl(this));
    }

    public final DriveId getDriveId() {
        return this.zzes.getDriveId();
    }

    public final InputStream getInputStream() {
        if (this.closed) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (this.zzes.N1() != 268435456) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (this.zzet) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        }
        this.zzet = true;
        return this.zzes.M1();
    }

    public final int getMode() {
        return this.zzes.N1();
    }

    public final OutputStream getOutputStream() {
        if (this.closed) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (this.zzes.N1() != 536870912) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (this.zzeu) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        }
        this.zzeu = true;
        return this.zzes.O1();
    }

    public final ParcelFileDescriptor getParcelFileDescriptor() {
        if (this.closed) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        return this.zzes.P1();
    }

    public final i reopenForWrite(h hVar) {
        if (this.closed) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (this.zzes.N1() != 268435456) {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        }
        zzj();
        return hVar.a(new zzbj(this, hVar));
    }

    public final a zzi() {
        return this.zzes;
    }

    public final void zzj() {
        E6.m.a(this.zzes.P1());
        this.closed = true;
    }

    public final boolean zzk() {
        return this.closed;
    }

    public final i commit(h hVar, q qVar, m mVar) {
        return zza(hVar, qVar, mVar == null ? null : H.g(mVar));
    }

    public static /* synthetic */ a zza(zzbi zzbiVar) {
        return zzbiVar.zzes;
    }
}
