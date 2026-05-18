package com.google.android.gms.internal.firebase-auth-api;

import J7.O;
import J7.h;
import K7.q;
import K7.w;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzafh implements zzaem {
    final /* synthetic */ zzaff zza;

    public zzafh(zzaff zzaffVar) {
        Objects.requireNonNull(zzaffVar);
        this.zza = zzaffVar;
    }

    private final void zza(zzafm zzafmVar) {
        this.zza.zzi.execute(new zzafn(this, zzafmVar));
    }

    public final void zzb(String str) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 8, "Unexpected response type " + i);
        zza(new zzafj(this, str));
    }

    public final void zzc(String str) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 7, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    private final void zza(Status status, h hVar, String str, String str2) {
        zzaff.zza(this.zza, status);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzn = hVar;
        zzaffVar.zzo = str;
        zzaffVar.zzp = str2;
        w wVar = zzaffVar.zzf;
        if (wVar != null) {
            wVar.zza(status);
        }
        this.zza.zza(status);
    }

    public final void zzb() throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 6, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    public final void zzc() throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 9, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    public final void zza(String str) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 8, "Unexpected response type " + i);
        this.zza.zzu = true;
        zza(new zzafl(this, str));
    }

    public final void zza(zzagv zzagvVar) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 3, "Unexpected response type " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzl = zzagvVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza() throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 5, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    public final void zza(zzaap zzaapVar) {
        zza(zzaapVar.zza(), zzaapVar.zzb(), zzaapVar.zzc(), zzaapVar.zzd());
    }

    public final void zza(zzaas zzaasVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzq = zzaasVar;
        zzaffVar.zza(q.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zza(Status status, O o) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 2, "Unexpected response type " + i);
        zza(status, o, null, null);
    }

    public final void zza(Status status) throws RemoteException {
        String P1 = status.P1();
        if (P1 != null) {
            if (P1.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (P1.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (P1.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (P1.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (P1.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (P1.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (P1.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (P1.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (P1.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (P1.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zza == 8) {
            zzaffVar.zzu = true;
            zza(new zzafk(this, status));
        } else {
            zzaff.zza(zzaffVar, status);
            this.zza.zza(status);
        }
    }

    public final void zza(zzahr zzahrVar) throws RemoteException {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzs = zzahrVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza(zzahs zzahsVar) throws RemoteException {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzr = zzahsVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza(zzahv zzahvVar, zzahk zzahkVar) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 2, "Unexpected response type: " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaffVar.zzk = zzahkVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza(zzaif zzaifVar) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 4, "Unexpected response type " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzm = zzaifVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza(zzaig zzaigVar) throws RemoteException {
        zzaff.zza(this.zza);
    }

    public final void zza(zzair zzairVar) throws RemoteException {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzt = zzairVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza(zzahv zzahvVar) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 1, "Unexpected response type: " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaff.zza(zzaffVar);
    }

    public final void zza(O o) throws RemoteException {
        int i = this.zza.zza;
        t.p(i == 8, "Unexpected response type " + i);
        this.zza.zzu = true;
        zza(new zzafi(this, o));
    }
}
