package k7;

import android.content.BroadcastReceiver;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s7 extends BroadcastReceiver {
    public final q3 a;

    public s7(q3 q3Var) {
        this.a = q3Var;
    }

    public final /* synthetic */ void a() {
        this.a.N().o(((Long) f2.D.b(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L12
            k7.q3 r3 = r2.a
            k7.C2 r3 = r3.a()
            k7.A2 r3 = r3.r()
            java.lang.String r4 = "App receiver called with null intent"
            r3.a(r4)
            return
        L12:
            java.lang.String r3 = r4.getAction()
            if (r3 != 0) goto L28
            k7.q3 r3 = r2.a
            k7.C2 r3 = r3.a()
            k7.A2 r3 = r3.r()
            java.lang.String r4 = "App receiver called with null action"
            r3.a(r4)
            return
        L28:
            int r4 = r3.hashCode()
            r0 = -1928239649(0xffffffff8d1165df, float:-4.4804198E-31)
            r1 = 1
            if (r4 == r0) goto L42
            r0 = 1279883384(0x4c497878, float:5.2814304E7)
            if (r4 == r0) goto L38
            goto L4c
        L38:
            java.lang.String r4 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            r3 = r1
            goto L4d
        L42:
            java.lang.String r4 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            r3 = 0
            goto L4d
        L4c:
            r3 = -1
        L4d:
            if (r3 == 0) goto L7d
            if (r3 == r1) goto L61
            k7.q3 r3 = r2.a
            k7.C2 r3 = r3.a()
            k7.A2 r3 = r3.r()
            java.lang.String r4 = "App receiver called with unknown action"
            r3.a(r4)
            return
        L61:
            k7.q3 r3 = r2.a
            k7.C2 r4 = r3.a()
            k7.A2 r4 = r4.w()
            java.lang.String r0 = "[sgtm] App Receiver notified batches are available"
            r4.a(r0)
            k7.i3 r3 = r3.b()
            k7.p7 r4 = new k7.p7
            r4.<init>(r2)
            r3.t(r4)
            return
        L7d:
            k7.q3 r3 = r2.a
            com.google.android.gms.internal.measurement.zzqp.zza()
            k7.m r4 = r3.w()
            r0 = 0
            k7.e2 r1 = k7.f2.R0
            boolean r4 = r4.H(r0, r1)
            if (r4 != 0) goto L90
            return
        L90:
            k7.C2 r4 = r3.a()
            k7.A2 r4 = r4.w()
            java.lang.String r0 = "App receiver notified triggers are available"
            r4.a(r0)
            k7.i3 r4 = r3.b()
            k7.q7 r0 = new k7.q7
            r0.<init>(r3)
            r4.t(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.s7.onReceive(android.content.Context, android.content.Intent):void");
    }
}
