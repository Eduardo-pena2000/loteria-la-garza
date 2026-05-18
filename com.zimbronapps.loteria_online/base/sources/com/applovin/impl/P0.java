package com.applovin.impl;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class p0 {
    private static final a a = new a("Age Restricted User", z4.r);
    private static final a b = new a("Has User Consent", z4.q);
    private static final a c = new a("\"Do Not Sell\"", z4.s);

    public static class a {
        private final String a;
        private final z4 b;

        public a(String str, z4 z4Var) {
            this.a = str;
            this.b = z4Var;
        }

        public static /* synthetic */ String a(a aVar) {
            return aVar.a;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.b);
            return null;
        }

        public String a() {
            return this.a;
        }

        public String a(Context context) {
            Boolean b = b(context);
            return b != null ? b.toString() : "No value set";
        }
    }

    public static a a() {
        return c;
    }

    public static a b() {
        return b;
    }

    public static a c() {
        return a;
    }

    public static boolean a(boolean z, Context context) {
        return a(z4.s, Boolean.valueOf(z), context);
    }

    public static boolean b(boolean z, Context context) {
        return a(z4.q, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(b, context) + a(c, context);
    }

    private static boolean a(z4 z4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + z4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) a5.a(z4Var, (Object) null, context);
            a5.b(z4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
            if (kVar != null) {
                kVar.D().c("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + a.a(aVar) + " - " + aVar.a(context);
    }
}
