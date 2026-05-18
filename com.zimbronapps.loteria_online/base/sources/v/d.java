package v;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import v.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final Intent a;
    public final Bundle b;

    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        H1.a.startActivity(context, this.a, this.b);
    }

    public static final class d {
        public ArrayList c;
        public ActivityOptions d;
        public ArrayList e;
        public SparseArray f;
        public Bundle g;
        public boolean j;
        public final Intent a = new Intent("android.intent.action.VIEW");
        public final a.a b = new a.a();
        public int h = 0;
        public boolean i = true;

        public d() {
        }

        public d a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                k(null, null);
            }
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            int i = Build.VERSION.SDK_INT;
            d();
            if (i >= 34) {
                l();
            }
            ActivityOptions activityOptions = this.d;
            return new d(this.a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d b(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i);
            return this;
        }

        public d c(int i, v.a aVar) {
            if (i < 0 || i > 2 || i == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i);
            }
            if (this.f == null) {
                this.f = new SparseArray();
            }
            this.f.put(i, aVar.a());
            return this;
        }

        public final void d() {
            String a = b.a();
            if (TextUtils.isEmpty(a)) {
                return;
            }
            Bundle bundleExtra = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a);
            this.a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public d e(v.a aVar) {
            this.g = aVar.a();
            return this;
        }

        public d f(Context context, int i, int i2) {
            this.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", G1.c.a(context, i, i2).b());
            return this;
        }

        public d g(int i) {
            return h(i, 0);
        }

        public d h(int i, int i2) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i2 < 0 || i2 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            this.a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i2);
            return this;
        }

        public d i(boolean z) {
            this.i = z;
            return this;
        }

        public d j(f fVar) {
            this.a.setPackage(fVar.e().getPackageName());
            k(fVar.d(), fVar.f());
            return this;
        }

        public final void k(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public final void l() {
            if (this.d == null) {
                this.d = a.a();
            }
            c.a(this.d, this.j);
        }

        public d m(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.h = i;
            if (i == 1) {
                this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i == 2) {
                this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public d n(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        public d o(Context context, int i, int i2) {
            this.d = ActivityOptions.makeCustomAnimation(context, i, i2);
            return this;
        }

        public d p(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
            return this;
        }

        public d(f fVar) {
            if (fVar != null) {
                j(fVar);
            }
        }
    }
}
