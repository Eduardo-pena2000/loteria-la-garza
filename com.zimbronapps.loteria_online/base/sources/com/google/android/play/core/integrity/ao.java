package com.google.android.play.core.integrity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ao extends IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c = null;

    public /* synthetic */ ao(String str, Long l, Object obj, an anVar) {
        this.a = str;
        this.b = l;
    }

    private static boolean a() {
        return true;
    }

    public final Long cloudProjectNumber() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r3 = r5.b
            if (r3 != 0) goto L26
            java.lang.Long r1 = r1.cloudProjectNumber()
            if (r1 != 0) goto L24
        L22:
            r1 = r0
            goto L31
        L24:
            r1 = r2
            goto L31
        L26:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L24
            goto L22
        L31:
            boolean r3 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r3 == 0) goto L44
            boolean r3 = a()
            if (r3 == 0) goto L44
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r1 == 0) goto L42
            java.lang.Object r6 = r6.c
            goto L45
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r1
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        int hashCode2 = (hashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    public final String nonce() {
        return this.a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
