package V5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i0 {
    public static i0 b;
    public String a;

    public static i0 a() {
        if (b == null) {
            b = new i0();
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Updating user agent."
            V5.o0.k(r0)
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            java.lang.String r1 = r6.a
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3e
            android.content.Context r1 = v6.l.d(r7)
            boolean r2 = E6.e.c()
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L3c
            r1 = 0
        L1e:
            java.lang.String r2 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            r3 = 0
            java.lang.String r4 = "admob_user_agent"
            android.content.SharedPreferences r3 = r7.getSharedPreferences(r4, r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "user_agent"
            android.content.SharedPreferences$Editor r2 = r3.putString(r5, r2)
            if (r1 != 0) goto L39
            r2.apply()
            goto L3c
        L39:
            E6.u.a(r7, r2, r4)
        L3c:
            r6.a = r0
        L3e:
            java.lang.String r7 = "User agent is updated."
            V5.o0.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.i0.b(android.content.Context):void");
    }
}
