package techcreator.com.alternativelistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Ted555 on 11/1/2015.
 */
public class CustomAdapter extends BaseAdapter {

    Context mContext;
    String[] text;

    CustomAdapter(Context mContext, String[] text){
        this. mContext = mContext;
        this.text = text;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
