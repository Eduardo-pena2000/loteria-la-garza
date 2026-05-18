package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Qa.l;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.Locale;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VariableProcessor$processVariables$resultString$1 extends u implements l {
    final /* synthetic */ VariableProcessor.PackageContext $context;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Package $rcPackage;
    final /* synthetic */ VariableDataProvider $variableDataProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableProcessor$processVariables$resultString$1(VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r3, Locale locale) {
        super(1);
        this.$variableDataProvider = variableDataProvider;
        this.$context = packageContext;
        this.$rcPackage = r3;
        this.$locale = locale;
    }

    public final String invoke(String variable) {
        t.g(variable, "variable");
        return VariableProcessor.access$variableValue(VariableProcessor.INSTANCE, this.$variableDataProvider, this.$context, variable, this.$rcPackage, this.$locale);
    }
}
