package com.revenuecat.purchases.utils;

import Qa.l;
import android.content.Context;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.storage.DefaultFileRepository;
import com.revenuecat.purchases.storage.FileRepository;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferingVideoPredownloader {
    private final FileRepository fileRepository;
    private final boolean shouldPredownload;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Boolean invoke(PaywallComponent it) {
            t.g(it, "it");
            return Boolean.valueOf(it instanceof VideoComponent);
        }
    }

    public OfferingVideoPredownloader(Context context, boolean z, FileRepository fileRepository) {
        t.g(context, "context");
        t.g(fileRepository, "fileRepository");
        this.fileRepository = fileRepository;
        this.shouldPredownload = z;
    }

    public final void downloadVideos(Offering offering) {
        Offering.PaywallComponents paywallComponents;
        PaywallComponentsData data;
        ComponentsConfig componentsConfig;
        PaywallComponentsConfig base;
        StackComponent stack;
        List<VideoComponent> filter;
        t.g(offering, "offering");
        if (!this.shouldPredownload || (paywallComponents = offering.getPaywallComponents()) == null || (data = paywallComponents.getData()) == null || (componentsConfig = data.getComponentsConfig()) == null || (base = componentsConfig.getBase()) == null || (stack = base.getStack()) == null || (filter = PaywallComponentFilterExtensionKt.filter(stack, 1.INSTANCE)) == null) {
            return;
        }
        for (VideoComponent videoComponent : filter) {
            if (videoComponent instanceof VideoComponent) {
                this.fileRepository.prefetch(OfferingVideoPredownloaderKt.access$checkedUrls(videoComponent.getSource()));
            }
        }
    }

    public /* synthetic */ OfferingVideoPredownloader(Context context, boolean z, FileRepository fileRepository, int i, k kVar) {
        this(context, (i & 2) != 0 ? UtilsKt.getCanUsePaywallUI() : z, (i & 4) != 0 ? new DefaultFileRepository(context) : fileRepository);
    }
}
