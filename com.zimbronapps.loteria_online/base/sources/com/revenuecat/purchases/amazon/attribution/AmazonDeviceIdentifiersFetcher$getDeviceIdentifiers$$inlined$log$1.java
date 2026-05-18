package com.revenuecat.purchases.amazon.attribution;

import Da.D;
import Qa.a;
import Qa.l;
import android.provider.Settings;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonDeviceIdentifiersFetcher$getDeviceIdentifiers$$inlined$log$1 extends u implements a {
    final /* synthetic */ Settings.SettingNotFoundException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonDeviceIdentifiersFetcher$getDeviceIdentifiers$$inlined$log$1(LogIntent logIntent, Settings.SettingNotFoundException settingNotFoundException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = settingNotFoundException;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Couldn't get Amazon advertising identifier. Message: %s", Arrays.copyOf(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
