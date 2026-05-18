package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a extends AdSession {
    private final AdSessionContext a;
    private final AdSessionConfiguration b;
    private final f c;
    private com.iab.omid.library.applovin.weakreference.a d;
    private AdSessionStatePublisher e;
    private boolean f;
    private boolean g;
    private final String h;
    private boolean i;
    private boolean j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.g) {
            return;
        }
        this.c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.h;
    }

    public AdSessionStatePublisher d() {
        return this.e;
    }

    public View e() {
        return (View) this.d.get();
    }

    public void error(ErrorType errorType, String str) {
        if (this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List f() {
        return this.c.a();
    }

    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.e = null;
        this.k = null;
    }

    public boolean g() {
        return this.k != null;
    }

    public boolean h() {
        return this.f && !this.g;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f;
    }

    public void m() {
        a();
        d().g();
        this.i = true;
    }

    public void n() {
        b();
        d().h();
        this.j = true;
    }

    public void registerAdView(View view) {
        if (this.g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.c.b();
    }

    public void removeFriendlyObstruction(View view) {
        if (this.g) {
            return;
        }
        this.c.c(view);
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    public void start() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        c.c().c(this);
        this.e.a(i.c().b());
        this.e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.e.a(this, this.a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.c = new f();
        this.f = false;
        this.g = false;
        this.b = adSessionConfiguration;
        this.a = adSessionContext;
        this.h = str;
        b(null);
        this.e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.e.i();
        c.c().a(this);
        this.e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b = c.c().b();
        if (b == null || b.isEmpty()) {
            return;
        }
        for (a aVar : b) {
            if (aVar != this && aVar.e() == view) {
                aVar.d.clear();
            }
        }
    }

    private void b(View view) {
        this.d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List list) {
        if (g()) {
            List arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((com.iab.omid.library.applovin.weakreference.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.j = true;
    }
}
