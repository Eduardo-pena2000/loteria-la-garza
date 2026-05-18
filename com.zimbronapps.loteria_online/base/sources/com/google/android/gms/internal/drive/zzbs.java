package com.google.android.gms.internal.drive;

import H6.g;
import H6.i;
import H6.m;
import H6.q;
import K6.k;
import L6.b;
import L6.c;
import L6.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbs extends zzdp implements i {
    public zzbs(DriveId driveId) {
        super(driveId);
    }

    public static c zza(c cVar, DriveId driveId) {
        c.a a = new c.a().a(b.a(d.d, driveId));
        if (cVar != null) {
            if (cVar.M1() != null) {
                a.a(cVar.M1());
            }
            a.c(cVar.N1());
            a.d(cVar.O1());
        }
        return a.b();
    }

    public static void zzb(q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        k c = k.c(qVar.a());
        if (c != null) {
            if (c.b() || c.a()) {
                throw new IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
            }
        }
    }

    public final com.google.android.gms.common.api.i createFile(h hVar, q qVar, g gVar) {
        return createFile(hVar, qVar, gVar, null);
    }

    public final com.google.android.gms.common.api.i createFolder(h hVar, q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if (qVar.a() == null || qVar.a().equals("application/vnd.google-apps.folder")) {
            return hVar.b(new zzbu(this, hVar, qVar));
        }
        throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
    }

    public final com.google.android.gms.common.api.i listChildren(h hVar) {
        return queryChildren(hVar, null);
    }

    public final com.google.android.gms.common.api.i queryChildren(h hVar, c cVar) {
        return new zzaf().query(hVar, zza(cVar, getDriveId()));
    }

    public final com.google.android.gms.common.api.i createFile(h hVar, q qVar, g gVar, m mVar) {
        if (mVar == null) {
            mVar = new m.a().a();
        }
        m mVar2 = mVar;
        if (mVar2.f() != 0) {
            throw new IllegalStateException("May not set a conflict strategy for new file creation.");
        }
        if (qVar == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        k c = k.c(qVar.a());
        if (c != null && c.a()) {
            throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
        }
        mVar2.a(hVar);
        if (gVar != null) {
            if (!(gVar instanceof zzbi)) {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (gVar.getDriveId() != null) {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (gVar.zzk()) {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
        }
        zzb(qVar);
        int zza = zza(gVar, k.c(qVar.a()));
        k c2 = k.c(qVar.a());
        return hVar.b(new zzbt(this, hVar, qVar, zza, (c2 == null || !c2.b()) ? 0 : 1, mVar2));
    }

    public static int zza(g gVar, k kVar) {
        if (gVar == null) {
            return (kVar == null || !kVar.b()) ? 1 : 0;
        }
        int Q1 = gVar.zzi().Q1();
        gVar.zzj();
        return Q1;
    }
}
