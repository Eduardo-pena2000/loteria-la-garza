package o5;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n implements m {
    public zzis b;
    public final o c;

    public n(Context context, zzis zzisVar) {
        this.c = new o(context);
        this.b = zzisVar;
    }

    public final void a(zzhx zzhxVar, int i, long j, boolean z) {
        zzis zzisVar;
        try {
            zziq zzm = this.b.zzm();
            zzm.zzm(i);
            this.b = zzm.zze();
            zzhv zzm2 = zzhxVar.zzm();
            zzja zzm3 = zzhxVar.zzB().zzm();
            zzm3.zza(z);
            zzm2.zzn(zzm3);
            zzhx zzhxVar2 = (zzhx) zzm2.zze();
            if (j == 0) {
                zzisVar = this.b;
            } else {
                zziq zzm4 = this.b.zzm();
                zzm4.zzo(j);
                zzisVar = (zzis) zzm4.zze();
            }
            l(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void b(zzhx zzhxVar) {
        try {
            l(zzhxVar, this.b);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void c(zzhx zzhxVar, long j, boolean z) {
        zzis zzisVar;
        try {
            zzhv zzm = zzhxVar.zzm();
            zzja zzm2 = zzhxVar.zzB().zzm();
            zzm2.zza(z);
            zzm.zzn(zzm2);
            zzhx zzhxVar2 = (zzhx) zzm.zze();
            if (j == 0) {
                zzisVar = this.b;
            } else {
                zziq zzm3 = this.b.zzm();
                zzm3.zzo(j);
                zzisVar = (zzis) zzm3.zze();
            }
            l(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void d(zzhx zzhxVar, int i, long j) {
        try {
            zziq zzm = this.b.zzm();
            zzm.zzm(i);
            zzis zzisVar = (zzis) zzm.zze();
            this.b = zzisVar;
            if (j != 0) {
                zziq zzm2 = zzisVar.zzm();
                zzm2.zzo(j);
                zzisVar = (zzis) zzm2.zze();
            }
            l(zzhxVar, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void e(zzij zzijVar) {
        try {
            zzjg zzc = zzji.zzc();
            zzc.zzn(this.b);
            zzc.zzm(zzijVar);
            this.c.a(zzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void f(zzib zzibVar, int i) {
        try {
            zziq zzm = this.b.zzm();
            zzm.zzm(i);
            this.b = zzm.zze();
            i(zzibVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void g(zzjo zzjoVar) {
        try {
            o oVar = this.c;
            zzjg zzc = zzji.zzc();
            zzc.zzn(this.b);
            zzc.zzo(zzjoVar);
            oVar.a((zzji) zzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void h(zzib zzibVar, long j, boolean z) {
        zzis zzisVar;
        try {
            zzhz zzm = zzibVar.zzm();
            zzja zzm2 = zzibVar.zzA().zzm();
            zzm2.zza(z);
            zzm.zzm(zzm2);
            zzib zzibVar2 = (zzib) zzm.zze();
            if (j == 0) {
                zzisVar = this.b;
            } else {
                zziq zzm3 = this.b.zzm();
                zzm3.zzo(j);
                zzisVar = (zzis) zzm3.zze();
            }
            m(zzibVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void i(zzib zzibVar) {
        try {
            m(zzibVar, this.b);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void j(zzjs zzjsVar) {
        if (zzjsVar == null) {
            return;
        }
        try {
            zzjg zzc = zzji.zzc();
            zzc.zzn(this.b);
            zzc.zzp(zzjsVar);
            this.c.a((zzji) zzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void k(zzhx zzhxVar, int i) {
        try {
            zziq zzm = this.b.zzm();
            zzm.zzm(i);
            this.b = zzm.zze();
            b(zzhxVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void l(zzhx zzhxVar, zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            zzjg zzc = zzji.zzc();
            zzc.zzn(zzisVar);
            zzc.zza(zzhxVar);
            this.c.a(zzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void m(zzib zzibVar, zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            zzjg zzc = zzji.zzc();
            zzc.zzn(zzisVar);
            zzc.zzl(zzibVar);
            this.c.a((zzji) zzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }
}
