package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FontAlias {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final ob.b serializer() {
            return FontAlias$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontAlias(String str) {
        this.value = str;
    }

    public static final /* synthetic */ FontAlias box-impl(String str) {
        return new FontAlias(str);
    }

    public static String constructor-impl(String str) {
        t.g(str, "value");
        return str;
    }

    public static boolean equals-impl(String str, Object obj) {
        return (obj instanceof FontAlias) && t.c(str, ((FontAlias) obj).unbox-impl());
    }

    public static final boolean equals-impl0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int hashCode-impl(String str) {
        return str.hashCode();
    }

    public static String toString-impl(String str) {
        return "FontAlias(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return equals-impl(this.value, obj);
    }

    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return hashCode-impl(this.value);
    }

    public String toString() {
        return toString-impl(this.value);
    }

    public final /* synthetic */ String unbox-impl() {
        return this.value;
    }
}
