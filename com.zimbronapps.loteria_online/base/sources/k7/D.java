package k7;

import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d extends c {
    public final zzfn g;
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, int i, zzfn zzfnVar) {
        super(str, i);
        Objects.requireNonNull(eVar);
        this.h = eVar;
        this.g = zzfnVar;
    }

    public final int a() {
        return this.g.zzb();
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return false;
    }

    public final boolean k(Long l, Long l2, zziu zziuVar, boolean z) {
        zzpu.zza();
        q3 q3Var = this.h.a;
        boolean H = q3Var.w().H(this.a, f2.E0);
        zzfn zzfnVar = this.g;
        boolean zze = zzfnVar.zze();
        boolean zzf = zzfnVar.zzf();
        boolean zzh = zzfnVar.zzh();
        boolean z2 = zze || zzf || zzh;
        if (z && !z2) {
            q3Var.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        zzfh zzd = zzfnVar.zzd();
        boolean zzf2 = zzd.zzf();
        if (zziuVar.zzf()) {
            if (zzd.zzc()) {
                r5 = c.e(c.g(zziuVar.zzg(), zzd.zzd()), zzf2);
            } else {
                q3Var.a().r().b("No number filter for long property. property", q3Var.D().c(zziuVar.zzc()));
            }
        } else if (zziuVar.zzj()) {
            if (zzd.zzc()) {
                r5 = c.e(c.h(zziuVar.zzk(), zzd.zzd()), zzf2);
            } else {
                q3Var.a().r().b("No number filter for double property. property", q3Var.D().c(zziuVar.zzc()));
            }
        } else if (!zziuVar.zzd()) {
            q3Var.a().r().b("User property has no value, property", q3Var.D().c(zziuVar.zzc()));
        } else if (zzd.zza()) {
            r5 = c.e(c.f(zziuVar.zze(), zzd.zzb(), q3Var.a()), zzf2);
        } else if (!zzd.zzc()) {
            q3Var.a().r().b("No string or number filter defined. property", q3Var.D().c(zziuVar.zzc()));
        } else if (g7.O(zziuVar.zze())) {
            r5 = c.e(c.i(zziuVar.zze(), zzd.zzd()), zzf2);
        } else {
            q3Var.a().r().c("Invalid user property value for Numeric number filter. property, value", q3Var.D().c(zziuVar.zzc()), zziuVar.zze());
        }
        q3Var.a().w().b("Property filter result", r5 == null ? "null" : r5);
        if (r5 == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (zzh && !r5.booleanValue()) {
            return true;
        }
        if (!z || zzfnVar.zze()) {
            this.d = r5;
        }
        if (r5.booleanValue() && z2 && zziuVar.zza()) {
            long zzb = zziuVar.zzb();
            if (l != null) {
                zzb = l.longValue();
            }
            if (H && zzfnVar.zze() && !zzfnVar.zzf() && l2 != null) {
                zzb = l2.longValue();
            }
            if (zzfnVar.zzf()) {
                this.f = Long.valueOf(zzb);
            } else {
                this.e = Long.valueOf(zzb);
            }
        }
        return true;
    }
}
