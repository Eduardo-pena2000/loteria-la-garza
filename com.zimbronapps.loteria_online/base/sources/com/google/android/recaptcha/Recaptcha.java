package com.google.android.recaptcha;

import Ga.e;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    public static /* synthetic */ Object getClient-BWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, e eVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.getClient-BWLJW6A(application, str, j, eVar);
    }

    @Ca.e
    public static final Task getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, e eVar) {
        return zzcq.zzd(application, str, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
    @Ca.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getClient-BWLJW6A(android.app.Application r5, java.lang.String r6, long r7, Ga.e r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Ca.t.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Ca.t.b(r9)
            Ca.s$a r9 = Ca.s.b     // Catch: java.lang.Throwable -> L29
            r0.zzc = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 != r1) goto L41
            return r1
        L41:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = Ca.s.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L52
        L48:
            Ca.s$a r6 = Ca.s.b
            java.lang.Object r5 = Ca.t.a(r5)
            java.lang.Object r5 = Ca.s.b(r5)
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.getClient-BWLJW6A(android.app.Application, java.lang.String, long, Ga.e):java.lang.Object");
    }

    @Ca.e
    public static final Task getTasksClient(Application application, String str, long j) {
        return zzcq.zzc(application, str, j);
    }
}
