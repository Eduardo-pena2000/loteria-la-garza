package com.google.android.gms.internal.games_v2;

import T6.v;
import c7.a;
import c7.b;
import c7.e;
import c7.g;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfd implements v {
    private final zzaq zza;

    public zzfd(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    public final Task commitAndClose(a aVar, g gVar) {
        return this.zza.zzb(new zzfc(aVar, gVar));
    }

    public final Task delete(e eVar) {
        return this.zza.zzb(new zzev(eVar));
    }

    public final Task discardAndClose(a aVar) {
        return this.zza.zzb(new zzer(aVar));
    }

    public final Task getMaxCoverImageSize() {
        return this.zza.zzb(new zzen());
    }

    public final Task getMaxDataSize() {
        return this.zza.zzb(new zzfb());
    }

    public final Task getSelectSnapshotIntent(String str, boolean z, boolean z2, int i) {
        return this.zza.zzb(new zzes(str, z, z2, i));
    }

    public final Task load(boolean z) {
        return this.zza.zzb(new zzem(z));
    }

    public final Task open(e eVar) {
        return open(eVar.w0(), false, -1);
    }

    public final Task resolveConflict(String str, a aVar) {
        e e = aVar.e();
        g.a aVar2 = new g.a();
        aVar2.b(e);
        return this.zza.zzb(new zzet(str, e.J1(), aVar2.a(), aVar.I1()));
    }

    public final Task open(e eVar, int i) {
        return open(eVar.w0(), false, i);
    }

    public final Task open(String str, boolean z) {
        return open(str, z, -1);
    }

    public final Task open(String str, boolean z, int i) {
        return this.zza.zzb(new zzew(str, z, i));
    }

    public final Task resolveConflict(String str, String str2, g gVar, b bVar) {
        return this.zza.zzb(new zzet(str, str2, gVar, bVar));
    }
}
