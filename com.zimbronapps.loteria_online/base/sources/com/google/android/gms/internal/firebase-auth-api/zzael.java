package com.google.android.gms.internal.firebase-auth-api;

import A6.a;
import J7.O;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzael implements zzaem {
    private final zzaem zza;
    private final a zzb;

    public zzael(zzael zzaelVar) {
        this(zzaelVar.zza, zzaelVar.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    public final void zza(zzagv zzagvVar) {
        try {
            this.zza.zza(zzagvVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e, new Object[0]);
        }
    }

    public zzael(zzaem zzaemVar, a aVar) {
        this.zza = (zzaem) t.l(zzaemVar);
        this.zzb = (a) t.l(aVar);
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    public final void zza(zzaap zzaapVar) {
        try {
            this.zza.zza(zzaapVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    public final void zza(zzaas zzaasVar) {
        try {
            this.zza.zza(zzaasVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    public final void zza(Status status, O o) {
        try {
            this.zza.zza(status, o);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    public final void zza(zzahr zzahrVar) {
        try {
            this.zza.zza(zzahrVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e, new Object[0]);
        }
    }

    public final void zza(zzahs zzahsVar) {
        try {
            this.zza.zza(zzahsVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e, new Object[0]);
        }
    }

    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        try {
            this.zza.zza(zzahvVar, zzahkVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    public final void zza(zzaif zzaifVar) {
        try {
            this.zza.zza(zzaifVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    public final void zza(zzaig zzaigVar) {
        try {
            this.zza.zza(zzaigVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending revoke token response.", e, new Object[0]);
        }
    }

    public final void zza(zzair zzairVar) {
        try {
            this.zza.zza(zzairVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e, new Object[0]);
        }
    }

    public final void zza(zzahv zzahvVar) {
        try {
            this.zza.zza(zzahvVar);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    public final void zza(O o) {
        try {
            this.zza.zza(o);
        } catch (RemoteException e) {
            this.zzb.b("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }
}
