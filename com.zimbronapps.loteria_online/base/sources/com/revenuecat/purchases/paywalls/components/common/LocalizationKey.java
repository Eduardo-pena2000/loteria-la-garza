package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalizationKey {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return LocalizationKey$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private /* synthetic */ LocalizationKey(String str) {
        this.value = str;
    }

    public static final /* synthetic */ LocalizationKey box-impl(String str) {
        return new LocalizationKey(str);
    }

    public static String constructor-impl(String str) {
        t.g(str, "value");
        return str;
    }

    public static boolean equals-impl(String str, Object obj) {
        return (obj instanceof LocalizationKey) && t.c(str, ((LocalizationKey) obj).unbox-impl());
    }

    public static final boolean equals-impl0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int hashCode-impl(String str) {
        return str.hashCode();
    }

    public static String toString-impl(String str) {
        return "LocalizationKey(value=" + str + ')';
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
