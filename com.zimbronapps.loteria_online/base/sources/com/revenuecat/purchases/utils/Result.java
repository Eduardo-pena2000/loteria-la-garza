package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class Result {

    public static final class Error extends Result {
        private final Object value;

        public Error(Object obj) {
            super(null);
            this.value = obj;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    public static final class Success extends Result {
        private final Object value;

        public Success(Object obj) {
            super(null);
            this.value = obj;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    public /* synthetic */ Result(k kVar) {
        this();
    }

    private Result() {
    }
}
