package com.revenuecat.purchases.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultAlertDialogHelper implements AlertDialogHelper {
    public static /* synthetic */ void a(Qa.a aVar, DialogInterface dialogInterface, int i) {
        showDialog$lambda$2(aVar, dialogInterface, i);
    }

    public static /* synthetic */ void b(Qa.a aVar, DialogInterface dialogInterface, int i) {
        showDialog$lambda$0(aVar, dialogInterface, i);
    }

    public static /* synthetic */ void c(Qa.a aVar, DialogInterface dialogInterface, int i) {
        showDialog$lambda$1(aVar, dialogInterface, i);
    }

    private static final void showDialog$lambda$0(Qa.a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    private static final void showDialog$lambda$1(Qa.a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    private static final void showDialog$lambda$2(Qa.a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    public void showDialog(Activity activity, String title, String message, String positiveButtonText, String negativeButtonText, String neutralButtonText, Qa.a onPositiveButtonClicked, Qa.a onNegativeButtonClicked, Qa.a onNeutralButtonClicked) {
        t.g(activity, "activity");
        t.g(title, "title");
        t.g(message, "message");
        t.g(positiveButtonText, "positiveButtonText");
        t.g(negativeButtonText, "negativeButtonText");
        t.g(neutralButtonText, "neutralButtonText");
        t.g(onPositiveButtonClicked, "onPositiveButtonClicked");
        t.g(onNegativeButtonClicked, "onNegativeButtonClicked");
        t.g(onNeutralButtonClicked, "onNeutralButtonClicked");
        new AlertDialog.Builder(activity).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new a(onPositiveButtonClicked)).setNegativeButton(negativeButtonText, new b(onNegativeButtonClicked)).setNeutralButton(neutralButtonText, new c(onNeutralButtonClicked)).show();
    }
}
