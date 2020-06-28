package me.lesonnnn.yoncoffee.screen.main.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;
import me.lesonnnn.yoncoffee.R;
import me.lesonnnn.yoncoffee.screen.main.model.ItemMenuHome;

/**
 * Created by leson on 6/28/20
 */
public class ItemMenuAdapter extends RecyclerView.Adapter<ItemMenuAdapter.ViewHolder> {

    private Context mContext;
    private List<ItemMenuHome> mItemMenuHomes;
    private onClickItemMenu mOnClickItemMenu;

    public ItemMenuAdapter(Context context, List<ItemMenuHome> itemMenuHomes) {
        mContext = context;
        mItemMenuHomes = itemMenuHomes;
    }

    public void setOnClickItemMenu(onClickItemMenu onClickItemMenu) {
        mOnClickItemMenu = onClickItemMenu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu_home, parent, false));
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final ItemMenuHome item = mItemMenuHomes.get(position);
        Glide.with(mContext)
                .load(item.getImage())
                .placeholder(R.drawable.espresso)
                .into(holder.mImageView);
        holder.mTextView.setText(item.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnClickItemMenu.onClickItem(holder.getLayoutPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItemMenuHomes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        private TextView mTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imgItemMenu);
            mTextView = itemView.findViewById(R.id.tvItemMenu);
        }
    }

    public interface onClickItemMenu {
        void onClickItem(int id);
    }
}
