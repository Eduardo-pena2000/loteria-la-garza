package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.e5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxRecyclerAdapter extends RecyclerView.g implements MaxAdPlacer.Listener {
    private final MaxAdPlacer a;
    private final RecyclerView.g b;
    private final b c;
    private RecyclerView d;
    private e5 e;
    private MaxAdPlacer.Listener f;
    private int g;
    private AdPositionBehavior h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.B {
        private final ViewGroup a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.a = view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.a;
        }
    }

    public class a implements e5.a {
        public a() {
        }

        public void a(int i, int i2) {
            MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).updateFillablePositions(i, Math.min(i2 + MaxRecyclerAdapter.a(MaxRecyclerAdapter.this), MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public class b extends RecyclerView.i {
        private b() {
        }

        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        public void onItemRangeInserted(int i, int i2) {
            boolean z = i + i2 >= MaxRecyclerAdapter.c(MaxRecyclerAdapter.this).getItemCount();
            if (MaxRecyclerAdapter.d(MaxRecyclerAdapter.this) == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.d(MaxRecyclerAdapter.this) == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).getAdjustedPosition(i);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = MaxRecyclerAdapter.c(MaxRecyclerAdapter.this).getItemCount();
            boolean z = i + i2 >= itemCount;
            if (MaxRecyclerAdapter.d(MaxRecyclerAdapter.this) == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.d(MaxRecyclerAdapter.this) == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).getAdjustedPosition(i);
            int adjustedCount = MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).getAdjustedCount(itemCount);
            int i4 = adjustedCount - adjustedCount2;
            Collection clearTrailingAds = MaxRecyclerAdapter.b(MaxRecyclerAdapter.this).clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i4 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i4 - i2), i4);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.g gVar, Activity activity) {
        b bVar = new b(this, null);
        this.c = bVar;
        this.g = 8;
        this.h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(gVar.hasStableIds());
        this.b = gVar;
        gVar.registerAdapterDataObserver(bVar);
    }

    public static /* synthetic */ int a(MaxRecyclerAdapter maxRecyclerAdapter) {
        return maxRecyclerAdapter.g;
    }

    public static /* synthetic */ MaxAdPlacer b(MaxRecyclerAdapter maxRecyclerAdapter) {
        return maxRecyclerAdapter.a;
    }

    public static /* synthetic */ RecyclerView.g c(MaxRecyclerAdapter maxRecyclerAdapter) {
        return maxRecyclerAdapter.b;
    }

    public static /* synthetic */ AdPositionBehavior d(MaxRecyclerAdapter maxRecyclerAdapter) {
        return maxRecyclerAdapter.h;
    }

    public void destroy() {
        try {
            this.b.unregisterAdapterDataObserver(this.c);
        } catch (Exception unused) {
        }
        this.a.destroy();
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.a;
    }

    public int getAdjustedPosition(int i) {
        return this.a.getAdjustedPosition(i);
    }

    public int getItemCount() {
        return this.a.getAdjustedCount(this.b.getItemCount());
    }

    public long getItemId(int i) {
        if (this.b.hasStableIds()) {
            return this.a.isFilledPosition(i) ? this.a.getAdItemId(i) : this.b.getItemId(this.a.getOriginalPosition(i));
        }
        return -1L;
    }

    public int getItemViewType(int i) {
        if (this.a.isAdPosition(i)) {
            return -42;
        }
        return this.b.getItemViewType(this.a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.a.loadAds();
    }

    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.d = recyclerView;
        e5 e5Var = new e5(recyclerView);
        this.e = e5Var;
        e5Var.a(new a());
    }

    public void onBindViewHolder(RecyclerView.B b2, int i) {
        this.e.a(b2.itemView, i);
        if (!this.a.isAdPosition(i)) {
            this.b.onBindViewHolder(b2, this.a.getOriginalPosition(i));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.a.getAdSize(i);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) b2).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.a.renderAd(i, containerView);
        }
    }

    public RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.b.onCreateViewHolder(viewGroup, i);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        RecyclerView.o layoutManager = this.d.getLayoutManager();
        if (layoutManager == null || !layoutManager.j()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        inflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(inflate);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.d = null;
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.a();
            this.e = null;
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.B b2) {
        return b2 instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(b2) : this.b.onFailedToRecycleView(b2);
    }

    public void onViewAttachedToWindow(RecyclerView.B b2) {
        if (b2 instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(b2);
        } else {
            this.b.onViewAttachedToWindow(b2);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.B b2) {
        if (b2 instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(b2);
        } else {
            this.b.onViewDetachedFromWindow(b2);
        }
    }

    public void onViewRecycled(RecyclerView.B b2) {
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.b(b2.itemView);
        }
        if (!(b2 instanceof MaxAdRecyclerViewHolder)) {
            this.b.onViewRecycled(b2);
            return;
        }
        if (this.a.isFilledPosition(b2.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) b2).getContainerView().removeAllViews();
        }
        super.onViewRecycled(b2);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.h = adPositionBehavior;
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.b.unregisterAdapterDataObserver(this.c);
        this.b.setHasStableIds(z);
        this.b.registerAdapterDataObserver(this.c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f = listener;
    }

    public void setLookAhead(int i) {
        this.g = i;
    }
}
