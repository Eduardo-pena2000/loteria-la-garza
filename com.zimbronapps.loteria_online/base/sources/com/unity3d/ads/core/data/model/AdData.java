package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    public static final /* synthetic */ AdData box-impl(String str) {
        return new AdData(str);
    }

    public static String constructor-impl(String data) {
        t.g(data, "data");
        return data;
    }

    public static boolean equals-impl(String str, Object obj) {
        return (obj instanceof AdData) && t.c(str, ((AdData) obj).unbox-impl());
    }

    public static final boolean equals-impl0(String str, String str2) {
        return t.c(str, str2);
    }

    public static int hashCode-impl(String str) {
        return str.hashCode();
    }

    public static String toString-impl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return equals-impl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return hashCode-impl(this.data);
    }

    public String toString() {
        return toString-impl(this.data);
    }

    public final /* synthetic */ String unbox-impl() {
        return this.data;
    }
}
