package com.google.android.gms.internal.drive;

import H6.d;
import H6.q;
import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.drive.DriveId;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzt {
    private String zzba;
    private DriveId zzbd;
    private Integer zzdk;
    private final int zzdl = 0;
    private q zzdm;

    public zzt(int i) {
    }

    public final IntentSender build(h hVar) {
        t.p(hVar.g(), "Client must be connected");
        zzg();
        zzaw d = hVar.d(d.a);
        this.zzdm.b().O1(d.getContext());
        try {
            return ((zzeo) d.getService()).zza(new zzu(this.zzdm.b(), this.zzdk.intValue(), this.zzba, this.zzbd, 0));
        } catch (RemoteException e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }

    public final int getRequestId() {
        return this.zzdk.intValue();
    }

    public final void zza(q qVar) {
        this.zzdm = (q) t.l(qVar);
    }

    public final q zzc() {
        return this.zzdm;
    }

    public final DriveId zzd() {
        return this.zzbd;
    }

    public final String zze() {
        return this.zzba;
    }

    public final void zzg() {
        t.m(this.zzdm, "Must provide initial metadata via setInitialMetadata.");
        Integer num = this.zzdk;
        this.zzdk = Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final void zza(DriveId driveId) {
        this.zzbd = (DriveId) t.l(driveId);
    }

    public final void zzc(String str) {
        this.zzba = (String) t.l(str);
    }

    public final void zzd(int i) {
        this.zzdk = Integer.valueOf(i);
    }
}
