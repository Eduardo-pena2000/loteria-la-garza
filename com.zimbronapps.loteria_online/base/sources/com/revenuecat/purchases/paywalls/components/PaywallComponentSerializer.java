package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import ob.b;
import ob.j;
import qb.e;
import qb.k;
import rb.f;
import tb.C;
import tb.E;
import tb.h;
import tb.i;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallComponentSerializer implements b {
    private final e descriptor = k.c("PaywallComponent", new e[0], PaywallComponentSerializer$descriptor$1.INSTANCE);

    public e getDescriptor() {
        return this.descriptor;
    }

    public void serialize(f fVar, PaywallComponent paywallComponent) {
        t.g(fVar, "encoder");
        t.g(paywallComponent, "value");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
     */
    public PaywallComponent deserialize(rb.e eVar) {
        String c;
        E o;
        t.g(eVar, "decoder");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar == null) {
            throw new j("Can only deserialize PaywallComponent from JSON, got: " + P.b(eVar.getClass()));
        }
        C n = tb.j.n(hVar.i());
        i iVar = (i) n.get("type");
        String a = (iVar == null || (o = tb.j.o(iVar)) == null) ? null : o.a();
        if (a != null) {
            switch (a.hashCode()) {
                case -2076650431:
                    if (a.equals("timeline")) {
                        tb.b d = hVar.d();
                        String c2 = n.toString();
                        d.a();
                        return (PaywallComponent) d.d(TimelineComponent.Companion.serializer(), c2);
                    }
                    break;
                case -1896978765:
                    if (a.equals("tab_control")) {
                        tb.b d2 = hVar.d();
                        String c3 = n.toString();
                        d2.a();
                        return (PaywallComponent) d2.d(TabControlComponent.INSTANCE.serializer(), c3);
                    }
                    break;
                case -1822017359:
                    if (a.equals("sticky_footer")) {
                        tb.b d3 = hVar.d();
                        String c4 = n.toString();
                        d3.a();
                        return (PaywallComponent) d3.d(StickyFooterComponent.Companion.serializer(), c4);
                    }
                    break;
                case -1391809488:
                    if (a.equals("purchase_button")) {
                        tb.b d4 = hVar.d();
                        String c5 = n.toString();
                        d4.a();
                        return (PaywallComponent) d4.d(PurchaseButtonComponent.Companion.serializer(), c5);
                    }
                    break;
                case -1377687758:
                    if (a.equals("button")) {
                        tb.b d5 = hVar.d();
                        String c6 = n.toString();
                        d5.a();
                        return (PaywallComponent) d5.d(ButtonComponent.Companion.serializer(), c6);
                    }
                    break;
                case -807062458:
                    if (a.equals("package")) {
                        tb.b d6 = hVar.d();
                        String c7 = n.toString();
                        d6.a();
                        return (PaywallComponent) d6.d(PackageComponent.Companion.serializer(), c7);
                    }
                    break;
                case 2908512:
                    if (a.equals("carousel")) {
                        tb.b d7 = hVar.d();
                        String c8 = n.toString();
                        d7.a();
                        return (PaywallComponent) d7.d(CarouselComponent.Companion.serializer(), c8);
                    }
                    break;
                case 3226745:
                    if (a.equals("icon")) {
                        tb.b d8 = hVar.d();
                        String c9 = n.toString();
                        d8.a();
                        return (PaywallComponent) d8.d(IconComponent.Companion.serializer(), c9);
                    }
                    break;
                case 3552126:
                    if (a.equals("tabs")) {
                        tb.b d9 = hVar.d();
                        String c10 = n.toString();
                        d9.a();
                        return (PaywallComponent) d9.d(TabsComponent.Companion.serializer(), c10);
                    }
                    break;
                case 3556653:
                    if (a.equals("text")) {
                        tb.b d10 = hVar.d();
                        String c11 = n.toString();
                        d10.a();
                        return (PaywallComponent) d10.d(TextComponent.Companion.serializer(), c11);
                    }
                    break;
                case 100313435:
                    if (a.equals("image")) {
                        tb.b d11 = hVar.d();
                        String c12 = n.toString();
                        d11.a();
                        return (PaywallComponent) d11.d(ImageComponent.Companion.serializer(), c12);
                    }
                    break;
                case 109757064:
                    if (a.equals("stack")) {
                        tb.b d12 = hVar.d();
                        String c13 = n.toString();
                        d12.a();
                        return (PaywallComponent) d12.d(StackComponent.Companion.serializer(), c13);
                    }
                    break;
                case 112202875:
                    if (a.equals("video")) {
                        tb.b d13 = hVar.d();
                        String c14 = n.toString();
                        d13.a();
                        return (PaywallComponent) d13.d(VideoComponent.Companion.serializer(), c14);
                    }
                    break;
                case 318201406:
                    if (a.equals("tab_control_button")) {
                        tb.b d14 = hVar.d();
                        String c15 = n.toString();
                        d14.a();
                        return (PaywallComponent) d14.d(TabControlButtonComponent.Companion.serializer(), c15);
                    }
                    break;
                case 827585120:
                    if (a.equals("tab_control_toggle")) {
                        tb.b d15 = hVar.d();
                        String c16 = n.toString();
                        d15.a();
                        return (PaywallComponent) d15.d(TabControlToggleComponent.Companion.serializer(), c16);
                    }
                    break;
                case 1352226353:
                    if (a.equals("countdown")) {
                        tb.b d16 = hVar.d();
                        String c17 = n.toString();
                        d16.a();
                        return (PaywallComponent) d16.d(CountdownComponent.Companion.serializer(), c17);
                    }
                    break;
            }
        }
        i iVar2 = (i) n.get("fallback");
        if (iVar2 != null) {
            C c18 = iVar2 instanceof C ? (C) iVar2 : null;
            if (c18 != null && (c = c18.toString()) != null) {
                tb.b d17 = hVar.d();
                d17.a();
                PaywallComponent paywallComponent = (PaywallComponent) d17.d(PaywallComponent.Companion.serializer(), c);
                if (paywallComponent != null) {
                    return paywallComponent;
                }
            }
        }
        throw new j("No fallback provided for unknown type: " + a);
    }
}
