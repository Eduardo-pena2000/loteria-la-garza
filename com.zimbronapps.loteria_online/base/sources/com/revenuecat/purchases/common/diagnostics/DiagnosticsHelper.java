package com.revenuecat.purchases.common.diagnostics;

import Ca.l;
import Ca.m;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DiagnosticsHelper {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";
    public static final Companion Companion = new Companion(null);
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final l sharedPreferences;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        public final SharedPreferences invoke() {
            return DiagnosticsHelper.Companion.initializeSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            t.g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            t.f(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    public DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper, l lVar) {
        t.g(context, "context");
        t.g(diagnosticsFileHelper, "diagnosticsFileHelper");
        t.g(lVar, "sharedPreferences");
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.sharedPreferences = lVar;
    }

    public final void clearConsecutiveNumberOfErrors() {
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().remove("consecutive_failures_count").apply();
    }

    public final int increaseConsecutiveNumberOfErrors() {
        int i = ((SharedPreferences) this.sharedPreferences.getValue()).getInt("consecutive_failures_count", 0) + 1;
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().putInt("consecutive_failures_count", i).apply();
        return i;
    }

    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteFile();
    }

    public /* synthetic */ DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper, l lVar, int i, k kVar) {
        this(context, diagnosticsFileHelper, (i & 4) != 0 ? m.b(new 1(context)) : lVar);
    }
}
