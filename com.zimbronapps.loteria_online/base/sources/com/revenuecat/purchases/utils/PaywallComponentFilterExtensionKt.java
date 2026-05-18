package com.revenuecat.purchases.utils;

import Da.A;
import Da.m;
import Da.v;
import Da.w;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabControlButtonComponent;
import com.revenuecat.purchases.paywalls.components.TabControlComponent;
import com.revenuecat.purchases.paywalls.components.TabControlToggleComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallComponentFilterExtensionKt {
    public static final List filter(PaywallComponent paywallComponent, l predicate) {
        t.g(paywallComponent, "<this>");
        t.g(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        m mVar = new m();
        mVar.add(paywallComponent);
        while (!mVar.isEmpty()) {
            CountdownComponent countdownComponent = (PaywallComponent) mVar.removeFirst();
            if (((Boolean) predicate.invoke(countdownComponent)).booleanValue()) {
                arrayList.add(countdownComponent);
            }
            if (countdownComponent instanceof StackComponent) {
                mVar.addAll(((StackComponent) countdownComponent).getComponents());
            } else if (countdownComponent instanceof PurchaseButtonComponent) {
                mVar.add(((PurchaseButtonComponent) countdownComponent).getStack());
            } else if (countdownComponent instanceof ButtonComponent) {
                mVar.add(((ButtonComponent) countdownComponent).getStack());
            } else if (countdownComponent instanceof PackageComponent) {
                mVar.add(((PackageComponent) countdownComponent).getStack());
            } else if (countdownComponent instanceof StickyFooterComponent) {
                mVar.add(((StickyFooterComponent) countdownComponent).getStack());
            } else if (countdownComponent instanceof CarouselComponent) {
                mVar.addAll(((CarouselComponent) countdownComponent).getPages());
            } else if (countdownComponent instanceof TabControlButtonComponent) {
                mVar.add(((TabControlButtonComponent) countdownComponent).getStack());
            } else if (countdownComponent instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) countdownComponent;
                TabsComponent.TabControl.Buttons control = tabsComponent.getControl();
                if (control instanceof TabsComponent.TabControl.Buttons) {
                    mVar.add(control.getStack());
                } else if (control instanceof TabsComponent.TabControl.Toggle) {
                    mVar.add(((TabsComponent.TabControl.Toggle) control).getStack());
                }
                List tabs = tabsComponent.getTabs();
                ArrayList arrayList2 = new ArrayList(w.y(tabs, 10));
                Iterator it = tabs.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TabsComponent.Tab) it.next()).getStack());
                }
                mVar.addAll(arrayList2);
            } else if (countdownComponent instanceof TimelineComponent) {
                List<TimelineComponent.Item> items = ((TimelineComponent) countdownComponent).getItems();
                ArrayList arrayList3 = new ArrayList();
                for (TimelineComponent.Item item : items) {
                    A.D(arrayList3, v.s(item.getTitle(), item.getDescription(), item.getIcon()));
                }
                mVar.addAll(arrayList3);
            } else if (countdownComponent instanceof CountdownComponent) {
                CountdownComponent countdownComponent2 = countdownComponent;
                mVar.add(countdownComponent2.getCountdownStack());
                StackComponent endStack = countdownComponent2.getEndStack();
                if (endStack != null) {
                    mVar.add(endStack);
                }
                StackComponent fallback = countdownComponent2.getFallback();
                if (fallback != null) {
                    mVar.add(fallback);
                }
            } else if (!(countdownComponent instanceof VideoComponent ? true : countdownComponent instanceof TabControlToggleComponent ? true : countdownComponent instanceof TabControlComponent ? true : countdownComponent instanceof ImageComponent ? true : countdownComponent instanceof IconComponent)) {
                boolean z = countdownComponent instanceof TextComponent;
            }
        }
        return arrayList;
    }
}
