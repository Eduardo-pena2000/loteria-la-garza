package com.revenuecat.purchases.common.diagnostics;

import Qa.l;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.utils.EventsFileHelper;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DiagnosticsFileHelper extends EventsFileHelper {
    public static final Companion Companion = new Companion(null);
    public static final int DIAGNOSTICS_FILE_LIMIT_IN_KB = 500;
    public static final String DIAGNOSTICS_FILE_PATH = "RevenueCat/diagnostics/diagnostic_entries.jsonl";
    public static final int DIAGNOSTICS_FILE_SYNC_LIMIT_IN_KB = 200;
    private final FileHelper fileHelper;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsFileHelper(FileHelper fileHelper) {
        super(fileHelper, "RevenueCat/diagnostics/diagnostic_entries.jsonl", (l) null, (l) null, 8, (k) null);
        t.g(fileHelper, "fileHelper");
        this.fileHelper = fileHelper;
    }

    private final double diagnosticsFileSize() {
        return this.fileHelper.fileSizeInKB("RevenueCat/diagnostics/diagnostic_entries.jsonl");
    }

    public final synchronized boolean isDiagnosticsFileBigEnoughToSync() {
        return diagnosticsFileSize() > 200.0d;
    }

    public final synchronized boolean isDiagnosticsFileTooBig() {
        return diagnosticsFileSize() > 500.0d;
    }
}
