package com.revenuecat.purchases.utils;

import Ca.o;
import Da.A;
import Da.X;
import Da.Y;
import Da.Z;
import Da.w;
import Qa.l;
import android.net.Uri;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Boolean invoke(PaywallComponent it) {
            t.g(it, "it");
            return Boolean.valueOf((it instanceof StackComponent) || (it instanceof IconComponent) || (it instanceof CarouselComponent) || (it instanceof TabsComponent) || (it instanceof ImageComponent) || (it instanceof CountdownComponent));
        }
    }

    public OfferingImagePreDownloader(boolean z, CoilImageDownloader coilImageDownloader) {
        t.g(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z;
        this.coilImageDownloader = coilImageDownloader;
    }

    private final void downloadV1Images(Offering offering) {
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List all$purchases_defaultsBc8Release = paywall.getConfig().getImages().getAll$purchases_defaultsBc8Release();
            ArrayList<Uri> arrayList = new ArrayList(w.y(all$purchases_defaultsBc8Release, 10));
            Iterator it = all$purchases_defaultsBc8Release.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path((String) it.next()).build());
            }
            for (Uri it2 : arrayList) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Pre-downloading Paywall V1 image: " + it2);
                }
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                t.f(it2, "it");
                coilImageDownloader.downloadImage(it2);
            }
        }
    }

    private final void downloadV2Images(Offering offering) {
        Offering.PaywallComponents paywallComponents = offering.getPaywallComponents();
        if (paywallComponents != null) {
            for (Uri uri : findImageUrisToDownload(paywallComponents)) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Pre-downloading Paywall V2 image: " + uri);
                }
                this.coilImageDownloader.downloadImage(uri);
            }
        }
    }

    private final Set findImageUrisToDownload(Offering.PaywallComponents paywallComponents) {
        StackComponent stack;
        PaywallComponentsConfig base = paywallComponents.getData().getComponentsConfig().getBase();
        Set findImageUrisToDownload = findImageUrisToDownload(base.getStack());
        StickyFooterComponent stickyFooter = base.getStickyFooter();
        Set findImageUrisToDownload2 = (stickyFooter == null || (stack = stickyFooter.getStack()) == null) ? null : findImageUrisToDownload(stack);
        if (findImageUrisToDownload2 == null) {
            findImageUrisToDownload2 = Y.b();
        }
        return Z.i(Z.i(findImageUrisToDownload, (Iterable) findImageUrisToDownload2), findImageUrisToDownload(base.getBackground()));
    }

    public final void preDownloadOfferingImages(Offering offering) {
        t.g(offering, "offering");
        if (!this.shouldPredownloadImages) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "OfferingImagePreDownloader won't pre-download images");
                return;
            }
            return;
        }
        LogLevel logLevel2 = LogLevel.DEBUG;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "OfferingImagePreDownloader: starting image download");
        }
        downloadV1Images(offering);
        downloadV2Images(offering);
    }

    public /* synthetic */ OfferingImagePreDownloader(boolean z, CoilImageDownloader coilImageDownloader, int i, k kVar) {
        this((i & 1) != 0 ? UtilsKt.getCanUsePaywallUI() : z, coilImageDownloader);
    }

    private final Set findImageUrisToDownload(StackComponent stackComponent) {
        Set b;
        List<StackComponent> filter = PaywallComponentFilterExtensionKt.filter(stackComponent, 1.INSTANCE);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (StackComponent stackComponent2 : filter) {
            if (stackComponent2 instanceof StackComponent) {
                StackComponent stackComponent3 = stackComponent2;
                Set findImageUrisToDownload = findImageUrisToDownload(stackComponent3.getBackground());
                List overrides = stackComponent3.getOverrides();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it = overrides.iterator();
                while (it.hasNext()) {
                    A.D(linkedHashSet2, findImageUrisToDownload(((ComponentOverride) it.next()).getProperties().getBackground()));
                }
                b = Z.i(findImageUrisToDownload, linkedHashSet2);
            } else if (stackComponent2 instanceof IconComponent) {
                IconComponent iconComponent = (IconComponent) stackComponent2;
                b = X.a(Uri.parse(iconComponent.getBaseUrl()).buildUpon().path(iconComponent.getFormats().getWebp()).build());
            } else if (stackComponent2 instanceof CarouselComponent) {
                CarouselComponent carouselComponent = (CarouselComponent) stackComponent2;
                Set findImageUrisToDownload2 = findImageUrisToDownload(carouselComponent.getBackground());
                List overrides2 = carouselComponent.getOverrides();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Iterator it2 = overrides2.iterator();
                while (it2.hasNext()) {
                    A.D(linkedHashSet3, findImageUrisToDownload(((ComponentOverride) it2.next()).getProperties().getBackground()));
                }
                b = Z.i(findImageUrisToDownload2, linkedHashSet3);
            } else if (stackComponent2 instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) stackComponent2;
                Set findImageUrisToDownload3 = findImageUrisToDownload(tabsComponent.getBackground());
                List overrides3 = tabsComponent.getOverrides();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                Iterator it3 = overrides3.iterator();
                while (it3.hasNext()) {
                    A.D(linkedHashSet4, findImageUrisToDownload(((ComponentOverride) it3.next()).getProperties().getBackground()));
                }
                b = Z.i(findImageUrisToDownload3, linkedHashSet4);
            } else if (stackComponent2 instanceof ImageComponent) {
                ImageComponent imageComponent = (ImageComponent) stackComponent2;
                Set findImageUrisToDownload4 = findImageUrisToDownload(imageComponent.getSource());
                List overrides4 = imageComponent.getOverrides();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                Iterator it4 = overrides4.iterator();
                while (it4.hasNext()) {
                    ThemeImageUrls source = ((ComponentOverride) it4.next()).getProperties().getSource();
                    Set findImageUrisToDownload5 = source != null ? findImageUrisToDownload(source) : null;
                    if (findImageUrisToDownload5 == null) {
                        findImageUrisToDownload5 = Y.b();
                    }
                    A.D(linkedHashSet5, (Iterable) findImageUrisToDownload5);
                }
                b = Z.i(findImageUrisToDownload4, linkedHashSet5);
            } else if (stackComponent2 instanceof VideoComponent) {
                ThemeImageUrls fallbackSource = ((VideoComponent) stackComponent2).getFallbackSource();
                b = fallbackSource != null ? findImageUrisToDownload(fallbackSource) : null;
                if (b == null) {
                    b = Y.b();
                }
            } else if (stackComponent2 instanceof CountdownComponent) {
                CountdownComponent countdownComponent = (CountdownComponent) stackComponent2;
                Set findImageUrisToDownload6 = findImageUrisToDownload(countdownComponent.getCountdownStack());
                StackComponent endStack = countdownComponent.getEndStack();
                Set findImageUrisToDownload7 = endStack != null ? findImageUrisToDownload(endStack) : null;
                if (findImageUrisToDownload7 == null) {
                    findImageUrisToDownload7 = Y.b();
                }
                Set i = Z.i(findImageUrisToDownload6, (Iterable) findImageUrisToDownload7);
                StackComponent fallback = countdownComponent.getFallback();
                Set findImageUrisToDownload8 = fallback != null ? findImageUrisToDownload(fallback) : null;
                if (findImageUrisToDownload8 == null) {
                    findImageUrisToDownload8 = Y.b();
                }
                b = Z.i(i, (Iterable) findImageUrisToDownload8);
            } else {
                b = Y.b();
            }
            A.D(linkedHashSet, (Iterable) b);
        }
        return linkedHashSet;
    }

    private final Set findImageUrisToDownload(Background background) {
        URL webpLowRes;
        String url;
        URL webpLowRes2;
        String url2;
        Uri uri = null;
        if (background instanceof Background.Image) {
            Background.Image image = (Background.Image) background;
            Uri parse = Uri.parse(image.getValue().getLight().getWebpLowRes().toString());
            ImageUrls dark = image.getValue().getDark();
            if (dark != null && (webpLowRes2 = dark.getWebpLowRes()) != null && (url2 = webpLowRes2.toString()) != null) {
                uri = Uri.parse(url2);
            }
            return Y.f(parse, uri);
        }
        if (background instanceof Background.Video) {
            Background.Video video = (Background.Video) background;
            Uri parse2 = Uri.parse(video.getFallbackImage().getLight().getWebpLowRes().toString());
            ImageUrls dark2 = video.getFallbackImage().getDark();
            if (dark2 != null && (webpLowRes = dark2.getWebpLowRes()) != null && (url = webpLowRes.toString()) != null) {
                uri = Uri.parse(url);
            }
            return Y.f(parse2, uri);
        }
        boolean z = true;
        if (!(background instanceof Background.Color ? true : background instanceof Background.Unknown) && background != null) {
            z = false;
        }
        if (z) {
            return Y.b();
        }
        throw new o();
    }

    private final Set findImageUrisToDownload(ThemeImageUrls themeImageUrls) {
        URL webpLowRes;
        String url;
        Uri parse = Uri.parse(themeImageUrls.getLight().getWebpLowRes().toString());
        ImageUrls dark = themeImageUrls.getDark();
        return Y.f(parse, (dark == null || (webpLowRes = dark.getWebpLowRes()) == null || (url = webpLowRes.toString()) == null) ? null : Uri.parse(url));
    }
}
