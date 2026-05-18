package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.b;
import h6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzab extends g implements zzg {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;
    private static final A6.a zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new a("GoogleAuthService.API", zzvVar, gVar);
        zzd = h6.g.a("GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, zzc, a.d.Q8, g.a.c);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (x.c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.h("The task is already complete.", new Object[0]);
    }

    public final Task zza(zzbw zzbwVar) {
        return doWrite(w.builder().d(h.l).b(new zzt(this, zzbwVar)).e(1513).a());
    }

    public final Task zzb(b bVar) {
        t.m(bVar, "request cannot be null.");
        return doWrite(w.builder().d(h.k).b(new zzu(this, bVar)).e(1515).a());
    }

    public final Task zzc(Account account, String str, Bundle bundle) {
        t.m(account, "Account name cannot be null!");
        t.g(str, "Scope cannot be null!");
        return doWrite(w.builder().d(h.l).b(new zzs(this, account, str, bundle)).e(1512).a());
    }

    public final Task zzd(Account account) {
        t.m(account, "account cannot be null.");
        return doWrite(w.builder().d(h.k).b(new zzr(this, account)).e(1517).a());
    }

    public final Task zze(String str) {
        t.m(str, "Client package name cannot be null!");
        return doWrite(w.builder().d(h.k).b(new zzq(this, str)).e(1514).a());
    }
}
