package com.google.android.gms.internal.firebase-auth-api;

import B7.g;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzafb extends zzaft implements zzagn {
    private zzaev zza;
    private zzaey zzb;
    private zzafy zzc;
    private final zzafc zzd;
    private final g zze;
    private String zzf;
    private zzafe zzg;

    public zzafb(g gVar, zzafc zzafcVar) {
        this(gVar, zzafcVar, null, null, null, null);
    }

    private final zzafe zzb() {
        if (this.zzg == null) {
            this.zzg = new zzafe(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    public final void zza(zzags zzagsVar, zzafv zzafvVar) {
        t.l(zzagsVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/createAuthUri", this.zzf), zzagsVar, zzafvVar, zzagv.class, zzaevVar.zza);
    }

    private zzafb(g gVar, zzafc zzafcVar, zzafy zzafyVar, zzaev zzaevVar, zzaey zzaeyVar, zzaew zzaewVar) {
        this.zze = gVar;
        this.zzf = gVar.r().b();
        gVar.r().g();
        this.zzd = (zzafc) t.l(zzafcVar);
        zza(null, null, null, null);
        zzagl.zza(this.zzf, this);
    }

    public final void zza(zzagu zzaguVar, zzafv zzafvVar) {
        t.l(zzaguVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/deleteAccount", this.zzf), zzaguVar, zzafvVar, Void.class, zzaevVar.zza);
    }

    public final void zza(zzagx zzagxVar, zzafv zzafvVar) {
        t.l(zzagxVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/emailLinkSignin", this.zzf), zzagxVar, zzafvVar, zzagw.class, zzaevVar.zza);
    }

    public final void zza(zzagz zzagzVar, zzafv zzafvVar) {
        t.l(zzagzVar);
        t.l(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagzVar, zzafvVar, zzagy.class, zzaeyVar.zza);
    }

    public final void zza(zzahb zzahbVar, zzafv zzafvVar) {
        t.l(zzahbVar);
        t.l(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzahbVar, zzafvVar, zzaha.class, zzaeyVar.zza);
    }

    public final void zza(zzahj zzahjVar, zzafv zzafvVar) {
        t.l(zzahjVar);
        t.l(zzafvVar);
        zzafy zzafyVar = this.zzc;
        zzafu.zza(zzafyVar.zza("/token", this.zzf), zzahjVar, zzafvVar, zzahv.class, zzafyVar.zza);
    }

    public final void zza(zzahi zzahiVar, zzafv zzafvVar) {
        t.l(zzahiVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getAccountInfo", this.zzf), zzahiVar, zzafvVar, zzahl.class, zzaevVar.zza);
    }

    public final void zza(zzahm zzahmVar, zzafv zzafvVar) {
        t.l(zzahmVar);
        t.l(zzafvVar);
        if (zzahmVar.zzb() != null) {
            zzb().zzb(zzahmVar.zzb().zze());
        }
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getOobConfirmationCode", this.zzf), zzahmVar, zzafvVar, zzahp.class, zzaevVar.zza);
    }

    public final void zza(zzaho zzahoVar, zzafv zzafvVar) {
        t.l(zzahoVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getRecaptchaParam", this.zzf), zzafvVar, zzahr.class, zzaevVar.zza);
    }

    public final void zza(zzaht zzahtVar, zzafv zzafvVar) {
        t.l(zzahtVar);
        t.l(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        String str = zzaeyVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzahtVar.zzb() + "&version=" + zzahtVar.zzc();
        if (!zzac.zzc(zzahtVar.zzd())) {
            str = str + "&tenantId=" + zzahtVar.zzd();
        }
        zzafu.zza(str, zzafvVar, zzahs.class, zzaeyVar.zza);
    }

    public final void zza() {
        zza(null, null, null, null);
    }

    public final void zza(zzaic zzaicVar, zzafv zzafvVar) {
        t.l(zzaicVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/resetPassword", this.zzf), zzaicVar, zzafvVar, zzaif.class, zzaevVar.zza);
    }

    public final void zza(zzaie zzaieVar, zzafv zzafvVar) {
        t.l(zzaieVar);
        t.l(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts:revokeToken", this.zzf), zzaieVar, zzafvVar, zzaig.class, zzaeyVar.zza);
    }

    public final void zza(zzaij zzaijVar, zzafv zzafvVar) {
        t.l(zzaijVar);
        t.l(zzafvVar);
        if (!TextUtils.isEmpty(zzaijVar.zzc())) {
            zzb().zzb(zzaijVar.zzc());
        }
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/sendVerificationCode", this.zzf), zzaijVar, zzafvVar, zzaii.class, zzaevVar.zza);
    }

    public final void zza(zzail zzailVar, zzafv zzafvVar) {
        t.l(zzailVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/setAccountInfo", this.zzf), zzailVar, zzafvVar, zzaik.class, zzaevVar.zza);
    }

    public final void zza(String str, zzafv zzafvVar) {
        t.l(zzafvVar);
        zzb().zza(str);
        zzafvVar.zza((Object) null);
    }

    public final void zza(zzaim zzaimVar, zzafv zzafvVar) {
        t.l(zzaimVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/signupNewUser", this.zzf), zzaimVar, zzafvVar, zzaip.class, zzaevVar.zza);
    }

    public final void zza(zzaio zzaioVar, zzafv zzafvVar) {
        t.l(zzaioVar);
        t.l(zzafvVar);
        if (zzaioVar instanceof zzais) {
            zzais zzaisVar = (zzais) zzaioVar;
            if (!TextUtils.isEmpty(zzaisVar.zzb())) {
                zzb().zzb(zzaisVar.zzb());
            }
        }
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaioVar, zzafvVar, zzair.class, zzaeyVar.zza);
    }

    public final void zza(zzaiq zzaiqVar, zzafv zzafvVar) {
        t.l(zzaiqVar);
        t.l(zzafvVar);
        if (!TextUtils.isEmpty(zzaiqVar.zzb())) {
            zzb().zzb(zzaiqVar.zzb());
        }
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaiqVar, zzafvVar, zzait.class, zzaeyVar.zza);
    }

    private final void zza(zzafy zzafyVar, zzaev zzaevVar, zzaey zzaeyVar, zzaew zzaewVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzagi.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzagl.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzafy(zza, zzb());
        }
        String zza2 = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzagl.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzaev(zza2, zzb());
        }
        String zza3 = zzagi.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzagl.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzaey(zza3, zzb());
        }
    }

    public final void zza(zzajb zzajbVar, zzafv zzafvVar) {
        t.l(zzajbVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyAssertion", this.zzf), zzajbVar, zzafvVar, zzajd.class, zzaevVar.zza);
    }

    public final void zza(zzajc zzajcVar, zzafv zzafvVar) {
        t.l(zzajcVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyCustomToken", this.zzf), zzajcVar, zzafvVar, zzajf.class, zzaevVar.zza);
    }

    public final void zza(zzaje zzajeVar, zzafv zzafvVar) {
        t.l(zzajeVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyPassword", this.zzf), zzajeVar, zzafvVar, zzajh.class, zzaevVar.zza);
    }

    public final void zza(zzajg zzajgVar, zzafv zzafvVar) {
        t.l(zzajgVar);
        t.l(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyPhoneNumber", this.zzf), zzajgVar, zzafvVar, zzajj.class, zzaevVar.zza);
    }

    public final void zza(zzaji zzajiVar, zzafv zzafvVar) {
        t.l(zzajiVar);
        t.l(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzajiVar, zzafvVar, zzajl.class, zzaeyVar.zza);
    }
}
