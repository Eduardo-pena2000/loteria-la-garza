package com.google.android.gms.internal.drive;

import H6.d;
import H6.k;
import H6.q;
import I6.b;
import I6.o;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzdp implements k {
    protected final DriveId zzk;

    public zzdp(DriveId driveId) {
        this.zzk = driveId;
    }

    public i addChangeListener(h hVar, b bVar) {
        return hVar.d(d.a).zza(hVar, this.zzk, bVar);
    }

    public i addChangeSubscription(h hVar) {
        zzaw d = hVar.d(d.a);
        zzj zzjVar = new zzj(1, this.zzk);
        t.a(o.a(zzjVar.zzda, zzjVar.zzk));
        t.p(d.isConnected(), "Client must be connected");
        if (d.zzec) {
            return hVar.b(new zzaz(d, hVar, zzjVar));
        }
        throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
    }

    public i delete(h hVar) {
        return hVar.b(new zzdu(this, hVar));
    }

    public DriveId getDriveId() {
        return this.zzk;
    }

    public i getMetadata(h hVar) {
        return hVar.a(new zzdq(this, hVar, false));
    }

    public i listParents(h hVar) {
        return hVar.a(new zzdr(this, hVar));
    }

    public i removeChangeListener(h hVar, b bVar) {
        return hVar.d(d.a).zzb(hVar, this.zzk, bVar);
    }

    public i removeChangeSubscription(h hVar) {
        zzaw d = hVar.d(d.a);
        DriveId driveId = this.zzk;
        t.a(o.a(1, driveId));
        t.p(d.isConnected(), "Client must be connected");
        return hVar.b(new zzba(d, hVar, driveId, 1));
    }

    public i setParents(h hVar, Set set) {
        if (set != null) {
            return hVar.b(new zzds(this, hVar, new ArrayList(set)));
        }
        throw new IllegalArgumentException("ParentIds must be provided.");
    }

    public i trash(h hVar) {
        return hVar.b(new zzdv(this, hVar));
    }

    public i untrash(h hVar) {
        return hVar.b(new zzdw(this, hVar));
    }

    public i updateMetadata(h hVar, q qVar) {
        if (qVar != null) {
            return hVar.b(new zzdt(this, hVar, qVar));
        }
        throw new IllegalArgumentException("ChangeSet must be provided.");
    }
}
