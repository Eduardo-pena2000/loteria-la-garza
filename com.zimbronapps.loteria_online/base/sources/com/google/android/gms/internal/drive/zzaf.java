package com.google.android.gms.internal.drive;

import H6.b;
import H6.d;
import H6.e;
import H6.r;
import L6.c;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.drive.DriveId;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaf implements e {
    public final i fetchDriveId(h hVar, String str) {
        return hVar.a(new zzai(this, hVar, str));
    }

    public final H6.i getAppFolder(h hVar) {
        zzaw d = hVar.d(d.a);
        if (!d.zzag()) {
            throw new IllegalStateException("Client is not yet connected");
        }
        DriveId zzaf = d.zzaf();
        if (zzaf != null) {
            return new zzbs(zzaf);
        }
        return null;
    }

    public final H6.i getRootFolder(h hVar) {
        zzaw d = hVar.d(d.a);
        if (!d.zzag()) {
            throw new IllegalStateException("Client is not yet connected");
        }
        DriveId zzae = d.zzae();
        if (zzae != null) {
            return new zzbs(zzae);
        }
        return null;
    }

    public final b newCreateFileActivityBuilder() {
        return new b();
    }

    public final i newDriveContents(h hVar) {
        return hVar.a(new zzah(this, hVar, 536870912));
    }

    public final r newOpenFileActivityBuilder() {
        return new r();
    }

    public final i query(h hVar, c cVar) {
        if (cVar != null) {
            return hVar.a(new zzag(this, hVar, cVar));
        }
        throw new IllegalArgumentException("Query must be provided.");
    }

    public final i requestSync(h hVar) {
        return hVar.b(new zzaj(this, hVar));
    }
}
